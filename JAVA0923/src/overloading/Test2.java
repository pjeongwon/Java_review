package overloading;

public class Test2 {

	public static void main(String[] args) {
		OverloadingTest ot = new OverloadingTest();
		
		// 두 수의 합을 계산하는 add() 메서드 정의
		// => 정수 2개, 실수 2개를 각각 전달받아 정수와 실수의 합 출력하도록 오버로딩
		//	  ex) add(10, 20) 호출 시 30 출력, add(10.0, 20.0) 호출 시 30.0 출력
		ot.add(10, 20); // 30 출력
		ot.add(10.0, 20.0); // 30.0 출력
		ot.add(10, 20.0); // 30.0 출력 add(double, double)호출됨(int -> double로 자동 형 변환)
		
		System.out.println("===============================");
		
		Calculator c = new Calculator();
		// 연산자(문자형, opr) 1개와 정수 2 ~ 3개(num1, num2, num3)를 전달 받아
		// 연산자에 따라 2 ~ 3개의 정수에 대한 연산 결과를 출력하는 메서드 cal() 정의
		c.cal('+', 2, 3); // 2 + 3 = 5 출력
		c.cal('+', 2, 3, 5); // 2 + 3 + 5 = 10 출력
		
		c.cal('-', 10, 2); // 10 - 2 = 8 출력
		c.cal('-', 10, 2, 3); // 10 - 2 - 3 = 5 출력
	}

}

class Calculator{
	
	public void cal(char opr, int num1, int num2) {
		if(opr == '+') {
			System.out.println("num1 + " + "num2 = " + (num1 + num2));
		} else if(opr == '-') {
			System.out.println("num1 - " + "num2 = " + (num1 - num2));
		}
	}
	public void cal(char opr, int num1, int num2, int num3) {
		if(opr == '+') {
			System.out.println("num1 + " + "num2 + " + "num3 = " + (num1 + num2 + num3));
		} else if(opr == '-') {
			System.out.println("num1 - " + "num2 - " + "num3 = " + (num1 - num2 - num3));
		}
	}
}


class OverloadingTest{
	
	public void add(int num1, int num2) {
		System.out.println("add(int, int) 호출됨");
		System.out.println("num1 + " + "num2 = " + (num1 + num2));
	}
	public void add(double num1, double num2) {
		System.out.println("add(double, double) 호출됨");
		System.out.println("num1 + " + "num2 = " + (num1 + num2));
	}
}
