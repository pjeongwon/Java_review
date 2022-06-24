package jdbc;

public class JDBC_Connect_2 {

	public static void main(String[] args) {

		try {
			// 1단계. 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패!" + e.getMessage());
		}
	}
}
