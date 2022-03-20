package operator;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 증감연산자(++, --)
		 * - 단항연산자
		 * - 피연산자의 앞 또는 뒤에 붙어서 해당 피연산자의 값을 1만큼 증가 또는 감소시키는 연산자
		 * - 다른 연산(출력문도 포함)과 결합될 때 전위 연산자와 후위 연산자에 따라 다른 결과 발생
		 * 
		 * 1. 선행 연산자(= 전위 연산자)
		 * 	- 피연산자의 앞쪽(좌측)에 붙어서 해당 피연산자 값을 1증가 또는 감소시키는데
		 * 	  먼저 피연산자의 값을 증가 또는 감소 시킨 후 다른 연산에 참여함
		 * 	  ex) ++a, --a
		 * 
		 * 2. 후행 연산자(= 후위 연산자)
		 * 	- 피연산자의 뒤쪽(우측)에 붙어서 해당 피연산자 값을 1증가 또는 감소시키는데
		 * 	  피연산자를 먼저 다른 연산에 참여시킨 후 피연산자 값을 1증가 또는 감소시킴
		 *  
		 * 
		 * 
		 */
		
		
		int i = 5;
		
		// i값을 1만큼 증가시키는 방법 1
		i = i + 1;
		System.out.println(i);
		
		//i값을 1만큼 증가시키는 방법 2
		i += 1;
		System.out.println(i);
		
		// i값을 1만큼 증가시키는 방법 3
		i++; // i값을 1만큼 증가시킴
		System.out.println(i);
		
		++i; // i값을 1만큼 증가시킴
		System.out.println(i);
		
		i--;
		System.out.println(i);
		
		--i;
		System.out.println(i);
		
		System.out.println("--------------------------");
		
		i = 5;
		// 출력문(println() 메서드)에서 증감연산자의 위치에 따른 차이
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
		
		System.out.println("--------------------------");
		
		int x1 = 5;
		int y1 = ++x1; // 선행연산자
		// => x1의 값을 먼저 1만큼 증가시킨 후 대입연산자를 통해 x1값을 y1에 대입
		// => 따라서, x1이 5 -> 6으로 변경된 후 y1에 x1을 저장하므로 y1도 6이 저장됨
		
		System.out.println(x1 + ", " + y1);
		
		int x2 = 5;
		int y2 = x2++; // 후행연산자
		// => x2의 값을 증가시키기 전 y2에 x2의 값을 먼저 전달한 후 x2값을 증가시킴
		// => 따라서, x2값(5)을 y2에 전달한 후 x2값을 5 -> 6으로 변경시킴
		System.out.println(x2 + ", " + y2);
		
		System.out.println("==========================");
		
		byte b1 = 10;
		// b1값을 1만큼 증가시키는 방법 세 가지
		// 1. 산술연산자와 대입연산자 사용(가장 기본적인 방법)
		b1 = (byte)(b1 + 1); // 강제 형 변환 필수
		System.out.println(b1);
		
		// 2. 확장 대입연산자 사용
		b1 += 1;
		System.out.println(b1);
		
		// 3. 증감연산자 사용
		b1++;
		System.out.println(b1);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
