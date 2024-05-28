package ch05_ex01;

//hw
public class ArrayTest05 {

	public static void main(String[] args) {

	      String[] m = {"이름","국어","영어","수학","총점","평균"}; 
	      String[] name = {"김준수","이하이","안예은","국카스텐"}; 

	      int[][] score = {{80,70,90},{70,90,90},{80,70,80},{90,90,70}}; 
	      int[] tot = new int[3]; int sum = 0, avg = 0; 
	      System.out.println("성적표 \n"); 
	      for(int i = 0; i<m.length;i++) 
	         System.out.print(m[i]+"\t"); 
	         System.out.println("\n--------------------------------------------");

		for (int i = 0; i < score.length; i++) {
			// i가 맞춘다는 점 확인
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {// 한사람의 점수
				// j 과목에 대한 총계 = 세로 줄이다
				// sum -> 사람의 총계
				System.out.print(score[i][j] + "\t");
			sum += score[i][j];
			tot[j] += score[i][j];
			// tot은 2차원 배열의 새로 줄을 뽑아내는 배열로 볼 수 있다 새로운 배열 생성하기
			}
			avg = sum / score[i].length;
			System.out.println(sum + "\t" + avg);
			sum = 0; // 초기화
		}
		System.out.println("--------------------------------------------");
		System.out.print("총계" + "\t");
		int totAvg, totSum = 0;
		
		for (int j = 0; j<3 ; j++) {
			System.out.print(tot[j]+"\t");
			totSum += tot[j];
		}
		
		totAvg = totSum/(score[0].length*name.length);
		// 갯수가 어차피 똑같아서 0으로 두고 한다.
		System.out.println(totSum + "\t"+totAvg);
		}
	}

//결과와 총점을 구하기 2차원 배열 안에 
