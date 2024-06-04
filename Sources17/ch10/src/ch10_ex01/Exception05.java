package ch10_ex01;

public class Exception05 {

	static void method1() throws Exception {
		 try {
			System.out.println("1. method1 정상 run");
			throw new Exception();
			// 일부러 오류를 만들었다
			// 나를 호출한 놈에게 던진다
		} catch (Exception e) {
			System.out.println("2. method1 메서드에서 예외가 처리");
			// 억지 에러 (7번) 때문에 실행된다
			throw e;
			// 다시 에러를 던졌고, 던진 이후에는 26번에서 처리해준다.
			// 다시 예외를 발생시킨다.
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main start . . . ");
		// method1();
		// 나한테 무엇인가를 돌려줄 수 있기 때문에 오류가 뜬다
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("main 메서드에서 예외가 처리");
		}
	}

}
