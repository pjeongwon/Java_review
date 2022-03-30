package oop_basic;

public class Test2_2 {

	public static void main(String[] args) {
		
	
		
// Car 클래스 인스턴스 생성 후 다음과 같이 멤버변수 초기화하여 출력
		// 차종 : SONATA
		// 차량번호 : 12가1234
		// 최대속력 : 240 km/h
		// 현재속력 : 0 km/h
		
		// 차량 정보를 출력하는 carInfo() 메서드를 호출하여 차종, 차량번호, 속력정보 출력
		car car1 = new car();
		car1.carName = "SONATA";
		car1.carNumber = "12가1234";
		car1.maxSpeed = 240;
		car1.speed = 0;
		
		car1.carInfo();
		
		System.out.println("=========================");

		// --------------------- 차량 속력 컨트롤 --------------------
		// 50km/h 만큼 속력 증가시키키 : 현재속력 0km/h + 50km/h = "현재속력 50 km/h" 출력
		car1.speedUp(50);
		System.out.println("=========================");
		// 250km/h 만큼 속력 증가시키키 : 현재속력 50km/h + 250km/h = 300km/h 이지만
		// 최대속력이 240 km/h 이므로 "최대 속력 도달" 출력 후, "현재속력 240 km/h" 출력
		// => 지금부터 증가되는 속력이 얼마이건간에 무조건 최대 속력 도달 상태.
		
		car1.speedUp(250);
		System.out.println("=========================");
		// 50km/h 만큼 속력 감소시키키 : 현재속력 240km/h - 50km/h = "현재속력 190 km/h" 출력
				
		car1.speedDown(50);
		System.out.println("=========================");
		// 300km/h 만큼 속력 감소시키키 : 현재속력 190km/h - 300km/h = -110km/h 이지만
		// 차량 정지 조건이 0 km/h 보다 작거나 같을 경우이므로 "차량 정지" 출력 후, 
		// "현재속력 0 km/h" 출력

		// => 지금부터 감소되는 속력이 얼마이건간에 무조건 차량 정지 상태.
		car1.speedDown(300);
		System.out.println("=========================");
		
		
	}
} // test2_2 끝

/*
 * 자동차(Car) 클래스 정의
 * 
 * 멤버변수
 *   - 차종명(carName, 문자열)
 *   - 차량번호(carNumber, 문자열)
 *   - 최대속력(maxSpeed, 정수)
 *   - 현재속력(speed, 정수)
 *   
 * 메서드
 *   - carInfo() 메서드 정의 : 파라미터 없음, 리턴값 없음
 *     => 차종, 차량번호, 최대속력, 현재속력을 출력
 *   
 *   - speedUp() 메서드 정의 : 파라미터 있음(증가시킬 속력값 value 전달), 리턴값 없음
 *     => 전달받은 속력값(value)을 현재속력(speed)에 누적하고, "현재 속력 : XXX km/h" 출력
 *     => 단, 증가한 현재속력(speed)이 최대속력(maxSpeed)보다 클 경우
 *        "최대 속력 도달!" 출력 후 현재속력(speed)을 최대속력(maxSpeed)으로 변경
 *   
 *   - speedDown() 메서드 정의 : 파라미터 있음(감소시킬 속력값 value 전달), 리턴값 없음
 *     => 전달받은 속력값(value)을 현재속력(speed)에서 차감하고, "현재 속력 : XXX km/h" 출력
 *     => 단, 감소한 현재속력(speed)이 0보다 작거나 같을 경우
 *        "차량 정지!" 출력 후 현재속력(speed)을 0으로 변경
 */
class car {
	String carName;
	String carNumber;
	int maxSpeed;
	int speed;
	
	public void carInfo() {
		System.out.println("차종 : " + carName);
		System.out.println("차량번호 : " + carNumber);
		System.out.println("최대속력 : " + maxSpeed);
		System.out.println("현재속력 : " + speed);
	}
	
	public void speedUp(int value) {
		speed += value;
		if(speed > maxSpeed) {
			System.out.println("최대속력 도달!");
			speed = maxSpeed;
			System.out.println("현재속력 : " + speed + "km/h");
		}
		else {
			System.out.println("현재속력 : " + speed + "km/h");
		}
	}
	
	public void speedDown(int value) {
		speed -= value;
		if(speed <= 0) {
			System.out.println("차량 정지!");
			speed = 0;
			System.out.println("현재속력 : " + speed + "km/h");
		}
		else {
			System.out.println("현재속력 : " + speed + "km/h");
		}
		
	}
	
	
}
