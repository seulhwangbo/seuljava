package ch10_ex02;

public class Throw02 {

	public static void main(String[] args) {
		int num = 100, result = 0;
		for (int i = 0; i < 10; i ++) {
			int ran = (int)(Math.random()*10);
			result = num / ran;
			// 오류가 발생하게 되면 Try catch 로 감싸야 한다.
			System.out.println("나눗셈 결과 : " + result);
		}

	}

}
