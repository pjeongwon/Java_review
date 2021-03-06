
public class Ex2 {

	public static void main(String[] args) {
		System.out.println("박정원");
		
		/*
		 * 주석문(Comment)
		 * - 프로그램 실행과 관계없는(실행 대상에서 제외되는) 문장
		 * - 주로, 코드나 프로그램 전체에 대한 설명을 작성하는 용도로 사용하거나
		 *   또는 프로그램 실행 시 문제점을 찾기 위해 임시로 실행 대상에서 제외시킬 때 사용
		 *   
		 * 1. 단일 주석(라인 주석 = 한 줄 주석)     
		 *    => // 기호 사용하여 기호 뒤의 문장 한 줄을 주석으로 처리
		 *    => 특정 문장 한 줄을 주석처리하거나 특정 문장 뒤에 간단한 설명을 작성하는 용도로 사용
		 *    => 단축키 : 주석 처리할 문장에 커서를 두고 Ctrl + Shift + C 또는 Ctrl + /
		 *       해체단축키 : 주석이 처리된 문장에 커서를 두고 동일한 단축키 사용
		 *    => 만약, 여러 문장을 블럭 지정 후 주석 처리할 경우
		 *       여러 줄 주석 형태로 사용되며 각 라인에 한 줄 주석이 각각 처리됨
		 *       (부분 주석 해제도 가능함)
		 *       
		 * 2. 범위 주석(여러 줄 주석)
		 *    => /* 양쪽의 기호 사이의 모든 문장을 주석으로 처리 */
		 /*   => 한 줄에 사용하거나 여러 줄에 걸쳐 사용 가능
		  *   => 주로, 많은 양의 코드 설명을 작성하는 용도로 사용하거나
		  *      많은 양의 범위의 코드를 주석으로 처리하는 용도로 사용
		  *   => 단축키 : 주석으로 지정할 범위의 코드를 블럭 지정 후 Ctrl + Shift + /
		  *      해체단축키 : 주석이 처리된 문장을 블럭 지정 후 Ctrl + Shift + \
		 */
		
		/**
		 * 3. JavaDoc 주석
		 *    => 자바 코드에 대한 설명서(API 문서)를 작성하는 용도의 특수한 주석
		 *    => 범위 주석과 동일한 방법으로 사용하나 주 용도가 일반 주석이 아님
		 */
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
	}

}
