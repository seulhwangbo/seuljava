package study01;

public class IncDecEx {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		int result1 = num1++;
		int num = num1 + 1;
		int result2 = num2--;
		int result3 = ++num3;
		int result4 = --num4;
		
		System.out.println("num1=" + num);
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		System.out.println("result4=" + result4);
		System.out.println("result5=" + result3);
		System.out.println("result6=" + num1);
		
	}

}