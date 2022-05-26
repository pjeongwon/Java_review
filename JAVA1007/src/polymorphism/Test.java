package polymorphism;

public class Test {

	public static void main(String[] args) {
		
		스마트폰 갤럭시노트20 = new 스마트폰();
		// 스마트폰(서브클래스) 타입으로 참조(사용) 가능한 메서드(기능) : 3개
		갤럭시노트20.전화();
		갤럭시노트20.문자();
		갤럭시노트20.카톡();

		System.out.println("-----------");
		
		피처폰 어머니폰 = new 피처폰();
		// 피처폰(슈퍼클래스) 타입으로 참조 가능한 메서드(기능) : 2개
		어머니폰.전화();
		어머니폰.문자();
		
		System.out.println("-----------");
		
		// 업캐스팅 예)
		// 스마스폰(갤럭시노트20)을 어머니께 드릴 경우
		어머니폰 = 갤럭시노트20; // 스마트폰(서브클래스)타입 -> 피처폰(슈퍼클래스)타입으로 변환
		// => 업캐스팅(자동 형 변환)이므로 형 변환 연산자 생략 가능
		
		// 어머니가 사용 가능한 기능 : 2개
		어머니폰.전화(); // 피처폰에서 사용가능한 기능(O)
		어머니폰.문자(); // 피처폰에서 사용가능한 기능(O)
//		어머니폰.카톡(); // 스마트폰에서만 사용가능한 기능 = 사용 불가
		// => 스마트폰을 피처폰 타입으로 참조할 경우 참조 영역이 축소됨
		
		System.out.println("-----------");
		// 다른 스마트폰을 구입해서 어머니께 드릴 경우
		// => 다른 인스턴스라 하더라도 스마트폰 타입이면 무조건 업캐스팅 시 문자, 전화 기능 사용 가능
		스마트폰 아이폰 = new 스마트폰();
		어머니폰 = 아이폰;
		어머니폰.전화();
		어머니폰.문자();
//		어머니폰.카톡();
		
		System.out.println("===========");
		
		// 다운캐스팅 예)
		어머니폰 = new 스마트폰(); // 스마트폰 -> 피처폰으로 업캐스팅
		// 참조 가능한 영역의 축소 발생 => 사용 가능한 기능 3가지 -> 2가지로 축소됨
		
		// 어머니폰을 내(스마트폰)가 전달받을 경우
//		스마트폰 내폰 = 어머니폰; // 자동 형 변환 불가능하므로 강제 형 변환 필수!
		스마트폰 내폰 = (스마트폰)어머니폰; // 다운캐스팅 수행
		// 참조 가능한 영역의 확대 발생 => 사용 가능한 기능 2가지 -> 3가지로 확대됨
		// => 이전에 스마트폰 -> 피처폰으로 업캐스팅 된 폰을 다시 다운캐스팅 하므로 안전하다!
		내폰.전화();
		내폰.문자();
		내폰.카톡();
		
	}

}

class 피처폰{
	
	public void 전화() {
		System.out.println("전화 기능!");
	}
	public void 문자() {
		System.out.println("문자 기능!");
	}
}


class 스마트폰 extends 피처폰{

	public void 카톡() {
		System.out.println("카톡 기능!");
	}
	
}










