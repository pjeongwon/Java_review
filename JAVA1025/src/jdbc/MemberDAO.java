package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
DAO(Data Access Object, 데이터 접근 객체)
- 데이터베이스를 사용하여 데이터를 추가/수정/삭제/조회를 수행할 때
  해당 데이터베이스와의 연결을 통해 실질적인 데이터 처리를 수행하는 객체
- 주로 XXXDAO 라는 이름의 클래스명을 사용
  (ex. 회원관리 작업을 위한 DAO 클래스 : MemberDAO 등)
 */

public class MemberDAO {

	// DB 연결을 수행 및 해당 연결 정보를 담는 Connection객체를 리턴하는 getConnection() 메서드 정의
	public Connection getConnection() {
		Connection con = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java3";
		String user = "root";
		String password = "1234";

		try {
			// 1단계. 드라이버 클래스 로드
			Class.forName(driver);
			System.out.println("드라이버 로드 성공!");

			// 2단계. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}

		return con;
	}

	// DB관련 객체를 반환하는 close() 메서드 정의
	// => 외부로부터 반환할 객체를 전달받아 close()메서드 호출
	public void close(Connection con) {
		// = if(con != null) try { con.close(); } catch (SQLException e) {}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// Connection 객체를 반환하는 close() 메서드아 이름은 같고 파라미터가 다른 메서드 오버로딩
	public void close(PreparedStatement pstmt) {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// =================================================================
	// 데이터베이스 연결을 통해 데이터 처리작업을 수행할 메서드 정의
	// => 실질적인 데이터베이스 처리 작업을 수행하지만
	// 처리에 사용되는 데이터는 외부로부터 전달받고
	// 처리 후의 결과역시 외부로 리턴하여 외부에서 처리하도록 해야함

	// 1. 데이터 추가 작업을 수행할 insert()메서드 정의
	// => 파라미터 : 추가할 회원 정보가 저장된 MemberDTO 객체(member)
	// => 리턴타입 : int(insertCount) - 데이터 추가 작업 후 결과 리턴

	public int insert(MemberDTO member) {
		// INSERT 작업 수행 결과를 저장할 변수 선언
		int insertCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;

		// 데이터베이스 처리 작업 수행 전 DB연결 후 Connection객체를 리턴하는
		// getConnection()메서드를 호출하여 Connection객체 리턴받기
		con = getConnection();

		// 외부로부터 전달받은 MemberDTO객체에 저장된 데이터를 활용하여
		// member테이블에 INSERT작업 수행
		// => 단, 2단계(DB연결)까지의 작업은 이미 getConnection()메서드에서 수행된 상태

		// 3단계. SQL구문 작성 및 전달
		// => idx컬럼(첫번째 컬럼)의 경우 AUTO_INCREMENT속성이 적용되어 있으므로
		// SQL구문 작성 시 null값을 전달하면 자동으로 번호가 부여됨
		// 1) SQL구문 작성
		String sql = "INSERT INTO member VALUES(null,?,?,?,?,?)";

		try {
			// 2) Connection객체를 통해 SQL구문을 전달하여, PreparedStatement객체 리턴받기
			pstmt = con.prepareStatement(sql);
			// 3) PreparedStatement객체의 setXXX()메서드를 호출하여 만능문자(?) 데이터 교체
			// => 교체에 사용될 데이터는 MemberDTO객체(member)에 저장되어 있으므로
			// MemberDTO객체의 Getter(getXXX())메서드를 호출하여 데이터 꺼내오기
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getGender());
			pstmt.setInt(3, member.getAge());
			pstmt.setString(4, member.getId());
			pstmt.setString(5, member.getPassword());

			// 4단계. SQL구문 실행 및 결과 처리
			// => PreparedStatement객체의 executeXXX()메서드 호출하여 쿼리 실행
			// 이 때, 리턴되는 결과값을 전달받을 수 있음
			insertCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL구문 오류 발생 : (INSERT 실패)");
			e.printStackTrace();
		}
		// Connection객체 사용 완료 후 자원 반환을 위해 close()메서드 호출하기
		finally {
			// 자원을 반환하기 위해 close()메서드를 호출하여
			// 파라미터로 반환 할 Connection객체를 전달
			close(pstmt);
			close(con); // 주의! con.close()호출은 자원을 직접 반환하는 코드이다!
		}

		// INSERT 작업 수행 결과 리턴
		return insertCount;
	}

	// 2. 데이터 수정 작업을 수행할 update()메서드 정의
	// => 파라미터 : 수정할 회원 정보가 저장된 MemberDTO객체(member)와
	// 수정할 회원을 구별하기 위한 기존의 id값을 별도로 전달받음
	// => 리턴타입 : int(deleteCount) - 데이터 수정 작업 후 결과 리턴

	public int update(MemberDTO member, String oldId) {
		int updateCount = 0;
		PreparedStatement pstmt = null;

		// getConnection()메서드를 호출하여 DB연결 후 생성된 Connection객체 리턴받기
		Connection con = getConnection();

		String sql = "UPDATE member SET name=?, gender=?, age=?, id=?, password=? WHERE id=?";

		try {
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getGender());
			pstmt.setInt(3, member.getAge());
			pstmt.setString(4, member.getId());
			pstmt.setString(5, member.getPassword());
//			member.setId(oldId);
//			pstmt.setString(6, member.getId());
			pstmt.setString(6, oldId);

			updateCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(con);
		}
		return updateCount;
	}

	public int delete(MemberDTO member) {
		int deleteCount = 0;
		Connection con = getConnection();
		PreparedStatement pstmt = null;

		String sql = "DELETE FROM member WHERE id=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			deleteCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(con);
		}
		return deleteCount;
	}

	public void select() {

		Connection con = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select구문으로 조회 시 ResultSet에 묶여져서 있음
		String sql = "SELECT * FROM member";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
//				int idx = rs.getInt("idx");
//				String name = rs.getString("name");
//				String gender = rs.getString("gender");
//				int age = rs.getInt("age");
//				String id = rs.getString("id");
//				String password = rs.getString("password");
//				
				// 같음

				int idx = rs.getInt(1);
				String name = rs.getString(2);
				String gender = rs.getString(3);
				int age = rs.getInt(4);
				String id = rs.getString(5);
				String password = rs.getString(6);
				System.out.println(idx + ", " + name + ", " + gender + ", " + age + ", " + id + ", " + password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
			close(con);
		}
	}

	
	// 회원 전체 목록 중에서 첫번 째 레코드만 외부로 리턴하는 select2()메서드 정의
	public MemberDTO select2() {

		Connection con = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM member";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			// 반복이 아닌 1개 레코드에만 접근하기 위해 조건문을 사용
			if(rs.next()) {
//				int idx = rs.getInt(1);
//				String name = rs.getString(2);
//				String gender = rs.getString(3);
//				int age = rs.getInt(4);
//				String id = rs.getString(5);
//				String password = rs.getString(6);
				
				// 복수개의 데이터를 하나의 객체로 묶기 위해
				// MemberDTO객체를 생성한 후 해당 객체에 데이터베이스레코드 데이터 저장 가능
				MemberDTO member = new MemberDTO();
				// MemberDTO객체의 Setter를 호출하여 조회된 컬럼데이터 저장하기
				member.setIdx(rs.getInt("idx"));
				member.setName(rs.getString("name"));
				member.setGender(rs.getString("gender"));
				member.setAge(rs.getInt("age"));
				member.setId(rs.getString("id"));
				member.setPassword(rs.getString("password"));
			
				// 1개 레코드 데이터가 저장된 MemberDTO객체를 외부로 리턴
				// => 데이터가 6개이므로 데이터를 직접적으로 리턴은 불가능하지만
				//    MemberDTO객체 하나로 관리되므로 MemberDTO객체 자체를 리턴 가능하다!
				return member;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
			close(con);
		}
		return null;
	}
}
