package ch08_ex01;

class A1 {
	private int kkk;

// 부모에 private를 제공
	public void print() {
		System.out.println("부모 메소드 print");
	}
}

class A2 extends A1 {
//  @Override
//public void print() {
//	// TODO Auto-generated method stub
//	super.print();
//}
	public void print3() {
		System.out.println("A2의 print3 메소드");
	}
}

public class OverRide01 {

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.print();
//		a1.print3();
// 부모는 자식을 쓸 수 없다.
		A1 a2 = new A2();
// 선언은 부모의 클라스를 통해서 해도 된다.
		a2.print();
// 상속 시 부모 (super) 사용 가능하다
//		a2.print3();
// 선언을 부모로 했으면 부모의 것으로 인식을 한다. 그렇기에 자식 클래스에 있는 것 허용 X
		A2 a22 = new A2();
//자식 객체를 활용해서 선언과 메모리 할당
		a22.print();
		a22.print3();
// 		a22.kk 
//		상속을 받았지만 private로 되어있는 것은 사용이 불가능하다
//a22처럼 선언을 해야만 자식의 내부에 있는 것까지 사용이 가능하다.
	}

}
