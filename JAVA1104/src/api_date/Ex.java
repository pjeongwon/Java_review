package api_date;

import java.util.Date;

public class Ex {

	public static void main(String[] args) {
		/*
		 * java.util.Date 클래스
		 * - 날짜 관련 기능을 제공하는 클래스
		 * - 제공되는 대부분의 메서드가 deprecated 처리되어 있음
		 *   (즉, 지금은 대부분 사용을 권장하지 않은 메서드)
		 *   => 다양한 API에서 여전히 Date 타입을 다루는 경우가 많음
		 * - 불편한 점이 많기 때문에 여러 단점을 보완한 별ㄷ의 클래스가 제공됨
		 * - toString() 메서드가 오버라이딩 되어있음 => 날짜 및 시각 정보를 간편하게 제공
		 * 
		 */
		
		// 기본 생성자를 호출하여 객체 생성 시 시스템의 현재 날짜 및 시각 정보를 사용하여 객체 생성
		Date d1 = new Date();
		System.out.println(d1);
		
		// long타입 파라미터 사용 시 전달받은 값을 기준 시각으로 사용
//		Date d2 = new Date(0L); //1970년 1월 1일 09시 00분 00초 기준으로 객체 생성
		Date d2 = new Date(2000000000000L); // 기준시각으로부터 2조밀리초 뒤의 날짜 및 시각으로 설정
		System.out.println(d2);
		
		// getTime()메서드는 long타입으로 날짜 정보를 리턴
		// => 따라서, 기준날짜와 현재날짜간의 연산을 통해 과거 or 미래를 구별할 수 있다!
		// 1) 기준날짜 - 현재날짜 > 0일 경우 현재날짜는 기준날짜보다 미래라는 뜻
		// 2) 기준날짜 - 현재날짜 == 0일 경우 현재날짜는 오늘이라는 뜻
		// 2) 기준날짜 - 현재날짜 < 0일 경우 현재날짜는 기준날짜보다 과거라는 뜻
		
		long differentDate = d2.getTime() - d1.getTime();
		System.out.println(differentDate); // long타입값(밀리초, ms)출력
		// 일 단위로 변경 밀리초 -> 초 -> 분 -> 시 -> 일 순으로 변환해야함
		System.out.println(differentDate /1000 /60 /60 /24 + "일");
		
		if(differentDate > 0) { 
			System.out.println(d2 + "미래");
			System.out.println(differentDate /1000 /60 /60 /24 + "일 남음");
		}
		else if(differentDate == 0) { System.out.println("오늘");}
		else if(differentDate < 0) {
			System.out.println(d2 + "과거");
			System.out.println(differentDate /1000 /60 /60 /24 + "일 지남");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
