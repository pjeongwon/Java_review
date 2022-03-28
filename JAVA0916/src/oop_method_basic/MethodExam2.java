package oop_method_basic;

public class MethodExam2 {
	// --------- 2. 파라미터는 없고, 리턴값은 있는 메서드 정의 ---------
	// => "아이티윌 부산교육센터"를 리턴하는 메서드 itwill() 정의
	public String itwill() {
		return "아이티윌 부산교육센터";
	}

	public int sum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}

}
