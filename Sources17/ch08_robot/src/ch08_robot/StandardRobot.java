package ch08_robot;

import ch08_robot.actions.FireOk;
import ch08_robot.actions.FlyNo;
// 자동완성을 통한 import 확인
// 패키지 분리 목적
// 코딩 절대 하지 않고 자동완성으로 만들기

import ch08_robot.actions.KnifeWithWood;

public class StandardRobot extends Robot {
	
	public StandardRobot() {
		flyAction = new FlyNo();
		fireAction = new FireOk();
		knifeAction = new KnifeWithWood();
	}

	@Override
	public void shape() {
		System.out.println("기본적으로 팔, 다리 몸통 존재. 그리고 달릴 수 있습니다.");
	}

}
