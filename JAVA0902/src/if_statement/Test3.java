package if_statement;

public class Test3 {

	public static void main(String[] args) {
		// 정수형 변수 num에 대한 양수, 음수, 0 
		
		int num = 1;
		
		if(num > 0) {
			System.out.println("양수임");
		}
		else if(num < 0) {
			System.out.println("음수임");
		}
		else if(num == 0) {
			System.out.println("0임");
		}
		
		System.out.println("-----------------------");
		
		// 3. 정수형 변수 num3에 대해 홀수, 짝수 판별(단, 0은 짝수에 포함시키기)
		// 	=> 짝수일 경우 "num3 = 짝수!" 아니면 "num3 = 홀수!"
				
		int num3 = 0;
		
		if(num3 == 0) {
			System.out.println(num3 + " = 0");
		}
		
		else if(num3 % 2 ==0) { 
			System.out.println(num3 + " = 짝수!");
		} 
		else if(num3 % 2 == 1) {
			System.out.println(num3 + " = 홀수!");
		}
		
		
		
		
		
		
		
		
	}

}
