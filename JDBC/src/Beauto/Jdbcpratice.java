package Beauto;
import java.sql.*;

public class Jdbcpratice {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/nani","root","9912");
		Statement s=c.createStatement();
		s.executeUpdate("insert into student values(1,'nagendra')");
		c.close();

	}

}
