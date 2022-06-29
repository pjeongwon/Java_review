package api_object;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// toString()메서드 사용 예)
		String s = "Hellow, World";
		System.out.println(s); // toString()메서드 생략
		System.out.println(s.toString()); 
		
		int[] arr = {1, 2, 3};
//		for(int i = 0; i < arr.length; i ++) {
//			System.out.print(arr[i] + "\t");
//		}
		
		// Arrays클래스에서 배열에 저장된 요소 정보를 문자열로 결합하여 리턴하는 static 메서드 제공
		System.out.println(Arrays.toString(arr)); // 반복문으로 찍을 필요 없음!!!
		
		
		
		
	}

}
