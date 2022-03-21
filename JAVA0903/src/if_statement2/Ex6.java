package if_statement2;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * 중첩 if문 - 특정 조건을 만족할 때 또는 만족하지 않을 때 블러문 내부에서 또 다른 조건을 비교해야 하는 경우 if문(또는 else문
		 * 등) 블록 내에 다른 if문을 기술할 수 있다.
		 * 
		 * < 기본 문법 > if(조건식1){ 조건식1 true 일 때 if(조건 1-2){ 조건식 1, 1-2 true 일 때 } else{ 조건식
		 * 1 true, 1-2 false 일 때 } } else{ 조건식 1의 결과가 false 일 때 }
		 * 
		 */

		String id = "admin";
		String password = "1234";

		if (id == "admin") {
			System.out.println("아이디 일치");
			if (password == "1234") {
				System.out.println("로그인 성공");
			} else {
				System.out.println("패스워드 틀림");
			}
		} else {
			System.out.println("아이디 없음");
		}

	}

}
