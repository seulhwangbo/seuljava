package ch11_ex01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList03 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("오렌지");
		list.add("바나나");
		
		System.out.println("요소의 개수 => " + list.size());
		System.out.println(">> Iterator 객체로 요소 얻기 << ");
		Iterator<String> elements = list.iterator();
		// 데이터를 iterator 형식으로 전달해줄 수 있다.
		// 고수들이 사용하는 방법
		while(elements.hasNext())//요소가 있다면
			System.out.print(elements.next() + "\t"); //요소를 얻어내서 출력
		System.out.println("\n");
		
		//일반적인 형식
		System.out.println(">> get 메소드로 요소 얻기 <<");
		for (int i = 0; i<list.size();i++)
			System.out.print(list.get(i)+"\t");
		System.out.println();
	}

}
