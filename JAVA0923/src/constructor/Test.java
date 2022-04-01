package constructor;

public class Test {

	public static void main(String[] args) {
		
		Account acc = new Account("111-11-1111", "홍길동", 10000); // 기본 생성자 호출
		acc.showAccountInfo();
		System.out.println("-----------------------");
		
		// 또 다른 Account 인스턴스 생성
		Account acc2 = new Account("222-22-2222", "임꺽정", 30000);
		acc2.showAccountInfo();
	}

}



/* 은행계좌 클래스(Account) 정의
 * 1. 멤버변수
 * 		- 계좌번호(accountNo, 문자열) : XXX-XX-XXXX
 * 		- 예금주명(ownerName, 문자열) : XXX 
 * 		- 현재잔고(balance, 정수)	  : XXXXXX원
 * 
 * 2. 생성자
 * 		- 계좌번호(newAccountNo), 예금주명(newOwnerName), 현재잔고(newBalance)를 전달받아
 * 		  멤버변수를 초기화하는 파라미터 생성자 정의
 * 
 * 3. 메서드
 * 		1) 은행계좌 정보(계좌번호, 예금주명, 현재잔고)를 출력하는 showAccountInfo()
 * 			=> 파라미터 없음, 리턴값 없음
 */

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String newAccountNo, String newOwnerName, int newBalance) {
		accountNo = newAccountNo;
		ownerName = newOwnerName;
		balance = newBalance;
		
	}
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
}




