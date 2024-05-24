package study0523;

public class VariEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		<결과값>
		f1=10.1 
		f2=10.12 
		d1=100.170000 
		
		float f1, f2;
		double d1;
		f1 = 10.1f;
		f2 = 10.123456f;
		d1 = 100.17;
		float 함수를 printf에 어떤 함수를 사용해서 도출할 수 있는지에 대한 정의


		 */
		
		float f1 = 10.1f;
		float f2 = 10.12f;
		double d1 = 100.17;
		
		System.out.printf("f1 = %.1f\n", f1);
		System.out.printf("f2 = %.2f\n", f2);
		System.out.printf("d1 = %f\n", d1);
		
		//여기서 주의해야 할 것은 double이나 float에 상관없이 정수가 아닌 실수는 printf 함수에 들어가면 무조건 %f를 사용한다는 점
		//두번째 %.원하는자리수f
	}

}
