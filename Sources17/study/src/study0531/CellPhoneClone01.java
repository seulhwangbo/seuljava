package study0531;

public class CellPhoneClone01 {
	// 필드, 멤버 변수 
	String model;
	String color;
	int price;
	
	// 생성자
	
	// 메소드 
	
	void powerOn() {
		System.out.println("전원이 켜지구 이습니다.");
	}
	void powerOff() {
		System.out.println("전원이 꺼지구 이습니다.");
	}
	void bell() {
		System.out.println("전화가 울리고 잇셔요");
	}
	void missedCall(){
		System.out.println("부재중 전화가 왔습니다.");
	}
	void sendVoice(String message) {
		System.out.println("당신에게 "+ message);
	}
	void receivedVoice(String message) {
		System.out.println("당신으로부터 " + message);
	}
	void hangUp() {
		System.out.println("잘 지내세요");
	}
	

}
