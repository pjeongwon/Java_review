
public class Ex {

	public static void main(String[] args) {
		/*
		 * 문자열 데이터
		 * - 큰 따옴표 ("")로 둘러싼 0개 이상의 문자 데이터
		 *	 => 아무 문자도 포함하지 않는 " "형태의 문자열을 널스트링(Null String)이라고 함
		 * - 작은 따옴표 ('')로 둘러싼 1개의 문자 데이터는 char타입이며,
		 *   큰 따옴표로 둘러싼 문자열 데이터는 String타입이다.
		 * - String타입은 기본 데이터타입이 아니다! = 참조 데이터타입
		 * - 이스케이프 문자도 문자열로 표현 가능
		 * 	 ex) "\n" => 줄바꿈 기호
		 *  
		 */
		System.out.println("Hello, World!");
		
		System.out.println("박정원");
		
		String name = "홍길동";
		System.out.println(name);
		
		// 이스케이프 문자 중 줄바꿈("\n") 기호를 사용하면
		// 하나의 문자열 내에서 줄바꿈 작업을 수행할 수 있다!
		
		System.out.println("안녕하세요.\n자바\t프로그래밍");
		
		// 문자열 내에서 큰 따옴표(") 기호를 문자열 데이터 자체로 사용하고 싶을 경우
		// \" 형식으로 지정해야한다!
		
		System.out.println("저는 \"박정원\"입니다.");

		System.out.println("------------------------------------");
		/*
		 * 문자열의 결합 연산(+)
		 * 	=> 어떤 데이터타입과 문자열 데이터를 + 연산자를 사용하여 연산 할 경우
		 *     두 데이터를 단순 결합하여 새로운 문자열을 만들어 낸다.
		 *     ex) 정수 + "문자열" = "정수 문자열"
		 *     	   "문자열" + 실수 = "문자열 실수"
		 */
		
		// 문자열을 다른 데이터(정수, 문자, 문자열 등)와 덧셈기호(연산자)로 연결하면
		// 두 데이터를 이어붙여주는 역할을 수행함.
		
		String myName = "박정원";
		System.out.println("이름 : " + myName);
		
		int myAge = 20;
		System.out.println("나이 : " + myAge);
		
		String result = "나이 : " + myAge;
		System.out.println(result);
		
		System.out.println("Hello, " + "World!"); // 문자열 "Hello, World!"로 결합됨.
		
		System.out.println("1" + 1); // 문자열 "11"로 결합됨 / 문자열이 아니라면 1+1 = 2가 출력
		System.out.println(1 + "1");
		System.out.println(1 + 1 + "1");
		// => 좌측에서 우측 방향으로 순차적으로 덧셈을 수행하므로
		// 	  먼저, 1 + 1 = 2가 됙, 이후에 2와 문자열 "1"을 덧셈연산을 통해 결합하므로
		//	  문자열 "21"로 결합됨.
		
		System.out.println(1 + "1" + 1); // 111
		// => 먼저 1 + "1"을 수행하여 문자열 "11"로 결합되고,
		//	  이후에 "11" + 1을 수행하여 문자열 "111"로 결함됨.
		
		
		int num1 = 15;
		int num2 = 20;
		System.out.println(num1 + " + " + num2 + " = 35");
		// => 단순 결합에 의해 각 변수의 데이터와 문자열을 결합한 결과
		//	  "15 + 20 = 35" 문자열로 결합되어 출력됨
		
		
		
		
		
		
		
	}

}
