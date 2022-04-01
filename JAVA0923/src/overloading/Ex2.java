package overloading;

public class Ex2 {

	public static void main(String[] args) {
		
		OverloadingMethod om = new OverloadingMethod();
		om.print(3);
		om.print(3, 5);
		
		System.out.println("--------------------------");
		
		// 파라미터의 개수와 타입을 달리하는 메서드 오버로딩
		
		WalkingDistance wd = new WalkingDistance();
		wd.walk();
		wd.walk(200); // "200cm 이동" 출력 (오버로딩 필요)
		wd.walk(50, "inch"); // "125cm 이동" 출력 (오버로딩 필요)
		
		
	}

}

class OverloadingMethod{
// ---- 파라미터의 개수를 달리하는 메서드 오버로딩 ----
	
	// 정수 1개를 전달받아 출력하는 print() 메서드 정의
	public void print(int num1) {
		System.out.println(num1);
	}
	// 정수 2개(num1, num2)를 전달받아 출력하는 print() 메서드 오버라이딩
	public void print(int num1, int num2) {
		System.out.println(num1 + ", " + num2);
	}
	
	// 매개변수가 동일한 타입일 경우 순서가 바뀌어도 오버로딩으로 취급 x
//	public void print(int num1, int num2) {
//		System.out.println(num1 + ", " + num2);
//	}
}


class WalkingDistance{
	
	// 아무것도 전달받지 않는 walk() 메서드 정의(리턴값 없음)
	public void walk() {
		System.out.println("100cm 이동!");
	}
	
	// 정수 1개(거리)를 전달받아 "해당 거리 cm이동!" 출력하는 walk()메서드 오버로딩
	public void walk(int distance) {
		System.out.println(distance + "cm 이동!");
	}
	
	// 정수 1개(거리, distance)와 문자열 1개(단위, unit)를 전달받아
	// unit가 "inch"일 경우 *2.5 연산한 결과를 출력하는 walk()메서드 오버로딩
	
	public void walk(int distance, String unit) {
		if(unit == "inch") {
//			distance = distance * 2.5; // int * double 이므로 int형 변수에 저장 불가
//			distance = (int)(distance * 2.5);
			distance *= 2.5; // 복합 대입연산자 활용
			
		}
		System.out.println(distance + "cm 이동!");
	}
	
	// 매개변수가 서로 다른 타입일 경우 순서를 바꿔도 오버로딩으로 취급됨
	public void walk(String unit, int distance) {
		if(unit == "inch") {
//			distance = distance * 2.5; // int * double 이므로 int형 변수에 저장 불가
//			distance = (int)(distance * 2.5);
			distance *= 2.5; // 복합 대입연산자 활용
			}
		System.out.println(distance + "cm 이동!");
		}
}
