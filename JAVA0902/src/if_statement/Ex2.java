package if_statement;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * if ~ else 문
		 * - 조건식 판별 결과에 따라 서로 다른 문장을 실행하는 if문
		 * 		(두가지 상황에 따라 다른 문장을 실행하며 동시에 두 가지 모두 실행될 수는 없음)
		 * - 조건식 판별 결과에 true이면, if문의 중괄호 블럭{}내의 문장을 실행하고,
		 * 	 조건식 판별 결과가 false이면, else문의 블럭{}내의 문장을 실행함
		 * 
		 * < 기본 문법 >
		 * 문장1;
		 * if(조건식){
		 * 		조건식 true일 때,
		 * 		문장2;
		 * }
		 * else{
		 * 		조건식 false일 때,
		 * 		문장3;
		 * }		
		 * 문장4;
		 * 
		 * => 조건식 판별 결과가 true일 때  : 문장1 -> 문장2 -> 문장4
		 * => 조건식 판별 결과가 false일 때 : 문장1 -> 문장3 -> 문장4
		 * 
		 */

		int num = 13;
		
		if(num > 5) {
			System.out.println("num = 5보다 크다!");
		}
		else {
			System.out.println("num = 5보다 크지 않다!");
		}
		
		System.out.println("num = " + num);
	
	
	
	
	
	}

}
