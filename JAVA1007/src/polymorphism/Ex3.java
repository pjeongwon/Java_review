package polymorphism;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 동적 바인딩
		 * - 상속 관계에서 업캐스팅 후 참조 변수를 통해 인스턴스의 메서드를 호출할 때
		 *   컴파일(번역)단계에서의 실행 대상과, 실행 단계에서의 실행 대상이 동적으로 변하는 것
		 * - 참조 변수의 데이터타입과 무관하게 실제 인스턴스에 따라 실행되는 메서드가 달라지는 것
		 *   (컴파일 시점에서 보이는 실행 대상과 실제 실행 대상은 다를 수 있다!)
		 * - 서브클래스에서 슈퍼클래스로부터 상속된 메서드를 오버라이딩 했을 경우
		 *   업캐스팅 후에도 슈퍼클래스 타입 변수로부터 접근하는 메서드는
		 *   오버라이딩 된 메서드가 호출된다!ㅏ
		 *   (컴파일 시점에서는 슈퍼클래스의 메서드가 호출되는 것처럼 보인다!)
		 *   
		 *   
		 */
		
		Parent3 p = new Parent3();
		p.parentPrn();
		
		System.out.println("------------------------");
		
		// Parent3타입 변수 p에 Child3인스턴스 전달(= 업캐스팅)
		p = new Child3();
		p.parentPrn();
		
	}

}

class Parent3 {

	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn()");
	}
}

class Child3 extends Parent3 {

	public void childPrn() {
		System.out.println("서브클르새의 childPrn()");
	}

	@Override
	public void parentPrn() {
		System.out.println("서브클래스에서 오버라이딩 된 parentPrn()");
	}
	
	
}

// 

