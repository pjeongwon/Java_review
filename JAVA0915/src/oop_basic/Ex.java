package oop_basic;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 객체 구현 단계 - 정의된 클래스(설계도)에 대한 인스턴스(= 객체) 생성
		 * - 힙(Heap) 메모리 공간에 인스턴스를 생성하면 주소값이 부여되고, 
		 *   해당 인스턴스의 주소값을 참조 변수에 저장하여,
		 *   참조 변수를 통해 인스턴스에 접근하도록 하는 단계
		 * - 하나의 클래스에 여러개의 인스턴스를 생성 가능
		 * 
		 *  < 인스턴스 생성 기본 문법 >
		 *  클래스명 참조변수명;
		 *  참조변수명 = new 클래스명();
		 *  => 클래스명 참조변수명 = new 클래스명();
		 *  => new 키워드를 통해 Heap공간에 인스턴스가 1개 생성되고,
		 *     생성된 인스턴스의 주소값이 참조변수에 전달되어 저장됨
		 *	
		 * < 인스턴스의 멤버에 접근하는 기본 문법 >
		 * 참조 변수명.멤버변수명 or 참조 변수명.메서드명()
		 */
		
		// int형 변수 num 선언
		int num;
		// 변수 num에 정수 20 저장
		num = 20; // 기본데이터타입은 변수에 데이터를 직접 저장 가능
		
		
		// 사람 클래스의 인스턴스 생성
//		사람 사람참조변수; // 사람 클래스 타입 참조변수 선언
//		사람참조변수 = new 사람(); // 사람 인스턴스 생성 후 참조변수에 주소값을 저장
		// => 참조변수 선언과 인스턴스 생성이 분리된 문장을 한 문장으로 결합 가능
		사람 사람참조변수 = new 사람();
		
		// -----------------------------------------------------------------
		// Student 클래스의 인스턴스 생성(변수명 s 사용)
//		Student s; // 참조변수 선언
//		s = new Student(); // 인스턴스 생성
		Student s = new Student();
		
		// 참조변수를 사용하여 생성된 인스턴스에 접근한 뒤
		// 인스턴스 내의 멤버변수 값을 변경하기
		// => 참조변수명.멤버변수명 형태로 접근
		// 1) Student인스턴스의 학번(id)을 20211111으로 초기화
		// id = 20211111;
		// 일반 변수 사용과 동일하게 변수명만 사용할 경우 오류 발생!
		// id cannot be resolved to a variable = id 변수 없음
		
		s.id = 20211111;
		// 2) Student인스턴스의 학번(id)을 출력
		System.out.println("학번 : " + s.id);
		
		// 이름을 "홍길동"으로 저장, 학과명 "쉽게배우는 자바"로 저장 후 출력
		s.name = "홍길동";
		s.className = "쉽게배우는 자바";
		System.out.println("이름 : " + s.name + "\n학과명 : " + s.className);
		
		// 현재 홍길동이라는 학생의 인스턴스가 생성되어 있는 상태
		
		System.out.println("---------------------------");
		
		// 홍길동이라는 학생의 인스턴스는 그대로 두고 새로운 학생의 인스턴스를 생성하기
		Student s2 = new Student();
		s2.id = 20212222;
		s2.name = "이순신";
		s2.className = "빅데이터";
		System.out.println("학번 : " + s2.id + "\n이름 : " + s2.name + "\n학과명 : " + s2.className);
		
		// Student타입 s2인스턴스가 새로 생성되더라도 기존의 s인스턴스는 그대로 유지됨
		System.out.println("학번 : " + s.id + "\n이름 : " + s.name + "\n학과명 : " + s.className);
	}

} // Ex 클래스 끝

// 하나의 Java파일 내에 여러개의 클래스를 정의할 수도 있다.
// 단, Java파일 이름과 동일한 클래스가 꼭 존재해야하며 해당 클래스는 class키워드 앞에 public필수!
//	=> 그 외의 클래스는 class키워드 앞에 public을 지정할 수 없다!

// 학생(Student) 클래스 정의
// => 속성 : 학번(id, 정수), 이름(name, 문자열), 학과명(className, 문자열)

class Student{
	int id;
	String name;
	String className;
}










