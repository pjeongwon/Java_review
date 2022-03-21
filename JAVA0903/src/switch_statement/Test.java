package switch_statement;

public class Test {

	public static void main(String[] args) {

		/*
		 * 학생 점수(score)에 대한 학점 계산 => 점수에 따른 학점을 String타입 변수 grade에 저장학 판별이 끝나면 점수와 학점
		 * 출력하기
		 * 
		 * A학점 : 90 ~ 100 (90이상, 100 이하) B학점 : 80 ~ 89 C학점 : 70 ~ 79 D학점 : 60 ~ 69 F학점 :
		 * 0 ~ 59 그 외 : 점수 입력 오류
		 */

		int score = 1111;

		if (score >= 90 && score <= 100) {
			System.out.println(score + " : A학점");
		} else if (score >= 80 && score < 90) {
			System.out.println(score + " : B학점");
		} else if (score >= 70 && score < 80) {
			System.out.println(score + " : C학점");
		} else if (score >= 60 && score < 70) {
			System.out.println(score + " : D학점");
		} else if (score >= 0 && score < 60) {
			System.out.println(score + " : F학점");
		} else {
			System.out.println("점수 입력 오류");
		}

		// 위의 if문을 중첩if문 형태로 변경
		// 0 ~ 100사이일때 학점을 판별, 그렇지 않으면 "점수 입력 오류"
		System.out.println("--------------");

		score = 80;
		if (score >= 0 && score <= 100) {
			if (score >= 90) {
				System.out.println(score + " : A학점");
			} else if (score >= 80) {
				System.out.println(score + " : B학점");
			} else if (score >= 70) {
				System.out.println(score + " : C학점");
			} else if (score >= 60) {
				System.out.println(score + " : D학점");
			} else {
				System.out.println(score + " : F학점");
			}
		} else {
			System.out.println("점수 입력 오류");
		}


		System.out.println("===================");

		//switch-case문으로 위의 if문 표현하기
		score = 80;
		if (score >= 0 && score <= 100) {
			switch(score) {
				case 100 : System.out.println(score + " : A학점"); break;
				case 98 : System.out.println(score + " : A학점"); break;
				case 97 : System.out.println(score + " : A학점"); break;
				case 96 : System.out.println(score + " : A학점"); break;
				// ... 
			
			
				case 59 : System.out.println(score + " : F학점"); break;
				// ...
			
			
				// 	=> 범위를 판별하는 문장에서는 if문보다 길어질 수 있다.
			}
		} else {
			System.out.println("점수 입력 오류");
		}

	System.out.println("===========================");
		score = 80;
		if (score >= 0 && score <= 100) {
			switch(score) {
				case 100 : 
				case 98 : 
				case 97 :
				case 96 :
				case 95 :
				case 94 :
				case 93 :
				case 92 :
				case 91 :
				case 90 : System.out.println(score + " : A학점"); break;
			// ... 
			
			
			}
		} else {
			System.out.println("점수 입력 오류");
		}
	
		
		System.out.println("===========================");
		score = 80;
		if (score >= 0 && score <= 100) {
			switch(score/10) {
				case 10 : 
				case 9 : System.out.println(score + " : A학점"); break;
				case 8 : System.out.println(score + " : B학점"); break;
			// ... 
				default : System.out.println(score + " : F학점"); break;
				// => 0 ~ 59
			}
		} else {
			System.out.println("점수 입력 오류");
		}
	
	
	
	}
}
