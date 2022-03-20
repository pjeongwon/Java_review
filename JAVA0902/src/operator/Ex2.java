package operator;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 대입연산자(=)
		 * - 우변의 데이터(변수 or 리터럴)를 좌변의 변수에 대입(= 저장 = 초기화)
		 * 	=> 연산의 방향이 우 -> 좌로 진행됨
		 * 		ex) x = y = 3의 경우 - y에 3을 먼저 대입하고, x에 y(3)을 대입
		 * - 모든 연산자 중에서 우선순위가 가장 낮다
		 * 
		 * 확장(복합) 대입 연산자(+=, -=, *=, /=, %=)
		 * - 대입연산자와 산술연산자를 조합한 연산자
		 * - 좌변과 우변의 데이터(피연산자)끼리 산술연산을 먼저 수행한 후
		 * 	 산술연산의 결과값을 좌변의 변수에 대입(저장)
		 * - 확장 대입연산자를 통한 연산시 피연산자의 자동 형 변환이 일어나지 않는다
		 * 
		 */
		
		int a = 10; // 대입연산의 예
		int b;
		
		// 변수 a의 값을 변수 b에 대입
		b = a;
		System.out.println(b);

		System.out.println("----------------------");
		
		// b + a의 결과를 다시 변수 b에 저장
		b += a;
		System.out.println(b);
			
		b -= a;
		System.out.println(b);
		
		b *= a;
		System.out.println(b);
		
		b /= a;
		System.out.println(b);
		
		b %= a;
		System.out.println(b);
		
		System.out.println("----------------------");
		
		// 확장 대입연산자를 사용하여 산술 연산을 수행하는 경우
		// 피연산자 타입에 따른 자동 형변환
		byte b1 = 10, b2 = 20;
		
		// b1과 b2의 덧셈 결과를 b1에 저장
		b1 = (byte)(b1 + b2);
		System.out.println(b1);
		
		b1 += b2; // byte타입끼리 연산 결과를 byte타입에 저장하더라도 형 변환이 일어나지 않음
		System.out.println(b1);
		
		char ch = 'A';
		ch = (char)(ch + 3); 
		// ch + 3의 결과를 다시 변수 ch에 저장 = 변수 ch의 값을 3만큼 증가(누적)시키기
		System.out.println(ch);
		
		// 확장 대입연산자를 사용하여 ch값을 3만큼 증가시키기
		ch += 3;
		System.out.println(ch);
		
	}

}
