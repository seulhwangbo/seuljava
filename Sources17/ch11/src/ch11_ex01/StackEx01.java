package ch11_ex01;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		String [] pet = {"지렁이","굼벵이","애벌레","구렁이", " 지렁이"};
		Stack<String> st = new Stack<String>();
		for(String str : pet ) {
			System.out.println("push ==> " + str);
			st.push(str);
			// 원소를 집어넣는 것 push
			// 원소를 꺼내는 것 pop
		}
		System.out.println("push st -> " + st);
		System.out.println("----------------------");
		while(!st.isEmpty()) {
			System.out.println("POP ==> " + st.pop());
		}
		System.out.println("POP st -> " + st);
	}

}
