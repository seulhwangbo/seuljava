package ch04_ex01;

public class If02 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		// int b = arg[1];
		// 파싱하는 방법 제대로 알기
		int b = Integer.parseInt(args[1]);
		
		String str = args[2];
		System.out.println("str->"+str);
		//실행할 때 계속 수정하지 않아도 되고 입력되는 값을 받아들일 수 있기에 유용하다.
		System.out.println("A=>" +a);
		System.out.println("B=>" +b);
		
		if(a > 0) {
			System.out.println(a+"는 양수");
			System.out.println("양수일");
		} else {
			System.out.println(a+"는 음수");
			System.out.println("음수일");
		}
		System.out.println("프로그램 종료");
	}

}
