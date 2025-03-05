import java.sql.*;
public class Test2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/nani","root","9912");
		PreparedStatement ps=c.prepareStatement("delete  aa set name='krishna'where id=2");
		//PreparedStatement ps=c.prepareStatement("update aa set name ='krishna' where id =2");
		ps.executeUpdate();
		System.out.println("nnai");
	}

}
