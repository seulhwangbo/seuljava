package ch13_ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileWriter01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력한 파일명");
		String fileName = sc.nextLine();
		System.out.println("저장될 글을 입력하시오");
		String msg = sc.nextLine();
		FileWriter fw = new FileWriter(fileName);
		Date date = new Date();
		fw.write(date + " : " + msg);
		fw.close(); // sc나 fw 둘 다 무조건 close를 쳐야 닫힌다는 점 확인하기
		System.out.println("출력 끝");
		sc.close();
	}

}
