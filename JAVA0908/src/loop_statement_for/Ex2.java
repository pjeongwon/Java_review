package loop_statement_for;

public class Ex2 {

	public static void main(String[] args) {
		// for문에서 각 항목(초기식, 조건식, 증감식)은 복수개의 항목을 지정할 수 있다.
		// 		=> 단, 각 항목 내의 복수개의 항목은 콤마(,)로 구분해야하며,
		//	  	   일반적으로는 한 개씩의 항복만 작성하므로 별로 사용하지 않음(혼동의 우려가 있음)
		//		   (단, 조건식은 결과가 하나의 boolean타입이어야 하므로 논리연산자(&&, ||)로 연결해야함)
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}
		
		System.out.println("-------------------");
		
		for(int i = 1, j = 2; i <= 10 && j <= 10; i++, j += 2) {
			System.out.println("i = " + i + ", j = " + j);
		}
		
//		i	j		 	i+1	j+2
//		-----------------------
//		1	2	i = 1	2	4
//		2   4	i = 2	3	6
//		3	6	i = 3	4	8
//		4	8	i = 4	5	10
//		5	10	i = 5	6	12 --- for문 종료 (i = 5, j = 12)
		
		System.out.println("========================");
		
		// 반복을 위한 초기식, 조건식, 증감식에 리터럴 대신 변수 사용도 가능함
		int min = 1, max = 10;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		for(int i = min; i <= max; i++) {
			System.out.println(i);
		}
		// 만약, 동일한 반복을 여러번 수행해야하는 경우 조건의 값이 변할 때
		// 각 반보문을 따로 수정하는 것이 아닌 변수 값만 수정하면 모든 반복문에 적용됨
		
	}

}
