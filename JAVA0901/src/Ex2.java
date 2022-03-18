
public class Ex2 {

	public static void main(String[] args) {
		
		/*		 ---------------------------------------------------------
 		 *			1Byte	2Byte	4Byte	8Byte
		 *			(8bit)	(16bit)	(32bit)	(64bit)
		 *--------------------------------------------------------
		 * 논리형	boolean
		 * 정수형	byte	short	int(*)	long
		 * 실수형					float	double(*)
		 * 문자형			char
		 * --------------------------------------------------------
		 * 	=> 정수형 데이터와 실수형 데이터는 표현 방식에 따른 차이점으로 인해
		 * 	   실수형 데이터가 정수형 데이터보다 무조건 크다!
		 * 
		 * byte타입 크기   : -128 ~ 127
		 * short타입 크기  : -32768 ~ 32767
		 * char타입 크기   : 0 ~ 65535  --> char 음수 x / 0부터 시작
		 * int타입 크기    : -21억 ~ 21억
		 * long타입 크기   : -922경 ~ 922경
		 * float타입 크기  : 40자리 숫자
		 * double타입 크기 : 300자리 숫자
		 * ========================================================
		 * [ 자바의 기본 데이터 타입에 대한 변환 (= 타입 변환 = 형 변환)	   
		 * - boolean타입을 제외한 나머지 7개의 기본 데이터타입 간의 변환
		 * 1. 묵시적 형 변환(자동 형 변환)
		 *		- 작은 데이터 타입 => 큰 데이터 타입으로 변환할 때(= 전달할 때)
		 *		- 자바에 의해 자동으로 형 변환이 일어남
		 *			=> 자동 형 변환 또는 묵시적 형 변환 또는 암시적 형 변환이라고 한다!
		 *		- 형 변환 후에도 원래의 데이터가 변형되지 않고 그대로 유지됨
		 *		- 형 변환 시 형 변환 연산자를 생략할 수 있다.
		 *
		 *		< 기본 문법 >
		 *		큰 데이터 타입 변수 = 작은 데이터 타입 변수 또는 리터럴;
		 *
		 *		< 변환 가능한 경우의 수 - 정수의 예 >
		 *			= byte -> short -> int -> long -> float -> double
		 *                    char
		 *
		 * 2. 명시적 형 변환(강제 형 변환) 	   
		 *		- 큰 데이터 타입 => 작은 데이터 타입으로 변환할 때(= 전달할 때)
		 *		  데이터의 오버플로우(Overflow = 넘침)가 발생할 수 있으므로
		 *		  자바 컴파일러에 의해 자동 형 변환이 일어나지 않는다.
		 *		- 반드시 개발자가 형 변환 연산자를 사용하여 명시적으로 형 변환을 수행해야함.
		 *			=> 우변의 데이터 앞에 () 괄호를 명시하고 괄호 안에 변환할 데이터 타입을 명시함.
		 *			   (즉, 작은 데이터의 데이터 타입을 () 괄호 안에 명시)
		 *		- 강제로 형 변환 한 후에도 오버플로우에 의해
		 *		  기존 데이터가 아닌 다른 데이터가 저장될 수 있는 위험성이 존재
		 *		- 단, byte 또는 short타입과 char타입의 경우
		 *		  양수와 음수 표현 범위가 서로 다르므로 상호 강제 형 변환이 필수!
		 *		  (ex. byte <-> char, short <-> byte, short <-> char)
		 *
		 *		< 기본 문법 >
		 *		작은 데이터 타입 변수 = (작은 데이터 타입 명)큰 데이터 타입 변수 또는 리터럴;
		 */
		 
		// 1. 묵시적 형 변환(= 암시적 형 변환 = 자동 형 변환)
		byte a1 = 10;
		short a2 = 128;
		
		System.out.println("a1(byte) : " + a1 + ", a2(short) : " + a2);
		 
		// byte타입 변수 a1에 저장된 데이터(정수 10)를 short타입 변수 a2에 전달
		
		a2 = a1; // 작은 타입(byte) 데이터를 큰 타입(short) 변수에 전달(저장) 
		// 이 때, byte타입 데이터가 short타입으로 변환된다!
		// => 이러한 과정은 자바의 컴파일러(번역기)에 의해 자동으로 변환되어지므로
		//	  자동 형변환이라고 한다!
		System.out.println("a1(byte) : " + a1 + ", a2(short) : " + a2);
		
		
		System.out.println("--------------------------------------------");
		
		// 2. 명시적 형 변환
		byte b1 = 10;
		short b2 = 200;
		System.out.println("b1(byte) : " + b1 + ", b2(short) : " + b2);
		
		// short타입 변수 b2의 데이터를 byte타입 변수 b1에 전달
		//b1 = b2; 오류 발생! - Type mismatch: cannot convert from short to byte
		// => short타입보다 byte타입의 크기가 작으므로 자동 형 변환이 불가능!
		//	  따라서, 개발자가 직접 우변 데이터 앞에 형 변환 연산자를 명시해야한다!
		//	  () 괄호 안에 좌변(작은)의 데이터타입을 명시함.  
		b1 = (byte)b2; // 좌변의 변수 데이터타입이 byte타입이므로 형 변환 연산자 (byte)를 명시
		System.out.println("b1(byte) : " + b1 + ", b2(short) : " + b2);
		// => 강제 형 변환에 의해 문법적인 오류가 해결되더라도
		//	  형 변환 후의 데이터는 원래 데이터와 다를 수 있다! = Overflow현상에 의해
		

		// 강제 형 변환을 수행하더라도 원본 데이터가 그대로 유지되는 경우
		byte c1 = 10;
		short c2 = 50;
		System.out.println("c1(byte) : " + c1 + ", c2(short) : " + c2);

		// short타입 변수 c2의 데이터를 byte타입 변수 c1에 전달
		c1 = (byte)c2; // c2의 데이터를 c1에 전달(강제 형 변환)
		
		System.out.println("c1(byte) : " + c1 + ", c2(short) : " + c2);
		//		=> c1(byte) : 50, c2(short) : 50
		// => c1의 데이터타입이 byte타입이며 c2의 데이터 50은 byte타입에 저장 가능하므로
		//	  강제 형 변환 후에도 원본 데이터(50)의 오버플로우가 발생하지 않음(유지됨)
		
		System.out.println("==============================================");
		
		// 정수와 실수간의 형 변환
		// 1. 묵시적 형 변환
		//	 	=> 실수 타입이 정수 타입보다 무조건 크므로 정수 -> 실수 변환은 자동 형 변환 가능
		int i = 100;
		float f = i; // int타입 변수 데이터 100을 float타입 변수 f에 저장 시 자동 형 변환 일어남
		System.out.println(f); // 정수 -> 실수로 변환되므로 100뒤에 .0f가 자동으로 붙는다.
		
		long l = 3133139L;
		// long타입(8byte)은 float타입(4byte)보다 메모리 크기는 크지만, 
		// 실수형은 정수형보다 무조건 큰 타입으로 취급되므로
		// long -> float타입으로 변환 시 자동 형 변환이 가능하다!
		float f2 = l; // long -> float 자동 형 변환
		System.out.println(f2);

		// long타입(8byte) vs double타입(8byte)
		long l3 = 10000000000L;
		double d = l3;
		System.out.println(d);
		
		// 2. 명시적 형 변환
		f2 = 3.14f;
		//long l2 = f2;  오류 발생! - Type mismatch: cannot convert from float to long
		long l2 = (long)f2; // float타입 3.14f가 long타입으로 변환될 때 소수점 부분 탈락됨
		System.out.println(l2);
		
		// long타입(8byte) vs double타입(8byte)
		double d3 = 3.14;
		long l4 = (long)d3; // double타입 3.14f가 long타입으로 변환될 때 소수점 부분 탈락됨
		System.out.println(l4);
		
		System.out.println("=================================================");
		
		// byte & short <-> char 사이의 형 변환 문제점
		char ch = 65;  // 2Byte(0 ~ 65535)
		short sh = 65; // 2Byte(-32768 ~ 32767)
		byte by = 65;  // 1Byte(-127 ~ 128)
		
		// ch = by; 오류 발생!  Type mismatch: cannot convert from byte to char
		//	 => byte타입의 음수 범위가 char타입보다 크므로 자동 형 변환 불가능!
		ch = (char)by;
		System.out.println(ch);
		
		// ch = sh; 오류 발생!  Type mismatch: cannot convert from byte to char
		//	 => short타입의 음수 범위가 char타입보다 크므로 자동 형 변환 불가능!
		ch = (char)sh;
		System.out.println(ch);
		
		// by = ch; 오류 발생!  Type mismatch: cannot convert from byte to char
		//	 => short타입의 음수 범위가 char타입보다 크므로 자동 형 변환 불가능!
		by = (byte)ch;
		System.out.println(by);
		
		// sh = ch; 오류 발생!  Type mismatch: cannot convert from byte to char
		//	 => short타입의 음수 범위가 char타입보다 크므로 자동 형 변환 불가능!
		sh = (short)ch;
		System.out.println(sh);
	}

}
