package loop_statement_while;

public class Test {

	public static void main(String[] args) {
		
		int dan = 2;
		System.out.println("< " + dan + "단 >");
		int i = 1;
		while(i < 10) {
			System.out.println(dan + " * " + i + "= " + dan * i);
			i++;
		}
		
		System.out.println("----------------------------");
		int sum = 0;
		i = 1;
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		System.out.println("----------------------------");
		
		
		int oddTotal = 0;
		int evenTotal = 0;
		i = 0;
		while(i <= 10) {
			if(i % 2 == 1) {
				oddTotal += i;
			}
			else if(i % 2 == 0) {
				oddTotal += i;
			}
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
