package study0523;

public class SignOpEx {

	public static void main(String[] args) {
		int x = - 100;
		int result1 = +x;
		// result 1 +x = result1;
		int result2 = 0;
		short s = 100;
		int result3 = -s;
		
		System.out.println("result2 초기값 ->" + result2);
		result2 = -x;
		System.out.println("result1 = " +   result1);
		System.out.println("result2 = " +  	result2);
		System.out.println("result3 = " +   result3);


	}
	/*
	result2 초기값->0
	result1= -100
	result2= 100
	result3= -100
	
	1. -에 -는 결과값이 +로 나온다는 점이 중요하다
	2. short는 간단할지라도 연산을 할 수 없다
	 */

}
