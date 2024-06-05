package ch11_ex01;

import java.util.ArrayList;
import java.util.List;

public class ArrListHw01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Database");
		list.add("Servlet/JSP");
		list.add("iBATTS");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println("List : " + list );
		
		// 아버지에 자식을 넣는 경우
		System.out.println("2:" +list.get(2));
		// 2번째 index 가져와 출력
		// Database, Servlet/JSP, iBATIS 삭제
		// for문이용 남은 원소 조회
		list.remove(2);
		list.remove(2);
		list.remove(2);
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("-------------------------");
		
	}

}
