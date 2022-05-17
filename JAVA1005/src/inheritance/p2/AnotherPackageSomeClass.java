package inheritance.p2;

import inheritance.p1.ParentClass;

public class AnotherPackageSomeClass {

	public void useMember() {
		// 외부 클래스의 멤버에 접근하기 위해서는 인스턴스 생성 필수지만
		ParentClass p = new ParentClass();
		// 다른 패키지 내의 다른 클래스 멤버에 접근
		p.pulbicVar = 10;		// public(o) 	- 누구나 접근 가능
		
//		p.protectedVar = 20;	// protected(x) - 패키지가 같으므로 접근 가능
//		p.defaultVar = 30;		// default(x) 	- 패키지가 같으므로 접근 가능
//
//		p.privateVar = 40;		// private(x) 	- 다른 클래스에서 접근 불가
		// => ParentClass클래스에서 Getter / Setter를 제공해 줄 경우에는 접근 가능해짐
		// ---------------------------------------------------------------------
	}

	
}
