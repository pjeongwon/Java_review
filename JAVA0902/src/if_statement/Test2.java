package if_statement;

public class Test2 {

	public static void main(String[] args) {
		
		// if ~ else문 연습
		
		// 1. 정수형 변수 num에 대해 양수 또는 음수 판별(단, 0은 양수에 포함시킴)
		
		int num = 5;
		
		if(num >= 0) {
			System.out.println(num + " : 양수!");
		}
		else {
			System.out.println(num + " : 음수!");
		}
		
		System.out.println("--------------------------");
		
		// 2. 정수형 변수 num2가 5의 배수일 경우 "num = 5의 배수!" 출력
		//	  아니면, "num = 5의 배수가 아님!" 출력하기
		
		int num2 = 14;
		
		if(num2 % 5 == 0) {
			System.out.println(num2 + " = 5의 배수!");
		}
		else {
			System.out.println(num2 + " = 5의 배수 아님!");
		}
		
		
		System.out.println("--------------------------");
		
		// 3. 정수형 변수 num3에 대해 홀수, 짝수 판별(단, 0은 짝수에 포함시키기)
		// 	=> 짝수일 경우 "num3 = 짝수!" 아니면 "num3 = 홀수!"
		
		int num3 = 5;
		
		if(num3 % 2 ==0) { 
			System.out.println(num3 + " = 짝수!");
		} 
		else {
			System.out.println(num3 + " = 홀수!");
		}
		
		System.out.println("--------------------------");
		
		// 4. 문자열(String)타입 변수 id에 저장된 데이터가 "admin"이면 "관리자입니다"출력
		//    아니면 "일반 회원입니다" 출력
		
		String id = "admin";
		
		if( id == "admin") {
			System.out.println("관리자입니다");
		}
		else {
			System.out.println("일반 회원입니다");
		}
		
		
		
	}

}
