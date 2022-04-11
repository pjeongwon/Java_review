package keyword_this;

public class Test {

	public static void main(String[] args) {
		
	Account ac1 = new Account("999-99-99999", "이순신", 10000);
	System.out.println("계좌번호 : " + ac1.getAccountNo());
	System.out.println("예금주명 : " + ac1.getOwnerName());
	System.out.println("현재잔고 : " + ac1.getBalance() + "원");
	
	System.out.println("-------------------------------");
	
	ac1.setAccountNo("111-11-11111");
	ac1.setOwnerName("홍길동");
//	ac1.setBalance(50000); // 불필요하여 제거된 Setter
		
	System.out.println("계좌번호 : " + ac1.getAccountNo());
	System.out.println("예금주명 : " + ac1.getOwnerName());
	System.out.println("현재잔고 : " + ac1.getBalance() + "원");
		
		
	}

}


class Account {
	private String accountNo;
	private String ownerName;
	private int balance;

	// 계좌번호, 예금주명, 현재잔고를 입력받아 멤버변수를 초기화하는 생성자 정의
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
















