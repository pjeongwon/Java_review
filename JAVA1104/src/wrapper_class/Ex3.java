package wrapper_class;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 문자열 데이터(String 객체) -> 기본형 데이터로 변환
		 * - 주로 웹 환경에서 form태그의 input태그를 통해 데이터를 입력받거나
		 *   자바, 안드로이드 등 GUI환경에서 데이터를 입력받을 때
		 *   수치 데이터를 입력하더라도 모두 문자열로 취급됨
		 *   따라서, 해당 문자열을 실제 연산을 위한 수치데이터 등의 기본형으로 변환하려면
		 *   Wrapper클래스에서 제공하는 메서드를 통해 변환을 수행해야함
		 *   
		 *   < 규칙>
		 *   Wrapper클래스명.parse기본데이터타입명(String타입변수 또는 문자열리터럴);
		 *   ex) 문자열을 정수형으로 변환할 경우 : Integer.parseInt("20");
		 *       문자열을 실수형으로 변환할 경우 : Double.parseDouble("3.14"); 
		 */
		
		String strNum = "1000";
		int i = Integer.parseInt(strNum);
//		double d = Double.parseDouble(strNum);// double타입으로 파싱도 가능함
		System.out.println(i + 99);
		
		String strNum2 = "1000.0";
		double d = Double.parseDouble(strNum2);
//		int i2 = Integer.parseInt(strNum2); 
		// => 컴파일 시점에서는 아무런 문제가 발생하지 않지만 실행 시점에서 예외발생
		//    Exception in thread "main" java.lang.NumberFormatException: For input string: "1000.0"
		// => 문자열을 정수로 바꾸는 시점에서 실수데이터가 정수형으로 전달 불가능하므로 예외 발생
		//    즉, 숫자 형식이 맞지 않아 발생하는 예외
		System.out.println(d);
	}

}
