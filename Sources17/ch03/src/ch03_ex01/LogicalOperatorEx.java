package ch03_ex01;

public class LogicalOperatorEx {

	public static void main(String[] args) {
		int charCode1 = 'A';
		int charCode2 = 'a';
		int charCode3 = '3';
		int charCode6 = 7;
		// 숫자가 아니라 문자로 하기 때문에 char를 숫자로 비교하기 위해서는 int로 패싱해서 측정하기
		//int charCode7 = 0;
		// 패싱은 나중에 교육
		// 앞 조건식이 false라도 뒷조건식 확인
		if( (charCode1>=65) & (charCode1<=90)) {
			System.out.println(charCode1 + "대문자 이군요");
		}
		// 앞 조건식 false라면 뒷조건식 판단 X
		if( (charCode2>=97) && (charCode2<=122)) {
			System.out.println(charCode2 + "소문자 이군요");
		}
		// !는 부정형이다
		if( !(charCode3<48) && !(charCode3>57)) {
			System.out.println("0~9 숫자이군요");
		}
		// 배수를 알아보는 방법
		System.out.printf("1. charCode6 %d \n", charCode6);
		// char 코드로 전달됐을 때 
		System.out.printf("1. charCode6 %d \n", charCode6);
		//charCode7 = charCode6%5;
		//System.out.printf("3. charCode7 %d \n", charCode7);
		// int 코드로 전달됐을 때
		if( (charCode6%2==0)|(charCode6%3==0)) {
			System.out.println("2 또는 3의 배수이군요");
		} else {			
			System.out.println("2 또는 3의 배수가 아니군요");
		}

	}

}
