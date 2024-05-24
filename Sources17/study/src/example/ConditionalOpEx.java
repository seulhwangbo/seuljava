package example;

public class ConditionalOpEx {

	public static void main(String[] args) {
		int a = 20, b = 30, max;
		// int a = 20;
		// int b = 30;
		// int max; 
		// 삼항연산자
		max = a > b ? a : b;
		// a>가 b보다 크면 a 아니면 b이다.
		// 조건 1 > 조건 2 ? 참일 때 : 거짓일 때 
		//if (a>b) {
		//	max = a;
		//} else {
		//	max = b;
		//}
		System.out.println("max->"+max);
	}

}