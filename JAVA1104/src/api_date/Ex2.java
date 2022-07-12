package api_date;

import java.util.Calendar;
import java.util.Date;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * java.util.Calendar클래스
		 * - 날짜 및 시각 정보를 관리하는 클래스
		 * - 주로, Date클래스로 날짜를 표현하고, Calendar클래스로 날짜를 조작함
		 * - 추상클래스이므로 인스턴스 생성없이 이미 시스템으로부터 생성된 객체를 
		 *   static메서드인 getInstance()메서드로 리턴받아 사용 가능 = 싱글톤 패턴 형식
		 * - get()메서드로 날짜 및 시각 정보를 가져오고,
		 *   set()메서드로 날짜 및 시각 정보를 설정
		 *   => 파라미터로 날짜 및 시각에 대한 모드 지정을 위한 상수 제공됨
		 * - 월(MONTH)을 0 ~ 11까지 사용하는 등 불편한 점이 많이 존재함  
		 */
		
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal); // toString()메서드가 오버라이딩 되어 있지만 식별이 어려움
		
		// get(int field)메서드를 사용하여 정보 갖오기
		// => 파라미터로 Calenddar.XXX 상수를 사용하여 가져올 정보의 종류를 지정
		int year = cal.get(Calendar.YEAR); // 연도
		int month = cal.get(Calendar.MONTH) + 1; // 0 ~ 11월까지 사용하므로 + 1 필요
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "년" + month + "월" + day + "일");
		
		int day2 = cal.get(Calendar.DAY_OF_WEEK); // 요일(int 형)
		System.out.println(day2);
		
		// 시, 분, 초 가져오기
		int hour = cal.get(Calendar.HOUR); // 12시간제 (0 ~ 11)
//		int hour = cal.get(Calendar.HOUR_OF_DAY); // 24시간제 (0 ~ 11)
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(hour + "시" + min + "분" + sec + "초");
		
		// set()메서드를 사용하여 정보 설정하기
		cal.set(Calendar.YEAR, 2030); // 2030년으로 설정 
		cal.set(Calendar.MONTH, 0); // 1월로 설정(실제값 -1 필요)

		System.out.println("=================================");
		// Calendar <-> Date 객체 상호 변환
		// 1. Calendar -> Date로 변환
		//	  => Calendar 객체의 getTime()메서드를 호출하여 Date타입 객체 리턴
		Date date = cal.getTime();
		System.out.println(date);

		// 2. Date -> Calendar로 변환
		//    => Calendar객체가 존재하는 상태에서 setTime()메서드 파라미터로 Date객체 전달
		Date d = new Date();
		cal.setTime(d);
		year = cal.get(Calendar.YEAR); // 연도
		month = cal.get(Calendar.MONTH) + 1; // 0 ~ 11월까지 사용하므로 + 1 필요
		day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "년" + month + "월" + day + "일");
		
		
	}

}
