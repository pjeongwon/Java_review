package operator;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 논리연산자(&&, &, ||, |, !, ^)
		 * - 두 피연산자 간의 논리적인 판별을 수행하는 연산자
		 * - 피연산자로 사용되는 데이터는 반드시 boolean타입 데이터(true 또는 false)만 사용 가능하며,
		 * 	 연산 결과값도 boolean타입으로 리턴(산출)됨
		 * - 주로, 다른 연산(비교 연산 등)과 결합하여 사용
		 * 
		 * < AND 연산자(& 또는 &&) - 논리곱 > ampersand
		 * - 두 피연산자가 모두 true일 경우에만 결과값이 true이고, 
		 * 	 둘 중 하나라도 false일 경우 결과값이 false
		 * - 진리표 : F AND F = F / F AND T = F / T AND F = F, T AND T = T
		 * - &&연산자 대신 &연산자를 사용해도 AND연산을 수행하는 것은 동일하지만
 		 *	 &&연산자를 사용하면 Short circuit operation이 발생하여
 		 *	 앞쪽의 피연산자가 false일 경우 뒤쪽을 판별하지 않고 즉시 false값을 리턴함
 		 *		=> 즉, &연산자에 비해 연산 속도가 증가함( = 연산 시간 짧아짐)
 		 * - 복합 조건을 설정 시 "~이고", "그리고"등의 의미로 사용됨
		 * 
		 * < OR 연산자(| 또는 ||) - 논리합 > verticla Bar
		 * - 두 피연산자 중 하나라도 true일 경우 결과값이 true이고,
		 *   둘 다 false 경우에만 결과값 false
		 * - 진리표 : F OR F = F / F OR T = T / T OR F = T / T OR T = T
		 * - ||연산자 대신 |연산자를 사용해도 OR연산을 수행하는 것은 동일하지만
 		 *	 ||연산자를 사용하면 Short circuit operation이 발생하여
 		 *	 앞쪽의 피연산자가 true일 경우 뒤쪽을 판별하지 않고 즉시 true값을 리턴함
 		 *		=> 즉, |연산자에 비해 연산 속도가 증가함( = 연산 시간 짧아짐)
 		 * - - 복합 조건을 설정 시 "~이거나", "또는"등의 의미로 사용됨
		 * 
		 * < NOT 연산자(!) - 논리부정 >
		 * - 단항 연산자(피연산자가 하나뿐인 연산자)
		 * - 현재 피연사자의 논리값을 반대로 반전시킴(토글 Toggle 기능)
		 * 	 진리표 : F -> T / T -> F
		 * 
		 * < XOR 연산자(^) - 배타적 논리합 >
		 * - 두 피연산가 서로 다를 경우 결과값이 true이고, 서로 같을 경우 결과값 false
		 * - 진리표 : F XOR F = F / F XOR T = T / T XOR F = T / T XOR T = F
		 * 
		 */
		
		boolean a = false, b = true;
		System.out.println("a(F) && a(F) = " + (a && a));
		System.out.println("a(F) && b(T) = " + (a && b));
		System.out.println("b(T) && a(F) = " + (b && a));
		System.out.println("b(T) && b(T) = " + (b && b));
		
		System.out.println("---------------------");
		
		System.out.println("a(F) || a(F) = " + (a || a));
		System.out.println("a(F) || b(T) = " + (a || b));
		System.out.println("b(T) || a(F) = " + (b || a));
		System.out.println("b(T) || b(T) = " + (b || b));
		
		System.out.println("---------------------");
		
		System.out.println("!a(F) = " + (!a));
		System.out.println("!b(T) = " + (!b));
	
		System.out.println("---------------------");

		System.out.println("a(F) ^ a(F) = " + (a ^ a));
		System.out.println("a(F) ^ b(T) = " + (a ^ b));
		System.out.println("b(T) ^ a(F) = " + (b ^ a));
		System.out.println("b(T) ^ b(T) = " + (b ^ b));

		
		
	}

}
