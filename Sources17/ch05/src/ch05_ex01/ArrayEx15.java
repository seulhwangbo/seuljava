package ch05_ex01;
//hw01
public class ArrayEx15 {

	public static void main(String[] args) {
		if(args.length !=3) {
			System.out.println("usage: java ArrayEx15 NUM1 OP NUM2");
			//op = 더하기 곱하기 빼기 나누기
			// 결과 : num1 (op) num2
			System.exit(0);
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		char op = args[1].charAt(0); // 문자열을 문자(char)로 변환한다.
		int result = 0;
		switch (op) {
				case '+' : System.out.println(num1 + num2); break;
				case '-' : System.out.println(num1 - num2); break;
				case 'x' : System.out.println(num1 * num2); break;
				case '/' : System.out.println(num1 / num2); break;
				default: System.out.println("잘못된 연산입니다.");
		}
		System.out.println("결과: " + result);
		
	}
	// + , =, x, / 수행 --> switch로 통일하기
	// *는 .classpath를 가르키므로 x로 변경해서 사용하였음
}
