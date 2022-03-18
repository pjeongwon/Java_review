
public class Test2 {

	public static void main(String[] args) {
		
		// 묵시적 형 변환의 예
		int i1 = 1234;
		// long타입 변수 l1에 int타입 변수 i1의 값을 전달
		long l1 = i1; // long타입(큰) <- int타입(작은)이므로 자동 형 변환 일어남
		System.out.println(i1 + "\t" + l1);
		
		l1 = 100; // long타입(큰) <- int타입(작은)이므로 자동 형 변환 일어남
		
		char ch1 = 'A'; // char타입 데이터 'A'는 정수 65에 해당함
		ch1 = 'B';
		// int타입 변수 i2에 char타입 변수 ch1의 값을 전달
		int i2 = ch1; // int타입(큰) <= char타입(작은)이므로 자동 형 변환 일어남
		System.out.println(ch1 + "\t" + i2);
		
		System.out.println("----------------------------------------------");
		
		// 명시적 형 변환의 예
		long ll1 = 1234L;
		// long타입 변수 ll1의 데이터를 int타입 변수 ii1에 전달
		int ii1 = (int)ll1;
		System.out.println(ll1 + "\t" + ii1);
		
		
		long ll2 = 10000000000L;
		int ii2 = (int) ll2;
		System.out.println(ll2 + "\t" + ii2);
		
				
		
		
		
		
		
		
	}
}
