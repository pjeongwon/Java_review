package if_statement;

public class Test4 {

	public static void main(String[] args) { 
	// 단일 if문 연습
	
	int score = 199;
	
	if (score >= 90) {
		System.out.println("A 학점입니다!");
	}
	
	System.out.println(score + "점입니다.");
	
	System.out.println("--------------------------");
	
	// if ~ else문 연습
	score = 89;
	
	if (score >= 90) {
		System.out.println("A 학점입니다!");
	}
	else {
		System.out.println("A 학점이 아닙니다");
	}
	
	System.out.println(score + "점입니다.");
	
	
	System.out.println("--------------------------");
	
	score = -79;
	
	if (score >= 90) {
		System.out.println("A 학점입니다!");
	}
	else if (score >= 80){
		System.out.println("B 학점입니다!");
	}
	else if (score >= 70){
		System.out.println("C 학점입니다!");
	}
	else if (score >= 60){
		System.out.println("D 학점입니다!");
	}
	else if (score >= 0){
		System.out.println("F 학점입니다!");
	}
	
	System.out.println(score + "점입니다.");
	
	
	System.out.println("--------------------------");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
