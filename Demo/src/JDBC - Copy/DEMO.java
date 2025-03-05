
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DEMO {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("localhost");
		Statement stm=con.createStatement();  
		ResultSet rs=stm.executeQuery("select * from demo");  
		  
		
		while(rs.next()) { 
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  
		  
		con.close();  
	}

}
}