package ch08_ex07;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc = null;
		// 선언만 했기 때문에 자식 객체를 넣을 수 있다
		
		// remoteControl에는 기본으로 turnon과 turnoff가 있다
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(15);
		
		rc.setMute(false);
		rc.setMute(true);
		
		RemoteControl.changeBattery();
		// default와 static 메소드의 허용 확인
		
	}

}
