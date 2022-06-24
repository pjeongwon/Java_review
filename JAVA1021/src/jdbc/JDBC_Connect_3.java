package jdbc;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connect_3 {

	public static void main(String[] args) {
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java3";
		String user = "root";
		String password = "1234";
		
		try {
			Class.forName(driver);
			DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
