package ch08_ex02;

// 코드 한 번 확인하고 정리할 대상
public class Car {
	// member 변수, 인스탄스 변수, 필드
	String kind;
	Engine eg; 
	// 여려 개의 객체를 모아놓은 것이다.
	// type, cc, method(print)
	// 객체를 멤버 변수로 둘 수 있다
	// 기본 변수를 선언하지 않아도 기본변수도 선언 가능한가
	// 객체는 상자값일 뿐이다
	// 실무에서 자주 사용하는 것이기에 잘 알고 있는 것이 좋다
	// 종합선물세트처럼 들고 다니기
	// 값으로 선언하는 것이 아니라 주소로 선언해야 하기 때문에 reference가 되는 것이다.

	public Car(String kind, Engine eg) {
		this.kind = kind;
		this.eg = eg;
	}

	void print() {
		System.out.println("종류 : " + kind);
		eg.print();
		//중간에 먼저 나온다는 점 확인
		//주소값을 미리 넣었으니 네가 알아서 처리해라
		System.out.println("============ ");
	}

	public static void main(String[] args) {
		Engine eg1 = new Engine("알파엔진", 2000);
		Engine eg2 = new Engine("베타엔진", 3000);
		// engine을 객체로 만들었고 그것을 여러 개를 같이 사용 중인 것이다.
		// 객체 단위로 가지고 다녀야 편하다는 점 확인하기
		// association 
		// 구조적 방법론
		Car[] c = new Car[3];
		c[0] = new Car("소나타",eg1);
		c[1] = new Car("모 닝", eg1);
		c[2] = new Car("벤 츠", eg2);
		//        c = <객체> 소나타, 모닝, 벤츠
		for (Car c1 : c) {
			c1.print();
		}
		// 로직화 시켜서 사용
		//  안 좋은 코딩 방식
		//	Car c1 = new Car("소나타", eg1);
		//	c1.print();
		//  유지보수가 어려워지기 때문에 이런 식으로 사용하지 않는다
		//  가급적 For문 사용이 좋다.
	}

}
