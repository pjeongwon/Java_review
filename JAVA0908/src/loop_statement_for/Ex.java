package loop_statement_for;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 반복문(Loop) - 특정 문장 또는 블럭을 주어진 조건에 따라 반복 실행하는 문 - for문, while문(do - while문) -
		 * for문과 while문은 문법적 구조는 다르지만, 동작 방식이 동일함 => 따라서, 상호 100% 전환이 가능함 - for문은 주로 반복
		 * 횟수가 정해져있는 반복문에 사용하며, while문은 주로 반복 횟수가 정해져 있지 않는 반복문에 사용함(관례적인 규칙) ex) 밥을 10번
		 * 떠서 드세요 -> 횟수가 정해져 있음 (for문에 적합) 밥을 그릇이 빌때까지 드세요 -> 횟수가 정해져 있지 않음 (while문에 적합)
		 * => 반복할 때 횟수를 카운팅 하는지에 따라 구분하면 쉽다.(횟수 or 상황) - 반복문 구성 요소 : 초기식, 조건식, 실행문(블록),
		 * 증감식 => 초기식 : 반복 횟수를 제어하기 위해 제어변수를 선언하고 필요에 따라 초기화 수행 (맨 처음 한 => 조건식 : 제어변수를
		 * 사용하여 반복문을 반복(종료)하는 조건식 지정 (조건식 판별 결과가 true일 동안 반복을 수행하고, false가 되면 종료) => 실행문
		 * : 조건식 결과가 true일 동안 실행 할 문장 기술 (한 문장 또는 여러 문장을 블록{}내에 기술) => 증감식 : 실행문 실행 후
		 * 조건식을 흐름이 이동하기 전, 제어변수 값을 증감시킴 => 실행 흐름 : 초기식 -> 조건식 -> 실행문(true일 때) -> 증감식 ->
		 * 조건식 반복 (조건식 판별 결과가 true일 동안 반복)
		 * 
		 * 
		 * 
		 * 1. for문 - 가장 일반적인 반복문 - 초기식, 조건식, 증감식의 위치가 정해져 있어서 초보자가 익히기에 쉬운 반복문
		 * 
		 * < 기본 문법 > for(초기식; 조건식; 증감식){ // 조건식이 true일 때 반복 실행할 문장들 }
		 *
		 * 조건식 결과가 false가 되면 중괄호 블럭을 빠져나와서 아래쪽 문장이 실행됨
		 * 
		 */

		System.out.println("1 : Hello, World!");
		System.out.println("2 : Hello, World!");
		System.out.println("3 : Hello, World!");
		System.out.println("4 : Hello, World!");
		System.out.println("5 : Hello, World!");
		System.out.println("6 : Hello, World!");
		System.out.println("7 : Hello, World!");
		System.out.println("8 : Hello, World!");
		System.out.println("9 : Hello, World!");
		System.out.println("10 : Hello, World!");
		System.out.println("===========================");

		// 반복 횟수에 따른 조건을 설정하기 위해 초기식, 조건식, 증감식 지정 필요
		// (반복 횟수를 반복하는 조건은 한 가지가 아니다!)

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " : Hello, World!");
			System.out.println(i);
		}
		// System.out.println(i); for문 종료 후 제어변수 i값을 확인하기 위해 for문 바깥에서
		//	i값을 출력하고자 System.out.println(i); 오류 발생! 
		//  => 제어변수 i는 for문 내에서 선언되었으므로 for문이 종료되면 제어변수 i도 제거됨
		//	   즉, for문 종료 후 for문 내에서 선언된 제어변수 i는 접근 불가능(=사용 불가)

		System.out.println("==========================");

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
//		System.out.print("\nfor문 종료");

		System.out.println("\n--------------------------");

		for (int i = 1; i <= 10; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println("\n--------------------------");

		for(int i = 2; i <= 10; i+=2) {
			System.out.print(i + " ");
		}
		
		
		System.out.println("\n--------------------------");
		
		
		for(int i = 10; i >=1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n==========================");
		
		// for문의 구성요소 생략할 수 있는 경우
		int i = 1; // for문 바까톡에서 제어변수를 선언하는 경우
		
		for (/*생략 가능*/; i <= 10;) {
			System.out.print(i + " ");
			i++; // for문 내의 실행문 아래쪽에서 제어변수를 증감시키는 경우(증감식)
		}
		// 제어변수 i가 for문보다 위쪽에서 선언되어 있으므로
		// for문 종료 후에도 제어변수는 여전히 존재하게 되므로 제어변수 i에 접근 가능함
		System.out.println("\nfor문 종료 후 제어변수 i = " + i);
		
		/*for (int i = 1; i <= 10; i++) { ★Duplicate local variable i★
			제어변수 i가 먼저 선언되어 있는 상태에서 for문 내에서 중복으로 
			선언되었음(중복불가)
		}
		만약, 제어변수 i를 for문에서 또는 다른 문장에서 사용하려면
		선언문의 데이터타입을 제외하고 변수 값만 변ㄱㅇ하여 사용 가능함 
		 */
		for (i = 1; i <= 10; i++) {} // for문의 초기식에서 i값을 1로 초기화는 가능!

		
		
		
	}

}
