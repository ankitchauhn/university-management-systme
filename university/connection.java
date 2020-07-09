package university;

import java.sql.*;
public class connection 
{
    Connection con;
    Statement stm;
    public connection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:330/university","root","ankit@123");
            stm=con.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        new connection();
    }
}
