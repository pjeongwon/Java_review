package oop_method_basic;

public class Sister4 {

	// 4. 파라미터도 있고, 리턴값도 있는 메서드 정의 : sister_4()
	// => 파라미터가 있으므로 메서드 선언부 소괄호()안에 전달받은 데이터를 저장할 변수 선언
	// => 리턴값이 있으므로 리턴타입 부분에 리턴할 데이터의 타입을 명시(ex. 문자열 = String)
	// => 메서드 호출시 돈(money = 정수)을 전달받아야 하고,
	// 메서드 작업 종료 후 과자(snack = 문자열)을 리턴해야함
	// String snack = s.sister_4(500); 형태로 호출됨
	
	public String sister_4(int money) {
		// money에서 200원 차감 후 "새우깡" 리턴
		System.out.println("동생 : 오빠가 새우깡 사오라고 " + money + "원을 줬다!");
		money -= 200;
		System.out.println("동생 : 새우깡 사고 " + money + "원 남았다!");
		return "새우깡";
	}
}
