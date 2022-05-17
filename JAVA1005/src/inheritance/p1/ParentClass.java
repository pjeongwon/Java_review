package inheritance.p1;

public class ParentClass {
	/*
	 * 접근제한자에 따른 접근 범위 차이
	 * 1. public : 외부에서 누구나 접근 가능 = 어디서든(패키지, 클래스 상관없이) 접근 가능
	 * 2. protected : 같은 패키지이거나, 패키지가 달라도 상속관계인 서브클래스에서만 접근 가능 
	 * 3. default(package) : 다른 패키지에서는 접근 불가 = 동일한 패키지에서만 접근 가능
	 * 	  => 이 접근제한자는 다른 제한자를 사용하지 않을 경우 자동으로 부여됨(키워드 없음)
	 * 4. private : 외부(다른 클래스)에서는 접근 불가 =  자신의 클래스 내에서만 접근 가능
	 */
	public int pulbicVar; 		// 누구나 접근 가능
	protected int protectedVar; // 같은 패키지 or 패키지 달라도 상속 관계면 접근 가능
	int defaultVar; 			// 같은 패키지 내에서만 접근 가능
	private int privateVar; 	// 자신의 클래스에서만 접근 가능
	
	public void useMember() {
		// 자신의 클래스 내의 멤버에 접근 시 모든 접근제한자에 접근 가능
		pulbicVar = 10;		// public(o)
		protectedVar = 20;	// protected(o)
		defaultVar = 30;	// default(o)
		privateVar = 40;	// private(o)
	}
	
}

class SamePackageAnotherClass{
	
	public void useMember() {
		// 외부 클래스의 멤버에 접근하기 위해서는 인스턴스 생성 필수
		ParentClass p = new ParentClass();
		// 같은 패키지 내의 다른 클래스 멤버에 접근 시
		p.pulbicVar = 10;		// public(o) 	- 누구나 접근 가능
		p.protectedVar = 20;	// protected(o) - 패키지가 같으므로 접근 가능
		p.defaultVar = 30;		// default(o) 	- 패키지가 같으므로 접근 가능

//		p.privateVar = 40;		// private(x) 	- 다른 클래스에서 접근 불가
		// => ParentClass클래스에서 Getter / Setter를 제공해 줄 경우에는 접근 가능해짐
	}

}













