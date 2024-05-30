package ch07_ex03;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		
		for(int i= 0 ; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// 가변변수는 기본형으로 넘어가도 배열로 잡힌다.
	// 인자를 가변으로 넣을 수 있다.
	// 내부적으로 기본형이지만 객체형으로 취급한다는 것을 확인할 수 있다.
	// 넘겨줄 때는 int로 넘겨줘도 배열로 취급될 수 있다.
	int sum2(int ... values) {
		int sum = 0;
		// 1번 values 가 뭔지 알기
		System.out.println("values -> "+values);
		for(int i=0; i<values.length; i++) {
		// 2번 values i 값이 뭔지 확인하기
			System.out.println("values[i] -> "+values[i]);
			sum += values[i];
		}
		return sum;
	}
}
