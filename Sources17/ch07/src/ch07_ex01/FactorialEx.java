package ch07_ex01;

import java.util.Scanner;

class Fac1 {
	int result = 1;

	void factorial(int cnt) {
		if (cnt > 1) {
			result *= cnt;
			System.out.print(cnt + " * ");
			factorial(--cnt);
			// 반드시 조건을 주어야 한다.
			// 탈출구 역할 
		} else {
			System.out.println(cnt);
			System.out.println("Factorial 결과는 " + result);
			return;
		}
	}
}

public class FactorialEx {

	public static void main(String[] args) {
		Fac1 e = new Fac1();
		int InNum;
		System.out.println("Factorial 할 10이하의 숫자를 입력하세요 ? ");
		Scanner sc = new Scanner(System.in);
		InNum = sc.nextInt();
		e.factorial(InNum);
	}

}
