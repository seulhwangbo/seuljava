package ch13_ex01;

import java.io.File;

public class Dir01 {

	public static void main(String[] args) {
		//File file = new File(".");
		//File file = new File("src/ch13_ex01");
		File file = new File("../ch12");
		// 앞에 부모 클래스에 일단 접근하는 ..이 필요하다
		// 특정 카테고리 내에 있는 파일이 궁금할 때 확인
		// 원하는 폴더로 조회가 가능하다
		// 바꿔가면서 확인하기
		String [] list = file.list();
		System.out.println("list --- > " + list);
		for(String str : list) {
			System.out.println(str);
		}
	}

}
