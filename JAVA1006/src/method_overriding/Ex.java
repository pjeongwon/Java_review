package method_overriding;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 메서드 오버로딩(Method Overloading)
		 * - 자신의 클래스 내에서 파라미터가 다른 메서드를 여러번 '다중정의' 하는 것
		 * 
		 * < 메서드 오버로딩 규칙 >
		 * 1. 메서드 이름이 같아야한다
		 * 2. 메서드 파라미터(매개변수)의 타입 또는 개수가 달라야 함
		 * 3. 리턴타입 무관(= 리턴타입만 다른 것은 오버로딩이 아님)
		 * 
		 * 메서드 오버라이딩(Method Overriding)
		 * - 슈퍼클래스로부터 상속받은 메서드를 서브클래스에서 새롭게 '재정의' 하는 것
		 * - 반드시 상속 관계에서 상속받은 메서드에 대해서만 적용 가능
		 * - 서브클래스에서 오버라이딩 한 후에는 슈퍼클래스의 메서드는 은닉됨(= 보이지 않음)
		 * - 슈퍼클래스가 가진 메서드의 기능을 변경하기 위해 선언부는 그대로 두고
		 *  구현부(body)의 코드만 변경하는 것
		 * 
		 * < 메서드 오버라이딩 규칙 >
		 * 1. 슈퍼클래스의 메서드와 시그니쳐(리턴타입, 메서드명, 매개변수)가 동일해야함
		 * 	  => 리턴타입은 변경은 가능하나 슈퍼클래스의 리턴타입과 같거나 
		 *       해당 타입의 서브클래스 타입으로는 변경 가능함
		 *       (부모의 리턴타입이 String이면, 자식의 리턴타입도 String) 
		 * 2. 접근 제한자는 슈퍼클래스의 제한자보다 좁아질 수 없다.
		 * 	  (부모가 public이면 자식도 public만 선택 가능함)
		 */

		// child클래스 인스턴스 생성
		Child c = new Child();
		c.childPrn();  // 서브클래스에서 정의한 메서드
		
		c.parentPrn(); // 슈퍼클래스로부터 상속받은 메서드
		// 만약, Child클래스(서브클래스)에서 parentPrn()메서드를 오버라이딩 했을 경우
		// 슈퍼클래스가 가진(상속된) parentPrn()메서드는 서브클래스에서 은닉되어 보이지 않음
		// => 따라서, Child인스턴스를 통해서 Parent클래스의 parentPrn()메서드에 접근 불가능
		//    즉, Child클래스가 오버라이딩 한 parentPrn()메서드가 호출됨
		
		System.out.println("----------------------------------------");
		
		Tiger tiger = new Tiger();
		Dog dog = new Dog();
		tiger.cry();
		dog.cry();
	}

}

class Parent{
	
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn()");
	}
}

// Parent클래스를 상속받는 Child클래스 정의
class Child extends Parent{
	
	public void childPrn() {
		System.out.println("서브클래스의 childPrn()");
		
		// 자신의 인스턴스 내의 parentPrn()메서드를 호출할 경우
		parentPrn(); // Parent클래스의 메서드가 아닌 Child클래스의 오버라이딩 된 메서드 호출됨
	}

	
	// Parent클래스의 parentPrn() 메서드를 상속받아 오버라이딩을 수행
	// => 슈퍼클래스인 Parent클래스의 parentPrn()메서드와 시그니처를 동일하게 정의하고 
	//	  슈퍼클래스의 메서드 접근제한자가 public이므로 변경 불가
	// => 오버라이딩 후에는 더 이상 슈퍼클래스의 parentPrn()메서드가 보이지 않음(= 은닉)
//	public void parentPrn() {
//		System.out.println("서브클래스에서 오버라이딩 된 parentPrn()");
//	}

	// 메서드 오버라이딩 자동 수행 단축키 : Alt + Shift + S -> V
	@Override
	public void parentPrn() {
		// 오버라이딩 메서드 자동 생성 시 메서드 윗줄에 @Override표시가 붙는데
		// 이는 어노테이션(Anotation)기능으로 자바 컴파일러를 위한 주석이며
		// 이 메서드가 오버라이딩 되어 있다는 표시이므로 오버라이딩 규칙을 검사하게 되어
		// 오버라이딩 규칙 위반 시 오류가 발생하게 된다!
		// ex) 오버라이딩이 아닌 오버로딩을 수행했을 경우 오류가 발생함
		System.out.println("서브클래스에서 오버라이딩 된 parentPrn()");
	}
	
}

// ---------------------------------------------------------------------

class Animal{ // 동물 클래스
	// 모든 동물은 울음소리를 낼 수 있으믈 공통 메서드인 cry() 메서드 정의
	// => Anumal클래스를 상속받는 모든 클래스는 cry()메서드를 상속받게 되므로
	//    "동물 울음소리!" 출력 가능
	public void cry() {
		System.out.println("동물 울음 소리!");
	}
}

// 동물 클래스를 상속받는 호랑이 클래스 정의
class Tiger extends Animal{
	// Animal클래스를 상속받았기 때문에 cry()메서드가 상속되고
	// cry()메서드 내에는 "동물 울음 소리!"문자열을 출력하는 코드가 기술되어 있다.
	// 그러나, 호랑이(Tiger)는 "어흥!"이라는 소리를 낼 수 있기 때문에
	// Animal클래스의 메서드를 그대로 사용하기 보다는 오버라이딩을 통해
	// 동일한 메서드에서 "어흥!"이라는 소리를 출력하도록 코드를 변경하면 더 향상된 기능을 제공함!
	public void cry() {
		System.out.println("호랑이 : 어흥!");
	}
}

//동물 클래스를 상속받는 강아지 클래스 정의
class Dog extends Animal{

	// Animal클래스의 cry()메서드 오버라이딩
	@Override
	public void cry() {
		System.out.println("강아지 : 멍멍!");
	}
	
}








