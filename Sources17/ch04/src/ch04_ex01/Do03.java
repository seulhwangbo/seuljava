package ch04_ex01;

import java.util.Scanner;

public class Do03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0, num;
		int answer = (int)(Math.random()*100)+1; 
		// 1부터 100까지의 정수
		
		do {
			System.out.println("1부터 100 중 어떤 숫자일까요? ");
			num = sc.nextInt();
		
			// 숫자로 가져와야 하기 때문에 nextInt이다.
			
			
			// System.out.println("num->" + num);
		if (answer == num) {
			System.out.println(cnt + "번에 맞혔습니다. 축하혀요!!");
			break;
		} else if(answer> num) {
			System.out.println("더 큰 수여요.");
		} else System.out.println("작은 수여요");
			
		cnt ++;
		} while(true);
	}

}
