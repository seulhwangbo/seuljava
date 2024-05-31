package ch08_ex04;


// 저녁에 돌려서 보기
public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		// 어소시에이션 관계로 불러서 실행
		// 뒤에 있는 걸 통해 문제가 2번으로 날라왔다.
		// run을 통해
		// 다섯 바퀴를 돌기
		for(int i =1; i<=5; i++) {
			//                    6,2,3,4
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontLeftTire = new HankookTire("앞오른쪽",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("뒤왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.frontLeftTire = new HankookTire("뒤오른쪽",17);
				break;
			}
	// default가 없는 이유 = 정상이면 그냥 돌아가기만 하면 되기 때문이다.
			System.out.println("---------------------------------------");
		}

	}

}
