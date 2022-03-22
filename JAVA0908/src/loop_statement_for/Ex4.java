package loop_statement_for;

public class Ex4 {

	public static void main(String[] args) {
		/* 
		 * 반복문과 조건문의 결합
		 *  - 반복문 내에서 조건문을 통해 특정 조건일 때만 일부 반복문을 수행핟록 제어
		 *  	ex) 1 ~ 100까지 1씩 증가하면서 홀수와 짝수의 합을 따로 누적
		 */
	
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Hello, World!");
			if(i == 5) {
				System.out.println("5회째 출력");
			}
		}
	
	}

}
