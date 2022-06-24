package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Connect_4_UPDATE {

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
			
			String name = "김태희";
			String id = "kimth";
			int age = 40;
			
			String sql = "UPDATE member SET age = ? WHERE name = ? AND id = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, age);
			pstmt.setString(2, name);
			pstmt.setString(3, id);
			
			int result = pstmt.executeUpdate();
			System.out.println("UPDATE 작업 성공! - " + result + "개 레코드");
			
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
