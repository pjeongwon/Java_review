package keyword_final;

import com.sun.corba.se.impl.orbutil.closure.Constant;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * static 키워드
		 * - static키워드가 선언된 멤버는 인스턴스 생성 전 클래스 로딩 시 함께 메모리에 로딩됨
		 * - 멤버변수에 static키워드 사용할 경우 클래스 로딩이 Method Area(영역)에 로딩되며
		 * 	 모든 인스턴스가 하나의 변수를 공유하게 되고, 클래스명만으로 접근 가능함
		 * 
		 * static final 상수
		 * - static과 final키워드를 모두 사용하여 선언한 변수
		 * - 클래스 로딩 시 함께 로딩되고 모든 인스턴스가 하나의 변수를 공유하며,
		 *   클래스명만으로 변수에 접근 가능 = static특징
		 * - 값 변경 불가능 = final특징
		 * - 진정한 의미에서의 상수(Constant)를 뜻함
		 * - 일반적으로 상수 선언 시 접근제한자는 public 사용(= 누구나 접근 가능)
		 * - 변수를 상수로 선언할 때 일반 변수와 구분하기 위해 이름을 모두 대문자로 작성
		 * 	 (단어 구분을 위해 언더스코어(_) 사용)
		 * 	 ex) int finalMember라는 변수를 상수로 선언할 경우
		 * 	     public static final int FINAL_MEMBER;
		 * - static과 final키워드의 순서는 무관하나, 보통 static을 먼저 표기
		 * 
		 */
		
		// 차량 예약을 위한 예약 정보를 입력할 경우
		Car c1 =new Car();
		c1.setCompany("HYUNDAI"); // 제조사
		c1.setCompany("hyundai"); // 제조사(소문자로 작성 시)
		c1.setModelName("SONATA"); // 모델명
		c1.setColor(0xFFFFFF); // 색상
		// => 일반적인 변수를 사용하여 값을 입력할 경우
		//    문자열은 잘못된 값을 입력하거나 대소문자가 다르면 다른 값으로 인식되어
		//	  프로그램 상의 오류가 발생할 확률이 높다!
		// => 또한, 입력되는 값이 다양할 경우 해당 값을 모두 외우기가 힘들다!
		
		// Car 클래스 인스턴스 c1에 저장된 차량의 제조사가 현대자동차인지 판별
		if(c1.getCompany() == "HYUNDAI") {
			// c1인스턴스의 company변수값과 "HYUNDAI"문자열을 비교하여
			// 두 문자열이 동일할 경우 if문 블록 내의 코드를 실행하게 되는데
			// 대소문자가 다르면 다른 값으로 취급되어 else문이 실행됨
			System.out.println("현대자동차입니다!");
		} else { 
			System.out.println("현대자동차가 아닙니다!");
		}
		
		// 모델명 판별
		if(c1.getModelName() == "SONATA") {
			System.out.println("소나타입니다!");
		} else { 
			System.out.println("소나타가 아닙니다!");
		}
		
		// 모델 색상 판별
		if(c1.getColor() == 0xFFFFFF) {
			System.out.println("노란색입니다!");
		} else { 
			System.out.println("흰색입니다!");
		}
		
		// 이처럼 일반 변수를 사용하여 값을 사용할 경우
		// 해당 값들에 대한 잘못된 사용으로 인해 프로그램 상의 오류가 발생할 수 있으므로
		// 조심해서 접근해야한다. => 불편!
		
		System.out.println("======================================");
		
		// 상수를 제공하는 ConstantCar클래슬ㄹ 활용한 차량 예약
		ConstantCar c2 =new ConstantCar();
		
		// Setter를 통해 값을 저장할 때 별도의 값을 직접 입력할 수도 있으나
		// 상수를 통해 값을 선택하면 편리하며 정확한 값을 입력 가능하다!
		// => 상수 선택시 클래스명만으로 접근 가능
		c2.setCompany(ConstantCar.COMPANY_HYUNDAI);
		c2.setModelName(ConstantCar.HYUNDAI_MODEL_SONATA);
		c2.setColor(ConstantCar.COLOR_PERFECT_BLACK);
		
		// 값을 비교할 경우에도 직접 비교할 값을 입력하지 않고
		// 상수값을 가져와서 비교하면 되므로 정확성이 향상됨
		if(c2.getCompany() == ConstantCar.COMPANY_HYUNDAI) {
		
			System.out.println("현대자동차입니다!");
		} else { 
			System.out.println("현대자동차가 아닙니다!");
		}
		
		// 모델명 판별
		if(c2.getModelName() == ConstantCar.HYUNDAI_MODEL_SONATA) {
			System.out.println("소나타입니다!");
		} else { 
			System.out.println("소나타가 아닙니다!");
		}
		
		// 모델 색상 판별
		if(c2.getColor() == ConstantCar.COLOR_PERFECT_BLACK) {
			System.out.println("퍼펙트 블랙 생상 입니다!");
		} else if(c1.getColor() == ConstantCar.COLOR_CREAMY_WHITE){ 
			System.out.println("흰색입니다!");
		}
	}
	

}

// 자동차 구매를 위한 예약 클래스 Car 정의
// 차량모델명, 제조사, 색상 등을 선택하기 위한 멤버변수를 선언
class Car{
	private String company; // 제조사
	private String modelName; // 모델명
	private int color; // 색상(페인트 색상 코드값을 16진수 6자리로 사용한다고 가정)
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
}

// 상수를 활용하여 자동차 예약관련 데이터를 제공할 경우

class ConstantCar{
	private String company; // 제조사
	private String modelName; // 모델명
	private int color; // 색상(페인트 색상 코드값을 16진수 6자리로 사용한다고 가정)
	
	/*
	 * -------------------------------------------------------------------
	 * 잘못된 값을 입력하는 등의 문제가 발생할 여지를 없애기 위해
	 * 값으로 사용될 고정된 데이터들을 상수(public static final)로 선언해두고
	 * 사용자가 선택하도록 제공하여 오류 발생 확률을 낮출 수 있으며, 편리해짐
	 * => 외부에서 값을 사용(접근)할 때 클래스명만으로 상수를 선택할 수 있으며, 
	 *    함부로 값을 변경하지 못하도록 고정된 값을 제공할 수 있음
	 * => 또한, 실제 저장된 데이터와 무관하게 상수의 이름만 보면
	 *    해당 데이터를 파악할 수 있으므로 잘못된 값을 사용할 위험성도 제거됨
	 * ------------------------------------------------------------------- 
	 */
	// 제조사를 저장하는 상수 선언
	public static final String COMPANY_HYUNDAI = "HYUNDAI";
	public static final String COMPANY_KIA = "KIA";
	public static final String COMPANY_CHEVROLET = "CHEVROLET";
	
	// 모델명을 저장하는 상수
	public static final String HYUNDAI_MODEL_SONATA = "SONATA";
	public static final String KIA_MODEL_K5 = "K5";
	public static final String CHEVROLET_MODEL_MALIBU = "MALIBU";
	
	// 색상코드를 저장하는 상수
	public static final int COLOR_PERFECT_BLACK = 0x000000;
	public static final int COLOR_CREAMY_WHITE = 0xFFFFDD;
	public static final int COLOR_BARCELONA_RED = 0xFF0022;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
}

















