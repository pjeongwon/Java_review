package abstract_class;

public class Ex {

	public static void main(String[] args) {
		/* 
		 * 추상메서드(Abstract Method)
		 * - 메서드 구현부(= 바디{})가 없는 메서드 = 미완성 메서드
		 * - 메서드의 동작을 기술하는 구현부가 없는 추상메서드는
		 *   실행 가능한 코드 블럭이 아예 존재하지 않으므로 외부로부터 호출되면 안됨
		 *   => 따라서, 추상메서드를 갖는 클래스는 인스턴스 생성이 불가능한 추상메서드로 선언되야 함
		 * - 메서드 정의 시 선언부이 접근 제하자가 뒤에 abstarc키웓를 붙여서 정의
		 *   => abstract키워드가 붙은 메서드는 추상메서드이므로 메서드 바디{}를 가질수 없다!
		 *   	(대신, 메서드 선언부 마지막에 세미콜론(;)으로 끝냄)
		 * - 서브클래스에서 반드시 오버라이딩하도록 강제성을 부여해야하는 
		 *   슈퍼클래스에서 추상메서드로 선언 시 서브클래스에서 무조건 오버라이딩 해야한다!
		 *   => 강제성을 통해 업캐스팅 시 코드의 통일성을 더욱 향상시킬 수 있다!
		 *   
		 * 
		 * < 추상메서드 정의 기본 문법>
		 * [제한자] abstract 리턴타입 메서드명([매개변수...]);
		 * ex) public abstract void method();
		 * 
		 * ----------------------------------------------------
		 * 추상클래스(Abstract Class) // 서브클래스의 갑질(오버라이딩을 걸러서 사용)을 슈퍼클래스에서 제어가능해짐(무조건 오버라이딩해야함)
		 * - 객체를 생성할 수 없는 클래스 = 미완성 클래스
		 *   => new연산자를 통해 생성자 호출 불가능(생성자에 private선언과 문법적으로 동일)
		 * - 상속 전용의 클래스로 사용되어질 수 있음
		 *   => 상속을 통해 서브클래스에서 추상메서드를 오버라이딩 한 후
		 *   	업캐스팅을 통한 다형성 활용 가능 
★★★★★★	 *   	>>>>>>>(추상메서드 구현의 강제를 통해 코드의 통일성 향상)<<<<<<<    
		 * - 상속받은 서브클래스에서는 추상메서드가 존재할 경우 반드시 오버라이딩 필수
		 * - 추상클래스는 추상메서드뿐만 아니라 일반메서드, 멤버변수, 생성자 모두 가질 수 있음
		 * - 추상메서드를 갖는 클래스는 반드시 추상클래스로 선언되어야 하지만,
		 * 	 추상클래스라고해서 모두 추상메서드를 갖는 것은 아니다.
		 * - 만약, 추상클래스를 상속받은 서브클래스에서 추상메서드를 오버라이딩하지 않으려면
		 * 	 해당 서브클래스를 추상클래스로 선언해야한다!
		 * 	 => 결국 더 하위의 서브클래스를 정의하여 최종적으로 추상메서드 오버라이딩이 되어야
		 * 	 인스턴스를 생성하여 정상적인 사용이 가능해짐 
		 * 
		 * < 추상클래스 정의 기본 문법 >
		 * abstract class 클래스명{
		 *	// 멤버변수 선언
		 *	// 생성자 정의
		 *	// 메서드(일반메서드, 추상메서드)
		 *}
		 */

		// 추상클래스에 대한 인스턴스 생성 시
//		AbstractClass ac = new AbstractClass() { // 오류 발생!
		// => Cannot instantiate the type AbstractClass
		//	  (AbstractClass클래스는 인스턴스 생성이 불가능하다!)
		
		// 추상클래스를 상속받아 추상메서드를 구현한 서브클래스의 인스턴스 생성
		SubClass sc = new SubClass();
		sc.abstractMetohd();
		
		// 추상클래스는 인스턴스 생성은 불가능하지만 참조변수로써의 사용은 가능하므로
		// 업캐스팅을 통한 다형성 활용 가능함.
		// SubClass클래스를 AbstractClass타입으로 업캐스팅 하여 공통메서드 호출
		AbstractClass ac = sc; // SubClass -> AbstractClass업캐스팅(자동 형변환)
		// 업캐스팅 후에는 참조영역의 축소로 인해 공통 멤버에만 접근 가능
		// => 이 때, 오버라이딩 된 메서드 호출 시 실제 인스턴스의 메서드(= 오버라이딩 메서드) 호출
		ac.abstractMetohd();
	}

}

abstract class AbstractClass{
	
	// 주의! abstract가 키워드 붙은 메서드는 추상메서드이믈 바디를 가질 수 없다!
	// => 구현부(바디)를 정의할 경우 오류 발생! (Abstract methods do not specify a body)
//	public abstract abstractMethod() { // 오류발생!
//		System.out.println("추상 메서드");
//	}
	// 추상메서드 정의 방법 : 
//	추상메서드 정의 방법 : abstract키워드를 붙이고 바디{}대신 세미콜론(;)으로 끝냄
//  => 주의! 추상메서드를 포함하는 클래스는 반드시 추상클래스로 선언되어야 한다!
//  (추상메서드를 포함하는 클래스 선언부 class키워드 앞에 abstract키워드를 붙임)
//	(The abstract method abstractMethod in type AbstractClass can only be defined by an abstrat)
	
	public abstract void abstractMetohd();
	
	// ==============================================================
	// 추상클래스는 추상메서드 외에 멤버변수, 생성자, 일반메서드도 가질 수 있다!
	int a; // 인스턴스 멤버변수
	static int b; // static 멤버변수
	
	public AbstractClass() {} // 생성자
	
	public void normalMethod() { // 일반메서드
		System.out.println("슈퍼클래스에서 정의한 일반메서드");
	}
	
}

// 추상클래스인 AbstractClass클래스를 상속받는 서브클래스 SubClass정의
// => 추상클래스는 인스턴스 생성은 불가능하지만 상속은 가능

class SubClass extends AbstractClass{

	// 추상클래스를 상속받은 서브클래스는 추상클래스에 추상메서드가 존재할 경우
	// 반드시 오버라이딩을 통해 추상메더스의 구현부({})를 정의해야한다
	// => 상속된 메서의 바디를 구현한다는 의미가 강하므로 Override 대신 Implement로 표현함
	//    (그러나, 결과적으로는 부모의 메서드를 바디{}부분만 바꾼다는 점에서 오버라이딩과 동일)
	
	@Override
	public void abstractMetohd() {
		// 메서드 오버라이딩 기능을 통해 메서드 바디{}만 구현하면,
		// 메서드 바디 내의 코드는 서브클래스에서 자유롭게 기술 가능하다!
		// => 즉, 메서드 선언부를 강제하는 용도로 추상메서드를 사용
		System.out.println("서브클래스에서 오버라이딩을 통해 구현한 추상메서드!");
	}
}

// =======================================================================
// AbstractClass클래스를 상속받는 MiddleClass정의
	
abstract class MiddleClass extends AbstractClass{
	// 추상메서드를 포함하는 추상클래스 상속 시 추상메서드에 대한 오버라이딩이 필수지만,
	// 만약, 오버라이딩을 하지 않을 경우 상속이 불가능하여 오버라이딩 수행 오류 메시지 출력
	// => 이 때, 오버라이딩에 대한 책임 회피를 위해서는 현재 서브클래스도 추상클래스로 선언해야함 
	
}

// 서브클래스인 MiddleClass에서 추상메서드 구현을 회피하기위해 추상클래스 선언 시 
// AbstractClass와 마찬가지로 인스턴스 생성이 불가능한 클래스가 된다.
// 따라서, 해당 클래스들을 사용하려면 반드시 또 다른 서브클래스를 정의하여
// MiddleClass클래스를 상속받아 추상메서드를 구현해야한다!

class SubClass2 extends MiddleClass{
	
	@Override
	public void abstractMetohd() {
		System.out.println("AbstractClass -> MiddleClass -> SubClass2 상속을 통해 구현");
	}
	
	
}




