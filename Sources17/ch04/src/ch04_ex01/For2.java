package ch04_ex01;

import java.io.IOException;

public class For2 {

	public static void main(String[] args) throws IOException {
	 System.out.println("보고 싶은 구구단 숫자는");
	// int num = System.in.read() - '0';
	 int num =(int) System.in.read()-'0';
	 for(int i=1; i<=9; i++) {
			 System.out.println(num + "*" + i + " = "+ num * i);
		 
		 
	 }
	 // for문으로 구구단 완성하기
	 // homework5
	}

}
