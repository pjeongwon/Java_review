package oop_basic;

public class Test {

	public static void main(String[] args) {
		
		// Car 클래스 인스턴스 생성(변수명 car)
		// 속성 : 제조사(현대), 모델명(그랜져), 가격(3500)
		Car car = new Car();
		car.company = "현대";
		car.modelName = "그랜져";
		car.price = 3500;
		System.out.println("제조사 : " + car.company + "\n모델명 : " + car.modelName + "\n가격 : " + car.price);
		
		System.out.println("========================");
		
		// 계좌번호 : 111-11-11111, 예금주명 : 홍길동, 현재잔고 : 10000원
		Account account1 = new Account();
		account1.accountNo = "111-11-11111";
		account1.onwerName = "홍길동";
		account1.balance = 10000;
		System.out.println("계좌번호 : " + account1.accountNo + "\n예금주명 : " + account1.onwerName + "\n현재잔고 : " + account1.balance + "원");
		System.out.println("");
		
		Account account2 = new Account();
		account2.accountNo = "222-22-22222";
		account2.onwerName = "임꺽정";
		account2.balance = 100000000;
		System.out.println("계좌번호 : " + account2.accountNo + "\n예금주명 : " + account2.onwerName + "\n현재잔고 : " + account2.balance + "원");
	}

} // Test 클래스 끝

/*
 * 자동차(Car) 클래스 정의
 * 속성
 * 1) 제조사(company) - 문자열
 * 2) 모델명(modelName) - 문자열
 * 3) 가격(price) - 정수
 */

class Car{
	String company;
	String modelName;
	int price;
}

// -----------------------------

/* 은행계좌(Account) 클래스 정의
 * 속성
 * 1) 계좌번호(accountNo, 문자열) - "계좌번호 : XXX-XX-XXXXX"
 * 2) 예금주명(onwerName, 문자열) - "예금주명 : XXX"
 * 3) 현재잔고(balance, 정수)     - "현재잔고 : XXXXXXXXXXXXXXX원"
 * 
*/

class Account{
	String accountNo;
	String onwerName;
	int balance;
}
