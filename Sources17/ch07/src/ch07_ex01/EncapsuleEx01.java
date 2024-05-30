package ch07_ex01;

class Encapsule {
//	public String name;
//	public int    age;
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age < 0)
			System.out.println("나이 입력 오류 ㅎㅎㅎ");
		else
			this.age = age;
	}
}

public class EncapsuleEx01 {

	public static void main(String[] args) {
		Encapsule h1 = new Encapsule();
//		h1.name = "김준수";
//		h1.age  = -10;
// 		다른 클라스에서 건들기 때문에 오류가 난다
// 		이런 식으로 사용하고 싶으면 public으로 풀어서 써야 한다
//		그럼에도 특별한 경우 외에는 private로 코딩을 한다.
		h1.setName("김준수");
		h1.setAge(-100);

		System.out.println("이름 : " + h1.getName());
		System.out.println("나이 : " + h1.getAge());

	}

}
