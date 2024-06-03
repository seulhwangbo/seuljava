package ch09_ex03;

public class String4 {

	public static void main(String[] args) {
		//숫자를 문자로 변경
		String str1 = 12 + "";
		String str2 = String.valueOf(3);
		// 문자열을 문자로 변경
		char c = str1.charAt(0);
		char d = str1.charAt(1);
		// str1의 다음 숫자가 없기 때문에 안 된다
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(c);
		System.out.println(d);
	}

}
