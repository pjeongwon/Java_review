package kr.co.itwillbs;

import access_modifier.MainClass;

public class AnotherPackageAnotherClass {
	public int publicVar;
	int defaultVar; // 접근제한자 생략 시 default 접근제한자로 지정됨
	private int privateVar;
	
	public void accessMethod2() {
		// 자신의 클래스 내의 멤버 접근 시
		System.out.println("publicVar = " + publicVar); // public 접근 가능
		System.out.println("defaultVar = " + defaultVar); // default 접근 가능
		System.out.println("privateVar = " + privateVar); // private 접근 가능
	}
	
	// 다른 패키지의 클래스 멤버에 접근 시
	public void accessMethod() {
		// 다른 패키지에 위치한 MainClass 클래스의 인스턴스 생성 후 인스턴스 멤버에 접근
		// => 다른 패키지의 클래스는 반드시 import 문을 사용하여 접근해야함 
		MainClass mc = new MainClass();
		System.out.println("publicVar = " + mc.publicVar); // public 접근 가능
		
//		System.out.println("defaultVar = " + mc.defaultVar); // default 접근 불가! 오류 발생!
		// => 현재 AnotherPackageAnotherClass 클래스와 MainClass 가 다른 패키지에 위치하므로 
		//    default 멤버에 접근 불가!
		
//			System.out.println("privateVar = " + mc.privateVar); // private 접근 불가! 오류 발생!
		// => 다른 클래스에서 인스턴스 생성을 통해 접근 시 private 멤버에 접근 불가!
		//    즉, 패키지는 아무 상관없이 클래스가 다르면 무조건 접근 불가능
	}
	
}




