package ch08_ex01;

public class RobotEx {

	static void action(Robot r) {
		// r의 객체Type DanseRobot이냐?
		// instanceof는 객체의 타입을 비교할 때 사용하는 것이다.
		if (r instanceof DanseRobot) {
		//원래 기본 Robot은 실행을 못하는데
		//형변환을 해야 하는데 같은 타입의 계열은 캐스팅 가능
		//부모 자식 간에는 형변환이 가능하다
		//부모 클래스로 갔을 때는 아무것도 못하기 때문에 형변환을 해야 한다.
			DanseRobot dr = (DanseRobot) r;
			dr.dance();
		//((DanseRobot)r) == 댄스로봇의 r로 바꾸기
		//((DanseRobot)r).dance();
		// 위에것두개를 아래로 옮긴 것이다.
		// 실제 고수들은 아래의 것을 사용한다.
		} else if (r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		} else {
			SingRobot sr = (SingRobot) r;
			sr.sing();
		}
	}
//	공유 메소드에서 공유 메소드가 아닌 것을 실행 혹은 호출 할 수가 없다. 
//  인스턴스에 있는 걸 실행할 수 없다.
	public static void main(String[] args) {
		//부모인 Robot => 새로운 객체 배열이 값을 저장할 수 있도록 한다
		Robot[] rb = new Robot[3];
		rb[0] = new DanseRobot();
		rb[1] = new DrawRobot();
		rb[2] = new SingRobot();
		// 유지보수를 위해서 사용하는 것이다.
		// 향상형 For 문 통해 배열을 돌리는 식
		// 단위만 확장시켰을 뿐이다.
		// DanseRobot , DrawRobot , SingRobot
		for (Robot r : rb) {
			action(r);
			//1. r -> 댄스로봇
			//2. r -> 그림로봇
			//3. r -> 노래로봇
		}
	}

}
