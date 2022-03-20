package if_statement;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * if ~ else if(다중 else if)
		 * - 두 가지 이상의 조건식을 차례대로 판별하면서
		 *   각 조건에 따라 총 세 가지 이상의 경우의 수를 수행하는 if문
		 * 
		 * < 기본 문법 >
		 * 
		 * if( 조건식1 ){
		 * 		문장1; // 조건식1의 결과가 true일 때
		 * }
		 * else if( 조건식2 ){
		 * 		문장2; // 조건식1의 결과가 false이고, 조건식2의 결과가 true일 때
		 * }
		 * else if( 조건식n ){
		 * 		문장n; // 조건식1, 2의 결과가 false이고, 조건식n의 결과가 true일 때
		 * }
		 * else{ // 마지막 else문은 생략 가능함 (else if보다 아래쪽에 위치해야한다.
		 * 		문장x; // 위의 모든 조건식 결과가 false일 때
		 * }
		 *  
		 * 
		 * 
		 */
		
		//정수 num이 5보다 크다, 5보다 작다 or 5와 같다
		
		int num = 5;
		
		if(num > 5) {
			System.out.println(num + "은(는) 5보다 크다");
		}
		
		else if(num < 5) {
			System.out.println(num + "은(는) 5보다 작다");
		}
		
		else if(num == 5){ // else 가능
			System.out.println(num + "은(는) 5와 같다");
		}
		
		System.out.println("------------------------------");
		
		
		
		
		
		
		
	}

}
