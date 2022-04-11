package access_modifier;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * private 멤버에 대한 접근 방법
		 * - 클래스 내에서 private 접근제한자가 적용된 멤버는 외부에서 접근이 불가능함
		 * - 멤버변수의 경우 외부에서 함부로 값을 변경하지 못하도록 차단하는데
		 *   이 때, 메서드를 제공하여 외부에서 간접적으로 멤버변수에 접근할 수 있도록 할 수 있음
		 * - private 멤버변수에 대해 접근할 수 있도록 제공하는 2가지 메서드
		 * 	 Getter / Setter 메서드라고 함
		 * - 외부에서 자유롭게 접근할 수 있도록 메서드 접근제한자를 public으로 선언함
		 * 
		 * 1. Getter 메서드 
		 * 	  - 객체 내의 멤버변수 값을 외부로 리턴하는 용도의 메서드 
		 * 	  - 기본적으로 외부로부터 전달받을 값은 없고, 리턴할 데이터만 존재하므로
		 *      매개변수는 없고, 리턴값만 있는 메서드 형식으로 정의
		 *    - 메서드명은 getXXX() 형식으로 지정 === < 관례적인 약속 >
		 *      => getXXX()의 XXX은 멤버변수의 이름 사용
		 *         ex) String 타입 멤버변수 name을 리턴하는 Getter의 형식
		 *         	   Public String getName(){
		 *         		 // 경우에 따라 메서드 내에서 부가적인 작업 수행할 수도 있음
		 *         	     return name; // 멤버변수 name값을 외부로 리턴
		 *         	   }
		 *         
		 * 2. Setter 메서드
		 * 	  - 객체 내의 멤버변수에 외부로부터 전달받은 데이터 저장하는 용도의 메서드
		 * 	  - 기본적으로 외부로부터 데이터를 전달받아 초기화하는 용도이므로
		 * 		매개변수만 있고, 리턴값은 없는 메서드 형식으로 정의        
		 *    - 메서드명은 setXXX() 형식으로 지정 === < 관례적인 약속 >
		 *      => setXXX()의 XXX은 멤버변수의 이름 사용
		 *         ex) String 타입 멤버변수 name을 초기화하는 Setter의 형식
		 *         	   Public void setName(String n){
		 *         		 // 경우에 따라 메서드 내에서 추가적인 작업 수행할 수도 있음
		 *         	     name = n;
		 *         	   }  
		 *         
		 */
		
		// PrivatePerson2 인스턴스 생성
		PrivatePerson2 pp = new PrivatePerson2();
		
		// private 멤버변수에 직접 접근할 경우 오류 발생!
//		pp.name = "홍길동"; // 외부에서 보이지 않으므로 접근 불가
//		System.out.println("이름 : " + pp.name); //// 외부에서 보이지 않으므로 접근 불가 
		
		// 멤버변수에 데이터를 전달하려면 Setter 호출 필요
		pp.setName("홍길동");
		
		// 멤버변수로부터 데이터를 꺼내려면 Getter 호출 필요
		System.out.println("이름 : " + pp.getName());
		
		// 멤버변수 age에 접근하여 초기화 및 출력
		pp.setAge(20);
		System.out.println("나이 : " + pp.getAge());
		System.out.println("----------------");
		pp.setAge(-20); // 잘못된 범위의 데이터가 입력될 경우 검증을 통해 오류메시지 출력 가능
		System.out.println("나이 : " + pp.getAge());
	}

}

class PrivatePerson2{
	// 멤버변수는 외부에서 함부로 접근하지 못하도록 보호해야하므로 접근제한다 private 적용
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// Getter / Setter 자동 생성 단축키 : Alt + Shift + S -> R
	
	
	
	
	//----------------------------------------------------------------------
	// 멤버변수에 간접적으로 접근하도록 하기 위해 Getter / Setter 정의
	// => 같은 클래스 내에서 private 접근제한자가 적용된 멤버에도 자유롭게 접근 가능함
	// 1. Getter 정의(매개변수는 없고, 리턴값만 있는 메서드)
	// 1) 멤버변수 name에 대한 Getter
//	public String getName() {
//		return name;
//	}
	
	// 2) 멤버변수 age에 대한 Getter
//	public int getAge() {
//		return age;
//	}

	// 2. Setter 정의(매개변수만 있고, 리턴값은 없는 메서드)
	// 1) 멤버변수 name에 대한 Setter
//	public void setName(String newName) {
//		name = newName;
//	}
//	// 2) 멤버변수 age에 대한 Setter
//	public void setAge(int newAge) {
//		age = newAge;
//	}
	
//	public void setAge(int newAge) {
//		// 예를 들어, 나이에 음수가 입력될 경우 멤버변수를 직접 변경하면 제어할 방법이 없지만
//		// Setter를 사용할 경우 값을 저장하기 전 사전에 검사를 수행할 수도 있다.
//		// 전달받은 나이(newAge)가 0보다 크거나 같을 경우에만 초기화를 수행하고
//		// 아니면 "나이 입력 오류!" 메시지 출력
//		if(newAge >= 0) {
//			age = newAge;
//		} else {
//			System.out.println("나이 입력 오류!");
//		}
//	}

}










