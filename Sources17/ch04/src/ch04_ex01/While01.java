package ch04_ex01;

public class While01 {

	public static void main(String[] args) {
		int sum = 0, i = 1;
		// while 변수에 대한 초기값 설정이 필수이다.
		while (i <= 10) {
			sum += i;
			System.out.println(i + "까지 합 = " + sum);
			i++;
		}
		System.out.println("합계: " + sum);
	}

}
