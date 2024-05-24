package study0523;
// 삼항연산식 + 부정을 사용하여 하나의 string에 연산식을 한 번에 만들기
public class ex0202ex {

	public static void main(String[] args) {
		
		int score = 94;
		String result = (!(score>90))?"B":"A";
		// 괄호의 위치가 중요하다
		// 작은 따음표가 아니라 큰 따음표라는 점을 확인하기
		// 부정을 포함하기 위해서는 조건식을 다 묶은 후 그 조건식을 뒤집는다는 느낌으로 !표를 두기
		System.out.println(result);
	}

}
