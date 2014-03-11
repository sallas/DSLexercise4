package dataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Order;
import domain.OrderDetail;

//=== Maps between objects and tables
//=== Encapsulates SQL-statements
public class OrderMapper implements OrderMapperInterface {

  private final Connection con;

  public OrderMapper(Connection con) {
    this.con = con;
  }

  //== load an order and the associated order details
  @Override
  public Order getOrder(int ono) {
    Order o = null;
    String SQLString1 = // get order
            "select * "
            + "from orders "
            + "where ono = ?";
    String SQLString2 = // get order details
            "select od.pno, od.qty "
            + "from odetails od "
            + "where od.ono = ? ";         // foreign key match 
    PreparedStatement statement = null;

    try {
      //=== get order
      statement = con.prepareStatement(SQLString1);
      statement.setInt(1, ono);     // primary key value
      ResultSet rs = statement.executeQuery();
      if (rs.next()) {
        o = new Order(ono,
                rs.getInt(2),
                rs.getInt(3),
                rs.getString(4),
                rs.getString(5));
      }

      //=== get order details
      statement = con.prepareStatement(SQLString2);
      statement.setInt(1, ono);          // foreign key value
      rs = statement.executeQuery();
      while (rs.next()) {
        o.addDetail(new OrderDetail(
                ono,
                rs.getInt(1),
                rs.getInt(2)));
      }
    } catch (SQLException e) {
      System.out.println("Fail in OrderMapper - getOrder");
      System.out.println(e.getMessage());
    } finally // must close statement
    {
      try {
        if (statement != null) {
          statement.close();
        }
      } catch (SQLException e) {
        System.out.println("Fail in OrderMapper - getOrder");
        System.out.println(e.getMessage());
      }
    }
    return o;
  }

  //== Insert new order (tuple)
  @Override
  public boolean saveNewOrder(Order o) {
    int rowsInserted = 0;
    String SQLString1
            = "select orderseq.nextval  "
            + "from dual";
    String SQLString2
            = "insert into orders "
            + "values (?,?,?,?,?)";
    PreparedStatement statement = null;

    try {
      //== get unique ono
      statement = con.prepareStatement(SQLString1);
      ResultSet rs = statement.executeQuery();
      if (rs.next()) {
        o.setOno(rs.getInt(1));
      }

      //== insert tuple
      statement = con.prepareStatement(SQLString2);
      statement.setInt(1, o.getOno());
      statement.setInt(2, o.getCustomerNo());
      statement.setInt(3, o.getEmployeeNo());
      statement.setString(4, o.getReceived());
      statement.setString(5, o.getShipped());
      rowsInserted = statement.executeUpdate();
    } catch (SQLException e) {
      System.out.println("Fail in OrderMapper - saveNewOrder");
      System.out.println(e.getMessage());
    } finally // must close statement
    {
      try {
        statement.close();
      } catch (SQLException e) {
        System.out.println("Fail in OrderMapper - saveNewOrder");
        System.out.println(e.getMessage());
      }
    }
    return rowsInserted == 1;
  }

  //== Insert new order detail (tuple)
  @Override
  public boolean saveNewOrderDetail(OrderDetail od) {
    int rowsInserted = 0;
    String SQLString
            = "insert into odetails "
            + "values (?,?,?)";
    PreparedStatement statement = null;

    try {
      //== insert tuple
      statement = con.prepareStatement(SQLString);
      statement.setInt(1, od.getOno());
      statement.setInt(2, od.getPno());
      statement.setInt(3, od.getQty());
      rowsInserted = statement.executeUpdate();
    } catch (SQLException e) {
      System.out.println("Fail in OrderMapper - saveNewOrderDetail");
      System.out.println(e.getMessage());
    } finally // must close statement
    {
      try {
        statement.close();
      } catch (SQLException e) {
        System.out.println("Fail in OrderMapper - saveNewOrderDetail");
        System.out.println(e.getMessage());
      }
    }
    return rowsInserted == 1;
  }
}
