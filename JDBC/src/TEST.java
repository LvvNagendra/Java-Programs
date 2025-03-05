import java.sql.*;
public class TEST {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		int id=78;
		String name="nani";
		int salary=488;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/nani","root","9912");
		PreparedStatement s=c.prepareStatement("insert into aa values (78,'nani',488)");
		s.executeUpdate();
		System.out.println("connected");
		

	}

}
