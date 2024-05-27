package ch05_ex01;

public class Arr02 {

	public static void main(String[] args) {
		
		int [] a = new int[] {23,45,67,789,2};
		// int a2 [] = {23,45,67,789,2};
		// int [] a3 = new int[] {23,45,67,789,2};
		//초기값 동시 할당
		// 세 가지가 다 같다는 것을 알아야 한다.
		
		System.out.println("=============일반형 For문===========");
		for( int i = 0; i < a.length; i++) {
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		//실무에서 더 많이 사용되는 for문
		System.out.println("=============향상형 For문===========");
		//{23,45,67,789,2} = a
		// 객체에 하나하나 타입이 되는 것 = int
		// 데이터 타입 임의이름 배열
		// 배열의 타입과 선언하는 데이터 타입이 맞아야 한다.
		// 포인터가 배열에 알아서 올라간다.
		for(int kk : a) {
			System.out.println("kk -> " + kk);
			// 로직을 담을 때 사용
			// 배열을 돌릴 때는 보통 한 바퀴 돌린다는 것을 뜻한다.
		}
	}
}
