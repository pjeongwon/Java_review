package exception;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * finally 블록
		 * => 예외 발생 여부와 관계없이 무조건 수행해야하는 문장이 기술되는 블록
		 * => 주로, 데이터베이스를 활용하는 JDBC사용 시 작업 완료 후 DB자원을 반환하거나
		 *	  입출력 스트림 사용 시 스트림 자원을 반환하는 등의 자업ㅇㄴ
		 * 	  예외 발생 여부와 관계없이 항상 실행되어야 하므로 finally블록에 기술함
		 * => try문 뒤에 catch블록 없이 finally블록만 작성도 가능함
		 * 	  (예외 발생 여부와 관계없이 항상 finally블록을 실행하며,
		 * 	   예외 발생 시에도 비정상 종료 없이 finally블록에서 예외 처리함)
		 * => 메서드 실행 도중 return문을 만나더라도 무조건 finally 블록을 실행한 후
		 * 	  return 문이 실행되어 메서드 실행을 종료하고 원래 위치로 되돌아 감
		 *  < 기본 문법 >
		 *  try{
		 *  	// 예외가 발생할 것으로 예상되는 범위의 코드들...
		 *  	// => 예외 발생 지점 아래쪽의 나머지 try블록 코드들은 실행되지 못함
		 *  } catch(예외클래스명 변수명){
		 *  	// 예외클래스에 해당하는 예외가 발생하여 객체 전달 시 처리할 코드들...
		 *  } finally{
		 *  	// 예외 발생 여부와 관계없이 무조건 싱행되는 코드들...
		 *  	// ex) 자원 반환 등
		 *  
		 *  }
		 */
		
//		System.out.println("프로그램 시작!"); // 1번
//		
//		try {
//			System.out.println("try블록 시작!"); // 2번
//			
//			int[] arr = {1, 2, 3};
//			System.out.println(arr[5]); // ArithmeticException 예외 발생 위치
//			
//			System.out.println("try블록 끝!"); // 3번
//		} 
//		catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Exception예외 처리!"); // 4번
//		} 
//		finally {
//			System.out.println("finally - 예외 발생 여부와 관계없이 항상 실행되는 블록!"); // 5번
//		}
//		
//		System.out.println("프로그램 종료!"); // 6번
		
		// 1. 34번 라인 코드에서 System.out.println(arr[5]); 
		//    예외발생 시 실행 흐름    : 1번 - 2번 - 예외 발생 - 4번 - 5번(무조건) - 6번(무조건)
		
		// 2. 34번 라인 코드에서 System.out.println(arr[5]);
		//    예외 미발생 시 실행 흐름 : 1번 - 2번 - 예외 미발생 - 3번 - 5번(무조건) - 6번(무조건)
		
		System.out.println("=========================================");
		
		System.out.println("프로그램 시작!"); // 1번

		exceptionMethod(); // 메서드 호출
		
		System.out.println("프로그램 종료!"); // 6번
	}
	
	public static void exceptionMethod() {

		
		try {
			System.out.println("try블록 시작!"); // 1번
			
			int[] arr = {1, 2, 3};
			
			// 배열의 크기가 3이면 현재 메서드를 종료하고 원래 위치로 돌아가기
			if(arr.length == 3) {
				return; // 현재 메서드 종료 후 호출한 위치로 돌아감 
				// => finally 블록이 존재할 경우 메서드 종료하기 전
				//	  먼저 finally블록 내의 코드를 실행한 후 종료함
			}
			
			
			System.out.println(arr[5]); // ArithmeticException 예외 발생 위치
			
			System.out.println("try블록 끝!"); // 2번
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception예외 처리!"); // 3번
		} 
		finally {
			// 예외 발생 여부와 관계없이, 심지어 return문을 만나더라도 실행되는 블록
			System.out.println("finally - 예외 발생 여부와 관계없이 항상 실행되는 블록!"); // 4번
		}
		
		// try블록 바깥의 코드는 예외발생 여부와 관계없이 실행되지만
		// 만약, 메서드 실행 도중 try문 내에서 return문을 만나게 되면 실행되지 못함 
		System.out.println("메서드 종료!");
		
	}

}



