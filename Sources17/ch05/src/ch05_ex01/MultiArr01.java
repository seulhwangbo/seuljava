package ch05_ex01;
//2차원 배열 디버그 대상
public class MultiArr01 {

	public static void main(String[] args) {
		int [][] a = new int [2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 11;
		a[1][1] = 12;
		a[1][2] = 13;
		
		for (int i = 0; i<a.length; i++) {
			for (int j = 0; j<a[i].length;j++) {
				System.out.print("일반 for " + a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("=======향상형 for ============");
		for(int [] k1 : a) {//a[0]a[1] = 1차원 배열 두 개를 통째로 가지고 있다
			for(int K2 : k1) {
			System.out.print("향상형for" + K2 + "\t");
			// 0번행 a[0] -> [0][0],[0][1],[0][2]
			// 1번행 a[1] -> [1][0],[1][1],[1][2]
			}
			System.out.println();
		}
	}

}
