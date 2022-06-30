package api_Character_sequence;

import java.util.Arrays;

public class Ex {

	public static void main(String[] args) {
		/*
		 * String 클래스
		 * - 문자열을 관리하는 클래스
		 * - 내부적으로 char[] 타입으로 문자를 각각 관리
		 * - new String("문자열")형태로 문자열을 생성할 경우
		 *   매번 새로운 공간이 할당되므로 동일한 문자열을 갖는 객체라도 서로 다른 공간에 생성됨
		 *   => 따라서, 리터럴 할당 방법(String str = "문자열")에 비해 공간의 낭비가 크다.
		 *   	        └> (동일한 문자열이 존재하는지 검사 후 존재할 경우 주소값만 전달)
		 * - String 객체는 불변 객체이므로 원본 데이터에 대한 수정이 불가능하며
		 *   결합 등의 작업을 수행한 결과는 원본 데이터 수정이 아닌 새로운 문자열이 생성됨
		 *   => 따라서, 문자열에 대한 수정 작업이 빈번할 경우 String클래스는 비효율적이다!
		 *      (StringBuilder또는 StringBuffer클래스 활용)
		 * - 문자열 검색, 분리, 추출, 변환, 비교 등의 다양한 메서드 제공
		 */
		
		String s1 = "Java Programming";
		String s2 = "       아이티윌       부산 교육센터          ";
		String s3 = "자바/JSP/안드로이드";
		
		System.out.println("s1.length() : " + s1.length()); // 문자열 길이
		System.out.println("s2.length() : " + s2.length()); // 문자열 길이
		System.out.println("s3.length() : " + s3.length()); // 문자열 길이
		
		// 문자열 비교
		System.out.println("s1.equals() : " + s1.equals("JAVA PROGRAMMING")); // 대소문자 구분하여 비교
		System.out.println("s1.equalsIgnoreCase() : " + s1.equalsIgnoreCase("JAVA PROGRAMMING")); // 대소문자 구분없이 비교
		
		System.out.println("s1.charAt() : " + s1.charAt(5)); // 특정 인덱스의 문자 1개 리턴
		
		// 부분 문자열(substring) 추출
		System.out.println("s1.substring(5) : " + s1.substring(5)); // 5번 인덱스부터 끝까지 부분 문자열 추출 (Programming)
		System.out.println("s1.substring(5, 12) : " + s1.substring(5, 12)); // 5번부터 12-1번까지 부분 문자열 추출 (Program)
		
		System.out.println("s1.concat() : " + s1.concat("!")); // 문자열 결합(연결)
		// => concat() 메서드를 사용한 결합 방식이 연결연산자(+)보다 빠르다!
		
		// indexOf() : 문자열의 앞에서부터 찾고자 하는 문자 또는 문자열의 인덱스 리턴(없으면 -1)
		System.out.println(s1.indexOf('a')); // 소문자 'a'의 인덱스 리턴
		System.out.println(s1.indexOf('A')); // 존재하지 않는 문자는 -1 리턴
		System.out.println(s1.indexOf("Programming")); // 문자열 "Programming"의 시작인덱스 리턴 (5)
		
		System.out.println(s1.lastIndexOf('a')); // 문자열의 뒤에서부터 탐색(인덱스 순서 유지됨)
		
		// replace() : 문자열 치환(대체)
		System.out.println(s1.replace('a', '@')); // 특정 문자 모두를 지정된 문자 각각 치환
		System.out.println(s1.replace("Java", "Android")); // 문자열 치환
		
		// 대소문자 변환(알파벳 문자에 대해서만 가능)
		System.out.println(s1.toUpperCase()); // 대문자로 변환
		System.out.println(s1.toLowerCase()); // 소문자로 변환
		System.out.println(s3.toLowerCase()); // 알파벳 외의 다른문자가 섞여있어도 알파벳만 변환
		
		// 문자열 앞 뒤의 불필요한 공백 제거(문자열 사이의 공백은 유지)
		System.out.println("현재 교육기관은 " + s2 + "입니다.");
		System.out.println("현재 교육기관은 " + s2.trim() + "입니다."); 
		
		// String 클래스의 메서드는 각 메서드별로 연결 가능함
		System.out.println("현재 교육기관은 " + s2.trim().concat("입니다."));
		
		System.out.println("--------------------------------");
		
		// split(String regex) : 문자열 분리
		// => 구분자(또는 분리자 = Delimeter)인 regex 파라미터를 활용하여
		//    주어진 문자열을 분리 후 배열로 리턴
		// => Delimeter는 구분의 기준이 되는 문자로 정규표현식 규칙에 따라 작성해야함
		
		System.out.println(s3);
		String[] subjects = s3.split("/"); // 슬래시(/) 기호를 구분자로 사용하여 문자열 분리
		for(int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i]);
		}
		System.out.println(Arrays.toString(subjects));
		// 자바, JSP, 안드로이드가 3개의 배열에 분리 저장됨
		
		System.out.println("---------------------------");
		
		// format() : 특정 문자열을 지정된 형식의 문자열 포맷으로 변환
		// => System.out.printf() 메서드와 형식 지정 문자가 동일함
		// => 형식 지정문자는 %와 형식지정문자 1글자를 결합하여 특정 형식을 지정함
		// => String.format(형식문자열, 형식문자를 대체할 데이터들...)
		String format = "이름 : %s, 나이 : %03d, 키 : %.1fcm"; // %03d 3자리 빈공간 0으로 채워라
		String name = "홍길동";
		int age = 20;
		double height = 190.123;
		
		String resultStr = String.format(format, name, age, height);
		System.out.println(resultStr);
		
		System.out.println("================================");
		
		// String 객체는 불변이므로 작업 후에도 원본 문자열은 그대로 유지됨 
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
	}

}
