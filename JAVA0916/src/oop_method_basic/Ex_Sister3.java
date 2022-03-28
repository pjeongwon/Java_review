package oop_method_basic;

public class Ex_Sister3 {

	public static void main(String[] args) {
		
		Sister3 s = new Sister3();
		// 3. 파라미터만 있고, 리턴값은 없는 메서드
		// => 파라미터가 있으므로 메서드 호출 시점에 소괄호() 내에 메서드에 전달할 데이터 지정
		//	  이 때, 전달할 데이터는 변수 또는 리터럴 모두 사용 가능
		System.out.println("동생아! 200원 줄테니까 과자 사 먹어라!");
//		s.sister_3(200); // sister_3() 메서드 호출 시 파라미터에 리터럴 직접 전달
		
		int money = 200;
		s.sister_3(money); // sister_3() 메서드 호출 시 파라미터에 변수값을 전달
		// => 메서드에 전달인자(데이터)가 전달될 경우 반드시 에서드 선언부에 파라미터가 존재해야합
		// => sister_3(int m) 메서드는 int형 파라미터가 한 개 존재하므로
		//	  메서드 호출 시 반드시 정수형 데이터 1개를 전달해야한다!
		
		// 리턴값이 없는 (void 타입) 메서드는 출력문이나 변수 등에 결합하여 사용 불가능
//		System.out.println(s.sister_3(200)); // 오류 발생!
		// => 반드시 단독으로만 사용해야한다!


	}

}
