package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Connect_4_DELETE {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java3";
		String user = "root";
		String password = "1234";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			String gender = "남";
			int age = 20;
			
			String sql = "DELETE FROM member WHERE gender = ? AND age <= ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, gender);
			pstmt.setInt(2, age);
			
			int result = pstmt.executeUpdate();
			System.out.println("INSERT 작업 성공! - " + result + "개 레코드");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) { try { pstmt.close(); } catch (Exception e) {} }
			if(con != null) { try {con.close(); } catch (Exception e) {} }
		}

	}

}
