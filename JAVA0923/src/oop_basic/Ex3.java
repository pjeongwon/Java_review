package oop_basic;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 객체의 내부와 외부에서의 메서드 호출 방법
		 * 1. 객체의 외부(다른 클래스)에서 메서드 호출 시
		 * 	  반드시 해당 클래스의 인스턴스를 생성한 후 참조변수를 통해 메서드에 접근해야함
		 *    ex) car.carInfo();
		 * 
		 * 2. 객체의 내부(자신의 클래스의 다른 메서드)에서 메서드 호출 시
		 * 	  해당 메서드 이름만으로 접근(호출) 가능함
		 *    ex) carInfo(); 
		 */
		
		// 외부클래스인 Car클래스의 메서드 호출을 위해 인스턴스 생성 
		// 생성자 파라미터 3개에 맞춰 데이터(차종, 차량번호, 최대속력) 전달
		Car car = new Car("그랜져", "12가 1234", 260);
		car.carInfo();
		
		car.speedUp(50);
	}

}

class Car {
	String carName;
	String carNumber;
	int maxSpeed;
	int speed;
	
	
	public Car(String carName, String carNumber, int maxSpeed) {
		super();
		this.carName = carName;
		this.carNumber = carNumber;
		this.maxSpeed = maxSpeed;
	}

//	public Car(String newCarName, String newCarNumber, int newMaxSpeed) {
//		carName = newCarName;
//		carNumber = newCarNumber;
//		maxSpeed = newMaxSpeed;
//	}

	public void carInfo() {
		System.out.println("차종 : " + carName);
		System.out.println("차량번호 : " + carNumber);
		System.out.println("최대속력 : " + maxSpeed + "km/h");
		System.out.println("현재속력 : " + speed + "km/h");
	}

	// 메서드 호출 시 차량의 현재 속력을 출력하는 showCurrentSpeed() 메서드 정의
	// => 파라미터 없음, 리턴값 없음
	public void showCurrentSpeed() {
		System.out.println("현재속력 : " + speed + "km/h");
	}
	
	public void speedUp(int value) {
		speed += value;
		if (speed > maxSpeed) {
			System.out.println("최대속력 도달!");
			speed = maxSpeed;
			System.out.println("현재속력 : " + speed + "km/h");
		} 
		//	System.out.println("현재속력 : " + speed + "km/h");
		// 자신의 클래스 내부에 있는 다른 메서드인 showCurrentSpeed() 메서드를 호출하여
		// 자동차의 현재 속력을 출력하기
		showCurrentSpeed(); // 메서드 명만으로 호출 가능
		
	}

	public void speedDown(int value) {
		speed -= value;
		if (speed <= 0) {
			System.out.println("차량 정지!");
			speed = 0;
			System.out.println("현재속력 : " + speed + "km/h");
		} 
		//	System.out.println("현재속력 : " + speed + "km/h");
		showCurrentSpeed(); // 메서드 명만으로 호출 가능

	}

}
