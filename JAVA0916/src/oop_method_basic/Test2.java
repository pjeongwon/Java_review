package oop_method_basic;

public class Test2 {

	public static void main(String[] args) {

		MethodExam2 m = new MethodExam2();
		// 2. 파라미터는 없고, 리턴값은 있는 메서드 호출
		// => 호출 시 "아이티윌 부산교육센터"를 리턴하는 메서드 itwill() 정의
		
		System.out.println(m.itwill());

		System.out.println("--------------------------------");

		// sum() 메서드를 호출하여 1 ~ 10까지 정수의 합을 리턴받기
		// => 현재 위치에서 계산하지 않고, sum()메서드에서 계산한 후 결과 (55)만 리턴
		// => 리턴받은 결과값을 "1 ~ 10까지 정수의 합 = 55" 형태로 출력하기
		System.out.println("1 ~ 10까지 정수의 합 : " + m.sum());

		System.out.println("===============================");

	}

}
