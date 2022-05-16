package keyword_static;

public class Ex3 {

	public static void main(String[] args) {
		// static메서드와 static변수 사용의 예
		// - 자바에서 제공되는 클래스(API)들 중 static으로 선언된 멤버가 제공되는 경우가 있음
		
		// ex) java.lang패키지의 Math클래스 내의 모든 메서드와 변수는 static으로 제공됨
		//	   => 자주 사용되는 수학 관련 기능을 인스턴스 생성없이도 사용 가능핟록 제공
		// 1) 파이(원주율) 값을 저장하는 Math클래스의 PI변수 접근 시
		System.out.println("PI 값 = " + Math.PI);
		
		// 2) 두 정수를 입력받아 최대값을 리턴하는 Math클래스의 max(int, int)메서드 호출 시
		int result = Math.max(10, 20);
		System.out.println("10과 20의 최대값 = " + result);
		System.out.println("-5의 절대값 = " + Math.abs(-5));
	}

}
