package example;

public class FinalEx {

	public static void main(String[] args) {
		final double PI = 3.14;
		double radius = 2.0, circum;
		
		// PI++; 
		// 상수에 가공을 하면 오류가 발생한다.
		
		circum = 2 * PI * radius;
		System.out.println(circum);
	}

}
