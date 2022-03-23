package array;

public class Ex3 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1 ~ 10의 합 : " + sum);
		
		
		System.out.println("-------------------------------");
		
		
		
		
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum2 = 0;
		for (int i = 0; i < nums.length; i++) {
			sum2 += nums[i]; 
		}
		System.out.println("nums[]의 각 인덱스 값의 합 : " + sum2);
	}

}
