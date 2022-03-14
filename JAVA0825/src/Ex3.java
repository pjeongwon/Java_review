
public class Ex3 {

	public static void main(String[] args) {

		/*
		 * [ 현실에서 사용하는 데이터 종류 ]
		 * 1. 숫자(나이, 키, 은행잔고 등) => 정수 데이터, 실수 데이터
		 * 2. 문자(이름, 성별, 혈액형 등) => 문자 데이터, 문자열 데이터
		 * 3. 기타(예/아니오 등)
		 * 
		 * [ 자바에서 사용되는 데이터 타입 ]
		 * 1. 기본 데이터타입(Primitive Type) - 8가지
		 *    1) 정수형 - byte    short    int    long
		 *    2) 실수형 -                  float  double
		 *    3) 논리형 - boolean
		 *    4) 문자형 -         char
		 *    
		 * 2. 참조 데이터타입(Reference Type)
		 *    => 기본 데이터 타입 외의 모든 타입은 참조 데이터타입으로 취급됨
		 *    => 대표적인 참조 데이터타입 : String, 배열, 객체 등
		 *    
		 * -------------------------------------------------------------
		 * 상수(Constant)
		 * - 변하지 않는 데이터(항상 같은 값을 갖는 데이터)
		 *   ex) 정수 1, 실수 3.14, 문자 'A', 문자열 "홍길동" 등
		 * - 기본 데이터타입 8가지와 참조 데이터타입의 문자열을 포함한 9가지 상수 사용됨
		 * - 연산, 저장 등의 용도로 사용되는 데이터
		 */
		
		
		//자바의 데이터타입 출력해보기
		System.out.println(1); // 정수형 데이터 1 출력
		System.out.println(3.14); // 실수형 데이터 3.14 출력
		
		System.out.println(100L); // 정수형(long타입 정수) 데이터 100L 출력
		System.out.println(1.5f); // 실수형(float타입 실수) 데이터 1.5f 출력
		
		System.out.println(true); // 논리형(boolean 타입) 데이터 true (반드시 소문자 사용)
		System.out.println(false); // 논리형(boolean 타입) 데이터 false (반드시 소문자 사용)
		
		//문자형 데이터를 사용하려면 1개의 문자를 ('')기호로 둘러싸서 표현
		//System.out.println(가); // 오류 
		System.out.println('가'); // 문자 데이터 '가' 출력
		
		// 문자열 데이터를 사용하려면 0개 이상의 문자를 ("")기호로 둘러싸서 표현
		System.out.println("1"); // 문자'열' 데이터 "1" 출력 (정수와 다름)
		System.out.println("가"); // 문자'열' 데이터 "가" 출력 (문자와 다름)
	}

}
