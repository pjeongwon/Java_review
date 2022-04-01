package overloading;

public class Ex3 {

	public static void main(String[] args) {
		// 생성자 오버로딩
		// - 생성자 호출 시 다양한 형태의 파라미터 전달을 위함
		// - 메서드 오버로딩과 방법 동일함
		
		Person3 p1 = new Person3();
		System.out.println(p1.name);
		
		Person3 p2 = new Person3("임꺽정");
		System.out.println(p2.name);
	}

}

class Person3{
	String name;
	
	// 기본 생성자 정의 - 멤버변수 name을 "홍길동"으로 초기화
	public Person3() {
		System.out.println("Person3() 생성자 호출됨!");
		name = "홍길동";
	}
	
	// 파라미터 생성자 정의(오버로딩) - 문자열 1개(newName)를 전달받아 멤버변수 name 초기화
//	public Person3(String newName) {
//		System.out.println("Person3(String newName) 생성자 호출됨!");
//		name = newName;
//	}
	
	// 생성자 자동 생성 단축키 : Alt + Shift + S -> O
	
	public Person3(String name) {
		System.out.println("Person3(String newName) 생성자 호출됨!");
		this.name = name;
	}
	
	
}