package keyword_super;

public class Exam {
	public static void main(String[] args) {
		ChildExam child = new ChildExam();
	}
}

class ParentExam {
	public String nation;

	public ParentExam() { // 5번
		this("대한민국"); // 6번  
		System.out.println("Parent() call"); // 10번(출력 2번)
	}

	public ParentExam(String nation) { // 7번
		super(); 
		this.nation = nation; // 8번
		System.out.println("Parent(String nation) call"); // 9번(출력 1번)
	}
}

class ChildExam extends ParentExam {
	private String name;

	public ChildExam() { // 1번
		this("홍길동"); // 2번 - ChildeExam(String)생성자 호출
		System.out.println("Child() call"); // 13번(출력 4번)
	}

	public ChildExam(String name) { // 3번
		super(); // 4번
		// ParentExam() 생성자 호출됨
		this.name = name; // 11번
		System.out.println("Child(String name) call"); // 12번(출력 3번)
	}
}
