package ch02_ex03;

public class Variable05 {

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
		// sum과 n이 다 같은 데이터 타입
		avg1 = sum / 3;
		avg2 = sum / (float) 3;
		// 형변환 유뮤의 차이
		avg3 = (float)(sum/3); 
		// 3번째는 나머지를 버린 상태에서 실행했기 때문에 float으로 변화해도 똑같다
		// avg는 double
		// 정수결과에 Float형 선언
		avg4 = (float) sum / 3;
		// 둘 중에 하나가 float이라면 float으로 선언한다

		
		System.out.printf("총점 = %d\n", sum); //println
		System.out.printf("평균1 = %.1f\n", avg1);//자리수 지정
		System.out.printf("평균2 = %.1f\n", avg2);
		System.out.printf("평균3 = %.1f\n", avg3);
		System.out.printf("평균4 = %.1f\n", avg4);
	}

}
