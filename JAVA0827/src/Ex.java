
public class Ex {

	public static void main(String[] args) {
		/*
		 * 정수 데이터의 다른 표현 방법
		 * - 별다른 표시가 없을 경우 10진수로 취급됨		 
		 * - 정수 데이터를 2진수, 8진수, 16진수로 표현 가능함
		 * 		=>정수 데이터 앞에 접두사를 사용하여 다른 진법으로 표현
		 * - 특정 진법으로 표현하더라도 실제 사용 시점에서 10진수로 변환되어짐
		 * 		=> 만약, 출력문에서 10진수 외의 진법으로 표현하려면 다른 방법을 추가로 적용해야함
		 * 
		 * 
		 * 1. 2진수  : 접두사 0b를 붙여서 표현. 사용 가능한 숫자는 0, 1 
		 * 		ex) 0b1010 =>  10진수 : 10
		 * 2. 8진수  : 접두사 0을 붙여서 표현. 사용 가능한 숫자는 0 ~ 7  
		 * 		ex) 017    =>  10진수 : 15
		 * 3. 16진수 : 접두사 0x를 붙여서 표현. 사용 가능한 숫자는 0 ~ 9, A ~ F 
		 * 		ex) 0x1F   =>  10진수 : 31
		 * 
		 * */
		
		int num = 10; // 10진수
		
		int binaryNum = 0b1010; // 2진수
		// binaryNum = 0b1234; // 0, 1만 사용가능
		
		int octalNum = 012; // 8진수
		//octalNum = 018; // 0 ~ 7사이 범위만 사용 가능
		
		int hexNum = 0xA; // 16진수
		//hexNum = 0xABCT; // 0 ~ 9, A ~ F사이의 범위만 사용 가능
		
		System.out.println("10진수 num = " + num);
		System.out.println("2진수 binaryNum = " + binaryNum);
		System.out.println("8진수 octalNum = " + octalNum);
		System.out.println("16진수 hexNum = " + hexNum);
		
		
	}

}
