package ch07_ex03;

public class ComputerEx {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		// 컴퓨터 호출
		
		int [] values1 = {1, 2, 3};
		// 배열 선언 및 값 입력
		// {1,2,3} 배열로 넘어간다
		// for(int i= 0 ; i<values.length; i++) sum+=values[i];
		// sum을 타고 1+2+3 + sum;
		int result1 = myCom.sum1(values1);		
		System.out.println("result1: " + result1);
		
		// 직접 코딩을 따로 하는 것이 아니라 선언과 동시에 값을 입력하고 값을 넘긴다.
		int result2 = myCom.sum1(new int [] {1,2,3,4,5});
		System.out.println("result2: " + result2);
		
		// ...이 무슨 뜻인지 알기 위한 코드
		int result31 = myCom.sum2(1,2);
		System.out.println("result31: " + result31);
		int result32 = myCom.sum2(1,2,3);
		System.out.println("result32: " + result32);
		int result41 = myCom.sum2(1,2,3,4,5);
		System.out.println("result41: " + result41);

	}

}
