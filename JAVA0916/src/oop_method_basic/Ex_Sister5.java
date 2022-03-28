package oop_method_basic;

public class Ex_Sister5 {

	public static void main(String[] args) {
	// 메서드 파라미터와 리턴값의 개수
	// - 파라미터가 2개 이상인 메서드 호출 시 전달할 파라미터들을 콤마(,)로 구부하여 전달
	//   각 파라미터간의 타입은 동일하지 않아도 무관하며, 매개변수만 순서에 맞게 선언하면 됨
	//   ex) 정수 50과 문자열 "A"를 전달 시 매개변수는 int형과 String형 순으로 선언해야함
		
		Sister5 s = new Sister5();
		
		System.out.println("동생아! 1000원이랑 새우깡을 줄테니 가서 쿠크다스로 바꿔와라!");
		int money = 1000;
		String snack = "새우깡";
		// => Sister5인스턴스의 sister_5()메서드를 호출하여
		//    파라미터로 money와 snack변수를 전달하고, 
		//    리턴값으로 문자열을 리턴받아 snack에 저장
		
		snack = s.sister_5(money, snack);
		System.out.println("동생이 바꿔다 준 과자 : " + snack);
	
		System.out.println("=====================================");
		
		
	
	
	
	
	
	}
}
