package ch02_ex02;
// study 
public class IncDecEx {
	

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		int result1 = num1++; // ++ 연산의 결과는 num1의 기존값
		
		result1 = num1;
		num1 =  num1 + 1; //  num1++
		// num1에 할당된 것이 1이고 result에는 num1의 기존값이 들어가게 된다 
		System.out.println("num1 = " + num1);
		
		
		int result2 = num2--; // -- 연산의 결과는 num2의 기존값
		int result3 = ++num3; // ++ 연산의 결과는 num3의 새로운 값
		int result4 = --num4; // -- 연산의 결과는 num4의 새로운 값
		// int result5 ; 		  // -- 연산의 결과는 num4의 새로운 값
		// int result6 ;		  // -- 연산의 결과는 num4의 새로운 값
				
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		System.out.println("result4 = " + result4);
		System.out.println("result5 = " + result3);
		result3--;
		// 단독 실행은 결과가 똑같다
		// 연산과정이 포함되어 있으면 앞과 뒤의 결과가 달라진다.
		System.out.println("result6 = " + result3++);
		System.out.println("result3 = " + result3);
	}
	
	

}
