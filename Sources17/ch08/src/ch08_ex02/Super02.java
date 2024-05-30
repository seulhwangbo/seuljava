package ch08_ex02;

class C1{
	// 생성자가 없으면 Default를 Compiler가 만들어준다.
	C1(){
		System.out.println("매개변수 없는 부모 생성자");
	}
	C1(String str){
		System.out.println("매개변수 있는 부모 생성자 1 str" + str);
	}
	void cc1Method() {
		System.out.println("cc1 야호 목요일이다");
	}
}
// this()는 클라스 내 오버로딩 된 상속자를 끄러오기 위한 명령어이다.
class C2 extends C1{
	C2(){
		// super 있을 때 없을 때를 확인하기
		// 부모를 호출했을 때는 아무 상관이 없다
		// 그러나 호출하지 않았을 때는 기본 생성자를 거치고 온다
		super(" 헐~~"); // 매개변수 1개짜리 부모 생성자 호출
		// C1(String str)이 호출되었음을 확인하기
		System.out.println("매개변수 없는 자식 생성자");
	}
	// 아버지의 method와 겹치는 method
	void cc1Method() {
		System.out.println("C2 야호! 목요일이다");
	}
	void cc2Method() {
		System.out.println("cc2 자식 Method cc2 ");
	}
}

public class Super02 {

	public static void main(String[] args) {
		C2 c = new C2();
		c.cc2Method();
		// 부모에 없고 나한테만 있는 method
		c.cc1Method();
		// 내것은 있고, 부모에도 있으면 나의 메소드를 탄다
		// c.super.
		// 안(클라스 내부) 에서만 부를 수 있고 밖(메인)에서는 부를 수 없음

	}

}
