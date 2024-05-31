package ch08_ex05;

public class Manager2 extends Person2 {
	private String part;
	// super을 통해 상속 함수가 처리할 수 있는 건 그쪽으로 보낸 후
	// 내가 처리해야 할 것은 여기 안에서 처리해야 한다.
	Manager2(String name, int age, String part) {
		super(name, age);
		// 진정한 객체지향 원리를 이용하는 것
		// 객체 지향적 프로그램
		this.part = part;
	}
	public void print() {
		super.print();
		// 이것 또한 객체지향적 프로그램이다.
		System.out.println("담당: " + part);
	}	//내가 가지고 있는 순수 멤버 변수만 내가 처리하는 것이다.
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	
		
	}


