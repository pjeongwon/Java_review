package abstract_class;

public class Test {

	public static void main(String[] args) {

		SportsCar sc = new SportsCar("AUDI", "R8", 300);
		sc.speedUp(320);
		sc.speedDown(400);
		sc.boosterMode = true;
		sc.speedUp(340);
		
		System.out.println("-----------------------------------");
		// Car클래스는 추상클래스이므로 직접적인 인스턴스 생성은 불가능하나
		// 서브클래스 인스턴스를 참조하는 다형성을 활용할 수는 있다!
		// SportsCar -> Car 타입으로 업캐스팅하여 다형성 활용
		Car car = sc; // 업캐스팅
		sc.speedUp(320);
		sc.speedDown(320);
		
		
		System.out.println("======================================");
		
		Taxi taxi = new Taxi("HYUNDAI", "SONATA", 240);
		taxi.speedUp(50);
		taxi.speedDown(100);
		car = taxi;
	}

}

/*
 * 모든 자동차들의 공통 슈퍼클래스인 Car클래스 정의
 * - 멤버변수 : 제조사(compnay, 문자열), 모델명(modelName, 문자열)
 *              현재속력(speed, 정수), 최대속력(maxSpeed, 정수)
 *              => 단, 최대속력은 한 번 설정하면 불변이므로 final선언 가능
 * - 생성자 : 제조사, 모델명, 최대속력을 전달받아 초기화
 * - 메서드(추상메서드)
 *   1) 속력 증가(speedUp()) : 누구나 접근 가능, 파라미터(speed, 정수형), 리턴값 없음
 *   1) 속력 감소(speedDown()) : 누구나 접근 가능, 파라미터(speed, 정수형), 리턴값 없음          
 *   
 */

abstract class Car{
	String company;
	String modelName;
	int speed;
	final int MAX_SPEED; // 불변이므로 final상수로 선언(blank final이므로 생성자에서 초기화 필수)
	
//	public Car() {
//		// 만약, 파라미터가 없는 기본 생성자를 정의하더라도
//		// final상수인 MAX_SPEED는 반드시 초기화를 수행해야한다!
//		MAX_SPEED = 200;
//	}
	
	public Car(String company, String modelName, int MAX_SPEED) {
		super();
		this.company = company;
		this.modelName = modelName;
		this.MAX_SPEED = MAX_SPEED;
	}
	// 추상메서드 정의 => 서브클래스에서 사용할 메서드의 가이드라인 제시
		public abstract void speedUp(int speed);
		public abstract void speedDown(int speed);
	// What(O), How(X) -> SubClass
}

/*
 * SportsCar클래스 정의 - Car클래스 상속
 * 
 */

class SportsCar extends Car{
	boolean boosterMode;
	
	public SportsCar(String company, String modelName, int MAX_SPEED) {
		// 슈퍼클래스의 기본생성자 없이 파라미터 생성자만 존재하므로
		// 서브클래스 생성자 내에서 슈퍼클래스의 파라미터 생성자를 명시적으로 호출해야함
		super(company, modelName, MAX_SPEED);
		boosterMode = false;
	}

	// 추상클래스인 Car클래스를 상속받은 서브클래스 SportsCar클래스에서는
	// 반드시 추상메서드인 speedUp(), speedDown()메서드를 구현(오버라이딩) 해야한다!
	@Override
	public void speedUp(int speed) {
		this.speed += speed;
		System.out.println("SportsCar의 방식을 속력 증가!");
		
		// boosterMode변수값이 true이면 "부스터로 인해 일시적 최대속력 상승!" 출력 및
		if(boosterMode) {
			System.out.println("부스터로 인해 일시적 최대속력 상승!");
			
			if(this.speed > MAX_SPEED + 20) {
				this.speed = MAX_SPEED + 20;
				System.out.println("부스터 최대 속력 도달" + this.speed + "Km/h"); 
			}
			
		} else {
			// 증가된 현재속력이 최대속력(MAX_SPEED)보다 클 경우 
			// 현재속력을 최대속력으로 고정 및 "최대 속력 도달" 메시지 출력
			if(this.speed > MAX_SPEED) {
				this.speed = MAX_SPEED;
				System.out.println("최대 속력 도달" + this.speed + "Km/h"); 
			}
		}
	}

	@Override
	public void speedDown(int speed) {
		System.out.println("SportsCar의 방식을 속력 감소!");
		this.speed -= speed;
		if(this.speed < 0) {
			this.speed = 0;
			System.out.println("차량 정지!");
		}
	}
	
}

// Taxi 클래스 정의
class Taxi extends Car{

	public Taxi(String company, String modelName, int MAX_SPEED) {
		super(company, modelName, MAX_SPEED);
	}

	@Override
	public void speedUp(int speed) {
		System.out.println("Taxi의 방식을 속력 증가!");
	}

	@Override
	public void speedDown(int speed) {
		System.out.println("Taxi의 방식을 속력 감소!");
	}
	
}







