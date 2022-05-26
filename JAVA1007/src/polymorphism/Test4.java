package polymorphism;

public class Test4 {

	public static void main(String[] args) {
		
		Car car = new Car("KIA", "K5", 240);
		car.speedUp(50);
		car.speedUp(250);
		System.out.println("-------------------");
		car.speedDown(50);
		car.speedDown(250);
		
		System.out.println("===================");
		
		Car myCar; // 슈퍼클래스 타입 변수 선언
		// 업캐스팅을 통한 다형성 활용
		// Taxi, Truck 인스턴스를 Car타입으로 업캐스팅하여 각 인스턴스를 다루기
		System.out.println("----------- Taxi -> Car 업 캐스팅 -----------");
		myCar = new Taxi("KIA", "K5", 240, "License1234");
		// 업캐스팅 후에는 상속된 멤버(공통)에만 접근 가능하므로
		myCar.speedUp(50); // 속력 증가와
		myCar.speedDown(100); // 속력 감소 기능은 접근 가능하지만
		// Taxi클래스의 멤버에는 접근이 불가능하다!
//		myCar.lift(); 오류발생!
//		myCar.drop(); 오류발생!
		
		System.out.println("----------- Taxi -> Car 업 캐스팅 -> Taxi 다운캐스팅 -----------");
		// Taxi 타입 변수 taxi 선언 후 myCar인스턴스를 전달
		// 자동형변환 불가 
		Taxi taxi = (Taxi)myCar;// Car -> Taxi 다운캐스팅
		taxi.speedUp(50);
		taxi.speedDown(100);
		taxi.lift();
		taxi.drop();
		
		System.out.println("----------- Truck -> Car 업 캐스팅 -----------");
		myCar = new Truck("KIA", "K5", 240);
		myCar.speedUp(50); // 속력 증가와
		myCar.speedDown(100); // 속력 감소 기능은 접근 가능하지만
//		myCar.dump(); 오류발생!
		
		System.out.println("----------- Truck -> Car 업 캐스팅 -> Truck 다운캐스팅-----------");
		Truck truck = (Truck)myCar; // 다운캐스팅
		truck.speedUp(50);
		truck.speedDown(100);
		truck.dump();
		
		System.out.println("=====================================");
		
		Driver driver = new Driver();
		driver.drive(taxi);
		driver.drive(truck);
	}

}


// 운전자(Driver)클래스 정의
// => 운전자와 자동차는 상속관계(is-a)가 아님
// => 운전자가 자동차를 '소유'하고 있으므로 포함관계(has-a)라고 할 수 있다!
class Driver{
	Car car;
	// 운전(drive) 메서드 정의
	// => 모든 운전자는 기본적으로 '자동차'를 모두 다를 수 있다!
	// => 파라미터 : 각 자동차들을 공통으로 다루기 위한 자동차 객체(Car타입 변수 car)를 전달받음
	//				 즉, 모든 각각의 자동차를 Car타입으로 업캐스팅하여 전달받음
	// => 리턴값 : 없음
	public void drive(Car car) { // Taxi or Truck -> Car 업캐스팅
		this.car = car;
		
		// 운전자는 차량의 종류에 관계없이 '자동차'를 '운전(속력 증가&감소)'만 하면 된다!
		System.out.println("운전자(Driver)가 운전을 한다!");
		car.speedUp(50);
		car.speedDown(100);
	}
	
}






/*
 * Car 클래스 정의
 * 멤버변수
 * - 제조사 (company,문자열)
 * - 모델명 (modelName, 문자열)
 * - 현재속력(speed, 정수)
 * - 최대속력(maxSpeed, 정수)
 *  
 * 메서드
 * - 속력 증가(speedUp(), 파라미터 int타입 speed, 리턴값 없음)
 * 		=> 전달받은 속력(speed)을 현재속력(speed)에 누적
 * 		   단, 현재속력(speed)이 최대속력(maxSpeed)보다 클 경우
 * 		   "최대속력 도달!"을 출력하고, 현재속력을 최대속력으로 변경(고정)
 * 
 * - 속력 감소(speedDown(), 파라미터 int타입 speed, 리턴값 없음)
 * 		=> 전달받은 속력(speed)을 현재속력(speed)에 차감
 * 		   단, 현재속력(speed)이 0보다 작음 경우
 * 		   "정지!"을 출력하고, 현재속력을 0으로 변경(고정)
 */



class Car {
	String company;
	String modelName;
	int speed;
	int maxSpeed;
	
	public Car(String company, String modelName, int maxSpeed) {
		super();
		this.company = company;
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
	}

	public void speedUp(int speed) {
		this.speed += speed;
		if(this.speed > maxSpeed) {
			System.out.println("최대속력 도달!");
			this.speed = maxSpeed;
		}
		
		System.out.println("현재속력 : " + this.speed + "km/h");
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
		if(this.speed < 0) {
			System.out.println("정지");
			this.speed = 0;
		}
		
		System.out.println("현재속력 : " + this.speed + "km/h");
	}
}

/*
 * Taxi클래스 정의 - Car클래스 상속
 * 멤버변수
 * - 면허번호(licenseNo, 문자열)
 * 
 * 생성자
 * - 제조사, 모델명, 최대속력과 함께 면허번호(licenseNo)를 전달받아 초기화하는 생성자 정의
 *   => 단, 제조사와 모델명과 최대속력은 슈퍼클래스인 Car클래스에서 초기화하도록 중복 제거
 * 메서드
 * - lift() : "승객 승차" 출력(파라미터 없음, 리턴값 없음)
 * - drop() : "승객 하차" 출력(파라미터 없음, 리턴값 없음)
 */

class Taxi extends Car {
	String licenseNo;
	
	public Taxi(String company, String modelName, int maxSpeed, String licenseNo) {
		super(company, modelName, maxSpeed);
		this.licenseNo = licenseNo;
	}
	public void lift() {
		System.out.println("승객 승차!");
	}
	public void drop() {
		System.out.println("승객 하차!");
	}

	// -------- Car클래스의 speedUp(), speedDown() 메서드 오버라이딩 --------
	
	@Override
	public void speedUp(int speed) {
		System.out.println("Taxi의 방법으로 속력 증가!");
	}
	@Override
	public void speedDown(int speed) {
		System.out.println("Taxi의 방법으로 속력 감소!");
	}
	
	
}

// Truck 클래스 정의 - Car클래스 상속

class Truck extends Car{

	public Truck(String company, String modelName, int maxSpeed) {
		super(company, modelName, maxSpeed);
	}
	
	public void dump() {
		System.out.println("짐칸의 모든 물건을 쏟아붓기!");
	}
	
	@Override
	public void speedUp(int speed) {
		System.out.println("Truck의 방법으로 속력 증가!");
	}
	@Override
	public void speedDown(int speed) {
		System.out.println("Truck의 방법으로 속력 감소!");
	}
}






