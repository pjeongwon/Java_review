package keyword_super;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 상속에서의 생성자
		 * - 생성자는 상속되지 않음
		 * 	 서브클래스의 인스턴스 생성 전에 슈퍼클래스의 인스턴스를 먼저 생성한 후
		 * 	 그 다음 서브클래스의 인스턴스를 생성함
		 *   => 이 때, 서브클래스의 생성자 내에서 먼저 자동으로 슈퍼클래스의 기본 생성자 호출
		 *   => 슈퍼클래스에서 생성자 실행이 끝나면 서브클래스의 생성자로 돌아와서 다음 코드 실행
		 *   	즉, 슈퍼클래스의 생성자 코드가 먼저 실행된 후 서브클래스 생성자 코드가 실행됨
		 *   	슈퍼클래스의 생성자를 호출하게 되며, 슈퍼클래스의 생성자가 모두 실행된 후
		 *  	서브클래스 생성자 내의 코드가 실행됨
		 * - 만약, 슈퍼클래스에서 기본 생성자 없이 파라미터 생성자만 정의했을 경우
		 *   서브클래스에서 슈퍼클래스의 기본 생성자를 찾기 못하므로 오류가 발생함
		 *   따라서, 슈퍼클래스에 기본 생성자를 직접 정의하거나,
		 *   파라미터 생성자를 명시적으로 호출해야한다!
		 *   
		 * 생성자 super()
		 * - 서브클래스의 생성자 내에서 슈퍼클래스의 생성자를 명시적으로 호출하는 코드
		 * - 서브클래스의 생성자 내에서 생성자 super()코드가 생략되어 있을 경우
		 *   컴파일러에 의해 슈퍼클래스의 기본 생성자를 호출하는 super()코드가 자동으로 추가됨
		 * - 주로, 슈퍼클래스의 기본 생성자가 없는 상태에서 파라미터 생성자만 정의할 경우
		 *   서브클래스 생성자에서 슈퍼클래스 기본 생성자가 호출되면 오류가 발생하므로
		 *   이 때, 슈퍼클래스의 파라미터 생성자를 명시적으로 호출하는 용도로 사용
		 *   또는, 슈퍼클래스의 생성자에서 초기화하는 코드와 
		 *   서브클래스에서 초기화하는 코드가 중복될 경우 중복 제거를 위해 
		 *   슈퍼클래스의 생성자에서 슈퍼클래스의 멤버는 대신 최화하도록 하는 용도로 사용
		 * - 생성자 this()와 마찬가지로 생성자 내에서 반드시 첫번째로 실행되어야 함
		 *   (주석문을 제외하고 실행문 중에서 가장 먼저 실행되어야 함)
		 *   => 따라서, 생성자 this()와 생성자 super()는 하나의 생성자에서 함께 기술 불가!
		 *   => 만약, 오버로딩 된 생성자 호출 this()와 슈퍼클래스 생성자 호출 super()가
		 *      함께 실행되어야 하는 경우 생성자 this()를 통해 자신의 다른 생성자를 호출한 뒤
		 *      해당 생성자 내에서 생성자 super()를 통해 슈퍼클래스에 접근하면 된다!
		 *   
		 * < 생성자 super() 기본 문법 > 
		 * super(전달할 데이터...);
		 *    
		*/
		
		Child2 c = new Child2();
		SpiderMan2 sm2 = new SpiderMan2();
		
	}

}

class Parent2{
	String name;
	int age;
	
//	public Parent2() {
//		// Parent2클래스는 별도의 상속표기가 없으므로 암묵적으로 Object클래스를 상속받는다.
//		// 따라서, Parent2()생성자 내에서 가장 먼저 슈퍼클래스인 Object클래스의
//		// 기본 생성자(Object())를 자동으로 호출함
//		super(); // 슈퍼클래스(Object)의 기본생성자(Object())를 호출하는 코드(생략 가능)
//		System.out.println("Parent2()생성자 호출됨!");
//	}

	
	// 파라미터 생성자 정의시 기본 생성자(Parent2())는 자동으로 생성되지 않는다.
	// => 만약, 서브클래스에서 기본생성자를 호출하게 되면 오류 발생하므로 주의!!!
	public Parent2(String name, int age) {
//		super(); // 슈퍼클래스(Object)의 기본생성자(Object())를 호출하는 코드(생략 가능)
		this.name = name;
		this.age = age;
		System.out.println("Parent2(String, int)생성자 호출됨!");
	}
	
}

class Child2 extends Parent2{
	String childVar;
	
	public Child2() {
		// Child2클래스의 인스턴스 생성 시 Child2()생성자가 호출되면
		// 생성자 내에서 가장 먼저 슈퍼클래스인 Parent2클래스의 기본 생성자를 자동으로 호출함
//		super(); // 슈퍼클래스(Parent2)의 기본 생성자를 호출하는 코드(생략 가능)
		// => 만약, 슈퍼클래스에서 기본 생성자를 정의하지 않고 파라미터 생성자만 정의할 경우
		//	  존재하지 않는 기본 생성자를호출하게 되므로 오류 발생
		//	  The constructor Parent2() is undefined
		// => 따라서, 이러한 경우에는 슈퍼클래스에서 기본 생성자를 직접 정의하거나
		//	  슈퍼클래스의 파라미터 생성자를 명시적으로 호출해야한다!
		//	  이 때, 명시적으로 슈퍼클래스의 생성자를 호출하는 코드가 super()이며,
		//	  호출 시 전달인자(데이터)를 포함하는 형식으로 파라미터 생성자를 호출해야함
		super("홍길동", 20); // Parent2(String name, int age)생성자가 명시적으로 호출됨
		
		System.out.println("Child2() 생성자 호출됨!");
		// => Parent2() 생성자에서 호출한 Object()생성자 내의 작업이 모두 끝난 후
		// 	  다시 Parent2() 생성자로 돌아와서 작업을 모두 끝내면
		//	  그 다음 마지막으로 실행되는 메서드
		
	}
}

// =======================================================================
// 생성자 super()를 사용하는 또 다른 이유

class Person2{
	String name;
	int age;
	
	public Person2() {}

	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Person2(String, int) 호출.");
	}
}

class SpiderMan2 extends Person2{
	boolean isSpider;
	
	public SpiderMan2() {
//		super("피터파커", 16); // name과 age는 부모가 대신 초기화
//		this.isSpider = true; // isSpider는 자신이 직접 초기화

		// 기본생성자에서 자신의 파라미터 생성자를 호출하여 멤버변수를 초기화할 경우
		// => 생성자 this() 사용 가능
		// => 단, 생성자 super()와 생성자 this()는 동시 사용 불가
		//    (항상 첫 문장에서 실행되어야 하므로)
		// => 따라서, 자신의 다른 생성자를 호출하여 슈퍼클래스의 생성자를 간접적으로 호풀하도록
		//    현재 생성자에서는 생성자 super()를 호출하지 않도록 해야함
		this("피터파커", 16, true);
	}
	
	public SpiderMan2(String name, int age, boolean isSpider) {
//		this.name = name; // super.name과 동일한 코드
//		this.age = age; // super.age과 동일한 코드
//		this.isSpider = isSpider;
		// Person2(String, int)생성자와, name, age초기화 코드가 중복됨
		// 이처럼 슈퍼클래스의 생성자와 상속받은 멤버변수에 대한 초기화 코드가 중복될 경우
		// 서브클래스의 생성자에서 직접 초기화하지 않고
		// 슈퍼클래스의 파라미터 생성자를 호출하여 간접적으로 상속받은 멤버변수를 초기화하고,
		// 서브클래스에서는 자신의 클래스에서 선언한 멤버변수만 직접 초기화하여 중복 제거 가능
		super(name, age); // name과 age는 부모가 대신 초기화
		this.isSpider = isSpider; // isSpider는 자신이 직접 초기화
		System.out.println(name + age + isSpider);
	}
	
}







