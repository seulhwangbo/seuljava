package ch05_ex01;
// 현장 work
public class ArrTest03 {
	// 합계, 평균, 최대값, 최소값 구하기 ... 연습문제
	public static void main(String[] args) {
		int array[] = {76, 45, 34, 89, 100, 50, 90, 92};
		int sum=0, avg=0, max=0, min = 100 ;
		
		for(int i = 0; i<array.length; i++) {
			sum += array[i];
			// 내부에 있는 값을 찾기
			if(array[i]> max) 	max = array[i];
			if(array[i]< min)   min = array[i];
			// 가장 큰 수 찾기 작은 수 찾기 어떻게 하는 거지
			// 일부러 min과 max에 가장 작은 수와 가장 큰 수를 부여
		}
		avg = sum / array.length;
		// for문이 다 돌고 나서야 비로소 sum이 완성이 되기 때문에 for문 밖에 avg를 둔 점 확인
		
		
		
		
		System.out.println("합계 = " + sum + "평균 = " +avg);
		System.out.println("최대값 = " + max + " 최소값 = " +min);
	}

}
