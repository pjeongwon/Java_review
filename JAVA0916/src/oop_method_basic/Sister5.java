package oop_method_basic;

public class Sister5 {

// snack = s.sister_5(money, snack);

	public String sister_5(int money, String snack) {

		System.out.println("동생 : 오빠가 바꿔오라고 준 과자 : " + snack);
		System.out.println("동생 : 오빠가 추가금으로 준 돈 : " + money);

		money -= 800;
		snack = "쿠크다스";

		return snack;
	}

	// ===========================================================
	// 주의사항!!
	// 메서드 정의시 파라미터는 복수개 지정이 가능하나, 리턴타입은 1개만 지정 가능하며
	// return문 뒤의 리턴값도 1개의 값만 리턴 가능함
	// =>단, 연산 등의 모든 식 통해 연산도 가능하지만, 결과는 지정된 리턴타입 데이터 1개여야만 한다.

	public int sister_6() { // 오류 발생! 리턴타입에 복수개의 타입 지정 불가
//		return 100, 200;  // return문 뒤에 하나의 데이터만 리턴이 가능하다!
		return 100 * 200; // 연산 결과가 1개의 정수이므로 사용 가능한 리턴문이 된다.
	}

	public String sister_7() {
		return "새우깡" + "쿠크다스"; // 문자열 결합도 1개의 문자열이 되므로 사용 가능
	}

	// ===========================================================
	// 메서드 내에서 if문 등의 조건에 따른 return문 사용 시 주의사항!
	// => 메서드 내에서 리턴값이 있을 경우 어떤 상황에서도 return문이 실행되어야 한다!
	
	public String method(int num) {
		// 전달받은 정수 num에 대해 "양수"와 "음수"를 판별하여 결과 문자열 리턴

//  if문과 else if문을 조합하여 양수와 음수를 판별하는 경우

//		if(num >= 0) { // 양수일 경우
//			return "양수";
//		} else if(num < 0 ) { // 음수일 경우
//			return "음수";
//		}
		// => 오류 발생!
		// => if문과 else if문만 사용하는 경우 
		//    나머지 조건(둘 다 false)일 때 수행할 return문이 없다!

// 문제점 : if문의 조건이 거짓이고, else if문의 조건이 거짓일 때
		//	나머지 조건에 대한 경우의 수가 없어서 return문이 실행되지 못하므로
		//	반드시 모든 조건에 대해 return문이 실행되어야 하는 조건이 성립되지 않는다!
		
// 해결책 1) else문을 추가하여 나머지 경우에 return문이 실행되도록 함
//		if(num >= 0) { // 양수일 경우
//			return "양수";
//		} else if(num < 0 ) { // 음수일 경우
//			return "음수";
//		} else {
//			return "기타"; // 위의 두가지 조건을 만족하지 않을 경우 "기타" 리턴  
//			//  사람의 입장에서는 당연히 일어날 일이 없다는걸 앎!
//		}
		
// 해결책 2) if문 등의 조건식 블록문 내에서 return문을 사용하지 않고 
		//	 return할 데이터(리터값)만 생성한 후 
		//	 if문 종료 후 return문을 공통으로 실행하도록 함
		String result = ""; // 통합 return문으로 사용할 리턴값(데이터)을 저장하는 변수 선언
		if(num >= 0) { // 양수일 경우
			result = "양수";
		} else if(num < 0 ) { // 음수일 경우
			result = "음수";
		}
		return result; 
		// if 문의 조건식 결과와 관계없이 실행되는 문장이므로
		// 항상 return문이 실행될 수 있다!
		// => if문과 else if문 조건식을 만족하지 않더라도 널스트링("")값이 리턴됨
		//	  따라서, result변수는 반드시 선언 시점에 초기화가 되어있어야 한다!
	}
	
}
