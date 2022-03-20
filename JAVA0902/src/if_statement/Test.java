package if_statement;

public class Test {

	public static void main(String[] args) {
		
		// 기본 if문 연습
		//---------------------------------------------------------------
		// 1. 정수형 변수 num에 대한 절대값을 계산하여 출력하기
		//		ex) 변수 num의 값이 5일 때 -> "num = 5" 출력
		//		ex2) 변수 num의 값이 -5일 때 -> 음수를 양수로 변환 "num = 5" 출력
		
		int num = -5;
		
		if (num < 0) {
			Math.abs(num);     // 절대값 구하는 법 Math.abs()
			num = -num;
		}
		
		System.out.println("num = " + num);
		
		System.out.println("----------------------------------");
		
		
		// 2. 정수형 변수 num2에 저장된 값이 5의 배수인지 판별
		//	  5의 배수일 경우 "num = 5의 배수!" 문장을 출력하기
			  
		int num2 = 15;
		
		if(num2 % 5 == 0) {
			System.out.println("num2 = 5의 배수");
		}
		System.out.println("num2 = " + num2);
		
		
		
		
		
		
		
		
		
	}

}
