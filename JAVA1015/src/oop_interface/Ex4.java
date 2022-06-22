package oop_interface;

public class Ex4 {

	public static void main(String[] args) {
		// 인터페이스끼리의 상속
		ISay2SubClass issc = new ISay2SubClass();
		issc.sayHello("자바");
		issc.sayGoodbye("자바");
		issc.greeting("자바");
		
	}

}

interface IHello{
	public void sayHello(String name);
}

interface IGoodbye{
	public void sayGoodbye(String name);
}

// IHello, IGoodbye인터페이스를 상속받는 ITotal인터페이스 정의

interface ITotal extends IHello, IGoodbye{
	// 인터페이스끼리의 상속 시 어차피 추상메서드만 가지므로 오버라이딩 불가!
//	public void sayGoodbye(String name) {} 오류발생! = 모든 메서드는 추상메서드여야만 한다!
	
	// 상속(extends)이므로 부모의 메서드와 별개로 자신의 메서드를 추가 가능 = 추상메서드
	public void greeting(String name);
}

// 2개의 인터페이스를 상속받은 ITotal인터페이스를 ISay클래스에서 상속받기
// => 상속받은 추상메서드 : 3개(모두 구현해야함)

class ISay implements ITotal{

	@Override
	public void sayHello(String name) {
		System.out.println(name + "씨, 안녕하세요!");
	}

	@Override
	public void sayGoodbye(String name) {
		System.out.println(name + "씨, 안녕히 가세요!");
	}

	@Override
	public void greeting(String name) {
		System.out.println(name + "씨, 안녕!");
	}
	
}

// ITotal인터페이스를 상속받아 구현하는 ISay2클래스 정의
// => 만약, 추상메서드 중 greeting()메서드를 구현하지 않을 경우
// 	  남은 메서드는 여전히 추상메서드이므로 일반클래스 내에 존재해서는 안된다!
// => 따라서, 인스턴스 생성이 불가능한 클래스가 되도록 해당 클래스를 추상클래스로 선언해야한다!
abstract class ISay2 implements ITotal{ // 추상클래스

	@Override
	public void sayHello(String name) {
		System.out.println(name + "씨, 안녕하세요!");
	}

	@Override
	public void sayGoodbye(String name) {
		System.out.println(name + "씨, 안녕히 가세요!");
	}

	// 3개의 추상메서드 중 일부를 구현하지 않는 경우
//	@Override
//	public void greeting(String name) {
//		System.out.println(name + "씨, 안녕!");
//	}

}

// 추상메서드를 모두 오버라이딩하지 않아 추상클래스가 된 ISay2클래스를 
// 또 다른 서브클래스를 통해 상속받아 사용 가능
class ISay2SubClass extends ISay2{
	// 추상클래스 ISay2를 상속받더라도 미구현 된 greeting()메서드 하나만 구현하면 된다!
	// => 다른 메서드들도 오버라이딩은 가능하지만, 강제성은 greeting()메서드에만 부여됨
	@Override
	public void greeting(String name) {
		System.out.println(name + "씨, 안녕!");
	}
	
}



