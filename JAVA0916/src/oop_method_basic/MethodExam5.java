package oop_method_basic;

public class MethodExam5 {

	public void printOddNumber(int start, int end) {
		System.out.print("짝수만 출력 : ");
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.print(" " + i);
			}
		}
	}
	
	//=======================================================
	
		public int sum(int num1, int num2) {
			int sum = 0;
			sum = num1 + num2;
			System.out.println(num1 + "와 " + num2 + "의 합 : " + sum);
			return sum; 
		}
		
		
		
		
		
		
		
		
		
		
		
	}

