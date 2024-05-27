package ch04_ex03;

import java.util.Scanner;

public class ex0302 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; //잔액
		//int inPut;
		//int outPut;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
			
			int menuNum = scanner.nextInt();
			switch(menuNum) {
			case 1 :
				System.out.println("얼마를 입금하시겠습니까?");
				balance += scanner.nextInt();
				//inPut = scanner.nextInt();
				//balance += inPut;
				break;
			case 2 :
				System.out.println("얼마를 출금하시겠습니까?");
				//outPut = scanner.nextInt();
				//balance -= outPut;
				balance -= scanner.nextInt();
				break;
			case 3 :
				System.out.println("당신의 현재 잔고는 " +balance+ "원입니다.");
				break;
			case 4 :
				System.out.println("종료하겠습니다.");
				run = false;
		}
	}
}
}