package array;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * [ 다차원 배열 ]
		 * - 1차원 배열 여러개가 모여 2차원 이상의 배열을 이루는 것(2차원, 3차원...)
		 * - 일반적으로 다차원 배열은 2차원 배열을 의미
		 * 
		 * [ 2차원 배열 ]
		 * - 행, 열의 구조로 이루어진 배열
		 * - 1차원 배열 여러개를 묶음으로 관리하는 또 다른 1차원 배열 구조삿
		 * => 즉, 어떤 1차월 배열에 저장된 주소값을 따라가면
		 *    데이터가 저장된 또 다른 1차원 배열에 접근이 가능함
		 * - 배열에서 실제 데이터가 저장되는 공간 = 열
		 *   열 공간의 주소값이 저장되는 공간     = 행
		 *   
		 * < 2차원 배열 선언 기본 문법 >
		 * 데이터타입[][] 변수명;
		 * 
		 * < 2차원 배열 생성 기본 문법 >
		 * 변수명 = new 데이터타입[행크기][열크기];
		 * 
		 * < 2차원 배열 선언 및 생성을 한 문장으로 압축 >
		 * 데이터타입[][] 변수명 = new 데이터타입[행크기][열크기]
		 * 
		 * < 2차원 배열 접근 기본 문법 >
		 * 변수명[행인덱스][열인덱스];
		 * 
		 * < 2차원 배열의 크기 >
		 * 1. 행 크기 : 변수명.length
		 * 2. 특정 행의 열 크기 : 변수명[행인덱스].length
		 * 
		 * < 2차원 배열 내의 모든 요소 접근을 위한 for문 >
		 * for(int i = 0; i < 배열명.length; i++){
		 * 		for(int j = 0; j < 배열명[i].length; j++){
		 * 			// 배열명[i][j]를 사용하여 배열 각 요소 접근
		 * 
		 * < 2차원 배열 선언 및 생성, 초기화를 한꺼번에 수행하는 방법 >
		 * 데이터타입[][] 변수명 = {
		 * 		{0행데이터1, 0행데이터2, ..., 0행데이터n},
		 * 		{1행데이터1, 1행데이터2, ..., 1행데이터n},
		 * 		... 생략 ...
		 * 		{x행데이터1, x행데이터2, ..., x행데이터n},
		 * };
		 * => 바깥 중괄호 내에서 안쪽 중괄호{} 개수 : 행의 개수
		 * => 안쪽 중괄호 내의
		 */
		
		// 1차원 배열(정수) arr 선언 및 3개짜리 공간 생성
//		int[] arr = new int[3];
//		arr[0] = 10; arr[1] = 20; arr[2] = 30;
//		System.out.println("arr 배열 크기 : " + arr.length );
//		System.out.println("------------------------------------------");
		
		// 2차원 배열(정수) arr 선언
//		int[][] arr;
		
		// 2행 3열 크기의 2차원 배열 arr 생성
//		arr = new int[2][3];
		
		// 위의 두 문장 압축
		int[][] arr = new int[2][3];
		
		// 2차원 배열 arr에 다음 구조에 해당하는 데이터 저장
		//	    0열 1열 2열
		// 0행   1   2   3
		// 1행   4   5   6
		arr[0][0] = 1; arr[0][1] = 2; arr[0][2] = 3;
		arr[1][0] = 4; arr[1][1] = 5; arr[1][2] = 6;
		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
		
		// 중첩 for문을 사용하여 2차원 배열 반복
//		for(int i = 0; i < 2; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.println(arr[i][j]);
//			}
//		}
		// 2차원 배열 크기
//		System.out.println("2차원 배열의 행 크기 : " + arr.length);
		System.out.println("2차원 배열의 0번 열크기 : " + arr[0].length);
		System.out.println("2차원 배열의 0번 열크기 : " + arr[1].length);
		
		
		for(int i = 0; i < arr.length; i++) { // 행크기 반복
			for(int j = 0; j < arr[i].length; j++) { // 행에 대한 열크기 반복
				System.out.println(arr[i][j]);
			}
		}

		System.out.println("=================================================");
		
		// 2차원 배열 arr2 선언 및 생성, 초기화를 한꺼번에 수행
		int[][] arr2 = { {1, 2, 3}, {4, 5, 6} };

		for(int i = 0; i < arr2.length; i++) { // 행크기 반복
			for(int j = 0; j < arr2[i].length; j++) { // 행에 대한 열크기 반복
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		
		
	}

}





