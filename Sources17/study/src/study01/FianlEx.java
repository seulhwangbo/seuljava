package study01;

public class FianlEx {

	public static void main(String[] args) {
		final double PI = 3.14;
		double radius = 2.0, circum;
		
		circum = 2 * PI * radius;
		System.out.println(circum);
		// 1번 final은 변수가 아닌 상수이다. 
		// 변하면 안 되는 중요한 정보를 정의하는 데에 사용된다.
		// final 정의할 때는 대문자로 한다
		// 추후에 상속 개념을 배우게 된다면 그때는 상속을 받아 바꿀 수 있는가
	}
}
