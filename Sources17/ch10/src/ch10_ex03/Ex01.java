package ch10_ex03;

public class Ex01 {
	static void method (boolean b) {
		try {
			System.out.println(1 + "b ==> " + b);
			if(b) throw new ArithmeticException();
			System.out.println(2);	
			// 예외가 발생하면 실행되지 않는 문장
		} catch (RuntimeException r) {
			System.out.println("RuntimeException" + "--> " + 3);
			return;
		// finally 블럭을 수행한 후에 메서드를 빠져 나간다.
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
		// 예외 발생여부에 관계없이 항상 실행되는 문장
			System.out.println("예외 발생 여부와 상관없이 항상 실행되는 문장 " + 5);
		}
		System.out.println("정상적으로 끝나야 실행되는 문장 ");
	}
	
	public static void main(String[] args) {
		System.out.println("-- true 호출 --");
		method(true);
		System.out.println("-- false 호출 --");
		method(false);
	}

}
