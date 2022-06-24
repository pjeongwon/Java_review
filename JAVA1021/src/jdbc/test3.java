package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test3 {

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
//			String sql = "INSERT INTO test2 VALUES(1, '홍길동')";
//			String sql = "DELETE FROM test2 WHERE(idx = 1)";
//			String sql = "CREATE TABLE test3(idx INT)";
//			String sql = "INSERT INTO test3 Values(1)";
//			String sql = "INSERT INTO test2 Values(2, '임꺽정')";
//			String sql = "INSERT INTO test2(name) Values('장길산')";
			String sql = "DELETE FROM test2 WHERE(name = '장길산')";
			pstmt = con.prepareStatement(sql); 

			int result = pstmt.executeUpdate();
			System.out.println("실행 결과 - " + result);
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연결 실패! 또는 SQL구문 오류 발생!");
			e.printStackTrace();
		}
	}
}
