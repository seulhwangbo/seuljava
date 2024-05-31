package ch08_robot;

import ch08_robot.actions.FireNo;
import ch08_robot.actions.FlyNo;
import ch08_robot.actions.KnifeNo;

public class CheapRobot extends Robot {

	public CheapRobot() {
		flyAction = new FlyNo();
		fireAction = new FireNo();
		knifeAction = new KnifeNo();
// 		아빠의 변수이고 내가 사용하는 것임
// 		생성을 하면서 부품을 조립
// 		인터페이스의 목적은 부품조립이다.
	}
	// 원하는 첫단어 + CTRL + SPACE
	@Override
	public void shape() {
	// 반드시 구현해야 하는 추상 Method
	System.out.println("기본적으로 팔, 다리 몸통 존재. 그리고 걸을 수 있습니다.");

	}

}
