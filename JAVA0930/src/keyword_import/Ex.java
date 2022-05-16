package keyword_import;

// kr.co.google패키지 내의 YourPackageClass클래스를 포험시키기
//import kr.co.google.YourPackageClass;
// => 이미 kr.co.itwillbs패키지의 YourPackageClass클래스를 import 한 상태에서
//	  다른 패키지의 동일한 이름을 갖는 클래스를 import할 수 없다! (이름이 충돌함)

// kr.co.google 패키지 내의 모든 클래스를 포함시키기
// 클래스명 대신 만능문자 * 사용하여 모든 클래스를 대체
import kr.co.google.*;

//kr.co.itwillbs패키지 내의 YourPackageClass클래스를 포함시키기
import kr.co.itwillbs.Tv;
import kr.co.itwillbs.YourPackageClass;
import kr.co.itwillbs.itwillbsA;
import kr.co.itwillbs.itwillbsB;


public class Ex {
	public static void main(String[] args) {
		// 같은 패키지에 위치하는 MyPackageClass 클래스에 접근시 클래스명만으로 접근 가능
		MyPackageClass mpc = new MyPackageClass();
		
		// 주의! 다른 패키지에 위치하는 클래스 접근 시 클래스명만으로 접근이불가능하다!
		// ex) kr.co.itwillbs 패키지에 있는 YourPackageClass에 접근할 경우
//		YourPackageClass ypc = new YourPackageClass(); // 패키지명만 지정 시 오류 발생
		// => YourPackageClass cannot be resolved to a type
		// 현재 Ex클래스가 위치한 패키지 내에서 YourPackageClass클래스를 탐색하므로 없음
		
		// 반드시 패키지명.클래스명 형태로 지정해야함
		kr.co.itwillbs.YourPackageClass ypc = new kr.co.itwillbs.YourPackageClass();
	
		// kr.co.google 패키지에 있는 Tv클래스에 접근
		kr.co.google.Tv tv = new kr.co.google.Tv();
		// ==============================================================================
		
		/*
		 * import 키워드
		 * - 특정 패키지 내의 클래스명 지정 시 패키지명을 생략하기 위해 사용하는 키워드
		 * - 특정 패키지 내의 클래스를 현재 패키지 내의 클래스에서 포함시켜 사용 가능
		 * - import문을 사용하여 특정 패키지내의 클래스를 
		 * 	 패키지명.클래스명 또는 패키지명.* 형식으로 지정하면
		 * 	 클래스 내에서 해당 패키지의 클래스 지정 시 클래스명만으로 접근 가능해짐
		 *   1) 패키지명.클래스명 : 해당 패키지 내의 특정 클래스 1개만 포함
		 *   2) 패키지명.*        : 해당 패키지 내의 모든 클래스를 포함
		 * - 여러번 반복 사용 가능(여러개의 패키지 또는 패키지 내의 클래스를 동시에 지정 가능) 
		 * - 반드시 package문과 class선언부 사이에 위치해야함
		 * - 중요! 자바에서 가장 많이 사용되는 클래스들은 java.lang패키지에 위치하며
		 *   해당 패키지 내의 클래스(ex. String, System 등)들은 별도의 import없이도 접근 가능함
		 *   (즉, java.lang패키지는 유일하게 자동으로 import되는 패키지이다!)
		 * - 주의! 상위 패키지만 import했을 경우 하위 패키지는 포함되지 않는다!
		 *     
		 * < 기본 문법 >
		 * import 상위패키지명.하위패키지명.클래스명;
		 * ---- 또는 ----
		 * import 상위패키지명.하위패키지명.*;
		 * 
		 * < 자동 import 단축키 >
		 * Ctrl + Shift + O
		 * => 이 때, 프로젝트 내에 서로 다른 패키지에 중복되는 클래스가 존재할 경우
		 * 	  클래스 선택창이 표시되며, 패키지를 선택해야함
		 */

		// import문을 사용하여 포함된 kr.co.itwillbs패키지의 YourPackageClass클래스 접근 방법
		YourPackageClass ypc2 = new YourPackageClass();
		
		// kr.co.itwillbs패키지의 Tv클래스 접근
		Tv tv2 = new Tv(); // 클래스명만을 접근 가능함
		
		// kr.co.google 패키지의 YourPackageClass 클래스 접근
		// => 기존에 import문을 사용하여 kr.co.itwillbs패키지의 YourPackageClass클래스가 포함되있는
		//	  동일한 이름을 갖는 클래스는 더 이상 import가 불가능하다!
		//	  따라서, 동일한 이름의 다른 클래스는 패키지명을 포함하여 지정해야함
		kr.co.google.YourPackageClass googleYpc = new kr.co.google.YourPackageClass();
		
		// import kr.co.google.*; 형식으로 패키지 내의 모든 클래스 지정했을 경우
		GoogleA ga = new GoogleA(); // 특정 클래스가 아닌 
		GoogleB gb = new GoogleB(); // 패키지 내의 모든 클래스를 이름만으로 지정 가능
		// 단, 이미 중복되는 이름을 import시킨 다른 클래스가 있을 경우
		// 해당 클래스명은 반드시 패키지명을 포함시켜야 함
		// ex) kr.co.itwillbs패키지의 YourPackageClass와 Tv클래스는 이미 포함되어 있으므로
		Tv tv3; // kr.co.itwillbs.Tv클래스가 지정됨
		kr.co.google.Tv tv4; // kr.co.google패키지의 Tv클래스가 지정됨
		
		itwillbsA ia;
		itwillbsB ib;
		
		System.out.println("==============================================");
//		java.lang.String str; // String클래스의 정석적인 접근 방법
		// java.lang 패키지는 별도로 import가 불필요하므로 클래스명만으로 접근 가능함
		String str;
	}
}
