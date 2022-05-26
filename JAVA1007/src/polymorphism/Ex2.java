package polymorphism;

public class Ex2 {

	public static void main(String[] args) { 
		/*
		 * instanceof 연산자
		 * - 좌변의 객체(인스턴스)가 우변의 클래스 타입인지 판별하는 연산자
		 * - 좌변에는 반드시 인스턴스가 저장된 참조변수가 위치하고
		 *   우변에는 반드시 검사할 클래스(또는 인터페이스)이름이 위치해야함
		 * - 판별 결과가 true이면 좌변의 객체를 우변 타입으로 형 변환이 가능하다는 의미이다.
		 *   (업캐스팅 또는 다운캐스팅 가능)
		 *   만약, false이면 '절대'로 형 변환이 불가능하다는 의미이다!
		 * 
		 * < 기본 문법 >
		 * if(A instanceof B){}
		 * => A는 참조변수, B는 클래스 명
		 * 
		 * 
		 */
		
		SmartPhone sp = new SmartPhone("갤럭시노트20", "010-1234-5678", "안드로이드");
		sp.call();
		sp.sms();
		sp.kakaoTalk();
		
		// sp는 SmartPhone입니까? YES
		if(sp instanceof SmartPhone) {
			System.out.println("sp는 SmartPhone이다!");
			System.out.println("그러므로, sp는 SmartPhone타입 변수에 저장 가능");
			SmartPhone anotherSp = sp; // SmartPhone타입 변수에 전달 가능
		}
		System.out.println("-----------------------------------------------");
		
		// sp는 HandPhone입니까? YES
		if(sp instanceof HandPhone) {
			System.out.println("sp는 HandPhone이다!");
			
			// HandPhone타입 변수 hp에 sp전달하여 변환
			HandPhone hp = sp; // 업캐스팅 = 자동 형 변환;
			
			System.out.println("sp는 HandPhone이 가지는 모든 기능을 포함한다.");
			System.out.println("따라서, 업캐스팅 후에도 HandPhone의 기능을 모두 사용 가능!");
			
			hp.call();
			hp.sms();
//			hp.kakaoTalk(); // SmartPhone의 기능 사용을 포기해야한다.
			
		} else {
			System.out.println("sp는 HandPhone이 아니다!");
		}
		
		System.out.println("-----------------------------------------------");
		
		// HandPhone타입 인스턴스 생성(hp)
		HandPhone hp = new HandPhone("삼성애니콜", "016-123-4567");
		
		// hp는 SmartPhone입니까?
		if(hp instanceof SmartPhone) {
			System.out.println("hp는 SmartPhone이다!");
		} else {
			System.out.println("hp는 SmartPhone이 아니다!");
			System.out.println("그러므로 SmartPhone으로 변환 불가능!");
			System.out.println("hp는 SmartPhone이 가진 기능을 모두 다 포함하지는 못함");
		}
		
		System.out.println("-----------------------------------------------");
		
		// SmartPhone인스턴스 -> HandPhone(hp2)으로 업캐스팅
		HandPhone hp2 = new SmartPhone("갤럭시노트20", "010-1234-5678", "안드로이드");
		hp2.call();
		hp2.sms();
//		hp2.kakaoTalk(); // 참조 영역 축소로 인해 SmartPhone기능 사용을 포기해야함
		
		// hp2는 SmartPhone입니까?
		if(hp2 instanceof SmartPhone) {
			System.out.println("hp2는 SmartPhone이다!");
			System.out.println("그러므로 hp2는 SmartPhone으로 형 변환이 가능하다!");
			
//			SmartPhone sp2 = hp2; // 자동 형 변환 불가능
			SmartPhone sp2 = (SmartPhone) hp2;
			System.out.println("hp2는 SmartPhone이 가지는 모든 기능을 포함한다!");
			sp2.call();
			sp2.sms();
			sp2.kakaoTalk();
		} else {
			System.out.println("hp2는 SmartPhone이 아니다!");
		}
		
		System.out.println("===============================================");
		
		Parent p = new Child(); // 업캐스팅
		
		// Parent p -> Child c로 다운캐스팅을 바로 수행하지 않고
		// instanceof연산자를 통해 검사 후 수행하는 것이 안전하다!
		
		if(p instanceof Child) {
			System.out.println("p는 Child이다!");
			
			// Parent p -> Child c로 변환
			Child c = (Child)p;
			c.parentPrn();
			c.childPrn();
		} else {
			System.out.println("p는 Child가 아니다!");
		}
	
		
	}

}

class HandPhone{
	String model;
	String number;

	//	public HandPhone() {}
	
	public HandPhone(String model, String number) {
		super();
		this.model = model;
		this.number = number;
	}
	
	public void call() {
		System.out.println("전화 기능!");
	}
	public void sms() {
		System.out.println("문자 기능!");
	}
	
	
}

// HandPhone을 상속받는 SmartPhone클래스 정의

class SmartPhone extends HandPhone{
	String osName;

	public SmartPhone(String model, String number, String osName) {
		super(model, number); // 슈퍼클래스의 파라미터 생성자를 명시적으로 호출
		this.osName = osName;
	}
	
	public void kakaoTalk() {
		System.out.println("카톡 가능!");
	}
	
	
	
	
}














