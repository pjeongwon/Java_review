package array;

public class Ex4 {

	public static void main(String[] args) {
		// 배열 선언 시 대괄호 []위치에 따른 차이점
		int[] arr1; // 자바에서 배열을 선언하는 기본 문법 (추천)
		int arr2[]; // 자바 외의 대부분의 언어에서 선언하는 기본 문법
		// => 하나의 배열만 선언할 경우 두 문법 모두 동일한 결과를 갖는다.
		
		// 동시에 두 개 이상의 배열을 선언할 경우 문법에 따른 차이가 발생
		int[] a, b; // a와 b 모두 배열로 선언됨
		int c, d[]; // c는 일반 int형 변수, d만 int형 배열 변수로 선언됨
	}

}
