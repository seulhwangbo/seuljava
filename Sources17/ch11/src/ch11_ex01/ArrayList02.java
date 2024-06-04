package ch11_ex01;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("수박");
		list.add("사과");
		list.add("바나나");
		list.add("수박");
		list.add("대추");
		list.add("바나나");
		System.out.println("갯수 : " + list.size());
//System.out.println("list : " + list);
// 마우스를 갖다가 되면 알아서 밑에 devPrint를 만들어준다.
// 갯수 확인 .size
// list의 객체 조회 ==> + list
// 중복 => 구렁2, 순서 ㅇ,를 눈여겨 봐야 한다.
// 1번 자리에 끼워넣기도 가능하다
// 원하는 자리, 원하는 string
		devPrint(list);
// 추가
		list.add(1, "키위");
		devPrint(list);
// 대치		
		list.set(4, "봉숭아");
		devPrint(list);
// 제거		
		list.remove(0);
		devPrint(list);
// 찾기		
		System.out.println("3번 인덱스 --> " + list.get(3));
// 특정 개체 찾기
		System.out.println("바나나 문의 --> " + list.contains("바나나"));
// 그 리스트가 특정한 객체를 가지고 있냐 없냐에 대한 것 .contains
		System.out.println("바나나 문의 --> " + list.indexOf("바나나"));
// 리스트에 바나나가 몇 개 있냐
		System.out.println("바나나 문의 --> " + list.lastIndexOf("바나나"));
// 리스트에 마지막 바나나는 몇 번인가
		for (int i = 0 ; i < list.size() ; i++) {
			if (list.get(i).equals("바나나")) {
				list.set(i, "딸기");
// 내가 만약 a -> 모두 다 b로 바꾸고 싶다면?
			}
		}
		devPrint(list);
		
	}
		
	
	private static void devPrint(ArrayList<String> list) {
		// 향상형 for문이 더 선호
		for (String str : list) {
			System.out.print(str + " \t");
		}
		System.out.println("\n-------------------------------------");
	}

	}
