package oop_interface;

public class Ex7 {

	public static void main(String[] args) {
		/*
		 * 인터페이스 필요성(장점)
		 * 4. 모듈간 독립적 프로그래밍으로 인한 개발 기간 단축
		 * - 각 모듈간에 연계된 부분을 공통 인터페이스 내의 추상메서드로 구현하고
		 * 	 각 모듈에서는 해당 인터페이스를 상속받아 구현함으로써
		 *   공통된 작업 형태를 지닌 채 각각의 서로의 작업만 작성하고
		 *   상대방 작업 진행 여부와 관계없이 임의의 데이터로 테스트가 가능함
		 * - 따라서,인터페이스 사용 시 서로간의 작업진행과 관계없이
		 *   각자의 작업이 진행되고, 공통 모듈을 통해 테스트가 수행되기 때문에
		 *   개발기간이 단축될 수있다!
		 * 
		 */
		// 개발자 입장에서의 코드 동작 확인
		// => 디자이너측에서 생성하여 전달할 아이디, 패스워드 임의로 입력하여 확인 가능
		DeveloperLogin devl = new DeveloperLogin();
		// login()메서드를 호출하여 임의의 아이디 및 패스워드를 메서드에 전달하여 확인하고
		// 판별 결과를 String 타입 변수로 리턴받아 출력해보기
		String loginResult = devl.login("admin", "1234"); 
		System.out.println("로그인 결과 : " + loginResult);
		
		System.out.println("===================================");
		
		// 디자이너 입장에서의 코드 동작 확인
		// => 개발자측에 아이디와 패스워드를 전달하고, 임의의 리턴값을 리턴받아 확인 가능
		DesignerLogin desl = new DesignerLogin();
		String loginResult2 = desl.login("root", "1234");
		System.out.println("로그인 결과 : " + loginResult2);
		// 로그인 성공 페이지 or 로그인 실패 페이지로 이동 작업 등을 수행 가능
	}

}

/*
 * 로그인 작업을 개발자와 디자이너가 협업하여 개발한다고 가정
 * => 로그인 작업의 공통 부분을 추상메서드로 정의하여
 * 	  기본적인 틀을 제시하면 개발자와 디자이너는 각각 별도로 독립된 작업 수행 가능함
 * 
 */

interface LoginInterface{
	// 디자이너는 입력받은 id와 password를 문자열로 전달하고
	// 개발자는 id와 password를 전달받아 로그인 처리 후 결과를 문자열로 리턴
	// => 두 작업의 공통점을추출하여 login()메서드를 정의 할 경우
	//	  파라미터 : 아이디, 패스워드 - 리턴타입 : String
	public String login(String id, String password);
}

// 개발자 입장에서 수행해야하는 로그인 작업 구현
// => 공통 인터페이스(LoginInterface)를 상속받아 추상메서드(login())를 구현하여 로그인 작업 수행
// 	  이 때, 디자이너쪽에서 넘어올 데이터는 임의의 데이터로 대체 가능
//	  (즉, 개발자가 직접 메서드를 호출하여 임의의 데이터를 메서드에 전달하면 됨)
// => 상호간에 사용할 파라미터를 미리 약속했기 때문에 가능함
class DeveloperLogin implements LoginInterface{

	@Override
	public String login(String id, String password) {
		// 개발자 입장에서는 어떤 데이터가 현재 전달되는지는 중요하지 않고
		// 전달받은 파라미터(데이터)가 로그인 기준을 충족하는지만 판별한 후
		// 해달 판별 결과값을 문자열로 리턴하면 됨
		System.out.println("아이디 : " + id);
		System.out.println("패스워드 : " + password);
		
		String result = "";
		
		// 아이디가 "admin"이고, 패스워드가 "1234"면 로그인 성공, 아니면 실패 작업 판별
		if(id.equals("admin") && password.equals("1234")) { // 아이디, 패스워드 일치할 경우
			result = "로그인 성공";
		} else { // 아이디 또는 패스워드가 틀렸을 경우
			result = "로그인 실패";
		}
		
		// 로그인 결과(result)값 리턴
		return result;
	}
	
}

// =====================================================================
// 디자이너 입장에서의 로그인 작업
// => 개발자측에 전달할 데이터(아이디, 패스워드)를 생성하고
//    공통 추상메서드를 구현항 파라미터로 전달했을 때
//    전달한 데이터가 잘 전달되었는지 화인하고,
//	  리턴되는 결과값을 임의로 설정하여 리턴 후의 작업을 수행할 수 있다!

class DesignerLogin implements LoginInterface{

	@Override
	public String login(String id, String password) {
		// 실제로는 개발자가 구현할 메서드이지만,
		// 개발자와 별개로 독립적인 작업을 위해 공통 메서드를 임시로 구현하고
		// 개발자 입장에서 처리해야할 작업(로그인 작업)은 생략한 채
		// 디자이너가 전달하는 데이터 확인 및 임시 결과 값 리턴 작업만 기술
		System.out.println("로그인 정보 파라미터 확인");
		System.out.println("아이디 : " + id);
		System.out.println("패스워드 : " + password);
		
		// 디자이너 입장에서는 아이디, 패스워드에 대한 처리작업은 중요하지 않으므로
		// 작업이 처리되었다는 가정하에 임의의 결과 값을 설정하여 직접 리턴
		return "로그인 성공";
	}
	
}






