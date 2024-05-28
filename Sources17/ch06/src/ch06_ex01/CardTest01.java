package ch06_ex01;
class Card{
	//인스턴스 변수 == 멤버 변수 혹은 필드
	String kind; 
	int number;
	
	//클래스 변수
	static int width = 100; 
	static int height= 250;
	
	//기본 생성자를 알아서 만들어준다.
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public Card(String kind,int number) {
		this.kind = kind;
		this.number = number;
	}
	// 오버로딩 중 
}

public class CardTest01 {

	public static void main(String[] args) {
		// 객체1 생성 -- > 기본 생성자
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		System.out.print(" c1 : " + c1.kind + "," + c1.number);
		//System.out.println("c1 : " + c1.width + "," + c1.height);
		System.out.print("\n c1 : " + Card.width + "," + Card.height);
	    // 20번과 21번은 동일한 의미를 표현한다 
		// 이미 멤버 변수가 초기화 되어있기 때문에 따로 할 필요 없다
		// 객체2 생성 -- > 생성자 (memory + instance 변수)
		Card c2 = new Card("Spade", 4);
		System.out.print("\n c2 : " + c2.kind + "," + c2.number);
		System.out.print("\n c2 : " + Card.width + "," + Card.height);


	}

}
