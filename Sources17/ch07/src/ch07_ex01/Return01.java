package ch07_ex01;

class C1 {
	void divide1(int x, int y) {
		if (y == 0) {
			System.out.println("y가 0이야 0으로는 못 나눠");
			return; // 여기까지 하고 Method를 부른 곳으로 돌아가라.
		}
		System.out.printf("%d / %d = %d\n", x, y, x / y);
	}
	void divide3(int x, int y, int z) {
		if (y==0) {
			System.out.println("y가 영이라 못 나눠");
			return;
		}
		System.out.printf("%d + %d + %d = %d\n", x , y , z, x+y+z);
	}

	int divide2(int x, int y) {
		if (y == 0) {
			System.out.println("y가 0이야 0으로는 못 나눠");
			return y; // 여기까지 하고 Method를 부른 곳으로 돌아가라.
		}
		System.out.printf("%d / %d = %d\n", x, y, x / y);
		int retDivide = x / y;
// 		반드시 하나의 return값을 해야 한다
// 		유의미한 네이밍을 해야 한다 
// 		동료들과 함께 협업을 할 때 네이밍룰을 지켜야 한다.
		return retDivide;
//		커뮤니케이션 비용을 줄일 수 있는 방식이다.
	}
}

public class Return01 {

	public static void main(String[] args) {
 
		int resultDivide1;
		int resultDivide2;
		int resultDivide3;
		C1 c = new C1();
		c.divide1(13, 3);
		int z = c.divide2(13, 3);
		int q = c.divide2(23, 3);
		int s = c.divide2(33, 3);
		c.divide3(z, q, s);
//		resultDivide1 = c.divide2(13, 3);
//		resultDivide2 = c.divide2(23, 3);
//		resultDivide3 = c.divide2(33, 3);
//// 		if 세 가지의 총계를 내고 싶으면 어떻게 해야 할까?
//// 		void를 넣으면 총계를 내지 못한다
//		int total = resultDivide1 + resultDivide2 + resultDivide3;
//// 		클라스를 대문자, 변수는 대문자 잘 안 한다
//		System.out.println("Main total -> " + total);
	}

}
