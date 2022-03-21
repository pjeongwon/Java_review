package if_statement2;

public class Test5 {

	public static void main(String[] args) {

		// 1. 점수에 대한 결과 계산
		// => 정수형 변수 score 0 ~ 100
		// 점수 60이상 100점 이하 "합격" / 아니면, 0이상 59이하면 불합격
		// 1,2 조건 다 아니면 점수 입력 오류

		int score = 70;

		if (score >= 60 && score <= 100) {
			System.out.println("합격");
		} else if (score >= 0 && score <= 59) {
			System.out.println("불합격");
		} else {
			System.out.println("점수 입력 오류!");
		}

		System.out.println("---------------------------");

		// 2. 영문자에 대한 대문자, 소문자 구별하기
		// char타입 변수 'A' = 65, 'a' = 97, '0' = 48
		
		
		char ch = 57;

		if (ch >= 'A' && ch <= 'Z') { // ch >= 65 && ch <= 90
			System.out.println("대문자임");
		} else if (ch >= 'a' && ch <= 'z') { // ch >= 97 && ch <= 122 
			System.out.println("소문자임");
		} else if (ch >= '0' && ch <= '9') { // ch >= 48 && ch <= 57
			System.out.println(ch);
		} else {
			System.out.println(ch);
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
