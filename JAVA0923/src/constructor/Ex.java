package constructor;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 생성자(Constructor)
		 * - 생성자 메서드 라고도 함
		 * - 객체(인스턴스)가 생성될 때 호출되어,
		 * 	 멤버변수 초기화나 객체 생성 시 특정 작업을 수행
		 * - 메서드 구조와 유사하나, 1) 리턴타입이 없고, 2) 이름이 클래스명과 동일함
		 * - 메서드와 마찬가지로 파라미터는 있을 수도 있고, 없을 수도 있다.
		 * - 클래스 내에는 반드시 한 개 이상의 생성자가 존재해야함
		 * - 클래스 내에서 생성자를 정의하지 않으면, 컴파일러에 의해 기본 생성자가 자동으로 생성됨
		 * 	 => 기본 생성자(Default Constructor) : 파라미터가 없고, 수행할 코드가 없음
		 * - 생성자 자동 정의 단축키 : ALT + SHIFT + S -> O / MAC : option + command + s
		 * 
		 *  < 생성자 정의 기본 문법 > 
		 *  [제한자] 클래스명([파라미터...]){
		 *  	// 객체 생성 시 수행할 작업들...
		 *  }
		 * 
		 * < 기본 생성자 형태 >
		 * [제한자] 클래스명() {}
		 */
		DefaultPerson dp = new DefaultPerson(); 
		// => new 키워드 뒤의 DefaltPerson() 코드가 생성자를 호출하는 부분
		// => DefaultPerson 클래스 인스턴스를 생성하면서 파라미터가 없는 생성자 호출
		//	  이 때, 클래스 내에서 아무런 생성자도 정의하지 않을 경우
		//	  자바 컴파일러에 의해 자동으로 생성되는 기본 생성자가 호출됨
		// => 수행할 작업이 없으므로 멤버변수 name에 null값으로 자동 초기화 됨
		System.out.println("DefaultPerson의 name = " + dp.name);
		
		
		// DefaultPerson2 클래스의 인스턴스 생성
		DefaultPerson2 dp2 = new DefaultPerson2();
		// => 인스턴스 생성 시 기본 생성자를 호출하였으며
		//    이 때, 생성자 내에서 출력문 실행 및 멤버변수 name을 "홍길동"으로 초기화했으므로
		//	  멤버변수 값 출력 시 "홍길동" 출력됨
		System.out.println("DefaultPerson2의 name = " + dp2.name);
		
		// ParameterPerson 클래스의 인스턴스 생성
		// => 이 때, 전달인자로 초기화 할 이름("홍길동")을 전달
		ParameterPerson pp = new ParameterPerson("홍길동");
		System.out.println("ParameterPerson의 name = " + pp.name);
		
		ParameterPerson pp_2 = new ParameterPerson("이순신");
		System.out.println("ParameterPerson의 name = " + pp_2.name);
		
		// 이미 파라미터를 전달받는 생성자가 존재하므로
		// 컴파일러에 의해 기본 생성자가 자동으로 정의되지 않는다!
		// ParameterPerson pp_3 = new ParameterPerson(); 컴파일 에러 발생!
		// => 파라미터가 없는 생성자가 존재하지 않기 때문에

		System.out.println("--------------------------------------------");
		ParameterPerson2 pp_3 = new ParameterPerson2("장길산", 73);
		System.out.println("ParameterPerson2의 name = " + pp_3.name);
		System.out.println("ParameterPerson2의 age = " + pp_3.age);
		
		ParameterPerson2 pp_4 = new ParameterPerson2("서희", 67);
		System.out.println("ParameterPerson2의 name = " + pp_4.name);
		System.out.println("ParameterPerson2의 age = " + pp_4.age);
	}

}

// 생성자를 정의하지 않는 클래스
class DefaultPerson{
//	String name;
	String name = "홍길동";
	// 클래스 내에서 아무런 생성자도 정의하지 않을 경우
	// 자바 컴파일러에 의해 기본 생성자(Default Constructor)가 

	//	public DefaultPerson() {} // 기본(Default) 생성자의 형태
	// => 주의! 클래스명과 생성자명이 동일하지 않을 경우 
	//	  메서드로 취급되어 리턴타입이 없다는 오류 메시지가 출력됨
	// => 파라미터로 아무것도 전달받지 않고, 호출 시 수행할 작업도없는 생성자
}		
class DefaultPerson2{
	String name;
	
	// 인스턴스 생성 시점(new DefaultPerson2())에 호출됨
	public DefaultPerson2() {
		// 생성자 내에서 인스턴스 생성 시 수행할 초기 작업을 기술할 수 있다!
		// ex) 멤버변수 초기화 등
		System.out.println("DefaultPerson2() 생성자 호출됨!");
		
		// 생성자 내에서도 메서드와 마찬가지로 멤버변수 접근 가능
		name = "홍길동";
	}
}

// ParameterPerson 클래스 정의
class ParameterPerson{
	String name;
	
	// 파라미터로 String타입 데이터 1개(newName)를 전달받아 멤버변수 name을 초기화하는 생성자 정의
	public ParameterPerson(String newName) {
		System.out.println("ParameterPerson(String)생성자 호출됨!");
		name = newName;
		
	}
	// 하나 이상의 생성자를 직접 정의했을 경우 컴파일러에 의한 기본 생성자는 자동 생성되지 않는다!
	// => ParameterPerson클래스 내에는 ParameterPerson() {}생성자가 존재하지 않는다!
	
}


class ParameterPerson2{
	String name;
	int age;
	
	// 메서드와 마찬가지로 생성자도 복수개의 파라미터를 가질 수 있다.
	// 이름(newName)과 나이(newAge)를 전달받아 초기화하는 생성자 정의
	public ParameterPerson2(String newName, int newAge) {
		System.out.println("ParameterPerson2(String, int) 생성자 호출됨!");
		name = newName;
		age = newAge;
		
		
	}
}

