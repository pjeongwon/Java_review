package loop_statement_for;

public class Test4 {

	public static void main(String[] args) {

		int sum = 0;
		boolean a = true;
		for(int i = 1; i <= 100; i++) {
			System.out.println(sum);
			sum += i;
			if(sum > 100 && a) {
				System.out.println("i가 "+ i + "일 때 합계 sum = 100을 초과");
				a = false;
			}
			
		}
		
		System.out.println("--------------------------------");
		
		
		int oddTotal = 0, evenTotal = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				oddTotal += i;
			}
			else if(i % 2 == 0) {
				evenTotal += i;
			}
		}
		System.out.println("홀수의 합 : " + oddTotal + " / 짝수의 합 : " + evenTotal);

		System.out.println("--------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
