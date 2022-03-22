package loop_statement_for;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 반복문을 사용한 연산의 누적
		 * - 특정 연산 결과를 누적하는 경우(ex. 점수의 합계 계산, 뺄셈을 연속해서 수행 등)
		 * 	 연산 결과를 누적하기 위한 별도의 변수가 필요함(= 누적 변수)
		 * - 누적 변수는 반드시 반복문보다 앞(위)쪽에서 선언 및 초기화를 수행해야함
		 * 
		 */
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i + ", sum = " + sum);
			sum += i;
		}
		System.out.println("합계 sum = " + sum);
		
		
		
		
		
		
	}

}
