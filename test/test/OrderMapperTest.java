package test;

import static org.junit.Assert.*;
import java.sql.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dataSource.OrderMapper;
import domain.*;

public class OrderMapperTest
{

    Connection con;
    private final String id = "cphbk77";
    private final String pw = "cphbk77";
    OrderMapper om;

    @Before
    public void setUp() throws Exception
    {
        getConnection();
        Fixture.setUp(con);
        om = new OrderMapper(con);
    }

    @After
    public void tearDown() throws Exception
    {
        releaseConnection();
    }

    @Test
    public void testGetOrderMatch()
    {
        {
            Order p = om.getOrder(1020);
            assertTrue("GetOrderMatch failed1", p != null);
            assertTrue("GetOrderMatch failed2", p.getOno() == 1020);
        }
    }

    @Test
    public void testGetOrderNoMatch()
    {
        {
            Order o = om.getOrder(10);
            assertTrue("GetOrderNoMatch failed1", o == null);
        }
    }

    @Test
    public void testSaveNewOrderMatchEmployeeAndCustomer()
    {
        Order o = new Order(0, 2222, 1001, null, null);
        boolean saveOk = om.saveNewOrder(o);
        assertTrue("SaveNewOrderMatchEmployeeAndCustomer failed1", saveOk);
        Order o2 = om.getOrder(1022);
        assertTrue("SaveNewOrderMatchEmployeeAndCustomer failed2", o2.getEmployeeNo()== 1001);
    }

    @Test
    public void testSaveNewOrderNoMatchEmployee()
    {
        Order o = new Order(100, 2222, 100, null, null);
        boolean saveOK = om.saveNewOrder(o);
        assertFalse("SaveNewOrderNoMatchEmployee failed1", saveOK);
    }
    
     @Test
    public void testSaveNewOrderNoMatchCustomer()
    {
        Order o = new Order(100, 2223, 1001, null, null);
        boolean saveOK = om.saveNewOrder(o);
        assertFalse("SaveNewOrderNoMatchCustomer failed1", saveOK);
    }
    
    @Test
    public void testSaveNewOrderDetailsMatchOnoAndPno()
    {
        OrderDetail od = new OrderDetail(1020, 10507, 3);
        boolean saveOk = om.saveNewOrderDetail(od);
        assertTrue("SaveNewOrderDetailsMatchOnoAndPno", saveOk);
    }
    
    @Test
    public void testSaveNewOrderDetailsMatchOnoAndNoMatchPno()
    {
        OrderDetail od = new OrderDetail(1020, 10, 3);
        boolean saveOk = om.saveNewOrderDetail(od);
        assertFalse("SaveNewOrderDetailsMatchOnoAndNoMatchPno", saveOk);
    }
    
    @Test
    public void testSaveNewOrderDetailsMatchPnoAndNoMatchOno()
    {
        OrderDetail od = new OrderDetail(100, 10506, 3);
        boolean saveOk = om.saveNewOrderDetail(od);
        assertFalse("SaveNewOrderDetailsMatchPnoAndNoMatchOno", saveOk);
    }
    
    private void getConnection()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat", id, pw);
        } catch (SQLException e)
        {
            System.out.println("fail in getConnection() - Did you add your Username and Password");
            System.out.println(e);
        }
    }

    public void releaseConnection()
    {
        try
        {
            con.close();
        } catch (Exception e)
        {
            System.err.println(e);
        }
    }
}
