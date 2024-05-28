package ch06_ex01;

	class Car1 {
		// class car가 객체이다
		String  	color;
		static int 	speed;
// 		공유변수
		
		void print() {
			System.out.println("색깔: " + color);
			System.out.println("속도: " + speed);
			System.out.println("------------------");
		}

}

		public class Car1Ex {
			
	public static void main(String[] args) {
		//c1.color = "빨강";
		//Car.color= "빨강";
		Car1.speed= 130;
		//왜 speed만 선언이 가능한지 확인하기
		
		//   선언           생성
		Car1 c1 = new Car1();
		Car1 c2 = new Car1();
		
		c1.print();
		c1.color = "빨강";
		c1.speed = 200;
// 노란색 권고가 뜨는 이유: 이렇게 써도 상관은 없지만 Car1.speed로 쓰면 좋겠다.
// ex. 산에서 길이 있는데 옆길로 가도 되지만 주어진 길로 가기를 권고하는 느낌으로 생각하면 된다.
		c2.color = "노랑";
		
		c1.print();
		c2.print();
		
	}

}
