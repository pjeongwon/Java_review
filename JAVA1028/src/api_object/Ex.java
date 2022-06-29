package api_object;

import java.util.Objects;

public class Ex {

	public static void main(String[] args) {
		/*
		 * java.lang.Object 클래스
		 * - 모든 자바 클래스의 슈퍼클래스
		 * - java.lang패키지에 위치하므로 import가 필요없는 클래스
		 * - Object클래스의 모든 메서드는 다른 클래스에서 사용하거나 오버라이딩이 가능
		 * 
		 * 1. equals() 메서드
		 * - 두 객체가 같은지 동등비교(==) 수행
		 * 	 => 즉, 두 객체의 주소값을 비교하여 같으면 true, 다르면 false 리턴
		 *   (Object클래스 입장에서는 어떤 서브클래스가 올 지 예측 불가하므로, 미리 변수 비교 불가)
		 * - 실제 '두 객체가 같다'라는 의미는 두 객체 위치에 해당하는 주소값이 아닌
		 *   '객체가 가지는 멤버변수 값이 같다'는 의미로 사용됨 
		 *   따라서, 사용자 정의 클래스 내부에 Object클래스로부터 상속받은 equals()메서드를 
		 *   오버라이딩하여 두 객체가 가진 멤버변수끼리 비교를 수행하도록 수정하여 사용해야함
		 * - 자바에서 제공하는 대부분의 클래스(API = 라이브러리)들은
		 *   equals()메서드가 이미 오버라이딩 되어 있으므로 객체 내의 값들을 비교 가능
		 *   ex) String클래스의 equals()메서드
		 * - 직접 오버라이딩을 통해 구현해도 되지만, 단축키를 사용하여 자동생성도 가능하다!
		 *   => equals() 메서드 생성 단축키 : Alt + Shift + S -> H
		 */
		
		Person p1 = new Person("홍길동","911111-1234567");
		Person p2 = new Person("홍길동","911111-1234567");

		System.out.println("p1 객체 정보 : " + p1);
		System.out.println("p2 객체 정보 : " + p2);
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		// 참조변수값에 대한 동등비교 = 두 객체에 대한(참조변수에 저장된) 주소값 비교
		if(p1 == p2) {
			System.out.println("두 객체의 주소값이 같다!");
		}else {
			System.out.println("두 객체의 주소값이 다르다!");
		}
		
		// Object클래스로부터 상속받은 equals()메서드를 사용한 동등비교
		// = 기본 equals()메서드는 내부적으로 두 객체에 대한 동등비교 수행(== 수행결과와 동일)
		if(p1.equals(p2)) {
			System.out.println("두 객체의 주소값이 같다!");
		}else {
			System.out.println("두 객체의 주소값이 다르다!");
		}
		
		System.out.println("-------------------------------------");
		
		Person p3 = p2; // p2의 주소값을 p3에 전달(복사)
		System.out.println("p1 객체 정보 : " + p1); // api_object.Person@7852e922
		System.out.println("p2 객체 정보 : " + p2); // api_object.Person@4e25154f
		System.out.println("p3 객체 정보 : " + p3); // api_object.Person@4e25154f
		
		if(p2 == p3) {
			System.out.println("두 객체의 주소값이 같다!");
		}else {
			System.out.println("두 객체의 주소값이 다르다!");
		}
		
		if(p2.equals(p3)) {
			System.out.println("두 객체의 주소값이 같다!");
		}else {
			System.out.println("두 객체의 주소값이 다르다!");
		}
		System.out.println("=====================================");
		Person2 p11 = new Person2("홍길동", "911111-1234567");
		Person2 p22 = new Person2("홍길동", "911111-1234567");
		
		// 참조 변수값에 대한 동등비교 = 두 객체에 대한(참조변수에 저장된) 주소값 비교
		if(p11 == p22) {
			System.out.println("두 객체의 주소값이 같다!");
		}else {
			System.out.println("두 객체의 주소값이 다르다!");
		}
		
		// Person2 클래스에서 오버라이딩 한 equlas()메서드를 사용한 비교
		// => Person2 클래스의 equals()메서드에서는 name과 jumin변수값을 직접 비교하므로
		//	  두 객체의 name, jumin변수값이 '같다!'는 결론(true)이 리턴됨
		if(p11.equals(p22)) {
			System.out.println("두 객체의 주소값이 같다!");
		}else {
			System.out.println("두 객체의 주소값이 다르다!");
		}
	}

}


class Person{
	String name;
	String jumin;
	
	public Person(String name, String jumin) {
		super();
		this.name = name;
		this.jumin = jumin;
	}
	
}

class Person2{
	String name;
	String jumin;
	
	public Person2(String name, String jumin) {
		super();
		this.name = name;
		this.jumin = jumin;
	}

	// equals()메서드 자동 오버라이딩 및 코드 구현 단축키 : Alt + Shift + S -> H
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person2 other = (Person2) obj;
		return Objects.equals(jumin, other.jumin) && Objects.equals(name, other.name);
	}

	
	
	
	// Object클래스의 equals()메서드 오버라이딩
	// p11.equals(p22)
//	@Override
//	public boolean equals(Object obj) {
//		// 파라미털 전달받은 객체(obj)의 멤버변수가 현재 인스턴스 내의 멤버변수와 같은지 판별
//		// => 주의! Person2 객체를 파라미터로 전달 시 Object타입으로 업캐스팅 되면 
//		//    Person2객체 내의 멤버에 접근 불가능하게 참조 영역이 축소됨
//		// => 따라서, 참조 영역 확대를 위해 Object -> Person2타입으로 다운캐스팅 필수!
//		if(obj instanceof Person2) { // 형변환(다운캐스팅) 가능 여부 판별
//			Person2 p = (Person2) obj; // Object -> Person2 다운캐스팅
//			
//			// 두 객체의 멤버변수 name, jumin을 비교하여 같으면 true, 하나라도 다르면 false 리턴
//			// => 이 때, name과 jumin은 String 타입 문자열이므로 String객체의 equals() 사용해야함
//			if(name.equals(p.name) && jumin.equals(p.jumin)) {
//				return true;
//			}
//		}
//		// 두 객체의 멤버변수가 하나라도 다르거나 instanceof 연산 결과가 false이면 false리턴
//		return false;
//	}
	
	
	
}













