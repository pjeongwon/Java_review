package api_object;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * toString()메서드 ~~~ 메서드 이름이 toXXX이면 XXX로 바꿔줌 
		 * - 어떤 객체의 정보를 문자열로 변환하여 리턴
		 * - 기본적으로 Object클래스의 toString()메서드는 
		 *   객체의 정보가 "패키지명.클래스명@해시코드값" 형태로 리턴하도록 정의되어 있음
		 * - 일반적으로 객체의 정보란 객체 내에 저장된 멤버변수에 저장된 데이터(값)를 의미하므로
		 *   Object클래스로부터 상속받은 toString()메서드를 오버라이딩하여
		 *   객체 내의 멤버변수 값을 문자열로 결합하여 리턴하도록 수정해야함 
		 * - toString()메서드를 출력문 내에서 호출하는 경우 결가값을 출력하는 코드이나,
		 *   출력문 내에서는 toString()메서드를 생략해도 동일한 결과
		 *   (= 즉, 출력문 내에서 객체 정보는 참조변수만으로도 출력이 가능하다!)
		 * - 자바에서 제공하는 대부분의 클래스(API)들은 toString()메서드가 오버라이딩 되어있으므로
		 *   객체의 정보(멤버변수에 저장된 값)들을 문자열로 결합하여 리턴받을 수 있다!
		 *    
		 * toString()메서드 자동 생성 단축키 : Alt + Shift + S -> S
		 */
		Student s = new Student("20211111", "홍길동", 23);
		System.out.println("학생 s의 정보 : " + s.toString());
		System.out.println("학생 s의 정보 : " + s); // toString()메서드 호출이 생략되어 있음
		// 학생 s의 정보 : api_object.Student@7852e922
		System.out.println("학생 s의 클래스 명 : " + s.getClass().getName());
		System.out.println("학생 s의 주소값(= 해시코드 값) : " + s.hashCode());
		// 결국, Object클래스의 toString()메서드는
		// getClass().getName + '@' + hashCode()코드를 수행한 것과 같다!
		
		System.out.println("============================================");
		
		Student2 s2 = new Student2("20211111", "홍길동", 23);
		System.out.println("학생 s2의 정보 : " + s2.toString());
		System.out.println("학생 s2의 정보 : " + s2); // toString()메서드 호출이 생략되어 있음
		
		// 주의! 출력문 외에는 toString()메서드를 생략할 수 없다!
		// => 즉, toString()메서드 결과값을 리턴받아 변수에 저장할 경우 생략 불가능
		// s2객체의 정보를 리턴받아 String타입 변수 studentInfo에 저장
//		String studentInfo = s2; // 컴파일 에러 발생! (Type mismatch: cannot convert from Student2 to String)
		String studentInfo = s2.toString();
		System.out.println("학생 s2의 정보 : "  + studentInfo);
	}

}

class Student{
	String id;
	String name;
	int age;
	
	public Student(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
}


class Student2{
	String id;
	String name;
	int age;
	
	public Student2(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// toString()메서드 자동 생성 단축키 : Alt + Shift + S -> S
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	// Object클래스의 toString() 메서드 오버라이딩
//	@Override
//	public String toString() {
//		// 현재 객체의 멤버변수 값들을 하나의 문자열로 결합하여 리턴
//		return "학번 : " + id + ", 이름 : " + name + ", 나이 : " + age;
//	}

	
	
}














