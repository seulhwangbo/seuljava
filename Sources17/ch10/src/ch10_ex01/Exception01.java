package ch10_ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		//시스템으로 친 걸 받아들여서 버퍼를 만드는 것이다.
		//무한 루프를 돌린다
		while (true) {
			System.out.println("첫번째 값을 입력하세요 ==>");
			int num1 = Integer.parseInt(bin.readLine());
			System.out.println("두번째 값을 입력하세요 ==>");
			int num2 = Integer.parseInt(bin.readLine());
			System.out.println(num1 + " / " + num2 + " = " + num1/num2);
		}
	}

}
