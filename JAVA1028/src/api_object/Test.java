package api_object;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// equals()메서드를 활용한 예) 
		// => 자바에서 제공되는 대부분의 API에는 equals()메서드가 오버라이딩 되어 있으므로
		//   객체 내의 값이 동일한 값인지를 판별하여 같으면 true, 다르면 false가 리턴됨(주소값 아님)
		// => 대표적인 예: String, Collection API 등

		// String클래스를 사용하여 문자열 생성 방법
		// 1. 리터럴을 직접 할당하는 방법(일반적으로 사용하는 방법)
		//    => 상수풀(Constant Pool)에서 동일한 문자열이 존재하는지를 먼저 검사한 후
		//		 동일한 문자열이 존재할 경우 해당 문자열의 주소값을 리턴
		String s1 = "Hello"; // 처음 생성되는 문자열이므로 새로운 공간에 "Hello"생성됨
		String s2 = "Hello"; // 기존 "Hello"문자열이 존재하므로, 해당 문자열의 주소값을 저장함
		// => 생성된 s1과 s2의 두 문자열 내용도 같고, "주소도 같다!"

		// 2. new연산자를 사용하여 생성자를 통해 할당하는 방법
		//    => 동일한 문자열이 존재하더라도 Heap공간에 무조건 새로운 문자열 생성
		String s3 = new String("Hello");
		String s4 = new String("Hello");

		if(s1 == s2) { // 객체의 동등비교 연산은 객체의 주소값 비교
			System.out.println("s1, s2의 주소 값이 같다");
		} else {
			System.out.println("s1, s2의 주소 값이 다르다");
		}
		
		// s1과 s2의 객체 내용(= 문자열)이 동일한지 판별
		if(s1.equals(s2)) {
			System.out.println("s1, s2의 문자열 내용이 같다");
		} else {
			System.out.println("s1, s2의 문자열 내용이 같다");
		}
		
		System.out.println("---------------------------");
		
		if(s3 == s4) {
			System.out.println("s3, s4의 주소 값이 같다");
		} else {
			System.out.println("s3, s4의 주소 값이 다르다");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s3, s4의 문자열 내용이 같다");
		} else {
			System.out.println("s3, s4의 문자열 내용이 같다");
		}
		
		System.out.println("===========================");
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		list1.add(1); list1.add(2); list1.add(3);
		list2.add(1); list2.add(3); list2.add(2);
		
		if(list1.equals(list2)) {
			System.out.println("list1, list2의 문자열 내용이 같다");
		} else {
			System.out.println("list1, list2의 문자열 내용이 다르다");
		}
	}

}






















