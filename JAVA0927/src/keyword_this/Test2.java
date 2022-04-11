package keyword_this;

public class Test2 {

	public static void main(String[] args) {
		
		MyDate m1 = new MyDate();
		m1.ShowDate();
		System.out.println("--------------------");
		
		MyDate m2 = new MyDate(2000);
		m2.ShowDate();
		System.out.println("--------------------");
		
		MyDate m3 = new MyDate(2013, 11);
		m3.ShowDate();
		System.out.println("--------------------");
		
		MyDate m4 = new MyDate(2013, 12, 29);
		m4.ShowDate();
	}

}

// 날짜(연도, 월, 일)을 관리하는 MyDate 클래스 정의
class MyDate{
	int year;
	int month;
	int day;
	
	public MyDate() {
		this(1900, 1, 1);
		System.out.println("MyDate() 호출됨");
	}
	
	public MyDate(int year) {
		this(year, 1, 1);
		System.out.println("MyDate(int) 호출됨");
	}
	
	public MyDate(int year, int month) {
		this(year, month, 1);
		System.out.println("MyDate(int, int) 호출됨");
	}
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		System.out.println("MyDate(int, int, int) 호출됨");
	}
	
	
	public void ShowDate() {
		System.out.println(year + "/" + month + "/" + day);
	}
}











