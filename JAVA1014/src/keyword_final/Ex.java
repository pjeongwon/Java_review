package keyword_final;

public class Ex {

	public static void main(String[] args) {
		/*
		 * final 키워드(final 제한자)
		 * - 클래스, 메서드, 멤버변수에 지정 가능한 키워드
		 * - 해당 대상이 더 이상 수정될 수 없음을 의미함(= 변경의 마지막)
		 * 
		 * 1. 멤버변수에 final 사용 시
		 *    - 변수값 변경 금지(불가) = 상수로 취급됨
		 *      => 즉, 기존에 저장된 값을 사용하는 것만 가능하고, 값을 변경할 수는 없다.
		 *    - 반드시 초기값을 가져야 하며, 초기값을 지정하지 않을 경우
		 *      blank final 상수로 취급되어 생성자를 통해 초기화가 필수!
		 *    - final 로 선언된 변수(= 상수)는 일반 변수와 구별하기 위해 대문자로 작성하며
		 *      단어 사이의 구분은 언더스코어(_) 기호 사용
		 *      ex) PI, NUM, SCHOOL_NAME
		 *    - 기본 문법 : final 데이터타입 변수명;
		 *    - 자바에서 제공되는 클래스(API)에는 상수들이 많이 활용됨(static final)
		 *      => 해당 데이터를 보호하기 위해 상수로 선언함
		 *      
		 * 2. 메서드에 final 사용 시
		 *    - 메서드 변경 불가 = 메서드 오버라이딩 금지
		 *      => 즉, 슈퍼클래스의 메서드를 상속받아 사용하는 것은 가능하나
		 *         오버라이딩을 통해 슈퍼클래스의 메서드를 변경(수정)할 수는 없다.
		 *    - 슈퍼클래스가 제공하는 메서드를 그대로 사용하도록 강제하기 위해 사용
		 *    - 기본 문법 : [접근제한자] final 리턴타입 메서드명([매개변수...]) {}
		 *    
		 * 3. 클래스에 final 사용 시
		 * 	  - 클래스 변경 불가 = 상속 금지
		 * 		=> 즉, 특정 클래스 자체를 (포함 관계 등으로)그대로 사용하는 것은 가능하나
		 * 		   다른 클래스에서 해당 클래스를 상속받을 수는 없다!
		 * 	  - 어떤 클래스 자체로 이미 완전한 기능을 수행하는 경우 상속을 금지시킴
		 * 		ex) String 클래스, Math 클래스 등
		 * 	  - final 메서드보다 더 광범위한 제한(메서드 전체 오버라이딩 불가)을 둘 때 사용
		 * 	  - 기본 문법 : [접근제한자] final 클래스명 {}
		 * 
		 */
		
		FinalMemberVariable fmv = new FinalMemberVariable();
		fmv.normalVar = 99;
//		fmv.finalVar = 999; // 오류 발생!
		// The final field FinalMemberVariable.finalVar cannot be assigned
		// => final 로 선언된 멤버변수(= 필드)는 값을 할당할 수 없다! (= 변경 금지)
		
		System.out.println("fmv.normalVar = " + fmv.normalVar);
		System.out.println("fmv.finalVar = " + fmv.finalVar);
		
		// final 로 선언된 상수의 대표적인 예 : Math 클래스의 PI 상수
		System.out.println("PI 값 = " + Math.PI);
//		Math.PI = 3.0; // 값 변경 불가
		
		System.out.println("======================================");
		
		FinalMethod fm = new FinalMethod();
		fm.normalMethod();
		fm.finalMethod();
		// final 메서드는 오버라이딩만 불가능할 뿐, 사용은 가능함
	}

}

// -------- final 멤버변수(= final 상수) ---------
class FinalMemberVariable {
	int normalVar = 10;
	final int finalVar = 20; // final 상수(실제로는 대문자 변수명 사용해야함)
	// finalVar 변수(상수)는 정수 20을 가진채로 고정됨 = 앞으로 변경 불가능
}


// -------- final 메서드 ---------
class FinalMethod {
	
	public void normalMethod() { // 일반 메서드
		System.out.println("FinalMethod 클래스의 normalMethod");
	}

	public final void finalMethod() { // final 메서드 = 서브클래스가 오버라이딩 불가능
		System.out.println("FinalMethod 클래스의 finalMethod");
	}
	
}

class SubFinalMethod extends FinalMethod {

	@Override
	public void normalMethod() {
		System.out.println("서브클래스에서 오버라이딩 된 normalMethod()");
		
		finalMethod(); // final 메서드를 호출할 수는 있다!
	}
	
//	@Override
//	public final void finalMethod() { // final 메서드
//		// 오류 발생! final 메서드는 서브클래스에서 오버라이딩 불가능
//		// => Cannot override the final method from FinalMethod
//		System.out.println("FinalMethod 클래스의 finalMethod");;
//	}
	
}


//-------- final 메서드 ---------

final class FinalClass{}

// FinalClass클래스를 상속받는 SubFinalClass클래스 정의

//class SubFianlClass extends FinalClass{} // 오류 발생! final클래스는 상속 불가!
// => The type SubFianlClass cannot subclass the final class FinalClas


class OtherClass{
	// final클래스는 상속(is-a관계)은 불가능하나
	// 포함(has-a관계)은 가능하다!
	FinalClass fc = new FinalClass(); // 클래스 내에서 인스턴스 생성을 통한 접근은 가능
}

//final 클래스의 대표적인 예 : java.lang.String 클래스
//class OtherClass2 extends String{} // 상속 불가!












