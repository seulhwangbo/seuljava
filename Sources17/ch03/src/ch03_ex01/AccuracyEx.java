package ch03_ex01;

public class AccuracyEx {

	public static void main(String[] args) {
		int 	apple = 1;
		double  pieceUnit = 0.1;
		int 	number = 7;
		// 우선순위 같을 시, 왼쪽에서 오른쪽 진행
		// 우선순위 */% -> +- : 우선순위
		double result = apple - number*pieceUnit;
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면,");
		System.out.println(result + "조각이 남는다.");

	}

}
