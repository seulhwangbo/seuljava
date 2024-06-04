package ch10_ex04;

public class MyExceptionEx01 {

	public static void main(String[] args) {
		int kkk = 15;
		
		try {
			// buz rule
			if(kkk> 10) throw new MyException();
		} catch (MyException e) {// 아니 10보다 크다니
			System.out.println(e.getMessage());
			// 메세지의 내용 확인 가능하다
			// 비즈니스 룰에 위반이 되었을 때 확인 가능하다.
		}
	}

}
