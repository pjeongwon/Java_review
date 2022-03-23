package array;

public class Test3 {

	public static void main(String[] args) {

		int sum = 0;
		double avg = 0;
		String[] names = { "홍길동", "이순신", "강감찬", "김태희", "전지현", "조인성" };
		int[] score = { 80, 100, 60, 77, 50, 90 };
		for (int i = 0; i < names.length; i++) { // 이름과 점수 배열 크기가 같으므로 둘 중 아무거나 ㄱㅊ
			System.out.println(names[i] + " : " + score[i] + "점");
		}
		
		System.out.println("--------------------------------------------");
		
		for (int i = 0; i < score.length; i++) { 
			sum += score[i];
		}
		// 피연산자 둘 중 하나라도 실수(double)타입으로 변경 후 계산을 수행
		avg = (double)sum / names.length; 
		
		// ★(double)(sum / names.length) x!!!!★
		
		System.out.println("점수의 합계 : " + sum + ", 평균 : " + avg);
		
		System.out.println("============================================");
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("max : " + max);
	
	
		int i = 100;
		long l = 100L;
		final float PI = 3.14f;
	
	
	}

}
