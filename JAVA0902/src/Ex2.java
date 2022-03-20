
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 연산 과정에서의 자동 형 변환
		 * 	- 자바에서 연산을 수행하기 전 피연산자끼리의 데이터타입을
		 * 	  먼저 일치 시킨 후 해당 연산을 수행
		 * 		=> 피 연산자끼리 데이터타입을 일치시키는 작업이 묵시적(자동)으로 수행됨
		 * 	
		 *  규칙 1. int타입보다 작은 타입끼리의 연산은 모두 int타입으로 변환 후 연산을 수행
		 *  	=> 따라서, 결과값이 무조건 int타입이 됨
		 *  	   ex1) byte + byte = int(byte) + (int)byte 형태로 변환되어 연산 수행하므로
		 *  		   결과값이 int타입이 됨
		 *  	   ex2) char + int = (int)char + int = int + int = int
		 * 
		 *   규칙 2. int타입보다 큰 타입과의 연산은 큰 타입으로 변환 후 연산을 수행
		 *   	=> 따라서, 결과값이 큰 타입으로 변환됨
		 *   	   ex1) int + long = (long)int + long = long + long
		 *   	   ex2) int + double = (double)int + double = double + double = double
		 */
		byte b1 = 10, b2 = 20, b3;
		System.out.println(b1 + b2);
		
		//b3 = b1 + b2;  오류 발생! - Type mismatch: cannot convert from int to byte
		//	=> byte + byte = int + int형태로 변환되어 결과값이 int이므로 byte변수에 저장 불가!
		//b3 = (byte)b1 + (byte)b2; // 각각의 타입을 byte로 변환해도 다시 int로 변환하여 연산함
		// 각각을 변환하는 것이 아니라 연산 결과를 다시 byte타입으로 변환해야 한다!
		b3 = (byte)(b1 + b2); // b1 + b2 연산 결과를 다시 byte타입으로 변환하면 저장 가능함
		System.out.println(b3);
		
		System.out.println("-------------------------------------");
		
		char ch = 'A';
		// char ch2 = ch + 3; 오류 발생! - Type mismatch: cannot convert from int to char 
		//	=> char + int = (int)char + int = int + int가 되므로 char타입 변수에 저장 불가
		char ch2 = (char)(ch + 3);
		System.out.println(ch2);
		System.out.println(ch + 3); // char + int = int + int = int 이므로 'D'가 아닌 68출력됨
		System.out.println((char)(ch + 3)); // 68(int) -> 'D'(char)로 변환됨
		
		System.out.println("-------------------------------------");
		
		int i = 100;
		long l = 200;
		// i와 l의 덧셈 결과를 int형 변수 i2에 저장
		//int i2 = i + l; // int + long = long이므로 int타입 변수에 저장 불가!
		int i2 = (int)(i + l);
		 
		float f = 3.14f;
		long l2 = (long)(l + f);
		System.out.println(l2);
		
		
		System.out.println("-------------------------------------");
		
		float f2 = 0.1f;
		double d2 = 0.1;
		System.out.println(f2 + d2); // float + double = double + double로 변환되어 연산 수행
		//	=> 따라서, 가급적 double -> float으로 강제 형 변환 후 연산을 수행해야 한다!
		System.out.println(f2 + (float)d2);		
		System.out.println("-------------------------------------");
		
		// 리터럴끼리의 연산시에는 형 변환이 발생하지 않는다.
		// 단, 연산 결과가 허용 범위를 초과할 경우에는 오류가 발생함
		byte b4 = 100 + 20; // 결과값이 byte범위 내이므로 별도의 형변환 발생x
		//byte b5 = 100 + 30; // 결과값이 byte범위 밖이므로 별도의 형변환 필수!
		byte b5 = (byte)(100 + 30);
		System.out.println(b5);
		
		
		 
	}

}
