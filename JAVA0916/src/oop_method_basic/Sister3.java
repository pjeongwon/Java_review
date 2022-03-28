package oop_method_basic;

public class Sister3 {
//	--------- 3. 파라미터만 있고, 리턴값은 없는 메서드 : sister_3() ---------
	// => 파라미터가 있으므로 메서드 선언후 소괄호()안에 전달받은 데이터를 저장할 변수선언
	// => 리턴값이 없으므로 리턴타입 부분에 리턴할 데이터의 타입을 void로 명시
	
	public void sister_3(int m) { // int money = 200과 동일한 결과가 수행됨
		// => 메서드 호출 시점에서 전달한 데이터(정수 200)을 파라미터에 저장하게 되ㅗ
		//    메서드 내에서 해당 파라미터(매개변수)를 사용하여 작업 가능함
		System.out.println("동생 : 오빠가 과자 사먹으라고 준 돈은 " + m + "원");
		System.out.println("동생 : 200원짜리 새우깡을 샀다!");
		m -= 200;
		System.out.println("동생 : 과자 사먹고 남은 돈" + m + "원");
		
		// 리턴타입이 void이므로 return문은 기술하지 않아도 됨
		// 단, return문을 사용해야 하는 경우도 있음
		// 이 때, void타입 메서드에서 return문은 return뒤에 아무값도 기술하지 않음
//		return; // 메서드 내에서 return문을 만나면 즉시 현재 메서드를 종료하고 돌아감
		
		// 만약, return문을 사용할 경우 return문 아래쪽의 문장은 실행되지 못함
		// 따라서, Unreachable code라는 오류가 발생함
		
//		System.out.println("return 아래쪽 문장"); // return문 있을 경우 실행딜 수 없는 코드
	}
	
}
