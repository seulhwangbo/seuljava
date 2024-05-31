package ch08_ex04;

public class Tire {
	// 필드
	public int maxRotation; 		// 최대 회전수
	public int accumulatedRotation; // 누적 회전수
	public String location; 		// 타이어의 위치
	//바퀴가 어디에 있는 바퀴인지에 대한 것
	//앞바퀴 뒷바퀴냐 
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드
	public boolean roll() {
		++accumulatedRotation;
		// 						  6, 2, 3, 4
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
		// 마지막 바퀴수가 지나면 stop
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}
}
