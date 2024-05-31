package ch08_robot;

import ch08_robot.actions.FireAction;
import ch08_robot.actions.FlyAction;
import ch08_robot.actions.KnifeAction;

public abstract class Robot {
	public FlyAction  flyAction;
	public FireAction fireAction;
	public KnifeAction knifeAction;
	
	public void setknifeAction(KnifeAction knifeAction) {
		this.knifeAction = knifeAction;
	}

	public Robot() {
	}
	
	public abstract void shape();// 추상 method
	
	//일반 method
	
	public void actionFly() {
		flyAction.fly();
	}
	
	public void actionFire() {
		fireAction.fire();
	}
	
	public void actionknife() {
		knifeAction.knife();
	}
	
	
	public void actionBasic() {
		System.out.println("팔, 다리, 몸통, 머리가 있습니다.");
	}
// 필요 시 setters 만 표시해서 만들 수 있다.

	public void setFlyAction(FlyAction flyAction) {
		this.flyAction = flyAction;
	}

	public void setFireAction(FireAction fireAction) {
		this.fireAction = fireAction;
	}
}
