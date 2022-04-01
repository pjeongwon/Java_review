package overloading;

public class Test3 {

	public static void main(String[] args) {
		
		//3)
		Account acc1 = new Account("222-22-22222", "장길산", 1000000);
		System.out.println("--------------------------");
		acc1.showAccountInfo();
		System.out.println("--------------------------");
		//1)
		Account acc2 = new Account("111-11-11111");
		acc2.showAccountInfo();
		System.out.println("--------------------------");
		//2)
		Account acc3 = new Account("333-33-33333", "임꺽정");
		acc3.showAccountInfo();
		System.out.println("--------------------------");
	}

}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	// 생성자 오버로딩
	// 1. 기본 생성자 정의(계좌번호 "111-11-11111", 예금주명 "홍길동", 현재잔고 0으로 초기화)
	// 2. 파라미터 생성자 정의
	//		1) 계좌번호(newAccountNo)만 전달받고, 예금주명 "홍길동", 현재잔고 0으로 초기화
	public Account(String newAccountNo) {
		accountNo = newAccountNo;
		ownerName = "홍길동";
		balance = 0;
	}
	//		2) 계좌번호(newAccountNo)와 예금주명(newOwnerName)만 전달받고, 현재잔고 0으로 초기화
	public Account(String newAccountNo, String newOwnerName) {
		accountNo = newAccountNo;
		ownerName = newOwnerName;
		balance = 0;
	}
	//		3) 계좌번호(newAccountNo)와 예금주명(newOwnerName), 현재잔고(newBalance) 전달받아 초기화
	public Account(String newAccountNo, String newOwnerName, int newBalance) {
		System.out.println("Account(String, String, int) 생성자 호출됨!");
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
