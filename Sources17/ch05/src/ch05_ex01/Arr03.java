package ch05_ex01;

public class Arr03 {

	public static void main(String[] args) {
		String [] str = {"산토끼", "고양이", "판토끼","강아지"};
		for (int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("=============향상형 For문===========");
		// 향상형 for문
		// 변수명은 중요하지 않고 자료형이 중요하다 
		// string으로 선언했기 때문에 배열 내 모든 자료는 string 형으로 되어 있다.
		for(String kk : str) {
			System.out.println("향상형 = "+kk);
		}

	}

}
