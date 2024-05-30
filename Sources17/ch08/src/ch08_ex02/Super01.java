package ch08_ex02;

class S1{
	int				a = 7;
	int				b = 7;
	void display() {
		System.out.println("B1 대박");
	}
	void print() {
		System.out.println("B1 난 부모 print 메소드");
	}
}
// S2에는 display가 없지만 상속받은 곳에 있기 때문에 실행한다.
class S2 extends S1{
	int 		   a = 10;
	void print() {
		super.print();
		System.out.println("B2 부모멤버      a = " +super.a); //7
		System.out.println("B2 난 자식 메소드 a = " +a); // 10 //나의 a
		System.out.println("B2 난 자식 메소드 b = " +b); // 7
		System.out.println("===============");
		// super.a vs this.a의 차이 확인하기
		// System.out.println("B2 난 자식 메소드 a = " +this.a); // 10
		// this.a라고 하면 나의 a
	}
}

public class Super01 {

	public static void main(String[] args) {
		S2 b = new S2();
		b.print();
		b.display();
	}

}
