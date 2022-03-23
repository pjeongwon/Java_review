package array;

public class Test5 {

	public static void main(String[] args) {
		/*
		 * 2차원 배열 연습
		 * ------------------
		 * 1차원 배열(names)에 5명의학생 이름을 저장하고
		 * 2차원 배열(score)에 5명 학생의 국어, 영어, 수학 점수 저장 후 출력
		 * 학생별 총점을 1차원 배열(total)에 저장 후 출력
		 * 
		 * < 출력 예시 >
		 * 		   국어  영어  수학
		 * 홍길동  80    80    80
		 * 이순신  90    80    77
		 * 강감찬  60    50    60
		 * 김태희  100  100   100
		 * 전지현  50    80    60
		 * ----------------------------
		 * < 학생별 총점 >
		 * 홍길동 : 240점
		 * 이순신 : 247점
		 * 강감찬 : 170점
		 * 김태희 : 300점
		 * 전지현 : 190점
		 */
		
		String[] names = {"홍길동", "이순신", "강감찬", "김태희", "전지현"};
		int[][] score = { {80, 80, 80}, {90, 80, 77}, {60, 50, 60}, {100, 100, 100}, {50, 80, 60} };
		int[] total = new int[5];

		for(int i = 0; i < score.length; i++) {
			System.out.print(names[i] + " ");
			for(int j = 0; j < score[i].length; j++) {
				
//				System.out.print(score[i][j] + " ");
				System.out.printf("%3d  ", score[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------------");
		
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(names[i] + " : ");
			
			for(int j = 0; j < score[i].length; j++) {
				total[i] += score[i][j];
				
			}
			System.out.println(total[i] + " 점");
		}
		
		
		
		
		
		
		
		
		
	}

}
