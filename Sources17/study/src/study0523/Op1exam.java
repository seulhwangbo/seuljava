package study0523;

public class Op1exam {

	public static void main(String[] args) {
		int n1 = 33;
		int n2 = 10;
		int result;
		
		// 사용해야 하는 것 printf와 사칙연산 및 %d
		
		result = n1 + n2;
		System.out.printf("%d %c %d = %d \n", n1,'+', n2, result);
		result = n1 - n2;
		System.out.printf("%d %c %d = %d \n", n1,'-', n2, result);
		result = n1 * n2;
		System.out.printf("%d %c %d = %d \n", n1,'*', n2, result);
		result = n1 / n2;
		System.out.printf("%d %c %d = %d \n", n1,'/', n2, result);
		result = 10 % 3;
		System.out.printf("%d %c %d = %d \n", 10,'%', 3, result);
	}
	// 왜 사칙연산이 들어가는 자리에 굳이 사칙연산을 넣지 않고 %c를 넣는 걸까? 재사용성을 위해 그런 건가
			// 33 + 10 = 43
			// 33 - 10 = 23
			// 33 * 10 = 330
			// 33 / 10 = 3
			// 10 % 3 = 1


}
