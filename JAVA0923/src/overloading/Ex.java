package overloading;

public class Ex {

	public static void main(String[] args) {
		
		/*
		 * 메서드 오버로딩(Method Overloading) = 다중 정의
		 * - 동일한 이름의 메서드를 여러 개 정의하는 것
		 * - 메서드 이름은 동일하고, 파라미터가 서로 달라야 함
		 * 		=> 파라밑의 타입 또는 개수가 달라야 함
		 * - 리턴 타입이 달라지는 것은 오버로딩과 무관함(달라도 서로 다른 메서드로 구분하는 기준x)
		 * - 반드시 메서드 호출 시점에서 오버로딩 된 각 메서드를 구분할 수 있어야 함
		 * - 자바에서 제공되는 다양한 메서드에는 오벌딩이 적용된 메서드가 많음
		 * 	 ex) Syetem.out.println();
		 */
		
		int num = -5;
		AbsoluteNum math = new AbsoluteNum();
		System.out.println("절대 값 : " + math.abs(num));
		
		double num2 = -3.14;
//		System.out.println("절대 값 : " + math.abs(num2));
		// => abs() 메서드 파라미터 타입이 int이므로 double타입 전달 불가
		// => 따라서, double타입을 처리할 doubleAbs()메서드 호출 필요
		System.out.println("절대 값 : " + math.doubleAbs(num2));

		System.out.println("=========================================");
		
		OverloadingAbsoluteNum math2 = new OverloadingAbsoluteNum();
		
		num = -5;
		System.out.println("절대 값 : " + math2.abs(num));
		
		num2 = -3.14;
		System.out.println("절대 값 : " + math2.abs(num2));
		
		System.out.println("=========================================");
		
		// 메서드 오버로딩이 적용되어 있는 println() 메서드
		System.out.println(1); // 정수형
		System.out.println("a"); // 문자열
		System.out.println(3.14); // 실수
		
	}

}
class OverloadingAbsoluteNum{
	// 1. 정수 num을 전달받아 절대값을 리턴하는 abs()메서드 정의
		public int abs(int num) {
			if(num < 0) {
				System.out.println("num이 음수이므로 양수로 변환");
				num = -num;
			}
			
			return num;
		}

		// ----------------------------------- 주의 사항 -----------------------------------------------

		//		public int abs(int x) {} // 오류 발생
		// => 파라미터 타입이 같고, 파라미터 변수명만 다른 것은 오벌딩이 아니다!
		//    반드시, 메서드 호출 시점에 어떤 메서드를 호출해야 하는지 구분되어야 한다!
		//    (int num과 int x 파라미터는 호출 시점에 동일한 정수 1개를 전달받으므로 구분이 불가능)
		
//		public long abs(int num) {} // 오류 발생
		// => 리턴타입만 다른 것은 오버로딩이 아니다!
		//    호출하는 시점과 리턴타입은 아무런 관계가 없다!
	// ---------------------------------------------------------------------------------------------
		
		
	// 2. 실수 num을 전달받아 절대값을 리턴하는 abs()메서드 오버로딩
	// => int 타입 파라미터를 갖는 abs()메서드와 이름은 같고, 파라미터가 다른 메서드 정의
		public double abs(double num) {
			if(num < 0) {
				System.out.println("num이 음수이므로 양수로 변환");
				num = -num;
			}
			
			return num;
		}
		
	// 3. long타입 num을 전달받아 절대값을 리턴하는 abs()메서드 오버로딩
		public long abs(long num) {
			if(num < 0) {
				System.out.println("num이 음수이므로 양수로 변환");
				num = -num;
			}
			
			return num;
		}
}



class AbsoluteNum{
	// 일반적으로 메서드를 정의할 때 메서드 이름은 식별자 작성 규칙을 따르므로
	// 메서드 이름을 달리하여 여러 개의 메서드를 정의하며
	// 기능이 동일하더라도 파라미터가 다를 경우 별 개의 메서드로 정의하여 각각 따로 사용해야함
	// => 같은 기능이지만, 이름이 다르므로 호출 시 구분해야함(여러개의 이름이 필요)
	
	// 1. 정수 num을 전달받아 절대값을 리턴하는 abs()메서드 정의
	public int abs(int num) {
		if(num < 0) {
			System.out.println("num이 음수이므로 양수로 변환");
			num = -num;
		}
		
		return num;
	}

	// 2. 실수 num을 전달받아 절대값을 리턴하는 doubleAbs() 메서드 정의
	//	=> 기존의 abs()메서드가 존재하므로 식별자 규칙에 의해 메서드 이름을 달리해야함
	public double doubleAbs(double num) {
		if(num < 0) {
			System.out.println("num이 음수이므로 양수로 변환");
			num = -num;
		}
		
		return num;
	}
	// 만약, long타입 변수를 전달받아 절대값을 리턴해야 하는 경우
	// longAbs()
	
}