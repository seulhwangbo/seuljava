package ch03_ex01;

public class SignOperatorEx {

	public static void main(String[] args) {
		int x = - 100;
		int result1 = +x;
		// result 1 +x = result1;
		int result2 = 0;
		// 이해를 위해서 result2값 일부러 두 번 지정
		System.out.println("result2 초기값->" + result2);
		result2 = -x;
		// result2 = result2 - (-100)
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		
		short s = 100;
		// short result3 = -s; // 컴파일 에러
		int result3 = -s;
		System.out.println("result3= " + result3);

	}

}
