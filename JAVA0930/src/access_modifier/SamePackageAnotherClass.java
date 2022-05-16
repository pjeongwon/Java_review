package access_modifier;

public class SamePackageAnotherClass {
	// 같은 패키지의 다른 클래스 멤버에 접근 시
	public void accessMethod() {
		// 같은 패키지에 위치한 MainClass 클래스의 인스턴스 생성 후 인스턴스 멤버에 접근
		// => 현재 클래스에서 MainClass 접근은 Ex3 클래스에서의 접근과 동일
		MainClass mc = new MainClass();
		System.out.println("publicVar = " + mc.publicVar); // public 접근 가능
		System.out.println("defaultVar = " + mc.defaultVar); // default 접근 가능
		// => 현재 Ex3 클래스와 MainClass 가 같은 패키지에 위치하므로 default 멤버에 접근 가능
		
//		System.out.println("privateVar = " + mc.privateVar); // private 접근 불가! 오류 발생!
		// => 다른 클래스에서 인스턴스 생성을 통해 접근 시 private 멤버에 접근 불가!
		//    즉, 패키지는 아무 상관없이 클래스가 다르면 무조건 접근 불가능
	}
	
}