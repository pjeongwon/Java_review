package polymorphism;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 직원(Employee), 매니저(Manager), 엔지니어(Engineer) 클래스 정의
		 * - 매니저와 엔지니어는 직원을 상속받아 정의
		 * - 각 직원의 세금을 메서드를 통해 계산을 해야하며, 
		 *   직원마다 세율이 다르다고 가정
		 *   (직원의 기본 세율, 매니저와 엔지니어의 특수 세율이 존재한다고 가정)
		 * 직원(Employee)의 세금 계산 방법
		 * 1. 직원을 비롯한 모든 클래스에서 세금을 계산하는 메서드 각각 정의
		 *    => 기본적인 세금 계산 코드들의 중복이 발생
		 *    => 각 직원마다 세금을 계산하는 메서드명이 다르므로 코드의 통일성이 저하됨
		 * 
		 * 2. 슈퍼클래스인 Employee클래스에서 세금 계산 메서드(employeeTax())를 정의하고
		 *    => 서브클래스(Manager, Engineer)에서는 해당 메서드를 상속받아 각자의 기능을 오버라이딩
		 * 
		 * 3. 슈퍼클래스인 Employee클래스에서 모든 서브클래스의 세부 기능까지 작성
		 * 	  => 슈퍼클래스의 메서드(allTax())를 정의할 때   
		 *    	 매개변수로 슈퍼클래스 타입 변수를 선언하고
		 *       각 인스턴스에서 해당 메서드 호출 시 업캐스팅을 통해 자신의 인스턴스를 전달하면
		 *       슈퍼클래스의 메서드에 서브클래스의 인스턴스까지 전달 가능하게 됨
		 *    => 슈퍼클래스 타입으로 업캐스팅 후에는 참조영역 축소로 서브클래스 멤버에 접근이 불가
		 *       따라서, 서브클래스의 멤버에 접근하여 상세 계산까지 수행하려면
		 *       이미 업캐스팅 된 객체를 슈퍼클래스에서 다시 다운캐스팅 수행하면 된다!
		 *       (단, 다운캐스팅 전 안전하게 수행되도록 검사를 수행할면 instanceof 연산자 사용)
		 *    => 결국, 업캐스팅 된 객체를 다시 다운캐스팅하여
		 *       각 클래스에서 수행하는 작업들을 기술하면
		 *       슈퍼클래스에서 서브클래스의 모든 기능까지 제어가 가능해진다! 
		 *           
		 */
		
		// 2번 방법을 사용하여 다형성 활용
		Employee emp = new Employee(); // 일반직원
		emp.employeeTax();
		System.out.println("-------------------");
		
		// 매니저의 세금 계산을 위해 Manager인스턴스 생성
		// => 다형성 활용을 위해 Employee타입으로 업캐스팅 가능
		emp = new Manager(); // Manager -> Employee 업캐스팅
		// Employee클래스의 employeeTax()메서드를 Manager클래스에서 오버라이딩했기 때문에
		// 업캐스팅 후에도 Manager 세금 계산을 위해 employeeTax()메서드 호출이 가능하다!
		emp.employeeTax();
		
		System.out.println("-------------------");
		
		// 엔지니어의 세금 계산을 위해 Engineer인스턴스 생성
		// => 다형성 활용을 위해 Employee타입으로 업캐스팅 가능
		emp = new Engineer();
		// 업캐스팅 후에도 공통 메서드 employeeTax()메서드 호출이 가능
		emp.employeeTax();
	}

} //-----------------------------------------------------------------------


class Employee{
	// 공통 직원(Employee)의 세율을 변수에 저장
	double employeeTaxRate = 1.5;
	
	// 직원의 세금을 계산하기 위한 employeeTax()메서드 정의
	public void employeeTax() {
		System.out.println("Employee 세금 계산!");
		System.out.println("직원의 세율 : " + employeeTaxRate);
	}
	
	//----------------------------------------------
	// 3. 슈퍼클래스인 Employee클래스에서 모든 서브클래스의 세부 기능까지 작성하는 방법
	//     => Employee클래스(슈퍼클래스)에서 allTax()메서드 정의
	//	   => 메서드 파라미터로 Employee, Manager, Engineer인스턴스를 모두 전달하기 위해서
	//        매개변수 타입을 슈퍼클래스 타입인 Employee타입으로 선언
	//     => 모든 인스턴스가 Employee타입으로 전달(Manager&Engineer -> Employee업캐스팅)
	public void allTax(Employee emp) {
		// 업캐스팅 후에는 참조영역 축소로 서브클래스 멤버 접근이 불가능하므로
		// 각 클래스의 고유 멤버에 접근을 위해 다시 다운캐스팅 필요
		// => 이 때, 안전한 변환을 위해 instanceof 연산자로 타입 검사 후 변환하는 것이 좋다!
		// Employee타입을 제외한 Manager, Engineer타입은 판별 후 변환 수행
		// 1) emp는 Manager인가?
		
		if(emp instanceof Manager) {
			// emp변수로는 Manager객체의 멤버에 접근이 불가능하지만
			// 다운캐스팅을 통해 참조영역 확대로 접근이 가능해진다.
			Manager man = (Manager)emp;

			// 공통된 멤버는 물론
			System.out.println("Employee 세금 계산!");
			System.out.println("직원의 세율 : " + man.employeeTaxRate);
			
			// 서브클래스만의 멤버에도 접근 가능함
			System.out.println("Manager의 세금 계산 추가!");
			System.out.println("직원의 세율 : " + man.managerTaxRateBonus);
		}
		
		// 2) emp는 Engineer인가?
		else if(emp instanceof Engineer) {
			// emp변수로는 Engineer객체의 멤버에 접근이 불가능하지만
			// 다운캐스팅을 통해 참조영역 확대로 접근이 가능해진다.
			Engineer eng = (Engineer)emp;
			// 공통된 멤버는 물론
			System.out.println("Employee 세금 계산!");
			System.out.println("직원의 세율 : " + eng.employeeTaxRate);
						
			// 서브클래스만의 멤버에도 접근 가능함
			System.out.println("Manager의 세금 계산 추가!");
			System.out.println("직원의 세율 : " + eng.engineerTaxRateBonus);
		}
			
		// 3) emp는 Employee인가?
		else if(emp instanceof Employee) {
			// 주의! Employee클래스가 상위타입이므로
			// if문 등과 instanceof연산자 조합하여 판별 시 마지막에 판별해야한다!
			// 일반 직원의 경우 기본 세금만 계산하면 되므로 employeeTax()메서드만 호출
			// (단, 현재 오버라이딩을 통해 코드를 작성해놓은 상태이므로 임시로 직접 작성)
			System.out.println("Employee 세금 계산!");
			System.out.println("직원의 세율 : " + employeeTaxRate);
		}
		
	}
}

class Manager extends Employee{
	// 매니저만의 세율을 추가로 변수에 저장한다고 가정
	double managerTaxRateBonus = 0.5;
	
	// 1. 매니저의 세금 계산을 위한 managerTax()메서드를 별도로 정의하는 경우
	public void managerTax() {
		System.out.println("Manager 세금 계산!");
		System.out.println("직원의 세율 : " + employeeTaxRate);
		System.out.println("매니저의 추가 세율 : " + managerTaxRateBonus);
	}
	
	// 2. 직원(employee)클래스로부터 상속받은 세금 계산 메서드 employeeTax()메서드를
	//    오버라이딩을 통해 매니저의 세금 계산을 위한 코드를 별도로 정의
	@Override
	public void employeeTax() {
		System.out.println("Manager 세금 계산!");
//		System.out.println("직원의 세율 : " + employeeTaxRate);
		// 오버라이딩 후에도 여전히 직원의 기본 세금 계산 코드가 중복되므로
		// 슈퍼클래스의 employeeTax()메서드를 호출하여 기본적인 코드를 재사용하면
		// 서브클래스의 메서드에서는 추가적인 기능만 따로 구현함으로써 코드 중복이 제거될 수 있다!
		super.employeeTax();
		System.out.println("매니저의 추가 세율 : " + managerTaxRateBonus);
	}
	
}

class Engineer extends Employee{
	// 엔지니어만의 세율을 추가로 변수에 저장한다고 가정
	double engineerTaxRateBonus = 0.5;
	
	// 1. 엔지니어의 세금 계산을 위한 engineerTax()메서드를 별도로 정의하는 경우
	public void EngineerTax() {
		System.out.println("Engineer 세금 계산!");
		System.out.println("직원의 세율 : " + employeeTaxRate);
		System.out.println("엔지니어의 추가 세율 : " + engineerTaxRateBonus);
	}
	
	// 2. 직원(employee)클래스로부터 상속받은 세금 계산 메서드 employeeTax()메서드를
		//    오버라이딩을 통해 매니저의 세금 계산을 위한 코드를 별도로 정의
		@Override
		public void employeeTax() {
			System.out.println("Engineer 세금 계산!");
//			System.out.println("직원의 세율 : " + employeeTaxRate);
			// 오버라이딩 후에도 여전히 직원의 기본 세금 계산 코드가 중복되므로
			// 슈퍼클래스의 employeeTax()메서드를 호출하여 기본적인 코드를 재사용하면
			// 서브클래스의 메서드에서는 추가적인 기능만 따로 구현함으로써 코드 중복이 제거될 수 있다!
			super.employeeTax();
			System.out.println("매니저의 추가 세율 : " + engineerTaxRateBonus);
		}
	
}












