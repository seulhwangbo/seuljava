package study0523;

public class VariEx05 {
	public static void main(String[] args) {
		int n1 = 90;
		int n2 = 90;
		int n3 = 91;
		int sum;
		double avg1;
		double avg2;
		double avg3;
		double avg4;
		sum = n1 + n2 + n3;
		avg1 = sum / 3;
		avg2 = sum / (float) 3;
		// 형변환 유뮤의 차이
		avg3 = (float)(sum/3); 
		// 3번째는 나머지를 버린 상태에서 실행했기 때문에 float으로 변화해도 똑같다
		// avg는 double
		// 정수결과에 Float형 선언
		avg4 = (float) sum / 3;
		
		System.out.printf("총점 = %d\n", sum);
		System.out.printf("평균1 = %.1f\n", avg1);
		System.out.printf("평균2 = %.1f\n", avg2);
		System.out.printf("평균3 = %.1f\n", avg3);
		System.out.printf("평균4 = %.1f\n", avg4);
}
	/*
	 	총점 = 271
		평균1 = 90.0
		평균2 = 90.3
		평균3 = 90.0
		평균4 = 90.3

	 */
}
