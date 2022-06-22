package oop_interface;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 인터페이스(Interface)
		 * - 물리적으로는 클래스와 동일하나 문법적으로 다른 구조를 갖는 형태
		 * - 클래스와 달리 선언 시 class키워드 대신 interface키워드 사용
		 * 	 ex) class Person{} -> interface Person{}
		 * - 인터페이스는 상수와 추상메서드만 가질 수 있다.
		 * 	 => 모든 멤버변수는 public static final이 붙은 상수로 취급됨(생략해도 동일)
		 * 		(final로 인해 값 변경 불가, static으로 인해 클래스명만으로 접근 가능하며,
		 * 		public으로 인해 누구나 접근 가능)
		 *   => 모든 메서드는 public abstract가 붙은 추상메서드로 취급됨(생략해도 동일)
		 *   	(abstract로 인해 메서드 바디(구현부)를 가질 수 없으며, 
		 *   	public으로 인해 누구나 접근 가능)
		 * - 추상클래스와 마찬가지로 객체 생성이 불가능(추상메서드 때문)
		 * 	 => 단, 참조변수 타입으로는 사용 가능 = 업캐스팅을 통한 다형성 활용 가능
		 * - 추상메서드 구현(오버라이딩)을 강제하고, 변수를 상수로만 강제하여 코드의 통일성 향상
		 *   = 추상클래스와 유사하나 추상클래스보다 더 강력한 강제성을 부여하는 것이 목적
		 *     (모든 메서드는 추상메서드, 모든 멤버변수는 상수로만 강제)
		 * 
		 */
		
		// 인터페이스도 추상클래스와 마찬가지로 인스턴스 생성 불가
//		MyInterface mi = new MyInterface(); // 오류발생! (Cannot instantiate the type MyInterface)
		
		// 인터페이스를 구현한 구현체 클래스(서브클래스)를 통해 사용 가능
		MySubClass msc = new MySubClass();
		msc.method1();
		msc.method2();
		
		// MyInterface인터페이스 내의 NUM가 static final이라는 사실에 대한 증명
		// 1. static으로 인해 외부에서 클래스명만으로 접근 가능
		// 2. final로 인해 값 변경 불가
//		MyInterface.NUM1 = 10; // 오류발생!
		// 클래스(인터페이스)명만으로 접근은 가능(static), 변경 불가(final)
		// => The final field MyInterface.NUM2 cannot be assigned
//		MySubClass.NUM2 = 20; // 오류발생! 값 변경 불가
//		msc.NUM1 = 10; // 오류발생! 값 변경 불가
		
		// MySubClass -> MyInterface 업캐스팅
		MyInterface mi = msc;
		// 업캐스팅 후에는 참조 영역의 축소로 인해 공통멤버(상속된 멤버)에만 접근 가능
		mi.method1();
		mi.method2();
//		System.out.println(mi.NUM1);
		System.out.println(MyInterface.NUM1);
		System.out.println(MyInterface.NUM2);
	
	}

}

// 추상클래스 정의 예
abstract class MyClass{
	// 추상클래스 내의 모든 멤버변수는 상수가 아니며, 선언에 따라 성격이 달라짐
	public static final int NUM1 = 10; // 상수
	int NUM2 = 20; // ★ 인스턴스 멤버변수
	
	public abstract void method1(); // 추상메서드(반드시 추상클래스 내에 위치해야함)
	
	void method2() { // 일반 메서드
	}
}

// 인터페이스 정의 
// => class키워드 대신 interface키워드를 사용하여 정의
interface MyInterface{
	// 인터페이스 내의 모든 멤버변수는 상수(public static final)이다!
	public static final int NUM1 = 10; // 상수
	int NUM2 = 20; // 상수(public static final 생략되어 있음)
	
	// 인터페이스는 생성자를 가질 수 없다!
//	public MyInterFace() {} // 오류발생! (Interfaces cannot have constructors)
	
	
	// 인터페이스 내의 모든 메서드는 추상메서드(public abstract)이다!
	public abstract void method1(); // 추상메서드(바디를 가질 수 없다!)
//	void method2() {} // 일반 메서드 정의 시 오류 발생!(Abstract methods do not specify a body)
	// => 인터페이스 내의 모든 메서드는 추상메서드(public abstract)이므로 바디{}를 정의할 수 없다!
	void method2(); // 추상메서드(public abstract 생략되어 있음)
	
}

// MyInterface인터페이스를 상속받는 서브클래스 MySubClass클래스 정의
// 단, 인터페이스 상속 시 extends키워드를 사용하면 상속이 불가능하다!
// => The type MyInterface cannot be the superclass of MySubClass; a superclass must be a class
//    (MyInterface는 MySubClass의 슈퍼클래스가 될 수 없다! 슈퍼클래스는 클래스이어야만 한다!)
//class MySubClass extends MyInterface{} // 오류발생!

// 인터페이스를 상속받아 '확장'하기보단 인터페이스 내의 추상메서드를 '구현'하는 의미가 강하므로
// 확장(extends)대신 구현(implements)이라는 의미의 키워드를 사용하여 상속을 표현
// => 클래스는 상속받아 '확장'하고, 인터페이스는 상속받아 '구현'한다.
// => 서브클래스 정의 시 클래스명 뒤에 implements키워드를 붙이고 인터페이스명을 지정
class MySubClass implements MyInterface{
	// 인터페이스를 상속받아 구현하는 서브클래스(= 구현체)에서는
	// 반드시 인터페이스 내의 추상메서드를 오버라이딩하여 바디{}를 '구현'해야함

	@Override
	public void method1() {
		System.out.println("서브클래스(구현체)에서 구현(오버라이딩)한 method1()!");
	}
	
	// 상속 관계에서 오버라이딩 시 슈퍼클래스의 접근제한자보다 좁아질 수 없다!
	// => 인터페이스 내의 모든 추상메서드는 접근제한자가 public이므로
	//    오버라이딩 시의 메서드 접근제한자는 무조건 public이어야한다!
//	@Override
//	protected void method2() {} // 오류발생! public보다 좁은 protected 사용 불가!
	// => Cannot reduce the visibility of the inherited method from MyInterface
	@Override
	public void method2() { // 부모의 메서드 접근제한자가 public이므로 public만 지정 가능
		System.out.println("서브클래스(구현체)에서 구현(오버라이딩)한 method2()!");
	}
	
}





