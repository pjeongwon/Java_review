package if_statement2;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * if문 조건식을 다양한 연사자를 결합하여 작성 - if문에 조건식 작성 시 boolean타입 변수 또는 값이나 결과가 boolean타입인
		 * 연산식이 올 수 있다. - 결과가 boolean타입인 연산식을 위한 연산자는 비교연산자(>, <, ==등)와 논리연산자 등이 있다. -
		 * 다양한 연산자를 조합하여 결과값이 boolean타입이 되도록 조건식으로 작성하면 복합적인 조건을 설정할 수 있다! => 주로, 비교연산자
		 * 등과 논리연산자를 결합하여 복합 조건을 설정 ex1 ) 나이가 5세 미만이거나 65세 이상인 조건 => if (age < 5 || age
		 * >= 65) ex2 ) 점수가 90점 이상이고 100점 이하인 조건 => if (score >= 90 && score <= 100)
		 */

		// 1. 놀이동산 무료입장 조건 판별 나이체크
		// 나이가 5세 미만이거나 65세 이상 - 무료 입장 대상
		// 나이가 5세 미만인 조건 - if (age < 5)
		// 나이가 65세 이상인 조건 - if (age >= 65)

		int age = 75;

		if (age < 5 || age >= 65) {
			System.out.println(age + "세 : 무료 입장 대상입니다");
		} else {
			System.out.println(age + "세 : 무료 입장 대상이 아닙니다!");
		}

		// 2. 10대에 대한 판별
		// 나이가 10이상이고 19이하인 경우
		// => 9초과 20미만

		System.out.println("-------------------------------");
		
		age = 15;
		
		if (age >= 10 && age < 20) {
			System.out.println(age + "세 : 10대다");
		} else {
			System.out.println(age + "세 : 10대 아니다");
		}
		
		System.out.println("-------------------------------");
		
		boolean result = age >= 10 && age < 20;

		if (result) {
			System.out.println(age + "세 : 10대다");
		} else {
			System.out.println(age + "세 : 10대 아니다");
		}

		// ctrl + shift + f 정렬

	}

}
