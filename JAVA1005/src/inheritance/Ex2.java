package inheritance;

public class Ex2 {

	public static void main(String[] args) {

		// Parent클래스를 상속받는 서브클래스인 Child클래스의 인스턴스 생성
		Child c = new Child();
		c.childPrn(); // 서브클래스 자신이 정의한 메서드
		// Child클래스는 자신의 클래스 내의 멤버뿐만 아니라
		// 슈퍼클래스인 Parent클래스로부터 상속받는 멤버도 선언없이 사용 가능
		c.parentPrn(); // 슈퍼클래스로부터 상속받은 메서드

		System.out.println("------------------------");
		
		// 슈퍼클래스인 Parent 클래스의 인스턴스 생성
		Parent p = new Parent();
		p.parentPrn(); // 슈퍼클래스 자신이 정의한 메서드
		// 슈퍼클래스의 인스턴스에는 서브클래스의 멤버에 접근불가
		// => 서브클래스의 인스턴스가 생성되지 않음
//		p.childPrn(); // 오류발생!
		
		
		System.out.println("------------------------");
		
		// SpideMan 인스턴스 생성
		SpiderMan s = new SpiderMan();
		s.eat();
		s.jump();
		s.fireWeb();
		
	}

}

class Parent{ // 자동으로 java.lang.Object 클래스 상속(생략됨)
	
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn()");
	}
	
}

class Child extends Parent{
	
	public void childPrn() {
		System.out.println("서브클래스의 childPrn()");
	}
}

// ---------------------------------------------------------------

// 사람(Person) 클래스 정의 - 슈퍼클래스
// 멤버변수 - 이름(name, 문자열)
// 메서드 - eat() 메서드(파라미터 없음, 리턴값 없음, "밥 먹기!" 문자열 출력)
//		    jump() 메서드(파라미터 없음, 리턴값 없음, "뛰기!" 문자열 출력)
class Person{
	String name;
	
	public void eat() {
		System.out.println("밥 먹기!");
	}
	
	public void jump() {
		System.out.println("뛰기!");
	}
}

// 슈퍼클래스 Person을 상속받는 서브클래스 SpideMan 정의
// 멤버변수 - 스파이더맨모드여부(isSpider, 논리형)
// 메서드 - fireWeb() 메서드(파라미터 없음, 리턴값 없음, "거미줄 발사!" 문자열 출력)
class SpiderMan extends Person{
	boolean isSpider;
	
	public void fireWeb() {
		System.out.println("거미줄 발사");
	}
}













