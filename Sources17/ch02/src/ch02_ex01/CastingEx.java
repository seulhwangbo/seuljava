package ch02_ex01;

public class CastingEx {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue =(char)intValue;
		//(Char) casting이다.
		System.out.println("charValue->"+charValue);
		// 유니코드
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println("intvalue->"+intValue);
		// casting 데이터 타입의 변환
		//long longValue = 5001234567L;
		//intValue = (int) longValue;
		//System.out.println("intvalue->"+intValue);
		//결과값이 잘릴 수 있다
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println("intValue2->"+intValue);
	}

}
