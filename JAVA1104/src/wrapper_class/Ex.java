package wrapper_class;

public class Ex {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스
		 * - 기본 데이터타입을 객체 형태로 관리해주는 클래스들의 모음
		 * - 기본 데이터타입과 1:1로 대응하는 8개의 클래스가 제공됨
		 *   (Byte, Short, Integer, Long, Float, Double, Character, Boolean)
		 *   => int, char외의 나머지는 기본데이터타입 이름첫글자만 대문자로 변경
		 * - Wrapper클래스에서 제공하는 상수와 메서드를 활용하여
		 *   기본 데이터타입으로 사용할 때보다 더 많은 기능을 수행할 수 있도록 도와줌
		 *   
		 */
		
		System.out.println("byte타입 메모리 크기(bit) : " + Byte.SIZE);
		System.out.println("byte타입 메모리 크기(Byte) : " + Byte.BYTES);
		System.out.println("byte타입 최소값 : " + Byte.MIN_VALUE);
		System.out.println("byte타입 최소값 : " + Byte.MAX_VALUE);
		
		System.out.println("short타입 메모리 크기(bit) : " + Short.SIZE);
		System.out.println("short타입 메모리 크기(Byte) : " + Short.BYTES);
		System.out.println("short타입 최소값 : " + Short.MIN_VALUE);
		System.out.println("short타입 최소값 : " + Short.MAX_VALUE);
		
		System.out.println("integer타입 메모리 크기(bit) : " + Integer.SIZE);
		System.out.println("integer타입 메모리 크기(Byte) : " + Integer.BYTES);
		System.out.println("integer타입 최소값 : " + Integer.MIN_VALUE);
		System.out.println("integer타입 최소값 : " + Integer.MAX_VALUE);
		
		System.out.println("long타입 메모리 크기(bit) : " + Long.SIZE);
		System.out.println("long타입 메모리 크기(Byte) : " + Long.BYTES);
		System.out.println("long타입 최소값 : " + Long.MIN_VALUE);
		System.out.println("long타입 최소값 : " + Long.MAX_VALUE);
		
		System.out.println("char타입 메모리 크기(bit) : " + Character.SIZE);
		System.out.println("char타입 메모리 크기(Byte) : " + Character.BYTES);
		System.out.println("char타입 최소값 : " + (int)Character.MIN_VALUE);
		System.out.println("char타입 최소값 : " + (int)Character.MAX_VALUE);
		
		
	}

}
