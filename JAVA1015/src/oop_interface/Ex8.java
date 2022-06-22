package oop_interface;

public class Ex8 {

	public static void main(String[] args) {
//		LGTv lg리모컨 = new LGTv();
		
		LgRemoteController lg리모컨 = new LgRemoteController();
		lg리모컨.setLgtv(new LGTv());
		
		lg리모컨.changeChannel(10);
		lg리모컨.channelUp();
		lg리모컨.channelDown();
		lg리모컨.volumnUp();
		lg리모컨.volumnDown();
		lg리모컨.LG고유기능();
		
		SamsungRemoteController 삼성리모컨 = new SamsungRemoteController();
		삼성리모컨.setSamsungTv(new SamsungTv());
		
		삼성리모컨.changeChannel(10);
		삼성리모컨.channelUp();
		삼성리모컨.channelDown();
		삼성리모컨.volumnUp();
		삼성리모컨.volumnDown();
		삼성리모컨.SAMSUNG고유기능();
		
		System.out.println("==============================");
		// LG리모컨과 삼성리모컨은 각각 자사의 TV만 제어 가능하다!
		// (= Object를 제외하면 서로 상속관계가 없기 때문)
//		삼성리모컨.setSamsungTv(new LGTv()); // 오류발생! 적합하지 않은 파라미터
		
		// 만약, 리모컨 하나로 LGTv와 SamsungTV를 다루려면
		// 해당 리모컨은 두 제조사 TV의 공통 기능을 제공하는 TV인터페이스를 구현해야한다!

		만능리모컨 만능리모컨 = new 만능리모컨();
		만능리모컨.setTv(new LGTv());
		만능리모컨.changeChannel(10);
		만능리모컨.channelUp();
		만능리모컨.channelDown();
		만능리모컨.volumnUp();
		만능리모컨.volumnDown();
//		만능리모컨.LG고유기능(); // 상위타입으로 접근 불가 (= 만능리모컨은 LG고유기능 버튼이 없음)
		
		만능리모컨.setTv(new SamsungTv());
		만능리모컨.changeChannel(10);
		만능리모컨.channelUp();
		만능리모컨.channelDown();
		만능리모컨.volumnUp();
		만능리모컨.volumnDown();
//		만능리모컨.SAMSUNG고유기능(); // 상위타입으로 접근 불가 (= 만능리모컨은 삼성고유기능 버튼이 없음)
		
		
		
	}

}

// 만능리모컨 클래스 정의
// => 제조사별 인스턴스를 직접 다루지 않고 상위개념은 TV인터페이스를 다루면
//    제조사와 상관없이 모든 TV를 다룰 수 있다!

class 만능리모컨 {
	TV tv; // 상위타입인 TV인터페이스 타입 변수 선언

	public void setTv(TV tv) {
		this.tv = tv;
	}

	// TV타입으로 다룰 수 있는 기능을 제외한
	public void channelUp() { 
		tv.channelUp();
	}
	
	public void channelDown() {
		tv.channelDown();
	}

	public void power() {
		tv.power();
	}

	public void changeChannel(int channel) {
		tv.changeChannel(channel);
	}

	public void volumnUp() {
		tv.volumnUp();
	}

	public void volumnDown() {
		tv.volumnDown();
	}
}

// LG리모컨은 LG TV에 신호를 전달하는 기능이므로
// LGTv클래스 인스턴스를 전달받아 해당 인스턴스의 메서드를 호출하여 기능을 실행하도록 함
class LgRemoteController{
	LGTv lgtv;

	public void setLgtv(LGTv lgtv) {
		this.lgtv = lgtv;
	}
	
	// LG리모컨에서 기능을 실행하는 것이 아닌 LGTv인스턴스의 메서드를 호출하여 기능을 실행
	public void channelUp() { 
		lgtv.channelUp();
	}
	
	public void channelDown() {
		lgtv.channelDown();
	}

	public void power() {
		lgtv.power();
	}

	public void changeChannel(int channel) {
		lgtv.changeChannel(channel);
	}

	public void volumnUp() {
		lgtv.volumnUp();
	}

	public void volumnDown() {
		lgtv.volumnDown();
	}
	
	public void LG고유기능() {
		lgtv.LG고유기능();
	}
	
}

class SamsungRemoteController {
	SamsungTv samsungTv;

	public void setSamsungTv(SamsungTv samsungTv) { // 인스턴스 전달받아 저장
		this.samsungTv = samsungTv;
	}
	
	
	public void channelUp() { 
		samsungTv.channelUp();
	}
	
	public void channelDown() {
		samsungTv.channelDown();
	}

	public void power() {
		samsungTv.power();
	}

	public void changeChannel(int channel) {
		samsungTv.changeChannel(channel);
	}

	public void volumnUp() {
		samsungTv.volumnUp();
	}

	public void volumnDown() {
		samsungTv.volumnDown();
	}
	
	public void SAMSUNG고유기능() {
		samsungTv.SAMSUNG고유기능();
	}
	
}


/*
 * TV 제조사(Samsung, LG)에서 각 TV를 생산할 때
 * 실제 동작하는 방식이 조금씩 다르지만, 기본적인 기능(전원, 볼륨, 채널, 메뉴)의 개념은 동일함
 * 각 제조사마다 고유의 기능도 TV에 추가하므로 각각의 TV마다 서로 다른 기능도 가짐
 * => 이 때, 각 제조사의 리모컨으로는 해당 제품만 제어할 수 있지만
 * 	  만능리모컨을 사용하면 해당 TV와 페어링을 통해 공통된 기능을 하나의 리모컨으로 제어할 수 있음 
 */

// TV 고유 기능(공통 기능)을 제공하는 인터페이스 정의
interface TV{
	// 모든 TV는 전원 ON/OFF 기능과 채널 업, 다운 / 볼륨 업, 다운 기능을 공통으로 제공함
	// 1. 전원 ON/OFF 기능을 제공하는 power()메서드 정의
	// 	  => 파라미터 없음, 리턴값 없음
	public void power();
	
	// 2. 채널 UP/DOWN 기능을 제공하는 channelUp(), channelDown()메서드 정의
	//	  => 파라미터 없음, 리턴값 없음
	public void channelUp();
	public void channelDown();
	
	// 3. 채널 변경 기능을 제공하는 changeChannle() 메서드 정의
	//	  => 파라미터 1개(channel, 정수), 리턴값 없음
	public void changeChannel(int channel);

	// 4. 볼륨 UP/DOWN 기능을 제공하는 volumnUp(), volumnDown()메서드 정의
	//	  => 파라미터 없음, 리턴값 없음
	public void volumnUp();
	public void volumnDown();
}



// LGTv클래스 정의 시 TV인터페이스 구현
class LGTv implements TV{
	int channel;
	int volumn;
	boolean isPowerOn; // 전원 ON/OFF상태를 저장하는 변수
	final int MAX_CHANNEL = 20;
	final int MIN_CHANNEL = 0;
	final int MAX_VOLUMN = 20;
	final int MIN_VOLUMN = 0;
	
	@Override
	public void channelUp() { // 채널 증가 기능
		channel++;
		
		// 증가된 채널이 MAX_CHANNEL보다 클 경우 현재 채널을 최소채널(0)로 설정
		if(channel > MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
		
		System.out.println("LGTV 현재 채널 : " + channel);
	}
	
	@Override
	public void channelDown() { // 채널 감소 기능
		channel--;
		
		// 감소된 채널이 MIN_CHANNEL보다 작을 경우 현재 채널을 최대채널(MAX_CHANNEL)로 변경
		if(channel < MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
		
		System.out.println("LGTV 현재 채널 : " + channel);
	}

	@Override
	public void power() {
		// 전원버튼을 누를 때 마다 전원 상태(isPowerOn)를 반전시킴(ON -> OFF, OFF -> ON)
		// => 현재 전원 상태(isPowerOn)를 반대로 변경(true -> false, false -> true로 변경)
		isPowerOn = !isPowerOn;
	}

	@Override
	public void changeChannel(int channel) {
		// 현재 전달 받은 채널이 최소채널과 최대채널 사이일 경우 채널값을 변경하고
		// 해당 범위를 벗어나면 변경하지 않고 종료
		if(channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
			this.channel = channel;
			System.out.println("LGTV 현재 채널 : " + channel);
		}
	}

	@Override
	public void volumnUp() {
		volumn++;
		
		// 증가된 볼륨이 MAX_VOLUMN보다 클 경우 현재 볼륨을 MAX_VOLUMN으로 고정
		if(volumn > MAX_VOLUMN) {
			volumn = MAX_VOLUMN;
		}
		
		System.out.println("LGTV 현재 볼륨 : " + volumn);
	}

	@Override
	public void volumnDown() {
		volumn--;
		
		// 증가된 볼륨이 MIN_VOLUMN보다 작을 경우 현재 볼륨을 MIN_VOLUMN으로 고정
		if(volumn < MIN_VOLUMN) {
			volumn = MIN_VOLUMN;
		}
		
		System.out.println("LGTV 현재 볼륨 : " + volumn);
	}
	
	public void LG고유기능() {
		System.out.println("LG TV만의 고유 기능!");
	}
}



class SamsungTv implements TV{
	int channel;
	int volumn;
	boolean isPowerOn; // 전원 ON/OFF상태를 저장하는 변수
	final int MAX_CHANNEL = 20;
	final int MIN_CHANNEL = 0;
	final int MAX_VOLUMN = 20;
	final int MIN_VOLUMN = 0;
	
	@Override
	public void channelUp() { // 채널 증가 기능
		channel++;
		
		// 증가된 채널이 MAX_CHANNEL보다 클 경우 현재 채널을 최소채널(0)로 설정
		if(channel > MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
		
		System.out.println("SamsungTv 현재 채널 : " + channel);
	}
	
	@Override
	public void channelDown() { // 채널 감소 기능
		channel--;
		
		// 감소된 채널이 MIN_CHANNEL보다 작을 경우 현재 채널을 최대채널(MAX_CHANNEL)로 변경
		if(channel < MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
		
		System.out.println("SamsungTv 현재 채널 : " + channel);
	}

	@Override
	public void power() {
		// 전원버튼을 누를 때 마다 전원 상태(isPowerOn)를 반전시킴(ON -> OFF, OFF -> ON)
		// => 현재 전원 상태(isPowerOn)를 반대로 변경(true -> false, false -> true로 변경)
		isPowerOn = !isPowerOn;
	}

	@Override
	public void changeChannel(int channel) {
		// 현재 전달 받은 채널이 최소채널과 최대채널 사이일 경우 채널값을 변경하고
		// 해당 범위를 벗어나면 변경하지 않고 종료
		if(channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
			this.channel = channel;
			System.out.println("SamsungTv 현재 채널 : " + channel);
		}
	}

	@Override
	public void volumnUp() {
		volumn++;
		
		// 증가된 볼륨이 MAX_VOLUMN보다 클 경우 현재 볼륨을 MAX_VOLUMN으로 고정
		if(volumn > MAX_VOLUMN) {
			volumn = MAX_VOLUMN;
		}
		
		System.out.println("SamsungTv 현재 볼륨 : " + volumn);
	}

	@Override
	public void volumnDown() {
		volumn--;
		
		// 증가된 볼륨이 MIN_VOLUMN보다 작을 경우 현재 볼륨을 MIN_VOLUMN으로 고정
		if(volumn < MIN_VOLUMN) {
			volumn = MIN_VOLUMN;
		}
		
		System.out.println("SamsungTv 현재 볼륨 : " + volumn);
	}
	
	public void SAMSUNG고유기능() {
		System.out.println("SamsungTv만의 고유 기능!");
	}
}










