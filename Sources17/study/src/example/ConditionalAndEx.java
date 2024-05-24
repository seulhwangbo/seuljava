package example;

public class ConditionalAndEx {

	public static void main(String[] args) {
		int num1 = -1, num2 = 0;
		// 함께 정의할 때는 ,를 찍어서 함께 정의할 수 있다
		// 들여쓰기 할 때 줄을 맞춰야 한다.
		if ( ++num1 > 0 && ++num2 > 0)
		// t * t = t
		// && = and 
			System.out.println("num1이 0보다 크거나 num2가 0보다 큽니다.");
		// 조건문의 결과를 나타낼 때 하나 들여서 쓰기도 한다.
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}

}
