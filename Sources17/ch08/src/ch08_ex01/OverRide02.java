package ch08_ex01;

class B1{
	void print1() {
		System.out.println("바꾸기 가능");
	}
	final void print2() {
		System.out.println("변경 금지");
	}
}

//final은 상속 금지
class B2 extends B1{
	void print1() {
		System.out.println("난 자식 메소드");
	}
//	private void print2() {
//		// TODO Auto-generated method stub
// 	확장하거나 재정의 될 수 없는 변수라는 뜻이다 final
//	}
}

public class OverRide02 {
	public static void main(String[] args) {
		
		B1 b1 = new B2();
		b1.print1();
		b1.print2();
	}
		

}
