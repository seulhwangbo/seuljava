package study01;

public class ConditioanlAndEx {

	public static void main(String[] args) {
		int num1 = -1, num2 = 0;
		// ++가 앞에 붙으면 숫자 증가 후 실행
		// ++가 뒤에 붙으면 실행 후 증가를 할당
		if ( ++num1 > 0 || ++num2 >0) {
			System.out.println("조건에 맞습니다.");
		} else {
			System.out.println("num1 = " + num1);
			System.out.println("num2 = " + num2);
		}
		int num3 = num1++;
		int num4 = num2++;
		
		if(++num1>4 && ++num2>3) {
			System.out.println("조건에 맞습니다");
		} else {
			System.out.println("num3 = " + num3);
			System.out.println("num4 = " + num4);
		}
			
		}
	}


