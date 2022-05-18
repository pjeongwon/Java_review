package method_overriding;

public class Test {

	public static void main(String[] args) {
		
		DieselCar dc = new DieselCar();
		dc.speedUp(); dc.speedDonw();
		System.out.println("-------------------------------");
		ElectricCar ec = new ElectricCar();
		ec.speedUp(); ec.speedDonw();
		
		System.out.println("===============================");
		Account acc = new Account();
		acc.balance = 50000;
		int money = acc.withdraw(100000);
		System.out.println("출금된 금액 : " + money + "원");
		System.out.println("-------------------------------");
		ItwillBank  ib = new ItwillBank();
		
		ib.balance = 50000;
		
		ib.isVip = false;
		money = ib.withdraw(100000);
		System.out.println("출금된 금액 : " + money + "원");
		System.out.println("-------------------------------");
		ib.isVip = true;
		money = ib.withdraw(100000);
		System.out.println("출금된 금액 : " + money + "원");
	}

}


// => "Car의 공통방식으로 속력 증가!" 출력
class Car{
	
	public void speedUp() {
		System.out.println("Car의 공통방식으로 속력 증가!");
	}
	public void speedDonw() {
		System.out.println("Car의 공통방식으로 속력 감소!");
	}
	
}

class DieselCar extends Car{
	@Override
	public void speedUp() {
		System.out.println("DieselCar의 방식으로 속력 증가!");
	}
	@Override
	public void speedDonw() {
		System.out.println("DieselCar의 방식으로 속력 감소!");
	}
}

class ElectricCar extends Car{
	@Override
	public void speedUp() {
		System.out.println("Electric의 방식으로 속력 증가!");
	}
	@Override
	public void speedDonw() {
		System.out.println("Electric의 방식으로 속력 감소!");
	}
}

// ---------------------------------------------------------------

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

// Account 클래스를 상속받는 ItwillBank클래스 정의
// - 멤버변수 : isVip(boolean타입)
// - withdraw() 메서드 오버라이딩
//   => VIP(isVip 변수가 true)이면 출금 시 잔고가 부족해도 무조건 출금(= 마이너스 통장 기능 탑재)
//   ex) 현재 잔고가 50000원일 때 일반 Account클래스에서는 100000원 출금 시 출금 불가능
//       그러나, VIP일 경우 ItwillBank클래스에서는 10만원 출금 가능(잔고가 -50000원이 됨)
//	 => 단, VIP가 아닐 경우(isVip변수가 false)일반 출금 기능을 그대로 적용
//	    (잔고 부족시 출금 불가)

class ItwillBank extends Account {
	boolean isVip;
	@Override
	public int withdraw(int amount) {
		if(!isVip) {
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
		else if(isVip) {
			System.out.println("Vip님 환영합니다!");
			System.out.println("출금할 금액 : " + amount + "원, 현재잔고 : " + balance + "원");
			balance -= amount;
			System.out.println("현재 잔고 : " + balance + "원");
		}

		return amount; 
		}
}






