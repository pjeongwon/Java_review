 package keyword_static;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * static메서드 (= 정적 메서드)
		 * - 메서드 선언 시 리턴타입 앞에 static키워드를 붙여서 정의하는 메서드
		 * - 클래스가 메모리에 로딩될 때 static변수에 함께 메모리에 로딩되므로
		 *   인스턴스 생성과 무관하며, 클래스명만으로 호출 가능함
		 *   => 클래스명.메서드명() 형태로 호출
		 *   
		 * < static 메서드 정의 시 주의사항 >
		 * - 인스턴스 생성 시점에서 사용되는 멤버들은 static메서드 내에서 접근 불가
		 *   => static멤버가 로딩되는 시점은 인스턴스 생성 전이기 때문
		 * 1. 인스턴스 변수 사용 불가
		 *    => 원인 : static메서드가 로딩되는 시점은 클래스가 로딩되는 시점이며
		 *    	        인스턴스 변수는 인스 턴스 생성 시점에 메모리에 로딩되므로
		 *    		    static메서드가 로딩되는 시점에서는 존재하지 않는 변수이다
		 *  2. 레퍼런스 this(또는 레퍼런스 super) 사용 불가
		 *    => 원인 : 레퍼런스 this는 자신의 인스턴스 주소를 저장하는 참조변수이나
		 *      		static메서드가 로딩되는 시점에서는 인스턴스가 생성되지 않았으므로
		 *      		레퍼런스 this (또는 레퍼런스 super)는 사용불가능한 참조변수이다!
		 */		
		
		// static메서드도 static변수처럼 인스턴스와 무관하게 
//		StaticMethod.normalMethod(); // 
		StaticMethod.staticMethod();
		
		StaticMethod sm = new StaticMethod();
		sm.normalMethod(); // 참조변수를 통해 일반(인스턴스)메서드도 호출 가능하며
//		sm.staticMethod(); // static메서드도 호출 가능함(정석적인 호출 방법은 아님)
		StaticMethod.staticMethod();// static메서드 호출하는 정석적인 방법
		
		// static 변수 staticVar 접근시 private 접근제한자 적용으로 접근 불가(= 보이지 않음)
//		StaticMethod.staticVar = 99; // 오류 발생!
		
	}

}

class StaticMethod{
	private int normalVar = 10; // 인스턴스 변수(인스턴스가 생성될 때 로딩됨)
	private static int staticVar = 20; // static 변수(클래스가 메모리에 로딩될 때 함께 로딩됨)
	
	// 멤버변수가 모두 private 접근 제한자로 지정되었으므로
	// 외부에서 접근하기 위해서는 Getter / Setter를 통해야한다.
	public int getNormalVar() {
		return normalVar;
	}
	
	public void setNormalVar(int normalVar) {
		// 메서드 내의 로컬변수(매개변수 포함)와 클래스 내의 멤버변수명이 동일할 경우
		// 레퍼런스 this를 사용하여 멤버변수 지정 가능
		this.normalVar = normalVar; 
	}
	
	public void normalMethod() { // 일반 메서드(인스턴스가 생성될 때 로딩됨)
		System.out.println("일반 메서드!");
	
	}
	
	public static int getStaticVar() {
		return staticVar;
	}
	
	public static void setStaticVar(int staticVar) {
		// static 메서드 내에서는 레퍼런스 this(레퍼런스 super) 사용 불가
		// => this는 자신의 인스턴스 주소값을 저장하는 참조변수이나,
		//    static멤버가 로딩되는 시점에는 인스턴스가 생성되지 않은 시점이기 때문에
//		this.staticVar = staticVar; // 오류 발생!
		
		// 해결책1) 로컬변수명과 멤버변수명을 다르게 선언하면 사용 가능(궁극적인 해결책 아님)
		//          ex) staticVar = localVar;
		
		// 해결책2) static변수에 접근하는 정석적인 방법으로 구분 가능
		StaticMethod.staticVar = staticVar;
	}
	public static void staticMethod() { // static 메서드(클래스가 메모리에 로딩될 때 함께 로딩됨)
		System.out.println("static 메서드!");
	
		// static메서드에서 멤버변수 접근
		System.out.println("일반 메서드에서 static 변수 접근 : " + staticVar);
//		System.out.println("일반 메서드에서 인스턴스 변수 접근 : " + normalVar); 
		// 오류발생!
		// => static메서드 내에서 static 멤버가 아닌 인스턴스 멤버에 접근 불가
		//    (Cannot make a static reference to the non-static field normalVar)
		// => static메서드가 메모리에 로딩되는 시점에는
		//    아직 인스턴스 변수는 로딩되지 않은 상태이므로 접근이 불가능!
		// 일반 메서드(= 인스턴스 메서드)에서 멤버변수 접근
		System.out.println("일반 메서드에서 static 변수 접근 : " + staticVar);
//		System.out.println("일반 메서드에서 인스턴스 변수 접근 : " + normalVar);
		// static메서드와 static변수는 함께 메모리에 로딩되므로 접근 가능
		
	}
}


