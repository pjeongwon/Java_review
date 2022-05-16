package keyword_static;

public class Test5 {

	public static void main(String[] args) {
		
		itwill5 itwill = itwill5.getInstance();
		itwill.class3_teacher = "이연태";
		System.out.println("강의실3 강사 : " + itwill.class3_teacher);
	}

}


class itwill5{
	// 싱글톤 패턴을 활용하여 아이티윌5 인스턴스를 직접 생성하여 리턴하기(외부에서 객체 생성 차단)
	
	private static itwill5 instance = new itwill5();
	
	private itwill5() {}
	
	
	public static itwill5 getInstance() {
		return instance;
	}
	


	// --------------------------------------------------------
	String classroom;
	String student1;
	String student2;
	String student3;
	// ... 생략
	
	// 각 강의장의 담임강사는 모든 강의장에서 공통으로 사용되므로
	// 일반적인 인스턴스 변수가 아닌 클래스 변수(=static 변수)로 선언하여 사용할 수 있다!!
	static String class1_teacher;
	static String class2_teacher;
	static String class3_teacher;
	// ... 생략
}

// 클래스 구성요소
// 1. 멤버변수(클래스변수, 인스턴스변수)
// 2. 생성자
// 3. 메서드 : if문...














