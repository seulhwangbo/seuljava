package ch08_ex01;

public interface Lenderable {
	// 소스에 대한 이해를 위해 이름을 굳이 이런 식으로 했다.
	// interface 내부에서 선언하는 것들은 자동적으로 상수
	int BORROW = 1;
	int NORMAL = 0;
	// final 상수이기 때문에 대문자로 들어간다.
	abstract void checkOut(String borrower, String date);
	// abstract은 생략 가능하다 interface는 전부 abstract method다.
	// 사용하는 경우가 있기 때문에 익숙하게 하기 위한 것
	// 인터페이스는 다 public...
	void checkin();
}
	// Extends(확장) vs Implements(구현)
	// 클라스상속          메소드 상속
class SeperateVolume implements Lenderable {
	// 내부 구현은 변수로 사용 가능하다.
	String title;
	String date;
	String borrower;
	int status;
	// 커뮤니케이션 비용을 아끼기 위해서 이름값을 확실하게 표시한다.
	// Void 지만 생성자기 때문에 void 쓰지 않는다.
	SeperateVolume(String title) {
		this.title = title;
	}
// 반드시 구현해야 한다.
// 책 대여 method: 상태가 NORMAL일 때만 책을 대여한다.
	public void checkOut(String borrower, String date) {
		if (status != NORMAL) return;
		this.date = date;
		this.borrower = borrower;
		status = BORROW;
// 대여 후에는 상태를 변경한다.
		System.out.println(borrower + "가 " + date + "일에 " + title + "을 대여했다");
	}
	// 책 반환 method => BORROW인 상태에만 실행된다.
	@Override
	public void checkin() {
		if (status != BORROW) return;
		System.out.println(borrower + "가 " + title + "을 반납했다.");
		date = null;
		title = null;
		borrower = null;
		status = NORMAL;
	}
}
