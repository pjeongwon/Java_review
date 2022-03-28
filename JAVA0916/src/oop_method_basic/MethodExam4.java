package oop_method_basic;

public class MethodExam4 {

	public int abs(int n) {
		int i = 0;
		if (n < 0) {
//			n = Math.abs(n);
			n = -n;
		}
		return n;
	}

	public int sum1ToX(int x) {
		int sum = 0;
		for(int i = 1; i <= x; i++) {
			sum += i;
		}
		return sum;
	}

	
//	public int sum1ToX(int num) {
//		int sum = 0;
//		for(int i = 1; i <= num; i++) {
//			sum += i;
//		}
//		return sum;
//	}
}
