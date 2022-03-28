package oop_method_basic;

public class Ex_Sister2 {

	public static void main(String[] args) {

		Sister2 s = new Sister2();
		// 2. 파라미터는 없고, 리턴값만 있는 메서드 호출
		System.out.println("동생아! 물 좀 떠온나!");
//		s.sister_2(); // sister_2() 메서드 호출
		// => 메서드 종료 후 리턴되는 값을 별도로 처리하지 않으면 사용 불가능(사라짐)
		
		// => 리턴타입이 String이므로 리턴되는 데이터를 변수에 저장하거나
		//	  출력문 등에 직접 사용할 수 있다.
		
		System.out.println("동생이 가져다 준 것 : " + s.sister_2());
	


	}

}
