package overloading;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 가변 인자(= 비정형 인자, Variable Arguments)
		 * - 복수개의 메서드 파라미터를 하나의 파라미터로 축약하여 정의하는 기능
		 * 		=> 복수개의 전달인자를 전달받아 하나의 파라미터로 관리하는 기능
		 * - 동일한 타입의 전달인자를 0개 ~ 무한대로 전달받아 
		 * 	 하나의 파라미터 이름으로 된 배열로 관리
		 * - 메서드 파라미터 선언 시 데이터타입 뒤에 ... 기호를 붙여서 표현
		 * - 주의! 가변 인자(...)는 마지막 파라미터 단 한 번만 사용 가능
		 * 
		 *  < 가변 인자 기본 문법 >
		 *  [제한자] 리턴타입 메서드명(데이터타입...변수명){}
		 * 	=> ex) public void add(int...nums){}
		 * 	  
		 */
		NormalArguments na = new NormalArguments();
		na.print("이순신");
		na.print("이순신", "송상현");
//		na.print("이순신", "강감찬", "임꺽정"); // 3개짜리 파라미터를 갖는 생성자 없음
		
		System.out.println("===========================");
		VariableArguments va = new VariableArguments();
		va.print("서희");
		va.print("서희", "양규");
		va.print("서희", "양규", "강감찬");
		va.print();
		
		// 파라미터에 배열 데이터 전달도 가능함(어차피 배열로 관리되기 때문에)
		String [] values = {"서희", "양규", "강감찬"};
		va.print(values);
	}

}

class VariableArguments{
	// 가변인자(...)를 사용한 메서드 오버로딩
	// => 문자열 데이터를 0 ~ 무한대까지 전달받아 names라는 파라미터로 관리하는 메서드 정의
	public void print(String... names) {
		// names 파라미터는 배열의 주소값을 가지며, 배열에 접근하면 복수개의 데이터에 접근 가능
		// 따라서, 반복문을 사용하여 배열 내의 모든 요소에 접근하면 전달된 데이터 모두 사용 가능
		if(names.length == 0) {
			System.out.println("데이터가 없습니다");
		} else {
			for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
			}
		}
		System.out.println();
	}
	
	public void print2(int count, String... names) {}

	// 주의사항! 가변인자보다 뒤쪽에 일반 파라미터가 올 수 없다!
	// => 즉, 가변인자는 항상 마지막 파라미터로 선언되어야 함
//	public void print3(String...names, int count ) {}
	
	// 복수개의 가변인자 선언할 수 없다!
	// => 즉, 가변인자는 항상 마지막 파라미터로 선언되어야 함
//	public void print4(int...count, String...names) {}
}






class NormalArguments{
	// 동일한 데이터타입을 갖는 복수개의 파라미터에 대한 메서드 오버로딩 시
	// 파라미터 개수가 달라지면 메서드도 새로 오버로딩 해야함
	// 또한, 오버로딩 되지 않은 복수개의 파라미터는 사용 불가능 
	public void print(String name1) {
		System.out.println(name1);
	}
	public void print(String name1, String name2) {
		System.out.println(name1 + ", " + name2);
	}
}