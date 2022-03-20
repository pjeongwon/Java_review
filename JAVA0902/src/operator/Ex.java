package operator;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 연산(Operation)
		 * 연산자(Operate)
		 * 피연산자(Operand) = 항
		 * 연산식(Expression)
		 * 
		 * 1. 산술 연산자(+, -, *, /, %)
		 * - 일반 사칙 연산과 동일
		 * - % 연산자 : 나머지 연산자(퍼센트 연산자)라고 하며 나눗셈 결과의 나머지를 계산
		 * 	=> / 연산자 : 나눗셈 결과의 몫을 계산
		 * 
		 */
		
		System.out.println(10 + 2);
		System.out.println(10 - 2);
		System.out.println(10 * 2);
		System.out.println(10 / 2);
		System.out.println(10 % 2);
		
		System.out.println("----------------------------");
		
		// int형 변수 a에 10저장, b에 3을 저장, c는 선언
		int a = 10, b = 3, c;
		
		// a와 b의 덧셈 결과를 c에 저장
		
		c = a + b;
		System.out.println(a + " + " + b + " = " + c);
		
		c = a - b;
		System.out.println(a + " - " + b + " = " + c);
		
		c = a * b;
		System.out.println(a + " * " + b + " = " + c);
		
		c = a / b;
		System.out.println(a + " / " + b + " = " + c);
		
		c = a % b;
		System.out.println(a + " % " + b + " = " + c);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
