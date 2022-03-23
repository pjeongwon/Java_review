package loop_statement_while;

public class Ex {

	public static void main(String[] args) {
		/*
		 * while문 - for문과 마찬가지로 조건식의 결과가 true일 동안 블록 내의 문장을 반복 실행하고, 조건식의 결과가 false가 되면
		 * 반복문을 종료하는 반복문 - for문은 초기식, 조건식, 증감식의 위치가 정해져 있는 반면, while문은 조건식의 위치만 정해져 있고,
		 * 초기식과 증감식은 개발자가 적당한 위치에 배치 - for문과 while문은 100% 상호 변환이 가능
		 * 
		 * 
		 * < 기본 문법 > for(초기식; 조건식; 증감식){ // true일 때 반복 실행 문장들... }
		 * 
		 * 초기식; // 초기식의 위치는 유동적이며, while문보다 위쪽에 위치하면 됨(생략 가능)
		 * 
		 * while(조건식){ [증감식;] // true일 때 반복 실행 문장들... [증감식;] -> 증감식의 위치는 유동적이며 경우에 따라
		 * 생략도 가능함 }
		 * 
		 */

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " : Hello, World!");
		}

		System.out.println("======================");

		int i = 0; // 초기식
		while (i < 10) {
			System.out.println(i + " : Hello, World!");
			i++;
		}

		System.out.println("----------------------");

		i = 1;

		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println("\n----------------------");

		i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}

		System.out.println("\n----------------------");

		i = 1;
		while (i <= 10) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}

		System.out.println("\n----------------------");

		i = 2;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}

		System.out.println("\n----------------------");

		i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}

		System.out.println("\n----------------------");

		i = 10;
		while (i > 0) {
			System.out.print(i + " ");
			i--;
		}

		System.out.println("\n----------------------");

		// 증감식의 위치가 달라지면 실행되는 코드도 달라질 수 있다!

		i = 1;

		while (i <= 10) {
			i++;
			System.out.print(i + " ");
		}
		// => 위 코드 실행시 2 3 4 5 6 7 8 9 10 11 결과가 출력
		//	  처음 i가 1일때 while문 내에서 증감식을 통해 1 -> 2로 증가되어 처음 출력
		// 	  i가 10이 되어 출력한 후 i <= 10의 결과가 true이므로 
		//	  다시 1증가된 값(11)이 출력. 그 후 조건식에 의해 false되어 종료
		
		System.out.println("\n----------------------");
		
		// 따라서, 위의 경우처럼 출력문보다 증감식이 먼저 오는 경우
		// 초기식과 조건식을 적절하게 조절해야한다!
		
		i = 0;

		while (i < 10) {
			i++;
			System.out.print(i + " ");
		}
		System.out.println("\n----------------------");
	}

}
