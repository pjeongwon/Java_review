package api_randomize;

public class Ex {

	public static void main(String[] args) {
		/*
		 * java.lang.Math클래스
		 * - 수학적인 다양한 기능을 상수와 static메서드로 제공
		 * - 모든 멤버가 static으로 선언되어 있으므로 클래스명만으로 접근 가능
		 *   ex) Math.PI, Math.random()
		 *   
		 */
		
		// Math 클래스의 상수
		System.out.println("PI 값 : " + Math.PI);
		System.out.println("PI 값 : " + Math.E);
		
		int num = -10;
		// Math클래스의 static메서드
		System.out.println("num의 절대값 : " + Math.abs(num));
		System.out.println("num과 20중 최댓값 : " + Math.max(num, 20));
		System.out.println("num과 20중 최솟값 : " + Math.min(num, 20));
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		// ------------------------------------------------------------
		double dNum = Math.PI;
		System.out.println("실수 dNum의 소수점 첫째자리 반올림 결과 : " + Math.round(dNum));
		// 항상 소수점 첫째자리에서 반올림이 일어남
		// 따라서, 소수점 x번째 자리 반올림을 위해서는 해당 x번째 자리 숫자를
		// 반올림 자리에 위치하도록 변형해야한다.
		// ex) 실수 3.141592의 소수점 4번째 자리 숫자(5)를 반올림하기 위해서
		//     해당 숫자를 소수점 첫번째 자리로 이동시켜야 한다.
		//     즉, 3.141592를 3141.592형태의 숫자로 변형시켜야함
		//	   => 그러기 위해서는 원래 숫자(3.141592)에 원하는 자리수로 변환 값을 직접 곱하거나
		// 		  해당 숫자에 10^(x-1) 공식의 값을 곱해야함(x는 반올림 할 자릿수 값)
		//	   ex) 3.141592 * 1000 또는 3.141592 * (10^(4-1))
		System.out.println("3.141592 * 1000 = " + (dNum * 1000));
		System.out.println("3.141592 * 1000 = " + Math.round((dNum * 1000)));
		
		// 실수 반올림을 위해 자리수를 변경한 경우 원래 데이터가 아니므로
		// 반올림 후에는 반드시 원래 자리로 되돌려야한다!
		// 따라서, 원래 자리 숫자로 되돌리기 위해 곱한 값만큼 다시 나눗셈 수행
		// => 주의! 원래 자리로 돌리기 위한 나눗셈 수행 시 반드시 실수 형태로 나눗셈 필수!
		// ex) 3.141592 * 1000 = 3142 / 1000 = 3.142
		System.out.println("실수 dNum의 소수점 첫째자리 반올림 결과 : " + (Math.round((dNum * 1000)) / 1000.0));
		
		// 반올림 수행하는 공식 결론!
		// => Math.round(숫자 * 변경할 자리수 값) / 변경할 자리수 값.0
		System.out.println("실수 dNum의 소수점 첫째자리 반올림 결과 : " + (Math.round((dNum * 10)) / 10.0));
		// 실수 dNum의 소수점 둘째자리 반올림값 계산해보기
		
		
		System.out.println("====================================");
		
		/*
		 * Math.random()
		 * - 난수(임의의 수) 발생을 위한 메서드
		 * - Math.random() : 0.0 <= x < 1.0 범위의 double 타입 난수 발생
		 *  
		 *  < 난수 발생 기본 공식 >
		 *  1. (정수화)(Math.random() * 상한값) : 0 ~ 상한값 - 1(0 <= x < 상한값)
		 *  2. (정수화)(Math.random() * 상한값) + 1 : 1 ~ 상한값 1(0 <= x <= 상한값)
		 *  ※ 난수 발생 복합 공식(확률적으로 난수 중복을 최소화하기 위한 공식)
		 *    (정수화)(Math.random() * (상한값 - 하한값 + 1) + 하한값)
		 */
		
		for(int i = 1; i <= 10; i++) {
			int upperLimit = 10; // 상한값
//			System.out.println(i + "번째 난수 : " + Math.random());
			// Math.random()결과(double 타입)을 원하는 자릿수만큼 정수로 이동시키고
			// 남은 소수점 부분 숫자들을 제거(= 정수화)
//			System.out.println((int)(Math.random() * upperLimit)); // 0 ~ 9
			
			// 0을 제외하고 1부터 상한값까지의 난수 발생(1 <= x <= 10)을 위해서는
			// => 난수 발생 결과에 + 1을 수행
//			System.out.println((int)(Math.random() * upperLimit + 1)); // 1 ~ 10

			// 1 ~ 20까지 난수 발생
			upperLimit = 20;
			System.out.println((int)(Math.random() * upperLimit + 1)); 
			
		}
		
	}
}
