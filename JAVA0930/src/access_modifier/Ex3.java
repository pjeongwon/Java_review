package access_modifier;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 접근제한자(Access modifier)
		 * - 클래스(또는 인터페이스)의 멤버에 접근을 제한할 용도로 사용하는 키워드
		 * - 4개의 접근제한자(public, protected, default, private) 사용
		 * 		=> 각 접근제한자에 따라 접근 범위가 달라짐
		 * 		   (넓음) public > protected > default > private (좁음)
		 * - 클래스, 메서드, 멤버변수 등에 사용 가능(상황에 따라 사용 불가능한 제한자도 존재)
		 * - 접근제한자로 인해 접근이 불가능한 멤버에 외부에서 접근할 필요가 있을 경우
		 *   Getter / Setter를 제공하여 간접적으로 접근하도록 할 수 있음
		 *   
		 * 1. public : 외부에서 누구나 접근 가능 = 어디서든(패키지, 클래스 상관없이) 접근 가능
		 * 2. protected : 상속단원에서 배움
		 * 3. default(package) : 다른 패키지에서 접근 불가 = 동일한 패키지에서만 접근 가능
		 *    => 이 접근 제한자는 다른 저븐 제한자를 사용하지 않을 경우 자동으로 부여됨(키워드 없음)
		 * 2. private : 외부에서는 접근 불가 = 자신의 클래스 내에서만 접근 가능
		 * 
		 * 
		 */
		// 같은 패키지에 위치만 MainClass 인스턴스 생성 후 인스턴스 멤버에 접근 
		
		MainClass mc = new MainClass();
		mc.accessMethod();
		System.out.println("publicVar = " + mc.publicVar); // public 접근 가능
		System.out.println("defaultVar = " + mc.defaultVar); // default 접근 가능
		// => 현재 Ex3클래스와 MainClass가 같은 패키지에 위치하므로 default멤버에 접근 가능

		//		System.out.println("privateVar = " + mc.privateVar); // private 접근 불가! 오류 발생!
		// => 다른 클래스에서 인스턴스 생성을 통해 접근 시 private멤버에 접근 불가!
		//	  즉, 패키지는 아무 상관없이 클래스가 다르면 무조건 접근 불가능
	}

} // Ex3 클래스 끝











