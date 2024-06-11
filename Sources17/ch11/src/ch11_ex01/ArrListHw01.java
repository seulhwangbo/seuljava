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
		// list.add(2,"Database");
		// -> 특정 인ㄷㄱ스에 넣고 싶을 때
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
		list.remove("iBATTS");
		// 특별한 객체를 삭제하는 다양한 방법 확인
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + ": "+ list.get(i));
		}
		System.out.println("-------------------------");
		
	}

}
