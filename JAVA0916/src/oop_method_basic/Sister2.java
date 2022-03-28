package oop_method_basic;

public class Sister2 {

	// --------- 2. 파라미터는 없고, 리턴값만 있는 메서드 : sister_2() ---------
	// => 파라미터가 없으므로 메서드 선언부 소괄호() 안에 아무것도 명시하지 않음
	// => 리턴값이 있으므로 리턴타입 부분에 리턴할 데이터의 타입을 명시(ex. 문자열 - String)
	//		=> 리턴타입을 명시할 경우 반드시 메서드 종료시점에서
	//		   return문을 사용하여 리턴할 데이터를 명시해야함
	//		   만약, 리턴타입을 void가 아닌 다른 타입으로 명시한 후 리턴값을 지정하지 않으면
	//		   This method must return a result of type String 오류 발생함
	public String sister_2() {
		System.out.println("동생 : 오빠가 물 떠오라고 시켰다!");
		System.out.println("동생 : 물을 떠다 줬다!");

		// 리턴타입이 String으로 명시디어 있으므로 반드시 메서드 종료시점에
		// String타입 데이터를 return문 뒤에 명시해야한다!
		// => 단, 리턴 가능한 데이터는 반드시 한 개만 가능
//		return "물"; // String 타입 리터럴을 직접 리턴
		// 또는 변수를 사용하여 리턴값을 저장한 뒤 리턴 가능함
		String str = "물"; // 리턴할 데이터를 변수에 저장
		return str;
		// => 메서드 내에서 return문을 만나면 현재 메서드 수행이 종료되고
		//	  호출한 곳으로 되돌아가는데 이 때, return문 뒤의 데이터를 가지고 돌아감(= 리턴값)
		// => 현재 메서드 종료 시에는 문자열 "물"을 가지고 원래 호출한 곳으로 되돌아감
	}

}
