package ch10_ex03;
//** !b 확인하기
public class Ex02 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(!b) System.exit(0); // 참이 아닐 때만 빠져나간다
			// false일 때 확인하기 빠져나가기 때문에 나오는 값이 1이다.
				System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);//true 일 때 상관 x
			return;
		} catch(Exception e) { // true 일 때 상관 x
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
	public static void main(String[] args) {
	 System.out.println("======================= True 시작 ====================");
	 method(true);
	 System.out.println("======================= False 시작 ====================");
	 method(false);
	}

}
