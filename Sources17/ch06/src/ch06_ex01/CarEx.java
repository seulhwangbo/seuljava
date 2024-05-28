package ch06_ex01;

public class CarEx {

	public static void main(String[] args) {
	// 선언과 생성을 반드시 해줘야 한다
		//  선언         생성
		Car myCar = new Car();
		// 인스탄스
		Car yourCar; 
		// 객체를 선언만 
		// 객체명 reference변수명
		yourCar = new Car(); 
		// 생성
		// 위 아래 차이는 없지만 그냥 선언하는 방법만 차이가 있다.
		// 한번 선언한 것은 계속해서 나온다.
		myCar.color = "빨강";
		myCar.speed = 200;
		yourCar.color="초록";
		yourCar.speed=150;
		myCar.speedUp();
		// 위는 성격
		myCar.print();
		yourCar.print();
		// 이는 메소드
	}

}
