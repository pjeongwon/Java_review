package oop_interface;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 인터페이스 필요성(장점)
		 * 1. 구현의 강제성 부여
		 * 	  - 인터페이스를 상속받은 서브클래스는 반드시 추상메서드를 구현해야한다!
		 * 2. 모듈 교체의 용이함
		 * 	  - 부모타입인 인터페이스 타입을 변수로 사용하여 각 서브클래스를 다룰 경우
		 * 		특정 서브클래스가 새로 추가되더라도 공통 코드의 변경없이
		 * 		새로운 클래스만 정의하게 되면 언제든 인스턴스 교체를 통해 서브클래스를 다룰 수 있음
		 * 	  ex) JDBC의 인터페이스(Connection 등)를 통해 MySQL과 Oracle등의 제조사 상관없이
		 * 		  해당 제조사의 드라이브 교체만으로 각 데이터베이스를 동일한 방법으로 다룰 수 있음
		 * 3. 상속관계가 없는 객체끼리의 관계를 부여하여 다형성에 활용 가능
		 * 4. 모듈간 독립적 프로그래밍으로 인한 개발 기간 단축
		 * 
		 */
		
		// 2. 모듈 교체 용이
		// Printer객체를 포함(has-a)하는 PrintClient인스턴스 생성하여 인쇄 작업 관리 가능
		 PrintClient pc = new PrintClient();
		 // PrintClient클래스의 setPrinter()메서드를 호출하여 실제 사용할 프린터 객체 전달
		 pc.setPrinter(new LaserPrinter()); // 현재 출력에 사용할 프린터를 레이저프린터로 지정
		 pc.print("Ex5.java");
		 // => PrintClient객체의 print()메서드를 호출하면 
		 //    print()메서드 내에서 LaserPrinter객체의 print()메서드를 다시 호출하게 됨
		 //    즉, 실제 인쇄 작업은 LaserPrinter객체에서 수행하게 됨
		 
		 // 사용할 프린터를 잉크젯프린터로 교체하여 Ex5.java 출력하기
		 
		 pc.setPrinter(new InkjetPrinter());
		 pc.print("Ex5.java");
		 
		 // 사용할 프린터를 도트프린터로 교체하여 Ex5.java 출력하기
		 pc.setPrinter(new DotPrinter());
		 pc.print("Ex5.java");
	}

}

// -------------------- 2. 모듈 교체의 용이 --------------------
interface Printer{
	// 모든 프린터의 공통 기능인 인쇄(print()) 기능 정의
	public void print(String fileName);
}

// printer인터페이스를 상속받아 구현하는 각 프린터 클래스 정의
// => 각 프린터에 해당하는 서브클래스에서 상속받은 print()메서드를 구현(상세한 출력 기능 정의)
class LaserPrinter implements Printer{

	@Override
	public void print(String fileName) {
		System.out.println("LaserPrinter로 출력 : " + fileName);
	}
}

class InkjetPrinter implements Printer{

	@Override
	public void print(String fileName) {
		System.out.println("InkjetPrinter로 출력 : " + fileName);
	}
}

// ----------------------
// 만약, 새로운 프린터(DotPrinter)를 추가한다고 가정하면
// Printer인터페이스를 구현하도록 서브클래슴나 정의하면
// PrintClient클래스를 손대지 않고도 도트프린터를 사용 가능하다!
class DotPrinter implements Printer{

	@Override
	public void print(String fileName) {
		System.out.println("DotPrinter로 출력 : " + fileName);
	}
}


// ----------------------------------------------------------------
// 각 프린터를 직접 컨트롤하지않고 별도의 클래스를 통해 프린터를 다룰 수 있다.
// => PrintClient클래스 정의
// => XXXPrinter클래스에 대한 명시 없이 부모 타입인 Printer타입으로 모든 작업 수행
//    차후 프린터가 변경되어도 Printer타입으로 업캐스팅만 가능하면 코드 변경 없이 프린터 추가 가능
class PrintClient{
	// 각 프린터를 하나로 묶어 관리할 수 있도록 슈퍼클래스 타입 인터페이스 Printer타입 변수 선언
	// => 직접적인 XXXXPrinter에 대한 코드를 기술하지 않음
	// => has-a 관계를 통해 각 프린터를 관리(업캐스팅을 통해 부모타입으로 관리)
	Printer printer; // 공통 부모타입인 Printer인터페이스타입 변수 선언

	// Setter메서드를 정의하여 외부로부터 각 프린터 객체를 전달받아 저장(업캐스팅 활용)
	public void setPrinter(Printer printer) {
		this.printer = printer; // 멤버변수에 각 프린터 객체를 저장(업캐스팅)
	}

	// print()메서드를 정의하여 외부로부터 출력할 파일명을 전달받으면
	// 현재 갖고있는 Printer타입 객체의 print()메서드를 호출하면 모든 프린터에 인쇄 가능하다!
	public void print(String fileName) {
		// 현재 메서드에서 직접 출력하는 것이 아니라 현재 메서드에 전달된 객체를 통해
		// 해당 객체(=프린터) 메서드를 호출하여 출력하도록 지시
		printer.print(fileName);
	}
	
}







