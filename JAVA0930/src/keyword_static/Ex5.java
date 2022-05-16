package keyword_static;

import sun.security.jca.GetInstance.Instance;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 싱글톤 디자인 패턴(Singleton Design Pattern)
		 * - 단 하나의 인스턴스만을 생성하여 공유하도록 하는 프로그래밍 기법
		 * - 외부에서 클래스의 인스턴스 생성을 못하도록 차단하고
		 *   클래스 내에서 직접 인스턴스를 생성하여 외부에 리턴하는 기법
		 * - 생성되어 리턴되어 인스턴스를 전달받아 사용하므로
		 *   누구나 단 하나의 인스턴스만을 공유하여 사용해야함
		 * 
		 * < 패턴 작성 규칙 >
		 * 1. 외부에서 클래스의 인스턴스 생성을 차단(= 생성자를 호출하지 못하도록 차단)
		 *    => 생성자의 접근제한자를 private으로 선언
		 * 2. 클래스 내부에서 인스턴스를 직접 생성하여 멤버변수(instance)에 저장
		 *    => 클래스가 로딩될 때 변수도 함께 로딩되어 인스턴스가 생성되도록 static변수로 선언
		 *    => 외부에서 멤버변수를 함부로 변경할 수 없도록 접근제한자를 private로 선언
		 * 3. 생성한 인스턴스를 외부로 리턴하기 위해 Getter메서드 정의
		 * 	  => 외부로부터 변경할 값은 전달받지 않으므로 Setter메서드는 불필요
		 */
		
		// SingletonClass클래스의 인스턴스 생성
//		SingletonClass sc = new SingletonClass(); // 오류발생! 생성자 호출 불가!
		
		// SingletonClass 클래스의 static메서드인 getInstance()메서드를 호출하여 
		// 생성되어 있는 인스턴스를 리턴받아 저장하기
		// => 클래스명을 사용하여 static메서드에 접근 가능
		SingletonClass sc = SingletonClass.getInstance(); 
		sc.print();
	
		// 만약, 멤버변수 instance가 private접근제한자가 아닐 경우
//		SingletonClass.instance = null; // null값으로 초기화가 가능하므로 문제 발생 소지 있음
		// 따라서, 멤버변수는 private접근제한자를 사용하여 보호해야할 필요가 있음
		// (Setter 메서드도 정의하지 않기 때문에 외부에서 변경 자체가 불가능해짐)
		
		// SingletonClass클래스의 인스턴스가 유일한 인스턴스인지 파악해보기
		
		SingletonClass sc_2 = SingletonClass.getInstance();
		if(sc == sc_2) { // 두 참조변수에 저장된 주소값이 동일한 경우 = 같은 인스턴스
			System.out.println("sc와 sc_2 인스턴스는 같다!");
		} else { // 두 참조변수에 저장된 주소값이 다를 경우 = 다른 인스턴스
			System.out.println("sc와 sc_2 인스턴스는 다르다!");
		}
		
		System.out.println("-------------------------------------------------");
		
		SingletonClass2 sc2 = SingletonClass2.getInstance();
		sc2.print();
	}

}


class SingletonClass{
	
	// 1. 생성자 정의 시 private 접근제한자를 사용하여 외부로부터 접근을 차단
	private SingletonClass() {} 
		
	// 2. 클래스 내부에서 인스턴스를 직접 생성하여 멤버변수(instance)에 저장
	//	  => 클래스가 메모리에 로딩될 때 멤버변수가 로딩돼 인스턴스가 생성될 수 있도록 static변수로 선언
	//	  => 외부에서 멤버변수 instance에 직접 접근이 불가능하도록 접근제한자 private로 선언
	private static SingletonClass instance = new SingletonClass();

	// 3. Getter 메서드를 정의하여 생성된 인스턴스를 외부로 리턴(Setter 정의 x)
	public static SingletonClass getInstance() {
		return instance;
	}
	
	// -----------------------------------------------------------
	// 인스턴스 확인을 위한 임시 메서드(일반 메서드) 정의
	public void print() {
		System.out.println("SingletonClass 인스턴스의 print() 메서드 호출됨!");
	}
	
}


class SingletonClass2{
	/*
	 * ● 실제 작업 시 순서
	 * 
	 * 1. 자신의 인스턴스를 생성하여 멤버변수 instance에 저장
	 * 	  => 변수의 접근제한자는 private, 클래스와 함께 로딩되도록 static변수로 선언
	 * 2. 생성자 정의
	 *    => 생성자의 접근제한자는 private 
	 * 3. 생성된 인스턴스를 외부로 리턴
	 *    => 1번에서 선언한 멤버변수에 대해 Getter메서드 정의
	 * 
	 * 
	 */
	
	
	/*
	private static SingletonClass2 instance = new SingletonClass2();
	
	private SingletonClass2() {}
	
	public static SingletonClass2 getInstance() {
		return instance;
	}


	// -----------------------------------------------------------
	// 인스턴스 확인을 위한 임시 메서드(일반 메서드) 정의
	public void print() {
		System.out.println("SingletonClass2 인스턴스의 print() 메서드 호출됨!");
	}
	*/
	
	private static SingletonClass2 instance;
	
	private SingletonClass2() {}
	
	public static SingletonClass2 getInstance() {
		if(instance == null) {
			instance = new SingletonClass2();
		}
		return instance;
	}
	
	// -----------------------------------------------------------
	// 인스턴스 확인을 위한 임시 메서드(일반 메서드) 정의
	public void print() {
		System.out.println("SingletonClass2 인스턴스의 print() 메서드 호출됨!");
	}

}
