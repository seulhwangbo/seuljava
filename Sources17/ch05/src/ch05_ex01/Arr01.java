package ch05_ex01;

public class Arr01 {

	public static void main(String[] args) {
	//	int a0,a1,a2,a3,a4,a5;
	//  배열을 이용하기 전에는 이런 식으로 선언을 했어야 했다.
		int [] a = new int[5];
		a[0] = 7;
		a[1] = 34;
		a[2] = 67;
		a[3] = 6;
		a[4] = 234;
		int [] b = new int[5];
		b[0] = 7;
		b[1] = 34;
		b[2] = 67;
		b[3] = 6;
		b[4] = 234;
		
		//for( int i = 0; i < 5; i++) 
		//범위를 정하고 적은 코드
		// 배열명.length는 배열의 갯수
		System.out.println("a.length => " +a.length);
		for( int i = 0; i < a.length; i++) {
		// 범위를 정하지 않고 배열의 길이에 맞게 알아서 변환될 수 있게 하는 함수 .length
			//System.out.println("a["+i+"]=" + a[i]);
			// 지저분하게 쓴 코드
			// i = index i는 0,1,2,3,4
			System.out.printf("a[%d]=%d\n",i,a[i]);
			// 개발자가 쓰기엔 좋은 코드는 printf 쪽이다.
			// 지저분하지 않게 깔끔하게 쓴 코드
		}
		for (int i = 0; i<b.length; i++) {
			System.out.println("b["+i+"] = " + b[i]);
		}
	}
}
