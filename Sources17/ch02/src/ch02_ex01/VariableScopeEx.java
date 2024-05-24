package ch02_ex01;

public class VariableScopeEx {

	public static void main(String[] args) {
		//선언만 하는 변수
		int var1 = 15;
		// 참일 때만 수행
		//{} block 시작과 끝
		// scope 범위
		// 현재 상태는 무조건 수행해라
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;
			System.out.println("var1->"+var1);
			System.out.println("var2->"+var2);
		}
		System.out.println("var1->"+var1);
		// Block 안에서만 유효하다
		// System.out.println("var2->"+var2);
	}

}
