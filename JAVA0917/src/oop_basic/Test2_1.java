package oop_basic;

public class Test2_1 {

	public static void main(String[] args) {
		
		Account ac1 = new Account();
		ac1.accountNo = "111-11-11111"; 
		ac1.ownerName = "홍길동";
		ac1.balance = 10000;
	
//		System.out.println("계좌번호 : " + ac1.accountNo);
//		System.out.println("예금주명 : " + ac1.ownerName);
//		System.out.println("현재잔고 : " + ac1.balance + "원");
		ac1.showAccountInfo();
		//
		ac1.deposit(990000);
		
		// 10만원 출금 - withdraw() 메서드 호출
		//	=> 출금된 금액을 변수에 저장하여 얼마가 출금되었는지 확인하기
		int money = ac1.withdraw(100000);
		System.out.println("출금(리턴)된 금액 : " + money + "원");
		System.out.println("");
		money = ac1.withdraw(10000000); // 잔고가 부족하므로 출금이 불가능한 상태
		System.out.println("출금(리턴)된 금액 : " + money + "원"); // 0원
	}
}  // Test2_1 클래스 끝



/* 은행계좌 클래스(Account) 정의
 * 1. 멤버변수
 * 		- 계좌번호(accountNo, 문자열) : XXX-XX-XXXX
 * 		- 예금주명(ownerName, 문자열) : XXX 
 * 		- 현재잔고(balance, 정수)	  : XXXXXX원
 * 
 * 2. 메서드
 * 		1) 은행계좌 정보(계좌번호, 예금주명, 현재잔고)를 출력하는 showAccountInfo()
 * 			=> 파라미터 없음, 리턴값 없음
 * 		2) 입금 기능 - deposit()
 * 			=> 외부로부터 입금할 금액(amount)을 전달받아 현재잔고(balance)에 누적하는 기능
 * 			=> 파라미터 : 입금할 금액(amount, 정수), 리턴값 : 없음
 * 			=> 잔고 누적(입금) 후 다음과 같이 출력
 * 				"입금된 금액 : XXXX원, 현재잔고 : XXXX원"
 *  	3) 출금 기능 - withdraw()
 *  		=> 외부로부터 출금할 금액(amount)을 전달받아 현재잔고에서 차감하는 기능
 *  		=> 파라미터 : 출금할 금액(amount, 정수), 리턴타입 : int
 *  			a) 출금할 금액이 현재 잔고보다 클 경우 출금이 불가능하므로 다음과 같이 출력 
 *  			   "출금할 금액 : XXXX원, 현재잔고 : XXXX원" 
 *  			   "잔고가 부족합니다" 출력 후 
 *  			   출금될 금액이 없지만, int형을 리턴해야하므로 0 리턴
 *  			b) 출금할 금액이 현재잔고나 같거나 작을 경우 출금이 가능하므로 다음과 같이 동작
 *  			   "출금할 금액 : XXXX원, 현재잔고 : XXXX원" 출력 후
 *  			   현재잔고(balance)에서 출금할금액(amount)만큼 차감한 후
 *  			   "출금 후 잔고 : XXXX원" 출력하고 출금할금액(amount)만큼 리턴
 */
class Account{
	// 멤버변수 선언
	String accountNo;
	String ownerName;
	int balance;
	
		
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
		System.out.println();
	}
	public void deposit(int amount) { // 외부로부터 입금할 금액(amount) 전달받음
		balance += amount;
		System.out.println("입금된 금액 : " + amount +"원, 현재잔고 : " + balance + "원");
		System.out.println();
	}
	
	public int withdraw(int amount) {
//		if (balance < amount) { // 출금이 불가능한 상황
//			System.out.println("출금할 금액 : " + amount + "원, 현재잔고 : " + balance + "원");
//			System.out.println("잔고가 부족합니다.");
//			return 0;
//		} else {
//			balance -= amount;
//			System.out.println("출금할 금액 : " + amount + "원, 현재잔고 : " + balance + "원");
//			return amount;
//		}
		// => if문과 else문의 조합에서 if문에만 return문이 있을 경우 오류 발생!
		//	  따라서, else문까지 return문을 작성해야 모든 조건에서 리턴 수행됨

		// 만약, else문 대신 출금 가능한 범위를 else if문으로 작성할 경우
		// 각 조건마다 return문을 작성하더라도 나머지 조건(else)이 없으면 오류 발생
		// 따라서, 이럴 경우 다음과 같이 변경할 수 있습니다.
		if (balance < amount) { // 출금이 불가능한 상황
			System.out.println("출금할 금액 : " + amount + "원, 현재잔고 : " + balance + "원");
			System.out.println("잔고가 부족합니다.");
			// 출금 금액이 없으므로 0원 리턴하는 대신
			// 출금할 금액(amount)를 0원으로 변경
			amount = 0;
		} else if(balance >= amount){
			balance -= amount;
			System.out.println("출금할 금액 : " + amount + "원, 현재잔고 : " + balance + "원");
			
		}
		// 조건에 따른 최종금액을 if문 바깥에서 통합 리턴
		return amount; // if문과 관계없이 무조건 실행되는 문장이므로 오류가 발생하지 않음
	}
}