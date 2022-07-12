package wrapper_class;

public class Ex2 {

	public static void main(String[] args) {

		// 기본 데이터타입 변수 선언 => 변수 내에 실제 데이터가 위치(저장)
		int num1 = 10; // 정수 10을 int형 변수 num1에 저장
		int num2;
		
		// Integer타입 변수 선언 및 객체 생성 => 변수 내에 실제 데이터가 아닌 저장된 객체 위치의 주소값 저장
		Integer n1;
//		Integer n2 = new Integer(20); // 정수 20을 갖는 인스턴스 생성하고, 변수 n2에 주소값 저장
		Integer n2 = new Integer("20"); // 문자열 20을 정수 형태로 변환하여 저장 가능
		
		// 기본 데이터타입은 Stack 공간에 실제 데이터 형태를 직접 관리하지만
		// 객체는 Heap공간에 실제 데이터가 저장되고, 참조 변수가 해당 공간의 주소를 관리함
		// 따라서, 기본 데이터타입과 참조 데이터타입은 서로 호환이 불가능
		n1 = Integer.valueOf(num1); // 기본형 데이터 num1을 Integer타입 객체로 변환하여 저장
		System.out.println(num1 + ", " + n1.toString()); // toString() 메서드가 오버라이딩 되어있음 / 저장되어 있는 정수 10을 문자열로 변환하여 리턴

		// Heap공간의 Wrapper클래스타입 객체를 기본형 변수에 저장하려면
		// 해당 객체의 xxxValue()메서드를 호출하여 기본 데이터타입 형식으로 변환해야함
		num2 = n2.intValue();
		System.out.println(num2 + ", " + n2.toString());
		
		System.out.println("==========================");
		
		/*
		 * 기본 데이터타입과 객제간의 변환이 빈번하게 사용되어
		 * Wrapper클래스에 새로운 기능이(오토박싱 & 오토언박싱 추가되었음
		 * => JDK 5버전부터 추가됨
		 * 
		 * 1. 오토 박싱(Auto Boxing)
		 * - 기본 데이터타입 -> Wrapper클래스 타입 객체로 자동으로 변환
		 *   ex) int -> Integer, char -> Character
		 *   => 즉, 기본 데이터타입을 Heap공간 객체에 저장하고 해당 객체의 주소값을 리턴해줌
		 *   
		 * 2. 오토 언박싱(Auto Unboxing)
		 * - Wrapper클래스 타입 객체를 기본 데이터타입으로 자동으로 변환
		 *   ex) Integer -> int, Character -> char
		 *   => 즉, Heap 공간 객체(박스)에 저장된 데이터를 꺼내서 기본 데이터타입으로 리턴해줌
		 *   
		 */

		// 오토 박싱
		
		n1 = num1; // 기본 데이터타입 num1값을 자동으로 Integer타입 객제 n1으로 포장
		System.out.println(num1 + ", " + n1.toString());
//		num1.??? // 기본 데이터타입은 변수에 값 저장 용도로만 사용 가능하므로 사용 불가!
		n1.equals(n2); // 참조 데이터타입 n1으로는 각종 메서드 호출 가능해짐
		
		// 오토 언방식
		num2 = n2; // Integer타입 객체 n2에 저장된 데이터를 꺼내서 기본 데이터타입 변수에 전달
		System.out.println(num2 + ", " + n2.toString());
		
		System.out.println("==========================");
		
		Object obj = 10;
		// => int형 정수 10을 Integer타입으로 오토 박싱 후 
		//    다시 Integer타입 객체를 Object타입으로 업캐스팅이 일어남
//		System.out.println(obj + 10);
		System.out.println(obj);
		
//		Integer n3 = obj; // Object -> Integer로 다운캐스팅 필요
		Integer n3 = (Integer) obj;
		System.out.println(n3);
		
//		int num3 = (Integer)obj; // Object -> Integer 다운캐스팅 -> int 오토언박싱
		int num3 = (int)obj; // 기본데이터타입으로 강제형변환도 가능함
		System.out.println(num3);
		
		
		
		
	}

}
