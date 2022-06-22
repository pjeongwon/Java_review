package keyword_final;

import java.util.Calendar;

public class Test3 {

	public static void main(String[] args) {
		// 상수(public static final)활용의 예
		// - java.uitl.Calendar클래스(날짜 관련 기능 제공)
		//	 => java.lang패키지 이외에는 모두 import 필수!
		Calendar cal = Calendar.getInstance();
		// Calendar 인스턴스의 get()메서드를 호출하여 날짜 정보를 가져올 수 있지만
		// 연도, 월, 일 등의 정보를 가져오기 위해 get()메서드 파라미터로 정수값을 전달해야함
		// 그러나, 해당 정보르 정수값으로 얼마를 지정해야하는지 알 수 없기 때문에
		// 정수값을 직접 지정하는 대신 Calendar클래스에서 제공하느 상수 활용 가능
		// => Calendar.XXX상수를 통해 가져오고자 하는 정보에 해당하는 상수명을 찾아서 전달하기만 하면
		//    내부적으로 사용되는 값을 통해 해당 정보를 찾아서 리턴해주기 때문에
		//    실제 정수값을 알지 못한 사애에서도 얼마든 접근이 가능하다!
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 입니다");
		
	}

}
