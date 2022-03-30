package oop_basic;

public class Test2_3 {

	public static void main(String[] args) {
		// 자신의 클래스 내에 있는 다른 메서드를 호출할 때에도
		// 자신의 클래스에 대한 인스턴스를 생성하여 접근함
		Test2_3 t = new Test2_3();
		// 1-2. add() 메서드를 호출하여 필요한 데이터를 전달 후 메서드 수행
		t.add(10, 20);
		t.add(99, 99);
		
		System.out.println("---------------------");
		
		int result = t.sum(10);
		System.out.println(result);
		
		result = t.sum(100);
		System.out.println(result);
	}
	
	// 1. 다음 메서드의 동작을 설명하시오.
    public void add(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    // 리턴값없고, 파라미터로 두개의 정수값을 전달 받아서 두 정수의 합을 출력
    /*
     * 정수형 전달인자 2개를 전달받는(= 정수형 파라미터 2개를 갖는) add() 메서드
     * => 파라미터는 있고, 리턴값은 없는 메서드
     * => 두 개의 정수를 전달받아 합계를 출력한 후 아무것도 리턴하지 않고 종료하는 메서드
     */

    // 2. 다음 메서드의 동작을 설명하시오.
    public int sum(int num) {
        int total = 0;
        for(int i = 1; i <= num; i++) {
            total += i;
        }
        
        return total;
    }
    // 파라미터 정수하나를 전달 받아서 1부터 그 정수까지의 합을 구하고 그 합을 리턴
    /*
     * 정수형 전달인자 1개를 전달받아(= 정수형 파라미터 1개를 갖고) 정수 1개를 리턴하는 메서드
     * => 파라미터도 있고, 리턴값도 있는 메서드
     * => 1개의 정수를 전달받아 1부터 전달받은 정수(num)까지 1씩 증가하면서
     *    해당 정수값을 누적한 후 누적된 값을 리턴하는 메서드
     */
}