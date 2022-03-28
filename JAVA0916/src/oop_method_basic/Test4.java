package oop_method_basic;

public class Test4 {

	public static void main(String[] args) {
		MethodExam4 m = new MethodExam4();
		
		// 4. 파라미터도 있고, 리턴값도 있는 메서드 호출
		// 정수 1개를 전달받아 해당 정수의 절대값을 리턴하는 메서드 abs() 호출
		// => 파라미터 : 절대값을 계산할 정수, 리턴값 : 계산된 절대값

		System.out.println("절대값 : " + m.abs(-4));
		System.out.println("절대값 : " + m.abs(-100));
		System.out.println("절대값 : " + m.abs(0));
		System.out.println("절대값 : " + m.abs(47));
		
		
		System.out.println("--------------------");
		
		int x = 10;
		int result = m.sum1ToX(x);
		System.out.println("1 ~ " + x + "까지의 합 : " + result);
//		System.out.println(m.sum1ToX(10));
//		System.out.println(m.sum1ToX(100));
//		System.out.println(m.sum1ToX(1000));
//		System.out.println(m.sum1ToX(10000));
//		System.out.println(m.sum1ToX(100000));
	}

} 
