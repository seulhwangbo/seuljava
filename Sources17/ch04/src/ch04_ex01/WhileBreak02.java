package ch04_ex01;

public class WhileBreak02 {

	public static void main(String[] args) {
		int i = 0, j = 0 ;
		while (true) {
			i++;
			while(true){
				j ++;
				System.out.print("현재 j는 " + j + "\t");
				if (j==5) break;
				//i 하나당 5번의 j
			}
			System.out.println("\n현재 i는 " + i);
			j = 0;
			// j 클리어
			if (i == 10) break;
		}
		System.out.print("끝");

		// 밖에서는 10번 안에서는 5번
	}

}
