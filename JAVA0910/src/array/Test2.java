package array;

public class Test2 {

	public static void main(String[] args) {
		String[] names = {"홍길동", "이순신", "강감찬", "김태희", "전지현"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println("\n저장된 인원 수(name 배열 크기) : " + names.length);
	}

}
