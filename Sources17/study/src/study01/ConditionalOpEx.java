package study01;

public class ConditionalOpEx {

	// 비교 연산자 사용이 포인트
	// 	int a = 20, b = 30, max;
	public static void main(String[] args) {
		String a = "가나다라마바사", b = "가나다라마바사아", max; 
	// int a = 20;
	// int b = 30;
	// int max;
		int strLength1 = a.length();
		int strLength2 = b.length();
	// .length(); = 문자의 길이를 세는 방법
		max = strLength1 > strLength2 ? b : a;
		
		System.out.println("max is " + max);

	}

}
