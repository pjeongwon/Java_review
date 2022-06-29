package api_randomize;

import java.sql.Array;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		/*
		 * Math.random() 메서드를 활용한 로또 번호 생성 프로그램
		 * - 1 ~ 45까지의 중복되지 않는 6개의 난수를 발생시키기
		 * - 발생된 난수(로또 번호)는 1차원 배열 myLotto에 저장
		 *   단, 배열에 저장되는 6개의 난수는 중복이 제거된 난수여야한다.
		 *   => 배열에 난수 저장 전 배열 내에 저장된 숫자와 중복되는지 검사 후
		 *      중복되지 않을 경우에만 배열에 난수 저장
		 */
		// 1단계 (기초) => 1 ~ 45 사이의 난수 6개 출력(중복 번호 발생 가능)
		// 2단계(중급) => 생성된 난수 6개를 배열에 저장(단, 중복되는 숫자는 제외)
		// 3단계 => 1 ~ 45사이의 난수 생성 후 변수 rNum에 저장
		// 4단계 => 배열의 각 인덱스에 생성된 난수 저장
		// 5단계 => 저장된 난수를 모두 출력
		//			-> Arrays클래스의 static메서드인 toString()메서드를 활용하면 배열 내용 쉽게 출력
//		int[] myLotto = new int[6] ;
//		int upperLimit = 45;
//		for(int i = 0; i < myLotto.length; i++) {
//			int rNum = (int)(Math.random()*45+1);
//			myLotto[i] = rNum;
//			System.out.println("myLotto[" + i + "] = " + rNum);
//		}
//
//		System.out.println("나의 로또 번호 : " + Arrays.toString(myLotto));
	
		
		int[] myLotto = new int[6];
		int upperLimit = 45;
		int num = 0;
		for(int i = 0; i < myLotto.length; i++) {
			num = (int)(Math.random()*upperLimit+1);
			myLotto[i] = num;
			for(int j = 0; j < i; j++) {
				if(myLotto[j] == num) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(myLotto));
		
		//=============================================================
		// 이번주 1등 당첨 번호
		int[] thisWeekLotto = {8, 42, 14, 25, 6, 19};
		System.out.println("이번 주 1등 당첨 번호 : " + Arrays.toString(thisWeekLotto));
		int cnt = 0;
		for(int i = 0; i < myLotto.length; i++) {
			for(int j = 0; j < thisWeekLotto.length; j++) {
				if(myLotto[i] == thisWeekLotto[j]) {cnt += 1;}
			}
		}
		
		if(cnt == 6) System.out.println("1등!");
		if(cnt == 5) System.out.println("2등!");
		if(cnt == 4) System.out.println("3등!");
		if(cnt == 3) System.out.println("4등!");
		if(cnt == 2 || cnt == 1 || cnt == 0) System.out.println("꽝!");
		
		/*
		 * 나의 로또번호(myLotto)와 1등 당첨번호(thisWeekLotto)를 비교하여
		 * 일치하는 숫자 갯수에 따라 당첨된 결과를 출력해보기
		 * ex)
		 * 일치하는 번호 개수 : 6개(1등)
		 * 일치하는 번호 개수 : 5개(2등)
		 * 일치하는 번호 개수 : 4개(3등)
		 * 일치하는 번호 개수 : 3개(4등)
		 * 일치하는 번호 개수 : 2개(꽝)
		 * 일치하는 번호 개수 : 1개(꽝)
		 * 일치하는 번호 개수 : 0개(꽝)
		 */
		

	}
	
}

