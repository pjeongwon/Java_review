package inheritance;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 상속에서의 생성자
		 * - 생성자는 상속되지 않음
		 * 	 => 생성자의 이름은 자신의 클래스명과 동일해야하지만
		 * 		생성자가 상속된다고 가정하면 자신의 클래스명이 아닌
		 * 		부모의 클래스명을 갖는 생성자가 상속되는 것이므로 생성자 규칙에 위배됨
		 * - 서브클래스의 인스턴스 생성(new) 시
		 * 	 서브클래스의 인스턴스 생성 전에 슈퍼클래스의 인스턴스를 먼저 생성한 후
		 * 	 그 다음 서브클래스의 인스턴스를 생성함
		 *   => 서브클래스의 생성자 내에서 첫번째 실행할 코드로
		 *   	슈퍼클래스의 생성자를 호출하게 되며, 슈퍼클래스의 생성자가 모두 실행된 후
		 *  	서브클래스 생성자 내의 코드가 실행됨
		 * - 만약, 슈퍼클래스에서 기본 생성자 없이 파라미터 생성자만 정의했을 경우
		 *   서브클래스에서 슈퍼클래스의 기본 생성자를 찾기 못하므로 오류가 발생함
		 *   따라서, 슈퍼클래스에 기본 생성자를 직접 정의하거나,
		 *   파라미터 생성자를 명시적으로 호출행한다!
		 * 
		 * < Manager클래스 인스턴스 생성시 생성자 호출 및 인스턴스 생성 과정 >
		 * Manager man = new Manager();
		 *  1) new Manager() 코드 실행되어 Manager() 생성자로 이동
		 *  2) 슈퍼클래스인 Employee 의 Employee() 생성자 호출하여 이동
		 *  3) Employee 의 슈퍼클래스인 Object 클래스의 생성자 호출하여 이동
		 *  4) Object 인스턴스 생성되고, 생성자 내의 코드 실행
		 *  5) Employee 인스턴스 생성되고, 생성자 내의 코드 실행
		 *  6) Manager 인스턴스 생성되고, 생성자 내의 코드 실행
		 */
		
		// Employee클래스 인스턴스 생성 - 기본 생성자 호출
//		Employee emp = new Employee();
		
		// Employee클래스 인스턴스 생성 - 이름과 연봉을 전달받는 파라미터 생성자 호출
		Employee emp2 = new Employee("홍길동", 100000000);
		// Employee인스턴스의 getEmployee()메서드를 호출하여 이름과 연봉을 리턴받아 출력하기
		System.out.println(emp2.getEmployee());
		
		System.out.println("===============================");
		
		// Manager클래스 인스턴스 생성 - 기본 생성자 호출
		//		Manager m1 = new Manager(); // 오류발생! 기본 생성자 없음

		// Manager클래스 인스턴스 생성 - 파라미터 생성자 호출 
		Manager m2 = new Manager("이순신", 800000000, "영업팀");
		// Manager인스턴스의 getManager()메서드 호출하여 이름, 연봉, 부서명 리턴받아 출력하기
		System.out.println(m2.getManager());
	}

}


// 사원 클래스 정의
class Employee{
	String name; // 사원 이름
	int salary; // 연봉
	
	// 기본 생성자 정의 - "Employee() 생성자 호출됨" 출력
	// => 실제 직접적인 사용은 없지만 서브클래스의 생성자 내에서 자동으로 호출될 경우
	//    오류 발생을 방지하기 위해 임시로 정의해 둔 생성자
	public Employee() {
		System.out.println("Employee()생성자 호출됨");
	}
	
	// 파라미터 생성자 정의
	// - 이름, 연봉을 전달받아 멤버변수 초기화하고 "Employee(String, int)생성자 호출됨" 출력
	public Employee(String name, int salary) {
		this.name = name;
		this.salary= salary;
		System.out.println("Employee(String, int) 생성자 호출됨");
	}
	
	// 사원명과 연봉을 문자열로 결합하여 리턴하는 getEmployee()메서드 정의
	// ex) 이름이 "홍길동"이고 연봉이 4000일 경우 - "홍길동, 4000" 문자열 형태로 리턴
	
	public String getEmployee() {
		return name + ", " + salary;
	}
}

// 사원(Employee)클래스를 상속받는 매니저(Manager)클래스 정의
// - 멤버변수 : 부서명(depart, 문자열)
class Manager extends Employee{
	String depart;
	
	// 이름, 연봉과 함께 부서명(depart)을 모두 전달받아 초기화하는 파라미터 생성자 정의
	// => 멤버변수 초기화 후 "Manager(String, int, String)생성자 호출됨" 출력
	public Manager(String name, int salary, String depart) {
		// 서브클래스 생성자 첫번째 라인에서 암묵적(묵시적)으로
		// 슈퍼클래스의 기본생성자를 자동으로 호출하게 된다! = Employee()생성자 호출
		// => 이 때, 슈퍼클래스의 기본 생성자(Employee())가 정의되어 있지 않고
		//	  파라미터 생성자(Employee(String, int, String))만 정의되어 있을 경우 
		//    슈퍼클래스의 기본 생성자를 찾기 못해 오류 발생!
		// Implicit super constructor Employee() is undefined. Must explicitly invoke another constructor
		 
		// 생성자 내의 다른 코드를 실행하기 전 슈퍼클래스의 생성자가 자동으로 호출된 후
		// 슈퍼클래스 생성자 코드를 모두 실행하고 나서 서브클래스 생성자 내의 코드가 실행됨
		this.name=name; // 슈퍼클래스로부터 상속받은 멤버변수
		this.salary =salary; // 슈퍼클래스로부터 상속받은 멤버변수
		this.depart = depart; // 서브클래스 자신의 멤버변수
		System.out.println("Manager(String, int, String)생성자 호출됨");
	}
	
	// 사원명과 연봉, 부서명을 문자열로 결합하여 리턴하는 getManager()메서드 정의
	public String getManager() {
//		return name + ", " + salary + ", " + depart;
		// 이미, 슈퍼클래스의 getEmployee()메서드에서 name과 salary를 리턴하므로 코드가 중복됨
		// 따라서, name과 salary를 리턴하는 코드는 getEmployee()메서드 리턴값으로 대체하고
		// 부서명만 추가로 결합하여 리턴하면 코드 중복이 제거되고, 유지보수성 향상됨
		return getEmployee() + ", " + depart;
	}
	
}












