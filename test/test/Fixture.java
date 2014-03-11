package test;

import java.sql.*;

public class Fixture
{

    // sets up the tables
    public static void setUp(Connection con)
    {
        try
        {

            Statement st = con.createStatement();

            // start transaction
            con.setAutoCommit(false);

			// create table
            st.addBatch("delete from odetails");
            st.addBatch("delete from orders");
            
            st.addBatch("drop sequence orderseq");
            st.addBatch("create sequence orderseq start with 1022");
            // insert tuples
            String insert = "insert into orders values ";
            st.addBatch(insert + "(1020,2222,1000,null,null)");
            st.addBatch(insert + "(1021,1111,1001,null,null)");
            st.addBatch("insert into odetails values(1020,10506,3)");
            int[] opcounts = st.executeBatch();

            // end transaction
            con.commit();
        } catch (Exception e)
        {
            try
            {
                con.rollback();
            } catch (SQLException e1)
            {
                e1.printStackTrace();
            }
            System.out.println("Fail in Fixture.setup()");
            System.out.println(e.getMessage());
        }
    }
}
