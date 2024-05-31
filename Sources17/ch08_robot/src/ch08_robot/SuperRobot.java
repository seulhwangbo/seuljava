package ch08_robot;

import ch08_robot.actions.FireOk;
import ch08_robot.actions.FlyOk;
import ch08_robot.actions.KnifeWithLazer;
// 무조건 자동완성 시키고 직접 치는 코드는 아니다
// 앞문자를 치고 Ctrl + space를 치면 된다.
public class SuperRobot extends Robot {

	public SuperRobot() {
		flyAction = new FlyOk();
		fireAction = new FireOk();
		knifeAction = new KnifeWithLazer();
		
	}
	@Override
	public void shape() {
		System.out.println("기본적으로 팔, 다리 몸통 존재. 그리고 날 수 있습니다.");

	}

}
