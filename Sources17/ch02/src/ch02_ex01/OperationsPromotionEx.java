package ch02_ex01;

public class OperationsPromotionEx {

	public static void main(String[] args) {
		byte byteValue1 = 10;	
		byte byteValue2 = 20;	
		
		//byte byteValue3 = byteValue1 + byteValue2 ;
		//컴파일 에러 발생 확인
		//byte는 연산식이 가능하지 않게 자체적으로 막는다.
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println("intValue1->"+intValue1);
		
		char charValue1 = 'A'; 
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;
		//char형의 덧셈도 컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드="+intValue2);
		//숫자v로 변환 66
		System.out.println("출력문자"+(char)intValue2);
		//문자로 전환 b
		// 졸지 않아야 한다...
		int intValue3 =10;
		int intValue4 = intValue3/4;
		System.out.println("intValue4->" + intValue4);
		
		
	}

}
