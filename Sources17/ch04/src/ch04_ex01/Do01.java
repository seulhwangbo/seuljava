package ch04_ex01;

public class Do01 {

	public static void main(String[] args) {
		int sum = 0, i = 1;
		do {
			sum +=i;
			i++;
		} while(i <=10);

		System.out.println("합계: "+ sum);
	}

}
