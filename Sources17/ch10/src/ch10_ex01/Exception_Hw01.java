package ch10_ex01;

import java.util.Scanner;

public class Exception_Hw01 {

	public static void main(String[] args) 
	{
		int result = 0;
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
				
			do {
				try {
					System.out.println("첫번째 숫자 입력하세요");
					num1 = Integer.parseInt(sc.nextLine());
					if(num1 == 0) break;
					System.out.println("두번째 숫자 입력하세요");
					num2 = Integer.parseInt(sc.nextLine());
					result = num1 / num2;
					System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
				} catch (ArithmeticException e) {
					System.out.println("숫자만 가능합니다. ㅎㅎ");
				} catch (NumberFormatException e) {
					System.out.println("나머지 error.");
				} catch (Exception e) { // 부모격
					System.out.println("값을 잘못 입력했습니다.");
				} finally {
					System.out.println("난 무조건 나온다");
				}
			    	} while (true);
		
				System.out.println("프로그램 종료");
				sc.close();
			}	

		}

//나머지error 
// 난 무조건 나온다
// 프로그램 종료
