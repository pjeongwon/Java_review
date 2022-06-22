package oop_interface;

public class Ex6 {

	public static void main(String[] args) {
		// 인터페이스 필요성(장점)
		// 3. 상속관계가 없는 객체끼리의 관계를 부여하여 다형성에 활용 가능
		
		/*
		 * ------------ 상속 관계가 아닌 객체끼리의 사용 시 불편한 점 ------------
		 * SmartPhone과 DigitalCamera는 특정클래스에 대한 상속 관계가 아니므로
		 * 두 클래스의 유일한 공통클래슨느 Object클래스뿐이다.
		 * 따라서, 업캐스팅을 통해 다형성을 적용하려면 Object타입을 사용해야하며
		 * 업캐스팅 후에는 두 객체의 고유 멤버에 접근이 불가능하므로
		 * 다시 다운캐스팅을 통해 각 객체의 고유 멤버에 접근해야한다!
		 */
		// SmartPhone과 DigitalCamera의 공통클래스 = Object클래스(유일함)
		// => 따라서, SmartPhone과 DigitalCamera객체는 Object타입으로 업캐스팅 가능
//		Object obj1 = new SmartPhone();
//		Object obj2 = new DigitalCamera();
		// => Object타입 배열에 SmartPhone, DigitalCamera 인스턴스를 업캐스팅하여 저장
		Object[] objs = {new SmartPhone(), new DigitalCamera()};
		for(int i = 0; i < objs.length; i++) {
			// 배열 내의 각 객체를 꺼내서 Object타입 변수 obj에 저장
			Object obj = objs[i];
			// => 업캐스팅 후에는 참조영역 축소로 인해 서브클래스 전용 멤버에 접근 불가
			// 	  따라서, 충전을 위해 Object타입 객체의 charge()메서드를 호출하려해도
			//    SmartPhone과 DigitalCamera클래스에서 정의한 charge()메서드가 보이지않는다!
//			obj.charge(); // 오류발생! 호출불가!
			
			// 해결책 : instanceof연산자를 사용하여 객체를 변환 가능한지 판별 후
			//			다운캐스팅을 통해 원래 객체 형태로 변환하여 사용해야함
			if(obj instanceof SmartPhone) { // obj가 SmartPhone입니까?
				SmartPhone sp = (SmartPhone) obj; // 강제형변한 필수!
				// 다운캐스팅 후에는 참조영역 확대로 원래 객체 멤버 모두 접근 가능
				sp.charge(); // SmartPhone으로 변환 후에는 충전 가능
			} else if(obj instanceof DigitalCamera) { // obj가 DigitalCamera입니까?
				DigitalCamera dc = (DigitalCamera) obj; // 강제형변한 필수!
				dc.charge();
				
			}
		}
		
		// ----------------------------------------------------------------
		/*
		 * 인터페이스를 통해 상속관계가 아닌 클래스끼리 상속관계 부여 가능
		 * ----------------------------------------------------------------
		 * SmartPhone클래스와 DigitalCamera클래스는 동일한 상속관계가 아니지만,
		 * 두 클래스의 유일한 공통클래스인 Object클래스를 상속받은 상태에서
		 * Chargeable인터페이스를 정의하여 공통 부모로 지정하면
		 * 업캐스팅을 통해 다형성 적용 시 Object타입 외에도 Chargeable타입 지정도 가능함!
		 * => 이 때, Chargeable인터페이스에 charge()메서드를 추상메서드로 정의해두면
		 *    업캐스팅 후에도 고유 멤버인 charge()메서드에 접근이 가능해진다!
		 */
		
		// SmartPhone2클래스와 DigitalCamera2의 공통 부모클래스인 Object가 아닌
		// Chargeable인터페이스 타입으로도 업캐스팅이 가능함!
//		Chargeable c1 = new SmartPhone2();
//		Chargeable c2 = new DigitalCamera2();
		
		Chargeable[] obj2 = {new SmartPhone2(), new DigitalCamera2(), new NotebookPC()}; // 업캐스팅 
		for(int i = 0; i < obj2.length; i++) {
			// 배열에 저장된 객체를 꺼내서 Chargeable타입 변수 c에 저장
			Chargeable c = obj2[i];
			
			// 공통부모인 Chargeable타입으로 업캐스팅 한 후에도
			// 공통 메서드인 charge()메서드에 직접 접근 가능
			// => instanceof 연산자로 타입 판별없이, 다운캐스팅 없이 호출 가능하다!
			c.charge();
		}
	}

}

// ★★★ 전혀 다른 폰과 카메라지만 implements를 통해 충전기는 똑같게 만들 수 있음
// 인터페이스를 통해 상속관계가 아닌 클래스끼리 상속관계 부여 가능
interface Chargeable{
	// 공통 기능인 충전(charge())기능을 추상메서드로 정의
	public void charge(); // 추상메서드
}


// SmartPhone2클래스 정의 시 기존에 다른 클래스를 상속 중인 상태에서도
// 얼마든지 인터페이스 상속은 추가가 가능하다! (class A extends B implements C)
// Phone클래스와 Chargeable인터페이스를 상속받는 SmartPhone2클래스 정의
class SmartPhone2 extends Phone implements Chargeable{
	// Chargeable인터페이스의 추상메서드 charge()와 동일한 메서드가 정의되어 있음
	@Override
	public void charge() {
		System.out.println("SmartPhone 충전!");
	}
}

//Phone클래스와 Chargeable인터페이스를 상속받는 DigitalCamera2클래스 정의
class DigitalCamera2 extends Camera implements Chargeable{
	@Override
	public void charge() {
		System.out.println("DigitalCamera 충전!");
	}
}

// 만약, PC클래스를 상속받는 노트북 클래스를 정의하더라도
// Chargeable 인터페이스만 구현하면 동일한 충전기로 충전 가능하다!

class PC{}

class NotebookPC extends PC implements Chargeable{
	public void charge() {
		System.out.println("NotebookPC 충전!");
	}
}







// ------------ 상속 관계가 아닌 객체끼리의 사용 시 불편한 점 ------------

class Phone{}

class SmartPhone extends Phone {
	public void charge() {
		System.out.println("SmartPhone 충전!");
	}
}

class Camera{}

class DigitalCamera extends Camera {
	public void charge() {
		System.out.println("DigitalCamera 충전!");
	}
}










