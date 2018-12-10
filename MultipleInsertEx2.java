package btm.org.Multipleinsert;
import java.sql.*;
public class MultipleInsertEx2 {

public static void main(String[] args) {
		Connection con=null;
        PreparedStatement pstmt=null;
        String qry="insert into student.stud values(?,?,?)";
        try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver class loaded");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
       System.out.println("Connection established");
       pstmt=con.prepareStatement(qry);
			pstmt.setInt(1, 1);
			pstmt.setString(2,"vijay");
			pstmt.setDouble(3,89.75);
			pstmt.executeUpdate();
			System.out.println("Execution completed");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
        
        finally
        {
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
				}
        	}}}}
