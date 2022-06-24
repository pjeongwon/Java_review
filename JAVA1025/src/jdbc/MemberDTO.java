package jdbc;

/* DTO(Data Transfer Object, 데이터 전송 객체)
- DAO 가 데이터베이스와 연결을 통해 실제 작업을 수행할 때
주고 받는 데이터들을 하나의 객체로 담아 전송하기 위해 사용하는 객체
- 주로 XXXDTO(자바), XXXBean(JSP, 스프링) 의 이름을 사용
(ex. 회원관리 작업에 사용되는 DTO 클래스 : MemberDTO 등)
 */

public class MemberDTO { 
	private int idx;
	private String name;
	private String gender;
	private int age;
	private String id;
	private String password;
	
	// 기본 생성자 정의
	public MemberDTO() {}

	// 멤버변수 전체를 전달받아 초기화하는 파라미터 생성자 정의
	public MemberDTO(int idx, String name, String gender, int age, String id, String password) {
		super();
		this.idx = idx;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.id = id;
		this.password = password;
	}

	// 멤버변수에 접근하는 Getter/Setter 정의
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

	




