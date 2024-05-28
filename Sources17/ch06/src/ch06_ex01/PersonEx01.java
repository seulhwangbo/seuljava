package ch06_ex01;

//Homework01
class Person {
	String name;
	int age;
	String gender;

	void print() {
		System.out.println("이름: " + name + " 나이:" + age + " 성별: " + gender);
	}
}

public class PersonEx01 {

	public static void main(String[] args) {
		Person per11 = new Person();
		per11.name = "홍길동";
		per11.age = 52;
		per11.gender = "M";

		Person per12 = new Person();
		per12.name = "연개소문";
		per12.age = 62;
		per12.gender = "M";

		Person per13 = new Person();
		per13.name = "선덕여왕";
		per13.age = 72;
		per13.gender = "F";

		per11.print();
		per12.print();
		per13.print();
	}

}
