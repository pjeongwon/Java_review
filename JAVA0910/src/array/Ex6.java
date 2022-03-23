package array;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * 2차원 배열의 동적 크기 할당
		 * - 2차원 배열은 행을 먼저 생성하고 별도의 공간에 열이 생성되는 구조
		 * - 따라서, 행을 만든 후 열 생성 시  항상 같은 크기일 필요가 없다!
		 * 
		 * < 생성 문법 >
		 * 데이터타입[][] 변수명 = new 데이터타입[행크기][]; // 열크기 생략
		 * 변수명[행번호] = new 데이터타입[열크기];
		 */
		
		int[][] arr = new int[3][]; // 3행의 공간을 먼저 생성(= 1차원 배열 3칸)을 먼저 생성
		// 각 행에 실제 데이터가 저장될 열 공간을 각각 생성 가능함
		arr[0] = new int[3]; // 0번 행에 3개의 열 공간 생성
		arr[1] = new int[2]; // 1번 행에 2개의 열 공간 생성
		arr[2] = new int[4]; // 2번 행에 4개의 열 공간 생성
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
