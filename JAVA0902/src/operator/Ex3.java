package operator;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 비교 연산자(관계 연산자) (>, >=, <=, <, ==, !=)
		 * - 두 피연산자 간의 대소 관계 등을 비교하여
		 * 	 비교 결과를 true 또는 false 형태의 값으로 리턴(산출)
		 * - 산술 연산과 마차나지로 피연산자간의 타입을 일치시킨 후 연산을 수행함
		 * 
		 * 
		 * 
		 */
		
		int a = 10, b = 5;
		System.out.println("a > b 인가?  " + (a > b));
		System.out.println("a >= b 인가? " + (a >= b));
		System.out.println("a <= b 인가? " + (a <= b));
		System.out.println("a < b 인가?  " + (a < b));
		System.out.println("a == b 인가? " + (a == b));
		System.out.println("a != b 인가? " + (a != b));
		
		System.out.println("----------------------------");
		
		System.out.println('A' > 'B'); 
		// char > char ==> int > int로 변환되어 문자 자체가 아닌 정수(유니코드)값을 비교하게 됨
		// 따라서, 'A'(65)는 'B'(66)보다 크지 않으므로 false값이 리턴됨
		
		char ch = 'A';
		System.out.println(ch == 65);
		
		System.out.println("----------------------------");
		
		System.out.println(3 == 3.0); // int와 double의 경우 int를 double로 변환 후 비교
		// 3.0 == 3.0으로 비교 수행되어 true리턴됨
		
		System.out.println(0.1 == 0.1f);
		// => double과 float 연산 시 float -> double로 변환하여 비교함
		//	  이때, 근사치 표현에 의해 서로 다른 값으로 취급되어 false 리턴됨
		// => double타입을 float타입으로 변환 후 비교하면 true 리턴됨
		
		System.out.println((float)0.1 == 0.1f);
		
		
		
		
	}

}
