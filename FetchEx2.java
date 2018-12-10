package btm.org.Fetch;
import java.sql.*;
import java.util.Scanner;
/*Code to fetch single record from the cursor or buffer 
memory where id is place holder*/
public class FetchEx2 {
public static void main(String[] args) {
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        String qry="Select * from seja5.student where id =?";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your id please");
        int id=sc.nextInt();
        sc.close();
        try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Class is loaded");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
System.out.println("Connection established");
		pstmt=con.prepareStatement(qry);
		System.out.println("Values set before placeholder");
		pstmt.setInt(1, id);
		rs=pstmt.executeQuery();
		if(rs.next())
		{
		String name=rs.getString(2);
		double perc=rs.getDouble("perc");
		System.out.println(name+"   "+perc);
		}
		else
		{
			System.out.println("no data found id\t"+id);
		}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
finally
{
	if(rs!=null)
	{
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	if(pstmt!=null)
	{
	try {
		pstmt.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
	if(con!=null)
	{
	try {
			con.close();
	} catch (SQLException e) {
			e.printStackTrace();
	}}}}}