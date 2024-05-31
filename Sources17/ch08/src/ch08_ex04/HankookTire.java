package ch08_ex04;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	} 
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
	}

	}
}
// if -> 수명이 남았음을 알려주는 것이고 
// else는 펑크가 났다는 것을 말한다.
// 같은 클라스끼리는 구현을 하지 않아도 오류가 나지 않는다 : 부모객체에 가서 실행하면 되니까