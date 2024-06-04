package ch10_ex04;

public class MyException extends Exception {
	
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		// return super.getMessage();
		String errMsg;
		// 비즈니스 오류 buz logic error
		// if 비즈니스 룰이 10보다 작아야 한다는 거라면?
		errMsg = "아니 10보다 크다니";
		return errMsg;
	// 개발자들이 자주 쓰는 메소드
	}
}
