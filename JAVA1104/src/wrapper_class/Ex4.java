package wrapper_class;

import java.util.Arrays;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * Wrapper클래스의 다양한 메서드  활용
		 * - 기본 데이터타입 데이터들을 다양한 형태로 처리 가능한 메서드가 제공됨
		 * - 주로, Wrapper클래스의 static메서드를 
		 */
		
		int num1 = 10, num2 = 20;
//		Integer n1 = new Integer(10);
		Integer n1 = 10; // Integer타입 변수에 기본 데이터타입 데이터도 직접 전달 가능(= 오토박싱)
		Integer n2 = num2;
		System.out.println(num1 + ", " + num2);
		System.out.println(n1 + ", " + n2);
		
		System.out.println("-------------------------");
		
		System.out.println("최댓값 : " + Math.max(num1, num2));
		System.out.println("최댓값 : " + Integer.max(num1, num2));
		System.out.println("최솟값 : " + Math.min(num1, num2));
		System.out.println("최솟값 : " + Integer.min(num1, num2));
		
		// 10진수 정수 -> y진수 문자열로 변환
		System.out.println("10진수 " + num1 + "->  2진수로 변 : " + Integer.toBinaryString(num1));
		System.out.println("10진수 " + num1 + "->  8진수로 변 : " + Integer.toOctalString(num1));
		System.out.println("10진수 " + num1 + "-> 16진수로 변 : " + Integer.toHexString(num1).toUpperCase());
		
		System.out.println("------------------------------------");
		
		/*
		 * Character 클래스를 활용한 문자 데이터 처리
		 * - 특정 문자에 대한 판별을 수행 : Character.isXXX()
		 * - 특정 형식으로 변환을 수행 : Character.toXXX()
		 */
		
		char ch = 'r';
		System.out.println(ch);
		
		// if문을 사용하여 문자 ch에 대한 대문자, 소문자, 숫자, 기타문자 판별
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("소문자");
		} else if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자");
		} else if(ch >= '0' && ch <= '9') {
			System.out.println("숫자");
		} else if(ch == ' ') {
			System.out.println("공백문자");
		} else {
			System.out.println("기타문자");
		}
		
		// Character 클래스의 isXXX()메서드를 활용하면 각 판별 방법을 대체 가능 
		
		if(Character.isUpperCase(ch)) {
			System.out.println("대문자");
		} else if(Character.isLowerCase(ch)) {
			System.out.println("소문자");
		} else if(Character.isDigit(ch)) {
			System.out.println("숫자");
		} else if(Character.isWhitespace(ch)) {
			System.out.println("공백문자");
		} else {
			System.out.println("기타문자");
		}
		
		// 참고
		String str = "Hello, World!";
		char[] chArr = str.toCharArray(); // String -> char[] 변환
		System.out.println(Arrays.toString(chArr));
		
		String str2 = new String(chArr);
//		String str2 = Arrays.toString(chArr); // char[] -> String 변환(단, 배열 형태의 문자열이 됨)
		System.out.println(str2);
		
	}

}

