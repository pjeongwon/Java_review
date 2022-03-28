package oop_method_basic;

public class MethodExam {
	// MethodExam 클래스 정의
// --------- 1. 파라미터도 없고, 리턴값도 없는 메서드 정의 ---------
	public void hello() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "회 : Hello, World!");
		}
	}

	// => 구구단을 출력하는 메서드 gugudan() 정의
	public void gugudan() {
		int dan = 7;
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}

}
