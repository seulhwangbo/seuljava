package study01;

public class ConcatEx {
	public static void main(String[] args) {
		String str1 = "num" + 3+ 4;
		String str2 = 3+ 4+"num";
		String str3 = 3+5+"num"+ 4+5+6 ;
		// "" 앞에 있는 숫자는 숫자로 취급 뒤에 있는 숫자는 문자열로 취급
		
		System.out.println("str1="+str1);
		System.out.println("str2="+str2);
		System.out.println("str3="+str3);
	}

}
