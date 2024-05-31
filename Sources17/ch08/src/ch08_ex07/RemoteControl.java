package ch08_ex07;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	// 인터페이스에는 무조건 상수, 멤버변수 없다
	
	//추상 메소드
	// 추상메소드에 기술하면 specify a body 하지 말라 
	// 추상메소드밖에 쓸 수 없다.
	void turnOn();
	void turnOff();
	void setVolume(int volume);

	//default method : 자바 8 이상부터 가능한 것
	//default라고 써야 구현을 했을 때 오류가 나지 않는다.
	// ---------------------------------------------
	default void setMute (boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// static도 가능해진 점 확인
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	// ---------------------------------------------
}
