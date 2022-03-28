package oop_method_basic;

public class Test3 {

	public static void main(String[] args) {
		
		MethodExam3 m = new MethodExam3();
		// 3. 파라미터만 있고, 리턴값은 없는 메서드 호출
		// hello2() 메서드를 호출하여 반복할 횟수(count = 정수)를 파라미터에 전달하면
		// 메서드 내에서 반복문을 사용하여 1 ~ count번까지 1씩 증가하면서 "Hello, World!" 출력
		// => ex) count가 5일 때, "Hello, World!"를 5번 출력
		
		m.hello2(5);
		System.out.println("------------------");
		m.gugudan2(9);

	}

}
