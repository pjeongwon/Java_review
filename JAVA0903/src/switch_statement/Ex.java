package switch_statement;

public class Ex {

	public static void main(String[] args) {
		/*
		 * switch문 (switch ~ case문)
		 * - if문과 유사하게 조건에 따른 실행 문장을 달리하는 조건문
		 * - if문과 달리 조건식이 정수값(long제외), 문자열, enum 상수 중 하나의 결과만 사용 가능
		 * - switch문의 블록문 내에서 case문을 사용하여 조건식 판별에 따른 결과값음
		 *   => case문에는 특정 값 1개만 지정 가능 => 범위 지정이 불가능
		 *   => 조건식의 결과값과 일치하는 case문의 콜론(:)기호 뒤에 있는 문장들을 차례대로 실행
		 * - case문의 값은 중복될수 없으며, 순서는 상관 없음
		 * - case문 실행 도중 break문을 만나면 현재 switch문을 빠져나감(=종료)
		 * 	 break문은 각 case문의 영역을 구별하는 역할(중괄호{} 대신)
		 * 		=> 만약, break문이 없을 경우 다음 break문을 만나거나 switch문이 종료될 때까지
		 * 		   현재 case문의 아래쪽 모든 case문과 default문의 실행문을 조건과 관계없이 실행함
		 *  
		 *  - default문은 if문에서 else문과 동일한 역할을 수행
		 *    일치하는 case문이 없을 경우 default문을 실행함
		 *    => default문은 생략 가능함
		 *  - default문의 위치는 switch문 내의 어디라도 상관없으나
		 *    보통 마지막에 위치하기 때문에 break문을 쓰지 않음
		 *  
		 *  - if문은 실행 시점에서 조건식을 판별하여 실행할 문장을 결정하지만,
		 *    switch문은 컴파일(번역)시점에 미리 실행할 문장이 결정되므로
		 *    if문보다 실행 속도가 빠르다!
		 *  - if문이 switch문보다 유연하므로 
		 *    => switch문은 if문으로 100% 표현(전환)이 가능하지만,
		 *    	 if문은 switch문으로 전환이 불가능할 수 있다!
		 *    
		 *  < 기본 문법 >  --------------- * [ ] --> 생략 가능 
		 *  switch(조건식){
		 *  	case 값1 : 
		 *  		// 조건식의 결과가 값1과 일치할 경우 실행
		 *  		[break;]
		 *		case 값2 : 
		 *  		// 조건식의 결과가 값2과 일치할 경우 실행
		 *  		[break;]
		 *  	case 값n : 
		 *  		// 조건식의 결과가 값n과 일치할 경우 실행
		 *  		[break;]
		 *    
		 * 		[default :]   // 일치하는 case문이 없을 경우 실행 
		 *  }
		 * 
		 */
		
		int num = 3;
		
		switch(num) { // 조건식(결과가 정수, 문자열 중 하나)
			// 조건으로 제시된 num에 해당하는 값을 case문으로 하나씩 비교(범위 지정 불가)
			
			case 1 : // 조건식 결과가 1일 경우 실행할 문장들 기술
				System.out.println("num = 1");
		
			case 2 : // 조건식 결과가 2일 경우 실행할 문장들 기술
				System.out.println("num = 2");
				
			case 3 : // 조건식 결과가 3일 경우 실행할 문장들 기술
				System.out.println("num = 3");
			
			case 4 : // 조건식 결과가 4일 경우 실행할 문장들 기술
				System.out.println("num = 4");
				
			default : //	조건식 결과가 1, 2, 3, 4 중 일피하는 경우가 없을 경우 실행할 문장들 기술
				System.out.println("num = 1 ~ 4가 아닌 나머지");
			}
		// => 각 case문 뒤에 실행문을 기술한 뒤 break;문을 기술하지 않으면,
		    //해당 case문 실행 후에 아래쪽의 나머지 case 및 default문의 실행문을
		    //조건과 관계없이 무조건 차례대로 실행함
			//ex) num이 3일때 case 3을 실행하므로 "num = 3"이 출력되고 
			// break문이 없으므로 "num = 4" / "num = 1 ~ 4가 아닌 나머지" 모두 출력
		
		System.out.println("---------------------");
		
		switch(num) { // 조건식(결과가 정수, 문자열 중 하나)
		// 조건으로 제시된 num에 해당하는 값을 case문으로 하나씩 비교(범위 지정 불가)
		
			case 1 : // 조건식 결과가 1일 경우 실행할 문장들 기술
				System.out.println("num = 1");
				break; // 현재 위치에서 switch문을 빠져나감
			case 2 : // 조건식 결과가 2일 경우 실행할 문장들 기술
				System.out.println("num = 2");
				break; // 현재 위치에서 switch문을 빠져나감
			case 3 : // 조건식 결과가 3일 경우 실행할 문장들 기술
				System.out.println("num = 3");
				break; // 현재 위치에서 switch문을 빠져나감
			case 4 : // 조건식 결과가 4일 경우 실행할 문장들 기술
				System.out.println("num = 4");
				break; // 현재 위치에서 switch문을 빠져나감
			default : //	조건식 결과가 1, 2, 3, 4 중 일피하는 경우가 없을 경우 실행할 문장들 기술
				System.out.println("num = 1 ~ 4가 아닌 나머지");
		}
		
		System.out.println("---------------------");
		
		char initial = 'K';
		
		switch(initial) {
		
			case 'K' :
				System.out.println("Korea");
				break;
			case 'U' :
				System.out.println("USA");
				break;
			case 'C' :
				System.out.println("Canada");
				break; // 마지막 break문 생략 가능		
		
		}
		
		System.out.println("---------------------");

		String initial2 = "K";
		
		switch(initial2) {
		
			case "K" :
				System.out.println("Korea");
				break;
			case "U" :
				System.out.println("USA");
				break;
			case "C" :
				System.out.println("Canada");
				break; // 마지막 break문 생략 가능		
		
		}
		
		System.out.println("---------------------");
				
	}

}
