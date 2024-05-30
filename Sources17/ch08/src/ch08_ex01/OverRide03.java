package ch08_ex01;

// 추상 class
abstract class C1 {
	int k;

	public C1() {
		System.out.println("추상Class 생성자 ");
	}

	void setK(int k) {
		this.k = k;
	}

	// 추상 클라스는 반드시 하나 이상의 추상 메소드가 존재해야 한다.
	// 추상 메소드는 정의만 있는 것을 말한다.
	// 실제로 구현한 것이 아니라 정의만 있다.
	abstract void print();
}

// 추상 클라스를 상속받았을 때는 implement를 무조건 해야 한다고 경고를 띄운다.
// 구현해야만 instance화 할 수 있다.
// IDE = 통합된 개발 환경
class C2 extends C1 {

	@Override
	void print() {
		System.out.println("C2 k->" + k);
		// c2에는 없지만 c1에는 있기 때문에 사용 가능하다
	}

	void print3() {
		System.out.println("C2 print3");
		// c2에는 없지만 c1에는 있기 때문에 사용 가능하다
	}

}

public class OverRide03 {

	public static void main(String[] args) {
		// C1 c1= new C1();
		// 추상 Class는 생성 안 된다 => 추상메소드가 하나라도 있으면 인스턴스화 시킬 수 없다
		// 반드시 상속 받아서 구현한 이후에야 인스턴스화 시킬 수 있다.
		C1 c1 = new C2();
		c1.setK(12);
		c1.print();
		// c1.print3();
		// 기본 타입을 부모 타입으로 받았기 때문에 자식 클래스에 있는 print3은 사용이 불가능하다.
		// 구현한 메소드를 통해서만 인스턴스화 시킬 수 있다.
		C2 c2 = new C2();
		c2.setK	 (7);
		c2.print (); // c2.k와 c1.k --> 각각의 값은 다름
		c2.print3();
		// c2와 c1은 각각 기본타입을 무엇으로 선언했는지에 따라서 달라진다.
	}

}
