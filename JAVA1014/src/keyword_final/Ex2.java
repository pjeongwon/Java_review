package keyword_final;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * blank final 상수
		 * - 클래스 내에서 멤버변수 선언 시 final 키워드를 사용하여 변수(상수)를 선언할 때
		 *   별도로 초기화하지 않은 final상수를 blank final 상수라고 함
		 * - blank final상수는 주로 객체마다 다른 값으로 초기화해야하는 상수에 적용
		 * - 반드시 생성자를 통해 초기화 작업이 수행되어야 함
		 */
		// black final 상수인 ssn은 생성자를 통해 값을 전달받아 각각 다른 값으로 최기화 됨
		Person p1 = new Person("홍길동", "123456-7891011"); // 생성자를 통해 ssn 초기화
		Person p2 = new Person("이순신", "111098-7654321"); // 생성자를 통해 ssn 초기화
		p1.showPerson();
		p2.showPerson();
	}

}


class Person{
	String name;
	final String nation = "대한민국"; // 모든 사람(Person)의 국적은 대한민국으로 고정
	final String ssn; // 모든 사람(Person)의 주민번호가 각기 다르며 부여 후에는 변경이 불가능하므로
	// blank final상수 형태로 선언
	// => The blank final field ssn may not have been initialized
	
	// 각 객체마다 서로 다른 값으로 상수를 초기화하기 위해서는
	// 생성자를 통해 초기값을 전달받아 blank final상수 초기화를 수행하면 된다!
	public Person(String name, String ssn) {
		this.name = name;
		this.ssn = ssn; // blank final상수 초기화를 수행하는 코드(필수!)
	}
	
	public void showPerson() {
		System.out.println("이름 : " + name);
		System.out.println("국적 : " + nation);
		System.out.println("주민번호 : " + ssn);
	}
	
}

class A{
	private int num;

	public A(int num) {
		this.num = num;
		
	}
	public int getNum() {
		return num;
	}

	
}







