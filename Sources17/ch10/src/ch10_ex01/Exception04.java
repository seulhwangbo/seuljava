package ch10_ex01;

public class Exception04 {
	
	static void method1() throws Exception {
		System.out.println("Method 1 run");
		method2();
		// 던지거나 감싸거나 여기서 해야 한다
	}
	static void method2() throws Exception {
		System.out.println("Method 2 run");
		throw new Exception();
		// 일부러 예외를 발생시키는 코드
		// 예외를 던지면 받아줄 메소드가 필요하다.
	}

	public static void main(String[] args) throws Exception {
		method1();
		// 내가 static이면 호출하는 메소드도 static이어야 호출이 가능하다.
		// 메인도 던지거나 감싸거나 해야 한다
		System.out.println("main End");
	}

}
