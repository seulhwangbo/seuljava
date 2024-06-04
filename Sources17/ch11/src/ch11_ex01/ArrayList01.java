package ch11_ex01;

import java.util.ArrayList;

// list 계열
// 순서가 있는 데이터의 집합, 데이터의 중복을 허용한다
public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList<String>  al = new ArrayList<String>();
	//  <> 안에는 들어갈 데이터 타입 제시              앞에 이미 있기에 빼도 상관x
		al.add("구렁2");
		al.add("구렁8");
		al.add("구렁2");
		al.add("구렁4");
		al.add("구렁3");
		al.add("구렁1");
	// 	원소 추가   => .add
	// 	중복 	     => 구렁2, 순서를 눈여겨 봐야 한다. 
	//  원소 확인   => .get
		for(int i=0; i < al.size(); i ++) {
			System.out.println(al.get(i));
		}
		System.out.println("=========================");
		for(String str : al) {
			System.out.println(str);
		}
	// 	향상형 for문과 일반 for문 두 개로 다 볼 수 있다.
	}

}
