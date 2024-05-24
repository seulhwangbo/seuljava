package ch02_ex01;

public class PromotionEx {

	public static void main(String[] args) {
	byte byteValue = 10;
	int intValue = byteValue;
	// 작은 값에서는 큰 값으로 변환 가능
	System.out.println("intValue->"+intValue);
	//sysout + ctrl + space 단축키
	
	char charValue = '가';
	intValue = charValue;
	System.out.println("가의 유니코드 = " + intValue);
	
	intValue = 500;
	long longValue = intValue;
	System.out.println("longValue->" + longValue);
	
	intValue = 200;
	double doubleValue = intValue;
	System.out.println("doubleValue -> " + doubleValue);
	}

}
