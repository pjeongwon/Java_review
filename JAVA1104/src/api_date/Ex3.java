package api_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * java.time 패키지
		 * - 날짜 및 시각 정보를 관리하는 클래스들을 제공하는 패키지(JDK 8부터 추가됨)
		 * - LocalDate클래스 : 날짜 관련 기능 제공 클래스
		 *   LocalTime클래스 : 시각 관련 기능 제공 클래스
		 *   LocalDateTime클래스 : 날짜와 시각 관련 기능 제공 클래스
		 * - toString()메서드 오버라이딩 되어 있음
		 * - 각 클래스의 static메서드인 now()메서드 호출 시 현재 시스템의 정보 조회,
		 *   of()메서드 호출 시 날짜 및 시각 정보 설정 가능
		 * - getXXX() 메서드를 호출하여 항목별 상세 정보 조회 가능
		 *   => XXX은 가져올 정보의 종류 (ex. 연도는 getYear(), 시각은 getHour())
		 */
		
		// 날짜 및 시각 정보를 가져오기
		// 1. LocalDate 객체
		LocalDate date = LocalDate.now(); // 현재 날짜 정보 가져오기
		System.out.println(date);
		
		// 2. LocalTime 객체
		LocalTime time = LocalTime.now(); // 현재 시각 정보 가져오기
		System.out.println(time);
		
		// 3. LocalDateTime 객체
		LocalDateTime datetime = LocalDateTime.now(); // 현재 날짜 및 시각 정보 가져오기
		System.out.println(datetime);
		
		// 날짜 및 시각 정보를 설정하기 = of() 메서드
		// 1. 날짜 설정
		LocalDate date2 = LocalDate.of(2000, 1, 1);
		System.out.println(date2);
		
		// 2. 시각 설정
		LocalTime time2 = LocalTime.of(1, 47);
		System.out.println(time2);
		
		// 3. 날짜 및 시각 설정
		LocalDateTime datetime2 = LocalDateTime.of(date2, time2);
		System.out.println(datetime2);
		
		System.out.println("---------------------");
		
		int year = date.getYear();
		int month = date.getMonthValue(); // 주의! getMonth()메서드는 Month 타입 객체 리턴
		int day = date.getDayOfMonth();
		
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
		
		System.out.println("---------------------");
		
		// 날짜 및 시각에 대한 연산
		// => 해당 객체의 plusXXX()메서드 또는 minusXXX()메서드 호출하여 연산
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate afterTwoMonth = now.plusMonths(2); // 2개월 뒤의 날짜 계산
		System.out.println(afterTwoMonth);
		
		LocalDate afterTenDay = now.plusDays(30); // 2개월 뒤의 날짜 계산
		System.out.println(afterTenDay);
		
		// Builder Pattern을 활용하여 리턴타입이 자기자신인 객체는 다음메서드를 계속 연결 가능
		System.out.println(now.plusMonths(1).plusDays(27)); // 1개월 27일 후 계산
		
		System.out.println("---------------------");
		
		/*
		 *  날짜 정보에 대한 포맷팅(Formatting)과 파싱(Parsing)
		 *  - DateTimeFormatter객체와 LocalXXX객체를 활용하여
		 *    날짜 정보를 원하는 포맷으로 변환하거나
		 *    날짜 정보를 원하는 형태의 정보로 파싱하는 작업 가능
		 *  - 파싱(Parsing)이란? 문자열을 객체로 변환하는 과정
		 *    포맷팅(Formatting)이란? 객체를 문자열로 변환하는 과정
		 *  - DateTimeFormatter클래스의 static메서드인 ofPattern()메서드를 통해 패턴 설정 가능
		 */
		
		String nowStr = "2021년 11월 04일(목요일) 오후 16:08:30"; // 문자열로 지정한 임의의 정보
		// => 위의 문자열 정보를 통해 현재 날짜와 시각 정보를 추출하려할 때
		//    문자열의 형태에 맞는 패턴을 생성하여 DateTimeFormatter객체를 통해 파싱 가능
		//    (파싱할 패턴 형식은 API Document페이지에 설명되어 있음)
		String pattern = "yyyy년 MM월 dd일(EEEE) a HH:mm:ss"; // 읽어올 정보의 형식 패턴 문자
		
		// DateTimeFormatter클래스의 ofPattern()메서드를 통해 파싱할 정보의 패턴 전달
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		// LocalDateTime 클래스의 static메서드인 parse()메서드를 호출하여
		// 파라미터로, 원본 정보와 파싱할 DateTimeFormatter객체를 전달
		// => 패턴을 적용하여 파싱한 결과를 다시 LocalDateTime객체로 리턴
		LocalDateTime parsingDate = LocalDateTime.parse(nowStr, dtf);
		System.out.println("날짜 파싱 결과 : " + parsingDate);
		System.out.println("파싱된 현재 시각의 분 : " + parsingDate.getMinute());
		
		LocalDateTime now2 = LocalDateTime.now();
		// => 현재 날짜 및 시각 정보를 지정된 포맷 형식으로 변환하여 출력
		System.out.println(now2.format(dtf));
		
		
	}

}
