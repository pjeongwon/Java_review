
public class Ex {

	public static void main(String[] args) {
		
		byte a1 = 10;
		short a2 = 120;
		System.out.println("a1(byte) : " + a1 + ", a2(short) : " + a2);
		
//		a2 = a1;
		a2 = (short)a1; // 형 변환 연산자를 생략해도 되고, 명시해되 됨.
		
		System.out.println("a1(byte) : " + a1 + ", a2(short) : " + a2);
		
		System.out.println("-------------------------------------------");
		
		byte b1 = 10;
		short b2 = 130;
		System.out.println("b1(byte) : " + b1 + ", b2(short) : " + b2);
//		b1 = b2; 오류 발생!
		b1 = (byte)b2;
		System.out.println("b1(byte) : " + b1 + ", b2(short) : " + b2);
		//	=> 강제 형 변환 후에도 원래 데이터와 변환 후의 데이터가 다를수 있다! = Overflow(넘침)
			
		// 강제 형 변환을 수행하더라도 원래 데이터가 그대로 유지됨 Overflow 발생하지 않음
					
		b2 = 120;
		b1 = (byte)b2;
		System.out.println("b1(byte) : " + b1 + ", b2(short) : " + b2);		
		
		
		
		
		
		
	}
	
}
