package polymorphism;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 다형성(Polymorphism)
		 * - 하나의 참조변수로 여러 인스턴스를 참조할 수 있는 특성
		 * - 서브클래스의 인스턴스를 업캐스팅하여 슈퍼클래스 타입 변수로
		 *   복수개의 인스턴스를 동일한 방법으로 다루는 것
		 */
		
		Circle c = new Circle();
		c.paint();
		
		Rectangle r = new Rectangle();
		r.design();
		
		Triangle t = new Triangle();
		t.tDraw();
		
		// 슈퍼클래스의 메서드를 상속받아 오버라이딩 할 경우 코드의 통일성 향상됨
		// => Shape 클래스의 draw()메서드 오버라이딩
		
		c.draw();
		r.draw();
		t.draw();
		
		System.out.println("--------------");
		
		// 코드의 통일성을 더욱 향상시키기 위해 업캐스팅 활용
		// => Circle, Rectangle, Triangle의 공통 슈퍼클래스인 Shape클래스 타입 활용
		// 1. Circle -> Shape 업캐스팅
		Shape s = new Circle(); // Shape s = c;
		s.draw();

		// 2. Rectangle -> Shape 업캐스팅
		s= new Rectangle();
		s.draw();
		
		// 3. Triangle -> Shape 업캐스팅
		s= new Triangle();
		s.draw();
		
		System.out.println("==============");
		System.out.println("--------------");
		notPolymorphism(c); // notPolymorphism(Circle c){} 메서드 필요
		notPolymorphism(r); // notPolymorphism(Rectangle r){} 메서드 필요
		notPolymorphism(t); // notPolymorphism(Triangl t){} 메서드 필요

		// 메서드에 다형성을 활용하는 방법
		// => 하나의 메서드에 Circle, Rectangle, Triangle클래스의 슈퍼클래스 타입인
		//    Shape타입 변수 s를 파라미터로 선언하면 각 인스턴스 전달 시
		//    업캐스팅 되어 Shape s에 전달됨
		polymorphism(c); // Shape s = c(new Circle())와 동일
		polymorphism(r); // Shape r = c(new Rectangle())와 동일
		polymorphism(t); // Shape t = c(new Triangle())와 동일
		
		System.out.println("==============");
		// 배열에 다형성 활용
		// => 데이터타입[] 변수명 = new 데이터타입[배열크기];
		Circle[] cArr = new Circle[3];
		// => Circle인스턴스 3개를 저장 가능한 배열 생성
		
		cArr[0] = new Circle(); // Circle인스턴스1의 주소값을 배열0번 인덱스에 저장
		cArr[1] = new Circle(); // Circle인스턴스2의 주소값을 배열1번 인덱스에 저장
		cArr[2] = new Circle(); // Circle인스턴스3의 주소값을 배열2번 인덱스에 저장
//		cArr[2] = new Rectangle(); // 상속관계가 아니므로 저장 불가!
		
		// 배열에 다형성 활용
		// => Circle, Rectangle, Triangle인스턴스를 모두 저장 가능한 배열 = Shape 타입 배열 필요
		Shape[] sArr = new Shape[3]; // Shape타입 배열 공간 3개 할당받음0
		// Shape타입 배열 sArr에는 Circle, Rectangle, Triangle인스턴스를 모두 저장 가능
		// 즉, 배열의 데이터타입과 같거나 서브클래스 타입 인스턴스를 저장 가능
		sArr[0] = new Circle(); // Shape s = new Circle()과 동일(업캐스팅)
		sArr[1] = new Rectangle(); // Shape s = new Rectangle()과 동일(업캐스팅)
		sArr[2] = new Triangle(); // Shape s = new Triangle()과 동일(업캐스팅)
		
		// for문을 사용하여 Shape타입 배열 sArr을 반복하면서
		// 해당 배열을 통해 각 인스턴스의 공통메서드인 draw()호출 가능
		for(int i = 0; i < sArr.length; i++) {
			// 제어변수 i가 sArr배열의 크기만큼 반복(0 ~ sArr.length-1)하므로
			// 제어변수 i를 sArr배열의 인덱스로 사용 가능
			sArr[i].draw(); // sArr[i]번 배열에 있는 인스턴스의 draw()메서드 호출(s.draw()와 동일)
		}
	}
	
	// 다형성을 활용하여 하나의 메서드로 여러 인스턴스를 처리하기
	// => Circle, Rectangle, Triangle타입 인스턴스를 모두 전달하기 위해서는
	//    슈퍼클래스인 Shape타입 변수를 파라미터로 선언해야한다!
	public static void polymorphism(Shape s) {
		// Shape타입 변수 s에는 Circle, Rectangle, Triangle인스턴스가 업캐스팅 되어 전달됨
		// => 업캐스팅 후에는 참조 영역이 축소되며, 공통된 멤버에만 접근 가능함
		s.draw(); // 공통된 메서드가 존재하며 오버라이딩 되어 있으므로 코드의 통일성이 향상됨
	}
	
	// 다형성을 활용하지 않고 메서드를 통해 다양한 객체를 처리하는 경우
	// 메서드 오버로딩을 통해 이름은 같고 파라미터 타입이 다른 메서드를 여러번 정의해야함
	
	public static void notPolymorphism(Circle c) {
		c.draw();
	}
	
	public static void notPolymorphism(Rectangle r) {
		r.draw();
	}
	
	public static void notPolymorphism(Triangle t) {
		t.draw();
	}

}

// 도형(Shape)클래스 정의
class Shape{

	public void draw() {
		System.out.println("도형 그리기!");
	}
}

// 원(Circle)클래스 정의 - 도형(Shape)클래스 상속
class Circle extends Shape{
	
	public void paint() {
		System.out.println("원 그리기!");
	}
	
	@Override
	public void draw() {
		System.out.println("원 그리기!");
	}
}

//사각형(Rectangle)클래스 정의 - 도형(Shape)클래스 상속
class Rectangle extends Shape{
	
	public void design() {
		System.out.println("사각형 그리기!");
	}
	
	@Override
	public void draw() {
		System.out.println("사각형 그리기!");
	}
}

//삼각형(Triangle)클래스 정의 - 도형(Shape)클래스 상속
class Triangle extends Shape{
	
	public void tDraw() {
		System.out.println("삼각형 그리기!");
	}
	
	@Override
	public void draw() {
		System.out.println("삼각형 그리기!");
	}
}












