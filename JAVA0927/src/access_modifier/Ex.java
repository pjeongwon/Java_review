package access_modifier;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 접근제한자(Access modifier)
		 * - 클래스(또는 인터페이스)의 멤버에 접근을 제한할 용도로 사용하는 키워드
		 * - 4개의 접근제한자(public, protected, default, private) 사용
		 * 		=> 각 접근제한자에 따라 접근 범위가 달라짐
		 * 		   (넓음) public > protected > default > private (좁음)
		 * - 클래스, 메서드, 멤버변수 등에 사용 가능(상황에 따라 사용 불가능한 제한자도 존재)
		 *  
		 * 1. public : 외부에서 누구나 접근 가능 = 어디서든 접근 가능
		 * 2. private : 외부에서는 접근 불가 = 자신의 클래스 내에서만 접근 가능
		 * 
		 */
		
		NormalPerson np = new NormalPerson();
		np.name = "홍길동";
		np.age = 77;
		System.out.println("이름 : " + np.name);
		System.out.println("나이 : " + np.age);
		np.print(); // 메서드 접근 제한자가 public이므로 접근 가능
		
		System.out.println("----------------------");
		
		PrivatePerson pp = new PrivatePerson();
		// PrivatePerson 클래스의 멤버변수 name, age는 접근제한자가 private로 선언되어 있으므로
		// PrivatePerson 클래스가 아닌 다른 클래스(외부)에서는 접근이 불가능함
//		pp.name = "홍길동"; // 오류발생
//		pp.age = 77; // 오류발생
//		System.out.println("이름 : " + pp.name); // 오류발생
//		System.out.println("나이 : " + pp.age); // 오류발생
		// => 오류 메시지가 The field PrivatePerson.age is not visible로 출력되며
		//	  외부에서 해당 멤버변수(field)가 보이지 않는다는 의미
		
//		pp.print(); // 메서드 접근 제한자가 private이므로 보이지 않음
	}

}

class NormalPerson{
	// 멤버변수 선언
	public String name;
	public int age;
	
	public void print() {
		System.out.println("print()메서드 호출됨!");
	}
}


class PrivatePerson{
	// 멤버변수 선언
	// 접근제한자를 private로 선언할 경우 자신의 클래스에서만 접근 가능
	private String name;
	private int age;
	
	// 메서드도 접근제한자를 private로 선언 시 외부에서 접근 불가능!
	private void print() {
		System.out.println("print()메서드 호출됨!");
	}
}










