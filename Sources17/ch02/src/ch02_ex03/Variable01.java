package ch02_ex03;

public class Variable01 {

	public static void main(String[] args) {
		float f1, f2;
		double d1;
		
		f1 = 10.1f;
		System.out.printf("f1=%.1f \n", f1);
		
		f2 = 10.123456f;
		System.out.printf("f2=%.2f \n", f2);
		//%.(자릿수)
		
		d1 = 100.17;
		System.out.printf("d1=%f \n", d1);
		// double도 decimal과 헷갈리지 않기 위해서 d대신 f를 쓴다
	}

}
