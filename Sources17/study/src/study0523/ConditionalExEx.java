package study0523;

public class ConditionalExEx {
//삼항연산자를 만드는 것이 중요
//삼항연산자 내부의 두번째 삼항연산자를 만들 수 있다.
	public static void main(String[] args) {
		int score = 91;
		char grade = ((score>90) ? 'A' :((score>80) ? 'B' : ((score>70)? 'C':'F')));
		System.out.println(grade);
	}

}
