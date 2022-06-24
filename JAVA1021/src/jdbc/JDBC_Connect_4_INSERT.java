package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Connect_4_INSERT {

	public static void main(String[] args) {
		// member테이블에 저장할 데이터를 InsertData객체를 생성하여 저장
		InsertData data = new InsertData(3, "김태희", "여", 44, "kimth", "kim123");

		// InsertClass클래스의 인스턴스 생성 후 insert()메서드를 호출하여 InsertData객체 전달
		InsertClass ic = new InsertClass();
		ic.insert(data);
		
	}

}

class InsertClass {
	
	public void insert(InsertData data) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java3";
		String user = "root";
		String password = "1234";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1단계. 드라이버 로드
			Class.forName(driver);
			System.out.println("드라이버 로드 성공!");
			
			// 2단계. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공!");
			
			// 3단계. SQL구문 작성 및 전달
			// "INSERT INTO member VALUES(2,'이순신','남',44,'leess','lee123')";
//			int idx = 2;
//			String name = "이순신";
//			String sql = "INSERT INTO member VALUES(" + idx + ", '" + name + "','남',44,'leess','lee123')";
			
			// PreparedStatement의 만능문자 기능을 활용하는 경우
			// 만능문자(?)를 사용하여 전달할 데이터 위치를 표시하고
			// PreparedStatement객체의 setXXX() 메서드를 호출하여 만능문자 위치에 데이터 대체하기
			String sql = "INSERT INTO member VALUES(?,?,?,?,?,?)";
			// 첫번째 만능문자에는 idx값을 전달(InsertDada객체의 getIdx()메서드 호출)
			
			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, data.getIdx());
			pstmt.setString(2, data.getName());
			pstmt.setString(3, data.getGender());
			pstmt.setInt(4, data.getAge());
			pstmt.setString(5, data.getId());
			pstmt.setString(6, data.getPassword());
			
		
			
			// 4단계. SQL구문 실행 및 결과 처리
			int result = pstmt.executeUpdate();
			System.out.println("INSERT 작업 성공! - " + result + "개 레코드");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연결 실패! 또는 SQL구문 오류 발생!");
			e.printStackTrace();
		} finally {
			// DB사용이 끝난 후 자원을 반환하는 작업 수행
			// => 예외 발생 여부와 관계없이 수행되어야 하므로 finally블록에 작성
			// => 객체를 생성한 순서의 역순으로 반환
			if(pstmt != null) { try { pstmt.close(); } catch (Exception e) {} }
			if(con != null) { try {con.close(); } catch (Exception e) {} } 
		}
		
	}
	
}

class InsertData {
	private int idx;
	private String name;
	private String gender;
	private int age;

	private String id;
	private String password;

	public InsertData(int idx, String name, String gender, int age, String id, String password) {
		super();
		this.idx = idx;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.id = id;
		this.password = password;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}