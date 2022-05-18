package method_overriding;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 멤버변수에 대한 오버라이딩
		 * - 슈퍼클래스로부터 상속받은 메서드와 동일한 형태의 메서드를
		 * 	 서브클래스가 정의할 경우 서브클래스의 인스턴스에서는
		 * 	 슈퍼클래스의 메서드가 은닉된다.
		 * - 마찬가지로, 슈퍼클래스로부터 상속받은 멤버변수와 동일한 형태의 멤버변수를
		 *   서브클래스가 선언할 경우 서브클래스의 인스턴스에서는
		 *   슈퍼클래스의 멤버변수가 은닉된다. = 은닉 변수
		 *   
		 */
		Child2 c = new Child2();
		System.out.println("우리집 TV : " + c.tv);
		c.watchTv();
	}

}

class Parent2{
	String tv = "부모님이 구입한 TV";
	
	public void watchTv() {
		System.out.println(tv + "보기!");
	}
}

class Child2 extends Parent2{
	// 슈퍼클래스 Parent2클래스로부터 상속받은 멤버변수와 동일한 이름의 변수선언(= 오버라이딩)
	String tv = "내가 구입한 TV"; 
	
	// 슈퍼클래스 Parent2클래스로부터 상속받은 메서드 watchTv() 오버라이딩
	@Override
	public void watchTv() {
		System.out.println("우리집에서 " + tv + " 보기!");
	}
	
	
			
}












