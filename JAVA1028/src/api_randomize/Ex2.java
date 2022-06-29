package api_randomize;

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * java.util.Random클래스
		 * - 난수 발생 기능을 다양한 형태로 제공하는 클래스
		 *   ex) 정수형 난수, 실수형 난수, 논리형 난수 등
		 * - static메서드가 아닌 일반 메서드 형태로 제공되므로
		 *   반드시 Random클래스 인스턴스 생성 후 메서드 호출 필요
		 * - Math.random() 메서드에 비해 단순한 과정을 통해 난수 발생 가능
		 *   => 특히, nextInt()메서드 사용 시 별도의 정수화 과정 없이 정수형 난수 발생 가능
		 * - Math.random()보다 Random클래스를 통해 난수 발생 방법을 더 많이 사용하지만,
		 * - 보안상 안전하지 않은 방법을 사용하여 난수를 생성하므로
		 *   암호학적인 측면에서 안전한 난수를 생성하려면 SecureRandom 사용(차후에 설명)
		 */
		
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			
//			System.out.println("boolean 타입 임의의 값 : " + r.nextBoolean()); // true or false
//			System.out.println("int 타입 임의의 값 : " + r.nextInt());  // ± 21억
//			System.out.println("double 타입 임의의 값 : " + r.nextDouble()); 
			
			// 주로 사용하는 메서드 - r.nextInt(int bound)
			// => bound값을 상한값으로 갖는 정수형 난수 발생
			//    즉, 0 <= x < bound(0 ~ bound-1) 범위의 난수 발생
//			System.out.println("0 ~ 9 사이의 난수 : " + r.nextInt(10)); 
			System.out.println("1 ~ 10 사이의 난수 : " + (r.nextInt(10) + 1));
			
			
			
			
			
		}
	}

}
