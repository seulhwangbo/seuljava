package ch08_robot;
// hw 02
public class MainClass {

	public static void main(String[] args) {
		// 연계를 위해서 부모형으로 많이 선언한다
		System.out.println("SuperRobot 주문. 만들어 주세요.");
		Robot superRobot = new SuperRobot();
		// 한 번 인스턴스를 만든 이후에는 한두 자만 쳐도 인식한다.
		superRobot.shape();
		// 추상 클라스 상속 후 => 확인
		superRobot.actionBasic();
		// superRobot에는 없는 객체이지만 super에 있다
		superRobot.actionFly();
		superRobot.actionFire();
		superRobot.actionknife();
		
		System.out.println("-------------------------------------------------");
		System.out.println("StandardRobot 주문. 만들어 주세요.");
		Robot standardRobot = new StandardRobot();
		standardRobot.shape();
		standardRobot.actionBasic();
		standardRobot.actionFly();
		standardRobot.actionFire();
		standardRobot.actionknife();
		
		System.out.println("-------------------------------------------------");
		System.out.println("CheapRobot 주문. 만들어 주세요.");
		Robot cheapRobot = new CheapRobot();
		cheapRobot.shape();
		cheapRobot.actionBasic();
		cheapRobot.actionFly();
		cheapRobot.actionFire();
		cheapRobot.actionknife();
		

	}

}
