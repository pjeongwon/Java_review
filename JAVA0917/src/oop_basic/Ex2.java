package oop_basic;

public class Ex2 {

	public static void main(String[] args) {
		
		// Student2 클래스의 인스턴스 생성 - 학생 1명에 해당하는 객체 생성
		Student2 s1 = new Student2();
		
		// Student2 인스턴스의 멤버변수를 초기화 후 다음과 같이 출력
		// 학번 : 20211111
		// 이름 : 홍길동
		// 학년 : 3
		
		s1.id = 20211111;
		s1.name = "홍길동";
		s1.classLevel = '3'; // char 타입 데이터 지정 시 작은따옴표 사용하기!
		
		System.out.println("학번 : " + s1.id);
		System.out.println("이름 : " + s1.name);
		System.out.println("학년 : " + s1.classLevel);
		
		System.out.println("수업시간입니다! 공부합시다!");
		// Student2 인스턴스의 study() 메서드 호출
		s1.study();
	
		System.out.println("=======================");
		/*
		 * 인스턴스의 멤버변수에 접근하는 방법
		 * 1. 다른 클래스에서 또 다른 클래스(인스턴스)의 멤버변수에 접근하기 위해서는
		 *    반드시 참조변수명.멤버변수명 형태로 접근해야 한다!
		 * 2. 자신의 클래스(인스턴스)에서 자신의 멤버변수에 접근하기 위해서는
		 *    참조변수명 없이 그냥 멤버변수명만으로 접근이 가능하다!
		 */
		Person p = new Person();

		System.out.println("이름 : " + p.name);
		System.out.println("나이 : " + p.age);
		System.out.println("배고픔 : " + p.isHungry);
		
		// Person 인스턴스의 멤버변수 값 변경하기
		// => 반드시 참조변수명을 통해 접근해야함
		
		p.name = "홍길동";
		p.age = 20;
		
		
//		System.out.println("이름 : " + p.name);
//		System.out.println("나이 : " + p.age);
//		System.out.println("배고픔 : " + p.isHungry);
//		
		p.showPersonInfo();
		// Person 인스턴스의 work()메서드를 호출
		p.work(); // 메서드 내에서 출력문 실행후 isHungry값을 true로 변경함
		System.out.println("배고픔 : " + p.isHungry);
		
		// Person 인스턴스의 eat()메서드를 호출
		p.eat(); // 메서드 내에서 출력문 실행 후 isHungry값을 false로 변경함
		System.out.println("배고픔 : " + p.isHungry);
		
		System.out.println("-----------------------");
		
		Person p2 = new Person();
		p2.name = "장길산";
		p2.age = 47;
		p2.isHungry = true;
//		System.out.println("이름 : " + p2.name);
//		System.out.println("나이 : " + p2.age);
//		System.out.println("배고픔 : " + p2.isHungry);
		
		p2.showPersonInfo();
		
		p2.eat();
		System.out.println("배고픔 : " + p2.isHungry);
		
		// eatSome() 메서드를 호출하여 음식을 하나 전달(문자열)
		p2.eatSome("해물짬뽕");
	}
		

} // Ex2 클래스 끝
/*
 * 학생(Student2) 클래스 정의
 * 속성(멤버변수) - 학번(id, 정수형), 이름(name, 문자열), 학년(classLevel, 문자)
 * 기능 - 공부하다(study()) - 파라미터 없음, 리턴값 없음 => "공부하기!" 문자열 출력 
 */
class Student2 {
	// 멤버변수 선언
	int id;
	String name;
	char classLevel;
	
	// 메서드 정의
	public void study() {
		System.out.println("공부하기!");
	}
} // Student2 클래스 끝

/*
 * 사람(Person) 클래스
 * 멤버변수 : 이름(name 문자열), 나이(age, 정수), 배고픔상태(isHungry, boolean) - boolean 변수의 경우 isOOOO 형식으로 사용
 * 메서드
 *  1) work() 메서드 : 파라미터 없음, 리턴값 없음 => "일하기" 출력
 *  2) eat()  메서드 : 파라미터 없음, 리턴값 없음 => "밥먹기" 출력
 */

class Person {
	// 클래스 내의 멤버변수는 인스턴스 생성 시점에서 자동으로 기본값으로 초기화 된다!
	String name; // 기본값 null
	int age; // 기본값 0
	boolean isHungry; // 기본값 false
	
	// work() 메서드 정의
	public void work() {
		System.out.println("일 하기!");
		// 배고픔 상태를 true(배고픔)로 변경
		// => 자신의 인스턴스인 Person인스턴스의 isHungry 변수값을 변경해야하므로
		//	  별도의 참조변수 없이 변수명만으로 멤버변수(isHungry)에 접근이 가능하다!
		isHungry = true;
	}
	// eat() 메서드 정의
	public void eat() {
		System.out.println("밥 먹기!");
		// 배고픔 상태를 false(배고프지 않음)로 변경
		isHungry = false;
		
	}
	
	// eatSome() 메서드 정의
	// => 파라미터 : food(문자열), 리턴값 없음
	// 출력 예시 : "음식명, 먹기!" 출력 후 배고픔 상태를 false로 변경
	
	public void eatSome(String food) {
		System.out.println(food + ", 먹기!");
		isHungry = false;
	}
	
	// 자신의 멤버변수값(이름, 나이, 배고픔)을 출력하는 showPersonInfo() 메서드 정의
	// 파라미터 없음, 리턴값 없음
	public void showPersonInfo() {
		// 자신의 클래스내의 메서드에서는 멤버변수 접근 시 참조변수명이 불필요함
		System.out.println("이름 : " + name); // this.name 가능
		System.out.println("나이 : " + age);
		System.out.println("배고픔 : " + isHungry);
	}

}

