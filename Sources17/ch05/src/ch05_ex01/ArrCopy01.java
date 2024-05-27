package ch05_ex01;

public class ArrCopy01 {
//  main에서 호출하는 method는 같은 method여야 한다 ( must!!!!!!)﻿
	public static void main(String[] args) {
		//          0 1 2 3 4 5 6 <인덱스>
		int [] a = {1,2,3,4,5,6,7};
		int [] b = new int [10];
		
//		for(int i = 0; i <a.length; i++) {
//			b[i] = a[i];
		System.out.println("---------a, 0, b, 0, a.length-----------");
		System.arraycopy(a, 0, b, 0, a.length);
		//               a 배열에 0번째 인덱스부터 복사를 시작한다. 
		//               target[b]에 0번째부터 복사 
		//               얼마만큼 복사하는가 [a의 인덱스]만큼
		//              주석문 쓰기
			// 배열의 카피를 하는 것
			// 두 개 다 배열을 카피하는 것이지만 아래 방법을 더 자주 사용한다
//	}
		pr(b);
		cls(b); 
		System.out.println();
		pr(b);
		
		System.out.println();
		System.out.println("---------a, 0, b, 0, a.length------------");
		System.arraycopy(a, 0, b, 2, a.length);
		pr(b);
		
		System.out.println();
		System.out.println("---------a, 1, b, 0, a.length-1------------");
		System.arraycopy(a, 1, b, 0, a.length-1);
		// 6이라고 적으면 안되고 이런 식으로 적어야 다른 사람들이 볼 때 이해할 수 있게 만든다.
		pr(b);
		cls(b); 
		
		System.out.println();
		System.out.println("---------a, 1, b, 3, a.length-1------------");
		System.arraycopy(a, 1, b, 3, a.length-1);
		pr(b);
		cls(b); 
		
		//a가 1번부터 배열이 복사됐기 때문에 -1을 해야 한다
		// 배열의 값을 자유자재로 변경할 수 있다
		// a 배열 0번째에 있는 걸 b 배열 2번째에부터 복사해서 넣는다.
		// print를 하면서 확인하기
		// reuse를 위해서 사용하는 모듈화
		// cls = 배열 값 clear
		// 객체 조회하기 : 조회할 때는 메소드를 생성해서 조회한다
		//System.out.println("b=>"+b);
		// 위처럼 입력하면 console 결과 : b=>[I@4e50df2e
	}
	// 이름은 같을 필요가 없지만 타입은 같아야 한다.
	private static void cls(int[] b) {
		for (int i = 0; i<b.length; i++) {
			b[i] = 0;
			// 여기서 배열 값을 전부 0로 clear 시켜준다
		}
		
	}

	private static void pr(int[] b) {
		// 자동으로 int라고 인식하고 int로 꺼내줬다.
		// 오류가 발생시키지 않도록 자동완성을 하는 것이 좋다.
		for (int i =0; i<b.length;i++) {
			System.out.print(b[i]+"\t");
		}
		
	}

}
