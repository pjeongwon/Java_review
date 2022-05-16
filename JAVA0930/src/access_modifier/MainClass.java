package access_modifier;

public class MainClass {
	public int publicVar = 10; // public 접근제한자 : 누구나 접근 가능
	int defaultVar = 20; // default 접근제한자 : 같은 패키지에서만 접근 가능(접근제한자 생략 시 default 접근제한자로 지정됨)
	private int privateVar = 30; // private 접근제한자 : 자신의 클래스에서만 접근 가능
	
	public void accessMethod() {
		// 자신의 클래스내의 멤버에 접근 시 접근제한자와 무관하게 모두 접근 가능하다!
		System.out.println("publicVar = " + publicVar); // public 접근 가능
		System.out.println("defaultVar = " + defaultVar); // default 접근 가능
		System.out.println("privateVar = " + privateVar); // private 접근 가능
	}
	
}
