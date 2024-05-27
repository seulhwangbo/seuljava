package ch04_ex03;
		//HW06
		public class ex0301 {

			public static void main(String[] args) {
				int sum = 0;
				for(int i = 1; i <= 100; i++) {
					if(i % 3 == 0)
					{	
						System.out.println("i-->"+i);	
						sum += i;
		                // 어디서 잘못됐는지 확인하기 위한 코드
					}
				}
				System.out.println("3의 배수의 합: " +sum);
			}
				// for문 이용해서 1부터 100까지 sum을 내되, 3의 배수의 합을 구하라
				// 결과값 1683
				// 3의 배수의 합: 1683
	}