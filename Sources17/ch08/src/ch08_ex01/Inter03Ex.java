package ch08_ex01;
interface F1{
	void aa();
}
interface F2{
	void bb();
}
// 인터페이스는 다중상속이 가능하다.
interface F3 extends F1, F2{
	void cc();
}

// 추상 method기 때문에 오류
//class F4 implements F3{
class F4 implements F3{

	@Override
	public void aa() {
		System.out.println("aa method");	
	}

	@Override
	public void bb() {
		System.out.println("bb method");	
	}

	@Override
	public void cc() {
		System.out.println("cc method");	
	}
	
}

//class에서 다중상속을 받는데 인터페이스를 두 개
//extend는 다중상속 x implements는 다중상속
//다중 상속은 2개 이상도 가능하다.

class F5 implements F1, F2{

	@Override
	public void bb() {
		System.out.println("F5 bb method");
	}

	@Override
	public void aa() {
		System.out.println("F5 aa method");
	}
	
}

// 메소드 정의가 되어 있어야 끌어다가 사용할 수 있다
public class Inter03Ex {

	public static void main(String[] args) {
		F3 f3 = new F4();
		f3.aa();
		f3.bb();
		f3.cc();
		
		//F2 f2 = new F4();
		//f2.aa();
		//f2.bb(); 
		// 왜 bb만 가능한지 알아야 한다.
		//f2.cc();
		
		F5 f5 = new F5();
		f5.aa();
		f5.bb();
		//f5.cc();
		//cc가 왜 불가능한지에 대해 알아야 한다.
	}

}
