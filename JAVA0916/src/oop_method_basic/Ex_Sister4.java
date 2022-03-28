package oop_method_basic;

public class Ex_Sister4 {

	public static void main(String[] args) {
		
		Sister4 s = new Sister4();

		// 4. 파라미터도 있고, 리턴값도 있는 메서드 호출 = 2번 + 3번 형태
		System.out.println("동생아! 500원 줄테니 내 새우깡도 사다줄래?");
		// sister_4() 메서드 호출
		// => 파라미터가 1개(int)있으므로 소괄호() 부분에 데이터(500원) 전달
		// => sister_4() 메서드 실행 후 리턴값을 가지고 현재 위치로 다시 복귀하여
		//    좌변의 String 타입 변수 snack에 해당 리턴값을 저장
		String snack = s.sister_4(500);
		System.out.println("동생이 사다준 것 : " + snack);
		
	}

}
