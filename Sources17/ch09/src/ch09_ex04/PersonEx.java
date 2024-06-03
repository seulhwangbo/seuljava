package ch09_ex04;

public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person(1111, "광해");
		Person p2 = new Person(1111, "광해군바부");
		Person p3 = new Person(12211, "바보군");
		Person p4 = new Person(121, "바보군");
		if (p1.equals(p2)) System.out.println("같다");
		else			   System.out.println("다르다");
		if (p3.equals(p4)) System.out.println("같다");
		else			   System.out.println("다르다");
	}

}
