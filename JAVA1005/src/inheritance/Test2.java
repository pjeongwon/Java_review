package inheritance;

public class Test2 {

	public static void main(String[] args) {
		
		ItwillBank ib = new ItwillBank();
		ib.accountNo = "111-11-11111";
		ib.ownerName = "홍길동";
		ib.showAccountInfo();
		
		ib.deposit(50000);
		int money = ib.withdraw(3000);
		System.out.println("출금된 금액 : " + money + "원");
		
		System.out.println("------------------------------------------");
		
		// ItwillBank클래스(서브클래스)에서 직접 정의한 멤버에 접근
		ib.contract("자동차");
	}

}

/*
 *  Account 클래스를 상속받는 ItwillBank클래스 정의
 *  멤버변수 : 보험 명(insureName, 문자열)
 *  메서드 : 보험계약 contract() - 파라미터 : 보험명, 리턴값 : 없음
 *  		 => 전달받은 보험명을 멤버변수에 저장
 *  		 => "XXX 보험 계약 완료!" 출력(XXX은 보험명) 
 */

class ItwillBank extends Account{
	String insureName;
	
	public void contract(String insureName) {
		this.insureName = insureName;
		System.out.println(insureName + "보험 계약 완료");
	}
}


class Account{
	String accountNo;
	String ownerName;
	int balance;
	
		
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
		System.out.println();
	}
	public void deposit(int amount) { 
		balance += amount;
		System.out.println("입금된 금액 : " + amount +"원, 현재잔고 : " + balance + "원");
		System.out.println();
	}
	
	public int withdraw(int amount) {
		if (balance < amount) { 
			System.out.println("출금할 금액 : " + amount + "원, 현재잔고 : " + balance + "원");
			System.out.println("잔고가 부족합니다.");

			amount = 0;
		} else if(balance >= amount){
			balance -= amount;
			System.out.println("출금할 금액 : " + amount + "원, 현재잔고 : " + balance + "원");
			
		}

		return amount; 
	}
}