package array;

public class Test {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		System.out.println("배열의 크기 : " + arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] 값 : " + arr[i]);
		}
		
		System.out.println("---------------------");
		
//		double[] heights;
//		heights = new double[5];
		double[] heights = new double[5];
		
		heights[0] = 155.3;
		heights[1] = 178.2;
		heights[2] = 193.6;
		for (int i = 0; i < heights.length; i++) {
			System.out.println("heights[" + i + "] 값 : " + heights[i]);
		}
		
		System.out.println("---------------------");
		
//		String[] names;
//		names = new String[5];
//		String[] names = new String[5];
//		
//		names[0] = "홍길동";
//		names[1] = "이순신";
//		names[2] = "강감찬";
//		names[3] = "김태희";
		
		String[] names = {"홍길동", "이순신", "강감찬", "김태희"};
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] 값 : " + names[i]);
		}
		
		
		
		
		

	}

}
