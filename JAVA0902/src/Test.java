
public class Test {

	public static void main(String[] args) {
		int i1 = 1234;
		long l1 = i1; // 자동 형 변환(int(작은) -> long(큰))
		byte b1 = (byte)i1; // 강제 형 변환(int(큰) -> byte(작은))
		//	=> 변환 시 Overflow 발생하므로 자릿수에 따른 값의 변화가 발생함(원본과 데이터가 달라짐)
		
		System.out.println(i1 + "\t" + l1 + "\t" + b1); // 1234	1234	-46
		//	=> i1과 l1은 같은 값이지만 b1은 다른 값이 출력됨(Overflow 발생함)
		
		// double타입과 long타입은 둘 다 메모리 크기가 8byte이나
		// 실수형은 무조건 정수형보다 큰 타입으로 취급되므로
		// long -> double로 이동할 때 자동 형 변환이 일어남
		double d1 = l1;
		// float타입은 메모리 크기가 4byte이므로 long타입보다 메모리 크기가 작지만
		// 실수형은 무조건 정수형보다 큰 타입으로 취급되므로
		// long -> float로 이동할 때 자동 형 변환이 일어남
		
		float f1 = l1;
		System.out.println(l1 + "\t" + d1 + "\t" + f1); 
		
		// float타입과 int타입은 둘 다 메모리 크기가 4byte이나
		// 실수형은 무조건 정수형보다 큰 타입으로 취급되므로
		// float -> int로 이동할 때 자동 형 변환이 일어나지 않음
		int i2 = (int)f1;
		System.out.println(f1 + "\t" + i2); 
		//	=> 소수점 0.은 오버플로우에 의해 탈락됨
		
		// byte & short <-> char
		byte b2 = 67;
		char ch1 = (char)b2;
		System.out.println(b2 + "\t" + ch1); 
		// byte(1)가 char(2)보다 메모리가 작지만 음수표현 문제로 강제 형 변환 필수!
		short s1 = 67;
		char ch2 = (char)s1;
		// short(2)가 char(2)보다 메모리가 작지만 음수표현 문제로 강제 형 변환 필수!
		System.out.println(b2 + "\t" + s1 + "\t" + ch1 + "\t" + ch2);
		
		// char타입은 최소 int타입 이상으로 자동 형 변환이 가능함
		int i3 = ch2;
		
		// boolean타입은 다른 기본 데이터타입과 상호 형 변환이 불가능함
		boolean b = true;
		//int i4 = (int)b; 오류 발생! Cannot cast from boolean to int
		
		System.out.println("-----------------------------------------");
		
		// 주의사항!
		// float타입에서 double타입으로 자동 형 변환 시
		// 근사치 표현에 의해 정상적인 데이터가 아닌 데이터가 전달될 수 있다!
		//	=> 부족한 자릿수를 채울 때 근사치 표현에 의해 이상한 값이 추가됨
		float f2 = 1.1f;
		double d2 = f2;
		System.out.println(d2 + "\t" + f2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
