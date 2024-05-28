package ch06_ex01;

public class Car3Ex {

	public static void main(String[] args) {
		// c1, c2, c3 인스턴스로 선언
		// car3 에 대한 class
		// car3는 멤버변수 초기화도 같이 시켜준다는 것을 확인할 수 있는 예제이다.
		// public Car3()와 연결되는 값
		Car3 c1 = new Car3(); 
		// 기본 할당자로 만들었기 때문에 현재 메모리만 받은 상태이다.
		//Car3 c1 = new Car3("소나타", 10, 14); 
		Car3 c2 = new Car3("다마스", 9, 20); 
		Car3 c3 = new Car3("모 닝", 12, 13); 
		// 메모리 + 변수(Instance 변수, 필드, 멤버변수) 초기화까지 완료된 상태이다.
		
		c1.name    = "소나타";
		c1.inTime  = 10;
		c1.outTime = 14;
		// 기본 할당자로 만든 변수는 이런 식으로 코딩을 또 따로 해주게 된다.
		
		c1.print();
		c2.print();
		c3.print();

	}

}
