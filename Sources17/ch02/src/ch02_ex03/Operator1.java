package ch02_ex03;

public class Operator1 {

	public static void main(String[] args) {
		int n1 = 33;
		int n2 = 10;
		int result;
		// 초기값 지정 안 하고 나중에 지정
		
		// 사칙 연산자 +-*/%
		result = n1 + n2;
		System.out.printf("%d %c %d = %d\n", n1, '+', n2, result);
		// %d: decimal 숫자:int값 %c:문자
		// System.out.println(n1 + "+" + n2 + " "  + result);
		result = n1 - n2;
		System.out.printf("%d %c %d = %d\n", n1, '-', n2, result);
		result = n1 * n2;
		System.out.printf("%d %c %d = %d\n", n1, '*', n2, result);
		result = n1 / n2;
		System.out.printf("%d %c %d = %d\n", n1, '/', n2, result);
		result = 10 % 3; 
		// 나머지 연산 모들러 
		System.out.printf("%d %c %d = %d\n", 10, '%', 3, result);
		
		// printf<따로 줄바꿈을 해주지 않고 앞으로 주르륵 쓴다> + \n<줄바꿈>
		// printf를 사용한 이유: 가독성 이유
		
		
	}

}
