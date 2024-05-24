package example;

public class EqualityEx {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2 + 3;
		
		if (num1 == num2)
			System.out.println("num1과 num2의 값은 동일합니다");
		// 같다
		if ((num1 != num2) == false)
			System.out.println("다르다고 하면 거짓말!");
		// 같지 않다
		// false가 false인가 = 진실이다.
	}
}	
