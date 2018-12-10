package org.btm.update;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// wap to update record in the Db Server
public class Update_code1 {
	public static void main(String[] args) {
        Connection con =null;
        Statement stmt=null;        
		String qry="update seja5.student set name='rakhi' where id =4";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded and registered");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
         System.out.println("Connection established with DB server");
         stmt=con.createStatement();
         System.out.println("Platform Created");
         stmt.executeUpdate(qry);
         System.out.println("Data Updated");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			if(stmt!=null)
			{
				{
					try {
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			if(con!=null)
			{
				{
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			
			
		}
	}
}
