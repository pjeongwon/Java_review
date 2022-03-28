package oop_method_basic;

public class MethodExam3 {
	// --------- 3. 파라미터만 있고, 리턴값은 없는 메서드 호출 ---------

	public void hello2(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("Hello, World!");
		}
	}

	// --------------------------------------------------------

	public void gugudan2(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}

}
