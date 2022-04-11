package keyword_this;

public class Ex {

	public static void main(String[] args) {
		/*
		 * this 키워드
		 * - 자신의 인스턴스 주소가 자동으로 저장되는 레퍼런스변수(참조변수)
		 * 
		 * < 사용법 >
		 * 1. 레퍼런스(Reference) this
		 *    - 생성자 또는 메서드 내에서 로컬변수와 멤버변수의 이름이 같을 때
		 *      멤버변수를 구별(지정)하기 위한 키워드로 사용됨
		 *    - 사용법 : this.멤버변수명
		 *    - 단, 로컬변수가 없거나 이름이 다를 경우에는 멤버변수의 this 생략 가능함
		 * 
		 */
		
		Person p1 = new Person("홍길동", 20);
		System.out.println("이름 : " + p1.getName());
		System.out.println("나이 : " + p1.getAge());
		
		p1.setName("이순신");
		System.out.println("이름 : " + p1.getName());
	}

}

class Person{
	String name;
	int age;

	// 멤버변수 name과 age값을 초기화하는 생성자 정의
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 멤버변수 name값을 외부로부터 전달받아 멤버변수에 저장(초기화)하는 Setter 정의
	public void setName(String name) {
		// 메서드 내에서 선언된 매개변수와 기존에 존재하는 멤버변수의 이름이 같을 경우
		// 메서드 내에서 지정된 변수명은 로컬변수(메서드에서 선언된 매개변수)를 가리킴 
//		name = name; // 로컬변수 name값을 다시 로커련수 name(자기 자신)에 저장하는 코드 = 효과 x
		
		// 메서드 내에서 멤버변수를 지정하려면, 멤버변수명 앞에 레퍼런스 this를 붙여야함
		this.name = name; // 멤버변수 name(this.name)에 로컬변수 name(name)의 값을 저장(전달)
		
	}

	public String getName() {
		// 메서드 내에서 멤버변수와 중복되는 이름을 갖는 로컬변수가 없을 경우 this 생략 가능
		// => 멤버변수에 대한 구별이 불필요하기 때문
		return name; // 멤버변수 name을 가리킴(this.name도 사용 가능함)
	}
	
	public void setAge(int age) {
		// 로컬변수 age와 멤버변수 age를 구분하기 위해 멤버변수 age앞에 this.을 붙임
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	
	
	
}