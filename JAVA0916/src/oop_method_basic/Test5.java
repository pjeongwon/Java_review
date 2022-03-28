package oop_method_basic;

public class Test5 {

	public static void main(String[] args) {
		// start ~ end 까지 1씩 증가하면서 짝수만 찾아서 출력하는 printOddNumber() 메서드 호출
		// => 파라미터 : 정수 2개(start, end), 리턴값 없음
		MethodExam5 n = new MethodExam5();
		
		n.printOddNumber(4, 21);
		
		System.out.println("\n-----------------------------");
		
		// 정수 2개(num1, num2)를 전달받아 두 정수의 합을 리턴하는 sum() 메서드 호출
		// => 파라미터 : 정수 2개(num1, num2), 리턴값 : 두 정수의 합 = 정수
		n.sum(10, 20);
		n.sum(1, 47);
		n.sum(11, 111);
		
	}

}
