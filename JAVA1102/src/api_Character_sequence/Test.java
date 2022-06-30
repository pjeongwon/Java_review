package api_Character_sequence;

public class Test {

	public static void main(String[] args) {
		/*
		 * 주민등록번호를 입력(jumin)받아 성별(남 또는 여 또는 외국인)판별
		 * 1) 뒷자리 첫번째 숫자가 1 또는 3 : "남성" 출력
		 * 2) 뒷자리 첫번째 숫자가 2 또는 4 : "여성" 출력
		 * 3) 뒷자리 첫번째 숫자가 5 또는 6 : "외국인" 출력
		 * 4) 그 외의 나머지 : "오류" 출력
		 */
		
		String jumin = "901010-1234567";
		
		
		if(jumin.charAt(7) == '1' || jumin.charAt(7) == '3') {
			System.out.println("남성");
		} else if(jumin.charAt(7) == '2' || jumin.charAt(7) == '4') {
			System.out.println("여성");
		} else if(jumin.charAt(7) == '5' || jumin.charAt(7) == '6') {
			System.out.println("외국인");
		} else {
			System.out.println("오류");
		}
				
//		System.out.println("s1.charAt() : " + s1.charAt(5)); // 특정 인덱스의 문자 1개 리턴
				
		System.out.println("===========================");
		
		String email = "jinjin0310@naver.com";
		// 이메일 주소를 분리하여 다음가 같이 출력
		// 계정명 : jinjin0310
		// 도메인 : naver.com
//		System.out.println("s1.substring(5, 12) : " + s1.substring(5, 12)); // 5번부터 12-1번까지 부분 문자열 추출 (Program)
		System.out.println("계정명 : " + email.substring(0, 10));
		System.out.println("도메인 : " + email.substring(11, 20));
		
		String[] splitEmail = email.split("@");
		System.out.println("계정명 : " + splitEmail[0]);
		System.out.println("도메인 : " + splitEmail[1]);
	}

}
