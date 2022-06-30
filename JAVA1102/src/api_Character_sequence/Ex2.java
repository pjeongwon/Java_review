package api_Character_sequence;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * StringBuffer & StringBulder 클래스
		 * - java.lang패키지
		 * - String 클래스와 마찬가지로 문자열을 관리하는 클래스
		 * - String 클래스는 불변 객체이므로 문자열을 직접 수정하지 않고
		 *   수정 결과를 새로운 문자열로 생성하므로 문자열 조작이 빈번할 경우
		 *   메모리 낭비가 크고 수정 작업에 시간이 많이 소요됨
		 *   그러나, StringBuffer & StringBulder 클래스는 문자열이 저장된 객체(버퍼)를 
		 *   직접 수정 가능하므로 메모리 낭비나 시간 소요가 적어짐
		 *   => 즉, 문자열 조작이 빈번한 경우 String 대신 StringBuffer & StringBulder 사용 권장
		 * - 저장 공간(= 버퍼)는 자동으로 관리됨
		 * - String 클래스와는 아무런 상속관계가 없으므로 자동으로 상호 변환이 불가능함
		 * - StringBuffer 와 StringBulder는 구조가 동일하므로 동일한 메서드를 사용하지만
		 *   멀티쓰레드환경을 지원 유무가 다르므로 상황에 맞게 선택해서 사용해야함
		 */
		
		// String 클래스를 사용하여 문자열을 생성하는 방법
		// 1. 객체 생성을 통한 생성자 호출 방법
		String s1 = new String("홍길동");
		// 2. 리터럴 할당을 통한 방법(일반적으로 사용하는 방법)
		String s2 = "홍길동";
		
		// StringBuffer 또는 StringBulder는 객체 생성 방법만 사용가능
//		StringBuffer sb = new StringBuffer(); // 문자열이 빈 객체(= 버퍼) 생성
		StringBuffer sb = new StringBuffer("홍길동"); // "홍길동"문자열이 저장된 버퍼 생성
		// => String타입에 저장딘 문자열을 StringBuffer로 변한 시 사용하는 방법
		
		// toString()메서드를 사용하면 객체(버퍼)에 저장된 문자열을 리턴받을 수 있다!
		System.out.println(sb.toString());
		System.out.println(sb); // 출력문 내에서는 toString() 메서드 생략 가능
		
		String s3 = sb.toString(); // StringBuffer -> String타입 변환
		System.out.println(s3);
		
		
		System.out.println("--------------------------");

		String s4 = "홍길동";
		s4.concat("입니다"); // 불변객체이므로 데이터 직접 수정 x
		System.out.println(s4); // 홍길동 유지
		
		
		sb = new StringBuffer("자바");
		// 대표적인 메서드
		// append() : 문자열 추가 (= 결합)
		sb.append(" 프로그래밍"); // 문자열 뒷부분에 내용추가 (버퍼 공간의 문자열을 직접 수정함)
		System.out.println(sb); // 수정 작업 후에도 해당작업 결과가 유지됨
		// => 중요! 문자열 결합 방식 3가지는 수행에 걸리는 시간이 각각 다르다!
		//    <느림> 연결연산자(+) > String의 concat() > StringBuffer의 append() <빠름>
		// => 즉! 문자열 결합이 빈번할 경우 append()가 가장 효율적이다!
		
		// insert() : 문자열 삽입 (= 결합)
//		sb.insert(sb.length(), "(java)"); // 마지막 인덱스 위치에 문자열 삽입(맨 뒤에 추가와 동일)
		sb.insert(2, "(java)"); // 2번 인덱스 위치에 문자열 삽입
		System.out.println(sb);

		sb.delete(2, 8); // 2 ~ 8-1(7)번 인덱스까지 삭제
		System.out.println(sb);
		
		sb.reverse(); // 문자열을 반대로 역전시킴("자바 프로그래밍" -> 밍래그로프 바자")
		System.out.println(sb);
		
		// 이외에도 String클래스의 메서드와 동일하거나 유사한 메서드가 많이 제공됨
		
		
		
		
		
		
		
	}

}