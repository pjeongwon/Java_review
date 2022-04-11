package access_modifier;

public class Test2 {

	public static void main(String[] args) {

		Account ac1 = new Account();
		ac1.setAccountNo("111-11-11111");
		ac1.setOwnerName("홍길동");
//		ac1.setBalance(50000); // 불필요하여 제거된 Setter
		
		System.out.println("계좌번호 : " + ac1.getAccountNo());
		System.out.println("예금주명 : " + ac1.getOwnerName());
		System.out.println("현재잔고 : " + ac1.getBalance() + "원");
	}

}

class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	
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
	
	
	
//	public String getAccountNo() {
//		return accountNo;
//	}
//	public void setAccountNo(String newAccountNo) {
//		accountNo = newAccountNo;
//	}
//	
//	public String getOwnerName() {
//		return ownerName;
//	}
//	public void setOwnerName(String newOwnerName) {
//		ownerName = newOwnerName;
//	}
//
//	public int getBalance() {
//		return balance;
//	}
	// 잔고를 설정하는 기능은 불필요하며, 입금(deposit()) 메서드가 대신하므로 Setter는 제외 가능
//	public void setBalance(int newBalance) {
//		balance = newBalance;
//	}
	
	
}
