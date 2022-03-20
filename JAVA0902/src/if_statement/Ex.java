package if_statement;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 제어문
		 * - 프로그램의 흐름을 제어하는 용도로 사용되는 문장
		 * - 조건문(Condition)과 반복문(Loop)으로 구분됨
		 * 
		 * < 조건문 >
		 * - 특정 조건에 따라 문장의 실행 여부를 결정하는 문
		 * - if문 계열(if, if ~ else, if ~ else if)과 switch-case문으로 구분됨
		 * 
		 * 1. if문
		 * 		- 주어진 조건식에 따라 특정 문장의 실행 여부를 결정하는 기본적인 조건문
		 * 		- 조건식에 올 수 있는 문장 또는 값은 반드시 결과가 boolean타입이어야 한다.
		 * 		- 조건식 판별 결과가 true이면 블록문({}) 내부의 문장들을 실행하고, 
		 * 		  조건식 판별 결과가 false이면 블록문 내부의 문장 실행을 생략함
		 * 
		 *  < 기본 문법 >
		 *  문장 1;
		 *  
		 *  if(조건식){
		 *  	문장2; // 조건식의 판별 결과가 true일 때 실행
		 *  }
		 *  
		 *  문장 3;
		 *  
		 *  => 조건식 판별 결과가 true일 때  : 문장1 -> 문장2 -> 문장3
		 *  => 조건식 판별 결과가 false일 때 : 문장1 ->   x   -> 문장3
		 */
		
		int num = 3; // 문장1
		
		// 정수형 변수 num의 값이 5보다 큰가
		if(num > 5) { // 조건식(연산식의 경우 결과값이 boolean타입인 식만 사용 가능)
			// 이 위치(블록문 내)는 조건식 판별 결과가 true일 때만 실행 가능한 문장이 위치함
			System.out.println("num이 5보다 크다!"); // 문장2
		}
		
		System.out.println("정수 num = " + num);
	
		System.out.println("------------------------");
		
		int num2 = 15;
		
		if(num2 <= 10) {
			System.out.println("num2는 10보다 작거나 같다!");
			System.out.println("이 문장이 끝나면 if문을 빠져나간다!");
		}
		System.out.println("정수 num = " + num2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}
