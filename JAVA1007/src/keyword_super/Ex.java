package keyword_super;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 슈퍼클래스의 멤버(멤버변수 및 메서드)에 대한 오버라이딩 시
		 * 해당 멤버에 대한 은닉이 발생하여 슈퍼클래스의 멤버는 보이지 않고,
		 * 서브클래스의 멤버에만 접근이 가능해진다!
		 * 
		 * 레퍼런스 super
		 * - 레퍼런스 this와 마찬가지로 인스턴스의 주소를 저장하는 참조 변수
		 * - 레퍼런스 this는 자신(나)의 인스턴스 주소를 저장하는 반면,
		 * 	 레퍼런스 super는 부모의 인스턴스 주소를 저장함 
		 * - 메서드 또는 변수 오버라이딩으로 인해 슈퍼클래스의 멤버가 은닉되었을 때
		 *   서브클래스에서 슈퍼클래스의 은닉된 멤버에 접근하기 위해 사용
		 * - super키워드를 중첩해서 사용 불가(= super.super형식 등으로 사용 불가)
		 * 
		 * < 기본 사용 문법 >
		 * 서브클래스의 메서드 내에서 
		 * super.부모의멤버변수 또는 super.부모의메서드()
		 * (this.자신의 멤버변수 또는 this.자신의메서드())
		 * 
		 */
		
		Child c = new Child();
		System.out.println("우리집 TV : " + c.tv);
		c.watchTv();
		System.out.println("------------------------------");
		c.watchMyParentTv();
		
		System.out.println("==============================");
		
		c.scope();
		
		System.out.println("==============================");
		
		SpiderMan sm = new SpiderMan();
		System.out.println("현재 스파이더맨 모드인가? " + sm.isSpiderMode);
		sm.jump();
		System.out.println("------------------------------");
		sm.isSpiderMode= true;
		System.out.println("현재 스파이더맨 모드인가? " + sm.isSpiderMode);
		sm.jump();
		
	}
}

class Parent{
	String tv = "부모님이 구입한 TV";
	
	public void watchTv() {
		System.out.println("부모님댁에서" + tv + "보기!");
	}
	
	//---------------------------------------------------------------
	// 로컬변수, this.멤버변수, super.멤버변수의 접근에 따른 차이
	String name = "Parent의 멤버변수 name";
	//---------------------------------------------------------------
}

class Child extends Parent{
	// 슈퍼클래스 Parent클래스로부터 상속받은 멤버변수와 동일한 이름의 변수선언(= 오버라이딩)
	String tv = "고장난 TV"; 
	
	// 슈퍼클래스 Parent클래스로부터 상속받은 메서드 watchTv() 오버라이딩
	@Override
	public void watchTv() {
		System.out.println("우리집에서 " + tv + " 보기!"); // 레퍼런스 this 생략됨(this.tv)
		// => 멤버변수 tv가 슈퍼클래스의 멤버변수와 동일한 이름이기 때문에 슈퍼클래스의 멤버변수 은닉
		//	  따라서, tv변수 접근 시 자신의 "고장난 TV"만 접근 가능함
		
		// 슈퍼클래스의 은닉된 멤버변수 tv에 접근하기 위해서는 레퍼런스 super사용 필수!
		System.out.println("super.tv = " + super.tv); // 슈퍼클래스(Parent)의 멤버변수 tv접근
	}
	
	public void watchMyParentTv() {
//		watchTv(); // 자신의 클래스인 Child()클래스에 오버라이딩 된 메서드가 호출됨
		// => this. 생략되어 있음
		
		// 슈퍼클래스인 Parent 클래스의 watchTv() 메서드를 호출하기 위해서는
		// 레퍼런스 super를 사용하여 부모(Parent)인스턴스에 접근해야한다!
		super.watchTv();
	}
	
	//---------------------------------------------------------------
	// 로컬변수, this.멤버변수, super.멤버변수의 접근에 따른 차이
	String name = "Child의 멤버변수 name";
	
	public void scope() {
		String name = "Child클래스 메서드 내의 로컬변수 name";
		
		// 메서드 내에서 로컬변수, this, 멤버변수, super.멤버변수 접근 시
		// => 1. 로컬변수 -> 2. 자신의 인스턴스의 멤버변수 -> 3. 부모 인스턴스의 멤버변수 순으로 탐색
		System.out.println("name = " + name);
		System.out.println("this.name = " + this.name);
		System.out.println("super.name = " + super.name);
		
		// 만약, 로컬변수 name이 존재하지 않을 경우
		// 자신의 인스턴스 변수 name을 사용하게 되므로
		// name과 this.name의 결과는 같아진다
		
	}
	//---------------------------------------------------------------
	
}


// ======================================================================

class Person{
	String name;
	
	public void jump() {
		System.out.println("일반 사람의 점프!");
	}
}

class SpiderMan extends Person{
	boolean isSpiderMode;

	@Override
	public void jump() {
		// 만약, 현재 스파이더모드일 경우(=isSpiderMode가 true) "스파이더맨의 강력한 점프!"출력,
		// 아니면, Person클래스의 jump()메서드를 호출하여 "일반 사람의 점프!" 출력
		if(isSpiderMode) {
			System.out.println("스파이더맨의 강력한 점프!");
		} else {
			// 자신의 오버라이딩 된 jump()메서드가 아닌 슈퍼클래스의 jump()메서드 호출을 위해
			// 레퍼런스 super사용 필수!
			super.jump();
		}
	
	}
}



















