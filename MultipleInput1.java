package jdbcAppInputPlaceholder;
import java.sql.*;
public class MultipleInput1 {
	public static void main(String args[]) {
    Connection con=null;
    PreparedStatement pstmt=null;
    String qry="insert into jdb.stud1 values(?,?,?)";
    try {
		Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
         pstmt=con.prepareStatement(qry);
         pstmt.setInt(1,1);
         pstmt.setString(2,"verma");
         pstmt.setDouble(3,67.78);
         pstmt.executeUpdate();
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
    
    finally{
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
    	    }
    }
    
}}