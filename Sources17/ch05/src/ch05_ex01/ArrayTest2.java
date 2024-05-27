package ch05_ex01;

public class ArrayTest2 {

	public static void main(String[] args) {
		int money = 2680;
		//            0    1    2   3 - > 습관이 될 때까지는 인덱스를 미리 걸어놓는다
		int[] unit = {500, 100, 50, 10};
		// 각 동전이 최대한 나올 수 있는 갯수
		for (int i =0; i < unit.length; i ++) {
			int cnt = money / unit[i];
			System.out.println(unit[i]+"원짜리 :" +cnt + "개");
			money %=unit[i];
			// 나머지 값을 이용해서 남은 돈을 확인 후 다음 수식 진행하기
			System.out.println("money->" + money);
			// 화폐의 최대값 및 최대 단위 확인
		}
	}

}
