package array;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * < 배열 선언 및 생성을 하나의 문장을 결합 >
		 * 
		 * 데이터타입[] 변수명;
		 * 변수명 = new 데이터타입[배열 크기];
		 * => 데이터타입[] 변수명 = new 데이터타입[배열 크기]
		 *
		 * 
		 * < 배열 선언 및 생성과 동시에 초기화까지 수행하는 문장 >
		 * 
		 * 데이터타입[] 변수명 = {데이터1, 데이터2, ... ,데이터n};
		 * => 데이터(리터럴)의 개수만큼 자동으로 배열 크기가 지정됨
		 * =>주의! 반드시 초기화 데이터까지 모두 준비가 되어 있어야만 사용 가능
		 * => 한 번 생성 후에는 크기 변경이 불가능하므로 데이터 추가 불가능
		 */
		
		// int형 배열 arr선언하고 3개의 배열 공간을 생성하는 문장
		
//		int[] arr;
//		arr = new int[3];
		int[] arr = new int[3];
		
//		int[] arr2 = new int[3];
//		arr2[0] = 10;
//		arr2[1] = 20;
//		arr2[2] = 30;
		
		int[] arr2 = {10, 20, 30};
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		// 주의사항!
//		int[] arr3 = new int[3] {10, 20, 30}; 사용불가
		// => 배열 생성 및 초기화 시 배열 크기를 지정할 수 없다!
		
//		int[] arr3;
//		arr3 = {10, 20, 30}; 사용불가
		// => 배열 선언 후 별도로 리터럴만 사용하여 초기화 문장 사용 불가
		
		int[] arr3 = new int[] {10, 20, 30};
		// 배열 생성 및 초기화 시 배열 크기를 제외하고 리터럴 사용하여 초기화 가능
		
		int[] arr4;
		// 배열을 먼저 선언한 후 별도로 리터럴만 사용하여 초기화할 경우
		// 리터럴 블럭 앞에 배열 생성코드(크기 제외)가 반드시 포함되어야한다!
		arr4 = new int[] {10, 20, 30};
		
		// String배열에 널스트링("")값을 초기화할 경우 해당 값도 메모리 공간에 포함됨
		String[] names = {"A", "B", "C", null, ""}; // 5개의 공간이 할당됨
		System.out.println(names.length);
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "!");
		}
		
		
	}

}
