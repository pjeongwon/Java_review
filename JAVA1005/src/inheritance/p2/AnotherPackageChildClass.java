package inheritance.p2;

import inheritance.p1.ParentClass;

// inheritance.p1 패키지의 ParentClass클래스를 상속받기
// => 패키지가 다르므로 해당 클래스 접근시 "패키지명.클래스명"형식으로 접근하거나
//	  또는 import문을 통해 inheritance.p1패키지의 ParentClass클래스를 import해야함
public class AnotherPackageChildClass extends ParentClass {
	
	public void useMember() {
		// 외부 클래스의 멤버에 접근하기 위해서는 인스턴스 생성 필수지만
		// 자신의 슈퍼클래스 멤버에 접근하기 위해서는 인스턴스 생성없이 직접 접근해야한다!
		// => 주의! 두 방법은 접근제한자에 따라 전혀 다른 결과를 가져온다!
		
		// -------------------------------------------------------------------
		// 1. 인스턴스 생성을 통해 슈퍼클래스에 접근할 경우 상속관계가 아닌 포함(사용)관계로 취급됨
		//	  = 다른 패키지에 있는 일반 클래스로 취급됨
		ParentClass p = new ParentClass();
		// 다른 패키지 내의 다른 클래스 멤버에 접근
		p.pulbicVar = 10;		// public(o) 	- 누구나 접근 가능
		
//		p.protectedVar = 20;	// protected(x) - 패키지가 같으므로 접근 가능
//		p.defaultVar = 30;		// default(x) 	- 패키지가 같으므로 접근 가능

//		p.privateVar = 40;		// private(x) 	- 다른 클래스에서 접근 불가
		// => ParentClass클래스에서 Getter / Setter를 제공해 줄 경우에는 접근 가능해짐
		// ---------------------------------------------------------------------

		// 2. 인스턴스 생성 없이 자신의 인스턴스를 통해 상속이 적용된 상태 그대로 접근할 경우
		//	  => 슈퍼클래스의 멤버에 직접 접근 가능
		this.pulbicVar = 10;	// public(o) 	- 누구나 접근 가능
		this.protectedVar = 20;	// protected(o) - 패키지는 다르지만, 상속관계이므로 접근 가능

//		this.defaultVar = 30;	// default(x) 	- 패키지가 다르므로 접근 불가
//		this.privateVar = 40;	// private(x) 	- 다른 클래스에서 접근 불가
		
	}


}
