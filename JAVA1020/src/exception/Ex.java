package exception;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 예외(Exception)
		 * - 개발자가 의도하지 않은 상황에서 발생하는 문제
		 * - 예외 발생 시 프로그램이 비정상적으로 종료됨
		 * 	 => 예외 발생 지점 아래쪽의 코드들은 실행되지 못함
		 * - 오류(Error)와 달리 심각도가 낮음
		 * 	 (오류는 주로 JVM의 문제, 메모리 문제 등의 치명적인 문제로 개발자가 해결 불가능한 문제)
		 * - 예외는 개발자가 예외 처리(Exception Handling)를 통해
		 * 	 예외 발생 시의 해결책을 기술하여 프로그램의 비정상적인 종료를 막을 수 있음
		 * 	 (즉, 프로그램이 정상적으로 종료될 수 있도록 후처리 수행)
		 *   => 주의! 예외가 발생하지 않도록 코드를 수정하는 것은 예외처리가 아니다!
		 * - try ~ catch문을 사용하여 예외 처리 작업 수행
		 * 	 => try블록 내에서 예외 발생 가능성이 있는 코드들을 감시하고
		 * 		예외가 해당코드 내에서 예외가 발생하면 JVM이 해당 예외를 감지하여 
		 * 		예외와 일치하는 클래스 타입의 예외 객체를 생성하여 전달하고
		 * 		catch블록 중 일치하는 예외 클래스 타입에 대한 블록 코드를 실행하여 예외를 처리함
		 * 	 => 만약, 일치하는 catch블록이 없을 경우 프로그램은 그대로 비정상적으로 종료됨
		 * - Exception클래스와 그 하위의 서브클래스들을 사용하여 예외 처리 가능
		 *   => 업캐스팅을 할용하여 복수개의 하위 클래스타입 예외들을
		 *   	상위 클래스타입 예외로 묶어서 처리 가능 
		 *   	(ex. ArithmeticException & NullPointerException 클래스의 상위 타입인
		 * 			 RunTimeException 또는 Exception타입으로 처리 가능함)
		 * - 컴파일(번역)시점에서 예외 발생 여부를 알 수 있는
		 * 	 Compile Checked Exception계열(SQLException, IOException 등)과
		 *   실행 시점에서 예외 발생 여부를 알 수 있는(= 컴파일 시점에서 알 수 없는)
		 *   Compile Unchecked Exception 계열 (RuntimeException계열)로 구분됨
		 * - 하나의 try블록에 복수개의 catch블록이 올 수 있음
		 * 
		 * 
		 *  < 예외 처리 기본 문법 >
		 *  try{
		 *  	// 예외가 발생할 것으로 예상되는 범위의 코드들...
		 *  	// => 예외 발생 지점 아래쪽의 나머지 try블록 코드들은 실행되지 못함
		 *  } catch(예외클래스명 변수명){
		 *  	// 예외클래스에 해당하는 예외가 발생하여 객체 전달 시 처리할 코드들...
		 *  }
		 */
		
		
		
		
//		System.out.println("프로그램 시작!");
//		
//		int num1 = 3, num2 = 0;
		
		
//		System.out.println(num1 / num2); // ArithmeticException예외 발생
		/*
		 * => 나눗셈 과정에서 두번째 피연산자가 0인 경우 연산 과정에서 문제가 발생
		 *    이 때, 나눗셈 과정에서의 문제 발생 시 ArithmeticException예외 발생함
		 * => Exception in thread "main" java.lang.ArithmeticException: 
		 * 	  / by zero at exception.Ex.main(Ex.java:40)
		 * 	  
		 * 			1) Exception in thread "main" 		=> 메인 쓰레드에서 예외 발생함
		 * 			2) java.lang.ArithmeticException	=> ArithmeticException객체가 예외 탐지함
		 *			3) / by zero 						=> 0에 의한 나눗셈 때문이라는 원인 메시지
		 *			4) at exception.Ex.main(Ex.java:40) => 예외 발생 위치 (Ex클래스의 main()메서드 내에서 발생했으며, Ex.java클래스의 9번 라인에서 발생)
		 * 
		 */ 
		
//		int[] arr = {1, 2, 3};
//		System.out.println(arr[5]); // ArrayIndexOutOfBoundsException예외 발생
		/*
		 * => 배열에 존재하지 않는 인덱스 접근 시 ArrayIndexOutOfBoundsException예외 발생
		 * => Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5 
		 * 	  at exception.Ex.main(Ex.java:55)
		 * 	  => 5번 인덱스로 인해 발생한 예외
		 */
		
//		String str = null;
//		System.out.println(str.equals("admin")); // NullPointerException 예외 발생
		/*
		 * => 객체를 저장하고 있지 않은(= 참조하고 있지 않은) 참조 변수에 접근 시 NullPointerException예외 발생
		 * => Exception in thread "main" java.lang.NullPointerException 
		 * 	  at exception.Ex.main(Ex.java:63)
		 * 	  => 예외 원인 메시지가 없는 이유는 48번 라인 str = null자체가 원인이므로 메시지 불필요
		 */
		
		// 슈퍼클래스 Parent타입 인스턴스 생성
//		Parent p = new Parent();
		// parent인스턴스를 Child타입으로 강제 형 변환
//		Child c = (Child) p; // ClassCastException 예외 발생
		/*
		 * => 슈퍼클래스 타입 객체를 서브클래스 타입으로 다운캐스팅 시 예외 발생
		 * 	  (이전에 업캐스팅 된 객체를 다시 다운캐스팅  하는 경우에는 예외 발생 X)
		 * Exception in thread "main" java.lang.ClassCastException: exception.Parent cannot be cast to exception.
		 * Child at exception.Ex.main(Ex.java:75)
		 */
		
		
		// 현재 코드 위쪽(앞쪽)에서 예외가 발생 시 예외 발생 지점 이후의 코드는 실행 불가능
//		System.out.println("프로그램 종료!"); // 예외 발생 시 실행되지 않는 코드
		
		
		// ==========================================================
		
		System.out.println("프로그램 시작!");
		
		// 예외 발생 시 처리를 위해 try ~ catch문을 사용 가능
		try {
			// 예외가 발생할 것으로 예상되는 코드들을 try블록 내에 기술
			// => 단, 예외가 발생하는 코드'만' 기술하는 것은 아님
			System.out.println("try 블록 시작!");
			
			int num1 = 3;
			int num2 = 1; // 예외 발생을 유발하는 원인이 되는 피연산자(예외 발생 위치는 아님)
//			1System.out.println(num1 / num2); // ArithmeticException예외 발생 위치
			// => 예외 발생 코드를 수정하지 않고 ArithmeticException예외가 발생했을 때
			//	  해당 예외를 처리하는 코드를 catch블록에 작성해야함
			// => 예외 발생 시 현재 지점을 기준으로 trt블록 내의 아래쪽 코드들은 실행되지 못하고(try블록 한정)
			//    예외와 일치하는 catch블록으로 이동함
			// => 만약, 예외가 발생하지 않으면 그대로 try블록 내의 코드를 계속 실행함
			
			// 하나의 try블록 내에서 2개 이상의 예외가 발생할 것으로 예상되는 경우
			// 다중 catch블록을 사용하여 복수개의 예외를 각각 처리할 수 있다!
			
			int[] arr = {1, 2, 3};
//			System.out.println(arr[5]); // ArrayIndexOutOfBoundsException 예외 발생 위치
			// => 기존 catch블럭은 ArrayIndexOutOfBoundsException예외만 처리 가능하므로
			//	  추가적인 catch블럭을 통해 ArrayIndexOutOfBoundsException예외를 처리해야함
			
			String str = null;
			System.out.println(str.equals("admin"));
			
			System.out.println("try 블록 끝!"); // 예외 발생 시 실행되지 못함
			
		} catch (ArithmeticException e) {
			// try블록에서 ArithmeticException예외가 발생하면
			// JVM에 의해 해당 예외 객체가 생성되어 던져짐
			// => 따라서, catch블록에서 해당 예외 객체를 전달받는 변수를 선언하고
			//	  전달받은 객체(e)를 활용하여 예외 발생 시 처리할 작업들을 catch블록 내에 기술
			// => 단, 예외가 발생하지 않으면 실행되지 않는다!
			// => 전달받은 예외 객체의 메서드를 활용하여 예외 처리 작업을 할 수 있음
			//	  1) e.getMessage() : 예외 발생 원인 메시지를 문자열로 리턴
			//	  2) e.printStackTrace() : 예외 발생 상황에 대한 정보(예외 클래스, 메시지, 위치) 출력
			
			System.out.println("0으로 나눌 수 없습니다! - " + e.getMessage());
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스가 잘못 지정됐습니다! - " + e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			// 위의 catch블록에서처리하지 못하는 나머지 예외들을
			// 최상위 클래스인 Exception클래스 타입으로 모두 한꺼번에 묶어서 처리 가능
			// => 이 때, 생성된 예외 객체가 Exception타입으로 모두 업캐스팅 되어 전달됨
			System.out.println("Exception타입으로 나머지 모든 예외 처리 - " + e.getMessage());
			e.printStackTrace();
		} //catch(NullPointerException e) { // 컴파일 에러 발생
			// Unreachable catch block for NullPointerException. 
			// It is already handled by the catch block for Exception
			// => Exception클래스로 예외 처리를 수행한 catch블록보다 아래쪽에
			//    Exception클래스의 하위 타입으로 예외 처리를 수행할 수 없다!
			// => catch블록은 if문과 마찬가지로 위에서부터 차례대로 수행하므로
			//    하위 클래스 -> 상위클래스 타입 순으로 예외 처리를 수행해야한다!
			// = 최소한 Exception클래스의 catch블록보다는 먼저 실행되어야 함
//		}
		
		System.out.println("프로그램 종료!");
		
	}

}

class Parent{}
class Child extends Parent{}














