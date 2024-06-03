package ch09_ex03;

public class String1 {

	public static void main(String[] args) {
		String a1 = "Java"; // 문자열 상수를 생성자에 전달해서 string 객체를 생성한 예
		String a2 = "Java";
		// 두개는 같은 메모리 주소를 바라본다.
		String a3 = new String("Java"); // string 객체에 문자열 리터럴을 저장
		String a4 = new String("java");
		System.out.println(a1 + " , " + a2 + " , " + a3);

		if (a1 == a2)
			System.out.println("a1과 a2는 같다");
		else
			System.out.println("a1과 a2는 다르다");
		if (a1 == a3)
			System.out.println("a1과 a3는 같다");
		else
			System.out.println("a1과 a3는 다르다");

		if (a1.equals(a2))
			System.out.println("equals a1과 a2는 같다");
		else
			System.out.println("equals a1과 a2는 다르다");
		if (a1.equals(a3))
			System.out.println("equals a1과 a3는 같다");
		else
			System.out.println("equals a1과 a3는 다르다");

		if (a1.equals(a4))
			System.out.println("a1과 a4는 같다");
		else
			System.out.println("a1과 a4는 다르다");
		if (a1.equalsIgnoreCase(a4))
			System.out.println("a1과 a4는 같다");
		else
			System.out.println("a1과 a4는 다르다");
		if (a3.equalsIgnoreCase(a4))
			System.out.println("a3과 a4는 같다");
		else
			System.out.println("a3과 a4는 다르다");
		// 메소드 * 클래스명 지을 때 직관적으로 알 수 있는 이름을 짓는 것이 중요하다
		// ignore -> 대소문자 무시하고 비교하는 것
	}

}
