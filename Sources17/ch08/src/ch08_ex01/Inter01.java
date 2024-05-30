package ch08_ex01;
//-------------------------------------------------------
//인터페이스는 1) 양식의 역할( 큼) 함 , 
//      2) 다중상속 지원(극히 일부분..)
//      3) class 와 class 를 연결 해줌 (중요)
//--------------------------------------------------

public interface Inter01 {
	// interface에 있는 모든 멤버변수는 Public Static Final

	int AA = 3;
	void display();
	void print();

	// 전부 abstract / final
}
	// 반드시 모든 메소드를 구현해야 한다	
	// class D1 implements Inter01 --> X {
	// 구현 전에 오류가 난다는 것을 확인하는 코드
class D1 implements Inter01 {

		@Override
		public void display() {
		//	AA = AA + 1; --> X
		//  final 변수이기 때문에 오류가 난다.
			System.out.println("재정의 했슈 ... AA -- > " + AA);
		}

		@Override
		public void print() {
			System.out.println("나도야 간다");
			
		}

}
