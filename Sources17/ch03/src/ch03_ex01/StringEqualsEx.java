package ch03_ex01;

public class StringEqualsEx {

	public static void main(String[] args) {
		String strVar1 = "김혁";
		String strVar2 = "김혁";
		//star1과 2는 같은 힙 영역을 공유한다
		String strVar3 = new String("김혁");
		//star3은 다른 힙 영역에 할당된다.
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		// 주소 값이 다르기 때문에 두 개를 비교했을 때 false
		// 메모리 비교
		System.out.println();
		// 한칸 띄고 확인하기 위해
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		// .equals는 값비교
	}

}
