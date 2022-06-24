package jdbc;

public class JDBC_Member_Management {

	public static void main(String[] args) {
		// main()메서드가 포함되는 클래스는
		// 실질적인 데이터 처리 작업이 수행되지 않고
		// 데이터를 처리하는 모듈화 된 객체들을 연계하여
		// 제어를 통해 데이터 처리가 가능하도록 하는 클래스
		// ex) 데이터 준비작업, 다른 객체 인스턴스 생성 및 메서드 호출,
		// 	   결과 처리 등
		JDBC_Member_Management mm = new JDBC_Member_Management();
//		mm.insert();
//		mm.update();
//		mm.delete();
		mm.select();
	}

	// 데이터베이스 처리 작업을 수행하기 전 데이터 준비작업을 통해
	// DAO클래스 인스턴스를 생성하고 메서드를 호출하여 필요한 데이터를 전달하여
	// 원하는 데이터베이스 작업을 수행하도록 제어하는 메서드 정의
	public void insert() {

		// 회원가입에 필요한 정보를 외부로부터 입력받았다고 가정하고 변수에 저장
		// 이름 : 강감찬, 성별 : 남, 나이 : 35, 아이디 : kang, 패스워드 : kang123
		String name = "배중손";
		String gender = "남";
		int age = 41;
		String id = "bae";
		String password = "bae123";
		
		// 데이터를 전달하기 전 하나의 객체로 관리하기 위해 MemberDTO객체 (member) 생성 후
		// MemberDTO객체에 이름, 성별, 나이, 아이디, 패스워드를 저장
		
		// 1) 기본 생성자를 호출하여 객체 생성 후 Setter로 데이터 저장하는 방법
//		MemberDTO member = new MemberDTO();
//		member.setName(name);
//		member.setGender(gender);
//		member.setAge(age);
//		member.setId(id);
//		member.setPassword(password);
		
		// 2) 파라미터 생성자를 호출하여 초기데이터를 한꺼번에 저장하는 방법
		//		=> 단, 번호(idx) 값은 전달받아 사용하는 데이터가 아니므로 아무값이나 전달 가능
		MemberDTO member = new MemberDTO(0, name, gender, age, id, password);
		// 데이터베이스 처리 작업을 수행하는 MemberDAO객체(dao) 생성
		MemberDAO dao = new MemberDAO();
		
		// MemberDAO객체의 insert()메서드를 호출하여 회원 추가 작업 수행
		// => 추가에 필요한 데이터를 MebmerDTO타입 객체 형태로 전달
		int result = dao.insert(member);
		
		// INSERT작업 수행 결과값을 리턴받아 판별 작업 수행
		// => 0보다 클 경우 : "INSERT 작업 성공! 출력, 아니면 "INSERT작업 실패!" 출력
		if(result > 0) System.out.println("INSERT작업 성공!");
		else		   System.out.println("INSERT작업 실패!");
		
		
	}
	
	public void update() {
		// 수정할 데이터를 외부로부터 입력받았다고 가정
		String name = "유성룡";
		String gender = "남";
		int age = 67;
		String id = "ryu";
		String password = "ryu1212";

		// 수정할 데이터는 MemberDTO객체에 저장
		MemberDTO member = new MemberDTO(0, name, gender, age, id, password);
		
		// 수정 시 WHERE절에 사용될 데이터를 전달받았다고 가정
		String oldId = "song"; 
		
		// MemberDAO클래스 인스턴스 생성 후 update()메서드를 호출하여 데이터 수정 작업 수행
		// => 파라미터 : MemberDTO객체(member), oldId
		// => update()메서드에 수행할 일 : oldId에 해당하는 id값을찾아
		//	  이름, 성별, 나이, 아이디, 패스워드를 수정(UPDATE)
		MemberDAO dao = new MemberDAO();
		
		int updateCount = dao.update(member, oldId);
		// UPDATE 작업 수행 결과를 리턴(updateResult)받아 0보다 크면 "UPDATE 성공!", 아니면 "UPDATE 실패!" 출력
		if(updateCount > 0) System.out.println("UPDATE작업 성공!");
		else		   		 System.out.println("UPDATE작업 실패!");
		
		
	}
	
	// DELETE작업을 수행하는 delete()메서드 정의
	// => 삭제할 회원의 id값을 전달받아 MemberDAO객체의 delete()메서드 호출하여 전달 후
	//    삭제 작업을 수행하고 결과값을 리턴받아
	//	  0보다 크면 "DELETE 성공!", 아니면 "DELETE 실패!" 출력
	public void delete() {
		
		String id = "ryu";
		
//		MemberDTO member = new MemberDTO(0, name, gender, age, id, password);
		MemberDTO member = new MemberDTO();
		member.setId(id);
		
		MemberDAO dao = new MemberDAO();
		
		int deleteCount = dao.delete(member);
		// UPDATE 작업 수행 결과를 리턴(updateResult)받아 0보다 크면 "UPDATE 성공!", 아니면 "UPDATE 실패!" 출력
		if(deleteCount > 0) System.out.println("DELETE작업 성공!");
		else		   		 System.out.println("DELETE작업 실패!");
	}
	
	// 회원 목록 조회 작업을 요청하는 select()메서드 정의
	public void select() {
		
		MemberDAO dao = new MemberDAO();
//		dao.select();
		
		// 1개 레코드 정보를 리턴하는 select()메서드를 호출하고
		// 리턴되는 1개 레코드 정보(MemberDTO 객체)를 리턴받아
		// 저장되어 있는 1개 레코드 정보(번호, 이름, 성별, 나이, 아이디, 패스워드)를 꺼내서 출력하기
		MemberDTO member = dao.select2();
		// MemberDTO객체의 Getter를 호출하여 데이터 꺼내기
		int idx = member.getIdx();
		String name = member.getName();
		String gender = member.getGender();
		int age = member.getAge();
		String id = member.getId();
		String password = member.getPassword();
		
		System.out.println(idx + ", " + name + ", " + gender + ", " + age + ", " + id + ", " + password);
	}
	
	
	
}
