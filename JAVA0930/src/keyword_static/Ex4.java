package keyword_static;

public class Ex4 {
	int num = 10;
	// -------------------------------------------
	/*
	 * static 멤버와 인스턴스 멤버의 할당 순서
	 * 1. static키워드가 선언된 모든 멤버(변수 및 메서드)가 메모리에 로딩됨
	 *    => static멤버변수 a, c와 static메서드 check(), main()메서드가 로딩됨
	 * 2. static멤버가 메모리에 로딩될 때 멤버변수 a, c는
	 * 	  check()메서드 리턴값이 할당되어야 하므로 check()메서드를 먼저 호출함
	 *    => static변수 a와 c중에서 a가 먼저 선언되어 있으므로 a의 check() 호출하고,
	 *    	 그 다음 c의 check() 메서드 호출함
	 *    => "call : static 변수 a"가 출력된 후
	 *       "call : static 변수 c"가 출력됨
	 *    ------ 여기까지 static멤버에 대한 로딩 과정 -----
	 * 3. main()메서드가 자동으로 호출됨
	 *    => "main()메서드 호출됨!" 출력됨 
	 * 4. main()메서드 내에서 Ex4인스턴스 생성됨
	 *    => 이 시점에 인스턴스 변수 b가 메모리에 로딩됨
	 * 5. 인스턴스 변수 b가 로딩될 때 check()메서드 리턴값이 할당되어야 하므로 check()메서드 호출
	 *    => "call : 인스턴스 변수 b"가 출력됨
	 */
	
	
	
	int b = check("인스턴스 변수 b");
	
	static int a = check("static 변수 a");
	
	public static int check(String str) {
		System.out.println("call : " + str);
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println("main() 메서드 호출됨!");
		
//		num = 99;
		
		// main()메서드 내에서 main()메서드가 속한 클래스의 멤버에 접근할 경우
		// static메서드이므로 인스턴스 멤버는 기본적인 접근이 불가능함(= 생성 시점 다름)
		// 따라서, 자신의 클래스 인스턴스를 먼저 생성한 후 접근해야함
		Ex4 ex = new Ex4(); // 인스턴스 멤버가 메모리에 로딩되는 시점(위치)
		ex.num = 99;
		
		
	}
	
	static int c = check("static변수 c");

}
