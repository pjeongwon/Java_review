package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Connect_1 {

	public static void main(String[] args) {
		/*
		 * API(Application Programming Interface)
		 * - 특정 기능을 수행할 수 있도록 제공되는 클래스들의 모음집
		 * - 카카오 API = 카카오 관련 기능을 사용할 수 있도록 제공하는 클래스(인터페이스) 모음집
		 * 
		 * JDBC(Java DataBase Connectivity)
		 * - 자바에서 여러 데이터베이스에 공통된 방식으로 접근하기 위한 API
		 * - 데이터베이스는 제조사 별로 구조가 다르기 때문에 개발자가 해당 구조를 다 파악하기 어렵다.
		 *   따라서, 데이터베이스 개발자가 데이터베이스 구조에 맞는 드라이버를 외부에 제공하면
		 *   프로그램 개발자는 해당 드라이버를 JDBC를 통해 접근하여 각 제조사의 DB에 접근할 수 있음
		 *   => 접근 후 각종 클래스 및 인터페이스를 활용하여 DB를 사용 가능
		 * - JDBC기능을 활용하려면 각 제조사에서 제공하는 드라이버(*.jar파일)를 다운받아
		 * 	 프로젝트에 포함시켜(Add to Build path)사용해야함
		 * 	 ex) MySQL : mysql-connector-5.1.49.jar
		 * 		 Oracle : ojdbc6.jar
		 * - 데이터베이스 접속 등을 위해 자원(Connection, PreparedStatement객체 등)을 사용한 경우
		 *   사용이 끝난 후에는 해당 자원을 반환해야한다.
		 *   => 자원을 반환하기 위해서는 해당 객체의 close()메서드를 호출하면 자동으로 반환됨
		 *   => 만약, 반환을 수행하지 않으면 Connection객체의 경우 접속 사용자가 접속해야하는 서버에서
-----	 *      기존의 서버를 
		 * < JDBC 구현 과정 4단계 >
		 * 1. 드라이버 로드
		 * 		- java.lang.class클래스의 static메서드인 forName()메서드를 호출하여
		 * 		  DB연결에 필요한 드라이버 클래스 지정하여 로드
		 * 		- 단, 미리 해당 드라이버가 포함된 라이브러리(= jar파일)이 존재해야함
		 * 		  ex) MySQL의 경우 com.mysql.jdbc.Driver파일을 지정하며
		 * 			  해당 드라이버 파일은 mysql-connector-XXX.jar파일에 포함되어 있음
		 * 		- 드라이버 클래스의 위치가 잘못 지정되었거나 클래스 파일이 존재하지 않을 경우
		 * 		  ClassNotFoundException예외 발생 => 예외 처리(try - catch) 필수!
		 * 2. DB 연결
		 * 		- java.sql.DriverManager클래스의 static메서드인 getConnection()메서드를 호출하여
		 * 		  DB연결(접속) 작업을 수행하고, 성공 시 java.sql.Connection객체를 리턴
		 * 		  (연결 후에 데이터베이스와 연결 상태를 Connection객체를 통해 유지 및 관리)
		 * 		  => 파라미터로 DB접속 정보(URL, DB 계정명, 패스워드) 전달
		 * 		  => URL 형식 	프로토콜://주소:포트번호/DB명  (MySQL일 경우)
		 * 			 ex) jdbc:mysql://localhost:3306/java3
		 * 		  => 각 정보가 잘못됐을 경우마다 다른 예외 발생하므로 주의
		 * 			 ex) 서버 주소가 잘못됐을 경우 UnknownHostException
		 * 				 => 단, 모든 예외를 SQLException으로 통합 처리 가능
		 * 		- 리턴되는 Connection객체를 변수에 저장해두기
		 * ----------- 2단계까지는 데이터베이스 제품마다 달라짐 -----------
		 * -------- 3단계부터는 모든 DB에 대해 공통(단, SQL구문에 따라 달라질 수 있음) --------
		 * 
		 * 3. SQL구문 작성 및 전달
		 * - Connection객체의 prepareStatement()메서드를 호출하여
		 * 	  파라미터로 실행할 SQL구분(문자열)을 전달하여PreparedStatement객체 연결
		 * 	  => 전달 후 java.sql.PreparedStatement 객체 리턴됨
		 * - PreparedStatement 객체에 전달하는 쿼리문은 외부로부터 전달받은 데이터를
		 *   쿼리문에 삽입하기 위해 데이터가 저장된 변수와 문자열간의 결합을 수행할 수도 있지만
		 *   SQL삽입 공격(SQL injection Attack) 방지하기 위해
		 *   데이터가 표시될 자리를 만능문자인(?)기호로 미리 표시해두고
		 *   별도의 setXXX()메서드를 통해 만능문자(?) 부분에 들어갈 데이터를 대체하면서
		 *   입력값에 대한 검증까지 수행할 수 있음 
		 *   => setXXX() 메서드의 XXX은 전달할 데이터의 자바 데이터타입명
		 *   	ex) 정수형 데이터 전달할 메서드 : setInt()
		 *   		문자열 데이터 전달할 메서드 : setStrng()
		 *   => 파라미터로 만능문자(?)의 순서번호와 전달할 데이터를 지정
		 *   	ex) 정수형 데이터 idx변수값을 첫번째 만능문자(?)부분에 전달할 경우
		 *   		pstmt.setInt(1, idx);
		 *   	=> 단, setXXX()메서드의 타입과 실제데이터의 타입은 반드시 일치해야한다! 
		 *   
		 * 4. SQL구문 실행 결과 처리
		 * - PreparedStatement 객체의 executeXXX()메서드를 호출할 경우
		 * 	 메서드 종류에 따라 각각 다른 리턴값이 리턴됨 
		 * 	 1) executeUpdate() : int형 데이터 리턴됨. 작업 완료된 레코드 수 리턴
		 *   2) executeQuerty() : ResultSet타입 객체 리턴됨. 조회된 레코드가 테이블 형태로 리턴
		 *   	=> ResultSet 객체의 커서가 첫번째 레코드 위에 위치해 있으며
		 *   	   ResultSet 객체의 next()메서드를 호출하며 커서를 다음으로 이동시킴
		 *   	   (이 때, 다음 레코드가 존재하면 true, 아니면 false가 리턴됨)
		 *   	=> 반복문을 통해 next()메서드 호출을 반복하면서 마지막 레코드까지 이동시키면서
		 *   	   각 레코드에 있는 컬럼에 접근하여 데이터 꺼낼 수 있음
		 *   	   (이 때, 주로 while문을 사용하여 next()메서드 결과가 true일 동안 반복)
		 *   	=> 만약, 조회된 레코드가 1개뿐일 경우 if문으로 대체 가능
		 *   	=> 각 레코드에 컬럼에 접근하이 위해서는 ResultSet객체의 getXXX()메서드 호출
		 *   	   이 때, getXXX() 메서드의 XXX은 접근할 컬럼의 자바 데이터타입 이름 지정
		 *   	   파라미터로 해당 컬럼의 이름(문자열) 또는 컬럼인덱스(정수)를 전달함
		 *   	   ex) 첫번째 컬럼 이름이 name이고 문자열을 저장하고 있을 경우
		 *   		   rs.getString(1) 또는 rs.getString("name")
		 * 
		 */
		
		// 데이터베이스 작업에 필요한 문자열 설정
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java3";
		String user = "root";
		String password = "1234";
		
		// 2단계 작업(DB연결) 완료 후 리턴되는 java.sql.Connection객체를 저장할 변수 선언
		Connection con = null;
		// 3단계 작업에서 SQL구문 전달 시 리턴되는 java.sql.PreparedStatement객체를 저장할 변수 선언
		PreparedStatement pstmt = null;
		try {
			// 1단계. 드라이버 로드
			Class.forName(driver); // ClassNotFoundException 발생 위치
			System.out.println("드라이버 로드 성공!");
			
			// 2단계. DB연결
			con = DriverManager.getConnection(url, user, password); // SQLException 발생 위치
			System.out.println("DB연결 성공!");
//			System.out.println("Connection객체 내용 : " + con);
			
			// 3단계. SQL구문 작성 및 전달
			String sql = "CREATE TABLE test2 (idx INT, name VARCHAR(10))";
			// Connection객체의 PrepareStatement()메서드를 호출하여 작성한 SQL구문 전달
			// => 이 때, PreparedStatement객체를 리턴받기
			pstmt = con.prepareStatement(sql); // SQLException발생 위치
			
			// 4. SQL구문 실행 후 결과 처리
			// PreparedStatement객체의 executeXXX()메서드를 호출하여 전달된 SQL구문 실행
			// => 이 때, SQL구문(작업)의 종류에 따라 XXX부분의 이름이 달라짐
			// 1) 데이터베이스에 조작을 가하는 구문(CREATE, ALTER, INSERT, UPDATE, DELETE 등)
			//	  => int executeUpdate()메서드 사용
			// 2) 데이터베이스에 조작을 가하지 않는 구문(SELECT 등)
			//	  => ResultSet executeQuery()메서드 사용
			// MySQL에서 INSERT작업 실행 시 결과 메시지로 출력되는 메서드의 경우
			//    => Query OK, 1 row affected(0.02 sec)의 1이 리턴됨!
			//		 (단, CREATE문 등은 레코드에 영향을 주지 않으므로 성공해도 0 리턴됨)
			int result = pstmt.executeUpdate();
			System.out.println("실행 결과 - " + result);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패! - " + e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결 실패! - " + e.getMessage());
		}
		
		
		
	}

}















