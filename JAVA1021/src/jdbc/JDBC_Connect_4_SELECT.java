package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Connect_4_SELECT {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java3";
		String user = "root";
		String password = "1234";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		// 4단계 SQL구문 실행 후 리턴되는 java.sql.ResultSet객체를 저장할 변수 선언
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			String gender = "남";
			int age = 20;
			
			String sql = "SELECT * FROM test2"; // 임시 사용
//			String sql = "SELECT * FROM member";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) { // while문을 사용하여 다음 레코드가 존재(rs.next()결과가 true)할 동안 반복
				// 다음 레코드가 존재할 경우 수행하는 문장
				// ResultSet객체의 getXXX()메서드를 호출하여 해당 레코드의 각 컬럼 데이터 접근
				int idx = rs.getInt("idx"); // 컬럼명으로 지정할 경우
				String name = rs.getString("name");
				System.out.println(idx + ", " + name);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) { try { rs.close(); } catch (Exception e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (Exception e) {} }
			if(con != null) { try {con.close(); } catch (Exception e) {} }
		}

		
		
	}

}
