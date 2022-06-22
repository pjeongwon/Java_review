package oop_interface;

public class Ex2 {
	
	public static void main(String[] args) {
		// 인터페이스도 추상클래스와 마찬가지로 슈퍼클래스 타입 참조변수로 활용가능
		// 강아지 -> 동물 업캐스팅하여 다형성 활용(울음소리()메서드 호출)
		
		동물 동물 = new 강아지();
		동물.울음소리();
		
		// 고양이 -> 동물 업캐스팅하여 다형성 활용(울음소리() 메서드 호출)
		동물 = new 고양이();
		동물.울음소리();
		
		System.out.println("============================");
		Car car = new DieselCar();
		car.addFuel();
		
		car = new ElectricCar();
		car.addFuel();
		
		car = new HorseCar();
		car.addFuel();
	}

}

// 동물인터페이스를 상속받아 구현하는 강아지 클래스 정의
class 강아지 implements 동물{

	// 슈퍼클래스에 해당하는 동물 인터페이스가 가진 추상메서드 울음소리()를 구현하여
	// 서브클래스에서 상세한 코드를 기술함
	@Override
	public void 울음소리() {
		System.out.println("강아지는 멍멍!");
	}
	
}

class 고양이 implements 동물{

	@Override
	public void 울음소리() {
		System.out.println("고양이는 야옹!");
	}
	
}

// ===================================================================

/*
 * Car 인터페이스 정의
 * - 모든 자동차(Car)는 연료를 주입(addFuel())한다.
 * - 단, 각 자동차마다 휘발유 주유, 경유 주유, 전기 충전 등의 방법이 다르다.
 * 	 따라서, 부모인 Car의 addFuel()메서드를 직접 구현하지 않고
 * 	 추상메서드 형태로 제공하면 서브클래스인 각 자동차마다 추상메서드를 구현하여
 * 	 해당 차량에 맞는 연료 주입형태를 구현하면 된다!
 * - 서브클래스 정의(Car인터페이스 상속받아 구현)
 * 	 1) DieselCar의 addFuel() : "주유소에서 디젤 연료 주입!" 출력
 * 	 2) ElectricCar의 addFuel() : "충전소에서 전기 충전!" 출력
 */


interface Car{
	public void addFuel(); // abstract 생략되어 있음 = 추상메서드
	
}

class DieselCar implements Car{

	@Override
	public void addFuel() {
		System.out.println("주유소에서 디젤 연료 주입!");
	}
}
class ElectricCar implements Car{

	@Override
	public void addFuel() {
		System.out.println("충전소에서 전기 충전!");
	}
}

// 만약, HorseCar클래스를 추가할 경우 
// '자동차'이므로 Car인터페이스를 구현하도록하고, addFuel()메서드를 오버라이딩하여
// "말에게 당근 공급!" 출력하면 된다!
// => 즉, addFuel()메서드를 오버라이딩하지 않고는 상속이 불가능하므로 코드의 강제성 부여를 통해
//    통일성을 향상시킬 수 있으며, 안정성도 향상됨!

class HorseCar implements Car{

	@Override
	public void addFuel() {
		System.out.println("말에게 당근 공급!");
	}
}











