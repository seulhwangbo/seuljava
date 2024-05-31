package ch08_ex05;

public class Teacher2 extends Person2 {
	private String subject; 
	
	Teacher2(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		// TODO Auto-generated constructor stub
	}
	public void print() {
		super.print();
		System.out.println("과목: " + subject);
	}
	// 자동완성
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
