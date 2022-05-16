package keyword_static;

public class Test {

	public static void main(String[] args) {
		itwill room1 = new itwill();
		room1.classroom = "1강";
		room1.class1_teacher = "홍진숙";
		room1.class3_teacher = "이연태";
		room1.student1 = "홍길동";
		room1.student2 = "이순신";
		
		itwill room3 = new itwill();
		room3.classroom = "3강";
		room3.class1_teacher = "홍진숙";
		room3.class3_teacher = "이연태";
		room3.student1 = "정제용";
		room3.student2 = "박정원";
		//--------------------------------------
		// 만약, 담임강사 변수를 인스턴스 변수로 선언했을 경우
		// 강의장1 인스턴스에서 3강의장 담임을 이연태 -> 송지태로 변경해도
		// 강의장3 인스턴스에는 영향을 주지 못하므로 강의장3 인스턴스에서도 별도로 변경해야함
		room1.class3_teacher = "송지태";
		System.out.println("3강 담임 : " + room1.class3_teacher); // 송지태
		System.out.println("3강 담임 : " + room3.class3_teacher); // 이연태(변경 x)
		
		System.out.println("===============================");
		
		itwill2.class1_teacher = "홍진숙";
		itwill2.class3_teacher = "이연태";
		
		itwill2 room2_1 = new itwill2();
		room2_1.classroom = "1강";
		
		// 각 강의장 담임강사는 모든 인스턴스가 공통으로 사용하므로 static변수로 선언되어 있다.
		// 따라서, 일반적인 인스턴스 변수 접근 방법을 사용해도 오류는 발생하지 않지만,
		// 클래스명.static변수명 형태로 접근하는 것이 좋다.
		
//		room2_1.class1_teacher = "홍진숙"; // 인스턴스 변수 접근 문법과 동일한 방법
//		room2_1.class3_teacher = "이연태"; // 인스턴스 변수 접근 문법과 동일한 방법
		
//		itwill2.class1_teacher = "홍진숙";
//		itwill2.class3_teacher = "이연태";
		// => 그리고 인스턴스 생성 코드보다 위에서 담임강사 지정도 가능함
		
		room2_1.student1 = "홍길동";
		room2_1.student2 = "이순신";
		
		itwill2 room2_3 = new itwill2();
		room2_3.classroom = "3강";
		
		// 강의장 별 담임강사는 static변수이므로 모든 인스턴스가 공유하는 변수
		// 따라서, 인스턴스마다 초기화하는 작업 불필요
//		room2_3.class1_teacher = "홍진숙";
//		room2_3.class3_teacher = "이연태";
		room2_3.student1 = "정제용";
		room2_3.student2 = "박정원";
		//--------------------------------------
		// 만약, 담임강사 변수를 인스턴스 변수로 선언했을 경우
		// 강의장1 인스턴스와 강의장3 인스턴스와 무관하게
		// 강의장1 인스턴스에서 3강의장 담임을 이연태 -> 송지태로 변경하면
		// 강의장3 인스턴스의 담임도 이연태 -> 송지태로 변경되어 있음(공유됨)
		
		itwill2.class3_teacher = "송지태";
		System.out.println("3강 담임 : " + room2_1.class3_teacher); // 송지태
		System.out.println("3강 담임 : " + room2_1.class3_teacher); // 이연태(변경 x)
		
	}

}

/*
* < 아이티윌 클래스 정의 >
* - 강의장 멤버변수는 1강의장 ~ 7강의장까지 사용됨
* - 각 강의장에는 1번 학생 ~ 30번 학생까지 사용됨(강의장마다 각 학생의 이름은 다름)
* - 각 강의장별 담임강사는 1명씩이며 모든 반이 공통으로 담임강사에 접근 가능
*
*/

class itwill{
	String classroom;
	String class1_teacher;
	String class2_teacher;
	String class3_teacher;
	// ... 생략
	String student1;
	String student2;
	String student3;
	// ... 생략
}

class itwill2{
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
