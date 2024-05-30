package ch08_ex01;
// implements가 아니다 extends인 이유를 아는 것이 중요하다
interface E1{
	void aa();
}
interface E2 extends E1{
	void bb();
}
interface E3 extends E2{
	void cc();
}
class E4 implements E3{

	@Override
	public void bb() {
		System.out.println("E4 난 E2에 있는 Method bb()");
		
	}

	@Override
	public void aa() {
		System.out.println("E4 난 E1에 있는 Method aa()");
		
	}

	@Override
	public void cc() {
		System.out.println("E4 난 E3에 있는 Method cc()");
		
	}
	
}

public class Inter02Ex {

	public static void main(String[] args) {
// 선언은 부모Type 이 가능하다.<반대로 하면 문제가 생긴다>
// 인터페이스라고 할지라도 선언 자체는 가능하다
		E2 e2 = new E4();
		
//public void aa() {
//System.out.println("E4 난 E1에 있는 Method aa()");
		e2.aa();
		
//public void bb() {
//System.out.println("E4 난 E2에 있는 Method bb()");		
		e2.bb();

// e2.aa,e2.bb만 사용 가능 ,   e2.cc()는 사용 불가
// 선언한 객체의 method를 넘어서지는 못한다. 
// E3의 메소드가 구현 불가능한 이유이다.
//		e2.cc();
// 왜 사용이 안 되는지 아는 것이 중요하다
		
// 선언한 객체의 차이가 구현가능 범위를 정한다.
		E4 e4 = new E4();
		e4.aa();
		e4.bb();
		e4.cc();
	}
     
}
     