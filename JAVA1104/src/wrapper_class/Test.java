package wrapper_class;

public class Test {

	public static void main(String[] args) {
		/*
		 * char타입 배열 chArr에 'A', 'b', '5', ' ', '#' 문자를 저장한 후
		 * 각각의 문자를 반복문을 사용하여 대문자, 소문자, 숫자, 공백문자, 기타문자로 판별
		 */
		
		char[] chArr = {'A', 'b', ' ', '5', '#'};
		
		for(int i = 0; i < chArr.length; i++) {
			if(Character.isUpperCase(chArr[i])) {
				System.out.println("대문자");
			} else if(Character.isLowerCase(chArr[i])) {
				System.out.println("소문자");
			} else if(Character.isDigit(chArr[i])) {
				System.out.println("숫자");
			} else if(Character.isWhitespace(chArr[i])) {
				System.out.println("공백문자");
			} else {
				System.out.println("기타문자");
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
