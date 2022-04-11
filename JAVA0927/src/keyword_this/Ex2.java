package keyword_this;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * < this 키워드 사용법 >
		 * 2. 생성자 this()
		 * - 생성자 내에서 자신의 클래스 내의 또 다른 생성자를 호출하는 키워드
		 * - 레퍼런스 this와 동일하게 자신의 인스턴스에 접근하여
		 *   다른 생성자를 호출하는 용도로 사용
		 * - 생성자 오버로딩 시 멤버변수 초기화 코드가 중복되므로
		 *   초기화 코드 중복을 제거하기 위해 사용
		 *   => 여러 생성자에서 각각 멤버변수를 중복으로 초기화하는 대신, 
		 *   	하나의 생성자에서만 초기화 작업을 수행하고
		 *   	나머지 생성자에서는 해당 초기화 생성자를 호출하여
		 *   	초기화할 값(데이터)만 전달 후 대신 초기화를 수행
		 * - 주의사항! 생성자 내에서 실행문 중 가장 첫 문장으로 호출되어야 한다!(주석 제외)
		 * 	 => 생성자 this() 호출 코드보다 다른 코드가 먼저 실행될 수 없다!
		 * 
		 */ 
		
		Person2 p = new Person2();
		// => Person2() 생성자가 호출되면 생성자 내에서 다시 
		//    Person2(String, int) 생성자를 가장 먼저 호출하고
		//	  초기화 작업 수행 후 "Person2(String, int) 생성자 호출됨!" 메시지 출력 후
		//	  다시 기본 생성자로 돌아와서 "Person2() 생성자 호출됨!" 메시지 출력됨
		System.out.println("이름 : " + p.name);
		System.out.println("나이 : " + p.age);
		
	}

}

class Person2{
	String name;
	int age;
	
	// 생성자 오버로딩
	// 1. 기본 생성자 정의
	// => 이름("홍길동")과 나이(20)를 초기화하는 생성자
	public Person2() {
		// 생성자 내에서 멤버변수 초기화 코드가 중복되므로
		// 중복 제거를 위해 자신의 클래스 내의 또 다른 생성자를 호출해야함
//		Person2("홍길동", 20); // 생성자 호출은 이름만으로 불가능

		// 따라서, 자신의 클래스 내의 다른 생성자 호출 시 생성자명 대신 this 사용하여 호출 가능
		this("홍길동", 20);
		// => public Person2(String name, int age) {} 생성자를 호출하여 데이터를 전달하면
		//    해당 생성자가 대신 데이터를 초기화 해줌
		
//		name = "홍길동";
//		age = 20;
		System.out.println("Person2() 생성자 호출됨!");
		
		// ---------- 주의 ----------- 
		// 생성자 내에서 다른 코드보다 아래쪽(뒤)에 생성자 this() 올 수 없다!
//		this("홍길동", 20); // 컴파일 에러 발생!
		// => Constructor call must be the first statement in a constructor
		//	  (생성자 호출은 반드시 생성자 내의 첫 문장에서 호출되어야 한다!)
	}
	
	public Person2(String name) {
		// public Person2(String name, int age) {} 생성자 호출하여 대신 초기화		
		// => 전달받은 name값을 그대로 다시 전달하고, age는 자신의 값을 직접 지정
		this(name, 20);

//		this.name = name;
//		age = 20;
		System.out.println("Person2(String) 생성자 호출됨!");
	}
	
	// 3. 이름과 나이를 전달받아 초기화하는 생성
	// => 멤버변수 모두를 초기화하는 생성자는 다른 생성자를 호출하지 않고
	//    직접 초기화하는 코드를 가져야 한다! 
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person2(String, int) 생성자 호출됨!");
	}
	
	
	
}












