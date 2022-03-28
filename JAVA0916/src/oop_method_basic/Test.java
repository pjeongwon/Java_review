package oop_method_basic;

public class Test {

	public static void main(String[] args) {
		// MethodExam 클래스 인스턴스 생성(변수명 m)
		MethodExam m = new MethodExam();
		
		// 1. 파라미터도 없고, 리턴값도 없는 메서드 호출
		// => hello() 메서드 호출 "Hello, World!" 문자열 10번 출력
		m.hello();
		// 또 다시 hello() 메서드 호출 시 "Hello, World!" 문자열 10번 출력 
		m.hello(); 
		
		System.out.println("--------------------------------");
		
		m.gugudan();
		
		System.out.println("===============================");
		
			}

} 


