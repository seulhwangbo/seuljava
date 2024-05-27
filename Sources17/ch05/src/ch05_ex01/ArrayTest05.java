package ch05_ex01;

import java.lang.reflect.Array;
import java.util.Arrays;

//hw
public class ArrayTest05 {

	public static void main(String[] args) {
		
		String[] m = {"이름","국어","영어","수학","총점","평균"}; 
		String[] name = {"김준수","이하이","안예은","국카스텐"}; 
		int[][] score = {{80,70,90},
						 {70,90,90},	
						 {80,70,80},
						 {90,90,70}}; 
		int[] tot = new int[3]; int avg=0, sum=0;
		System.out.println("성적표 \n"); 
		for(int i = 0; i<m.length;i++) 
			System.out.print(m[i]+"\t"); 
			System.out.println("\n--------------------------------------------");
			for(int i = 0; i<name.length; i++) {
			System.out.print(name[i]+"\t");
		//	System.out.println(tot);
			 for(int j = 0; j<score.length;j++){
				 if (j==0) {
					 System.out.print(score[i][j]+"\t");
					 //System.arraycopy(score, i, tot, i, score.length-2);
				 }
				 else if(j==1) {
					 System.out.print(score[i][j]+"\t"); 
					 //System.arraycopy(score, i, tot, i, score.length-2);
					 //System.arraycopy(score, j, tot, j, score.length-2);
				 } 
				
				 else if(j==2) {
					 System.out.print(score[i][j]+"\t"); 	
					 //System.arraycopy(score, i, tot, i, score.length-2);
					 //System.arraycopy(score, j, tot, j, score.length-2);
				 }
				 
			
			}
			 System.out.println();
				}
	}
}
			
			
	

//결과와 총점을 구하기 2차원 배열 안에 
			



