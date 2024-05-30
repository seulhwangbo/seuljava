package study0530;

public class ComputerExam {
	int sum1 (int[] values) {
		int sum = 0;
		
		for (int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	// 여기서 중요한 개념은 ... 이다
	// int 값을 받아서 배열로 처리하겠다는 명령어이다.
	// 위와 아래의 값 모두 배열을 생성하겠다는 명령어이다.
	

	int sum2(int ... values) {
		int sum = 0;
		System.out.println("values -> " + values);
		for(int i = 0; i<values.length; i++) {
			System.out.println("values[i]" + values[i]);
			sum += values[i];
		}
		return sum;
	}
}
