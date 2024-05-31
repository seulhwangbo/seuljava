package ch08_ex05;

public class Student2 extends Person2 {

	private String sno;
	
	Student2(String name, int age, String sno) {
		//부모 클래스가 가지고 있는 부분은 부모 클래스에 맡기기
		super(name, age);
		//내가 새롭게 얻은 부분만 처리
		this.sno = sno;
		
	}
	
	public void print() {
		super.print();
		System.out.println("학번 : " + sno);
	}
	// 자동완성을 통해서 밑에는 생성하기.
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

}
