package ch09_ex04;

public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person(1111, "광해");
		Person p2 = new Person(1111, "광해군");

		if (p1.equals(p2)) System.out.println("같다");
		else			   System.out.println("다르다");

	}

}
