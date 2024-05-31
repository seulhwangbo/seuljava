package ch08_ex04;

public class Car {
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	// 테스트 하기 위한 숫자 지정
	// 4개의 타이어를 생성한다

//생성자

//메소드

int run() {
	System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		};
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		};
		
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		};

		
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		};
	return 0;
}
// 어디서 타이어가 펑크 났는지 알려주는 것 
// 문제가 없으면 0이다

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
