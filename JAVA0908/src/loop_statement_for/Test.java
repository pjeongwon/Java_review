package loop_statement_for;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("< 2단 >\n"
				+ "2 * 1 = 2\n"
				+ "2 * 2 = 4\n"
				+ "2 * 3 = 6\n"
				+ "2 * 4 = 8\n"
				+ "2 * 5 = 10\n"
				+ "2 * 6 = 12\n"
				+ "2 * 7 = 14\n"
				+ "2 * 8 = 16\n"
				+ "2 * 9 = 18");
		
		System.out.println("================");
		
		int dan = 5;
		int i = 1;
		System.out.println("< " + dan + "단 >");
		System.out.println(dan + " * " + i + " = " + (dan * i++) + "\n"
						 + dan + " * " + i + " = " + (dan * i++) + "\n"
						 + dan + " * " + i + " = " + (dan * i++) + "\n"
						 + dan + " * " + i + " = " + (dan * i++) + "\n"
						 + dan + " * " + i + " = " + (dan * i++) + "\n"
						 + dan + " * " + i + " = " + (dan * i++) + "\n"
						 + dan + " * " + i + " = " + (dan * i++) + "\n"
						 + dan + " * " + i + " = " + (dan * i++) + "\n"
						 + dan + " * " + i + " = " + (dan * i++) + "\n");
		

		
		
		
		
		
		
		// 위의 구구단을 for문으로 작성해보기
		
		System.out.println("================");
		dan = 5;
		System.out.println("< " + dan + "단 >");
		
		for(i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i );
			}

		System.out.println("================");
		
//		for(int sec = 0; sec < 60; sec++) {
//			System.out.println(sec + "초");
//		}
		
		// 제어변수를 건드리지 않고 실제 사용하는 시점에서 변형하여 사용 가능
		for(int sec = 1; sec <= 60; sec++) {
			System.out.println((sec - 1) + "초");
		}
		
		
		
		
		
		
		
		
		}
}


