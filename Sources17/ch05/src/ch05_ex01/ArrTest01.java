package ch05_ex01;

public class ArrTest01 {

	public static void main(String[] args) {
	 int a[][]= {{1,2,3,4,5},//1행 열 5개
			 	 {11,12,13,14,15},//2행,
			 	 {21,22,23,24,25}//3행
			 	 //[2][1] == 12
			 	};
	 // System.out.println("시작");
	 // 디버그용 코드
	 for(int i = 0; i<a.length;i++) {
		 // 행의 크기를 가리킨다 a[i].length
		 // 2차원 배열에서 1차원 배열의 크기를 가르킨다는 건 행의 크기를 말한다.
		 for(int j=0; j<a[i].length; j++) {
			 System.out.print(a[i][j]+" \t");
		 } // inner for
		 System.out.println();
	 }
	 //out for
	}

}
