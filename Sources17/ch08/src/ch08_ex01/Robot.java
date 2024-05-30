package ch08_ex01;

public interface Robot {

}
	// 각 클래스의 공통점은 로봇이라는 점
class DanseRobot implements Robot {
	public void dance() {
		System.out.println("춤을 춥니다");
	}
}

class DrawRobot implements Robot {
	public void draw() {
		System.out.println("그림을 그립니다");
	}
}

class SingRobot implements Robot{
	public void sing() {
		System.out.println("노래를 부릅니다");
	}
}
	

