package ch10_ex05;

import ch10_ex04.MyException;

public class MyExceptionEx02 {
// hw02_2
	public static void main(String[] args) {
		// Buz rule
		// 최소 급여 100, 최대 급여 1000
		System.out.println("java  MyExceptionEx02 num1");

		try {
			int kkk = Integer.parseInt(args[0]);
			if 		(kkk < 100)
				throw new MyException0201();
			else if (kkk > 1000)
				throw new MyExceptionEx0202();
			else
				System.out.println("정상실행");
		}

		catch (MyException0201 e ) {
		System.out.println(e.getMessage());
		}
		catch (MyExceptionEx0202 e ) {
			System.out.println(e.getMessage());}
//	   catch (ArrayIndexOutOfBoundsException e){
//			System.out.println("실행 매개값의 수가 부족합니다.");
		catch (Exception e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java MyExceptionEx02 num1");
			
		}

	}
}
