package ch09_ex02;

public class Integ1 {

	public static void main(String[] args) {
	
		String str = "3";
		//모두 문자열을 정수로 변환해주는 메소드
		// 1. Integer.parseInt()는 결과값을 기본 자료형(Primitive Type)인 int 로 반환
		// 2. Integer.valueOf()는 문자열의 값을 정수형으로 변환한 뒤 
		//    참조 자료형(Reference Type)인 Integer 객체로 만들어서 반환
		int i1 = Integer.parseInt("3");
		Integer i2 = Integer.valueOf("3");
		// 인터져 형으로, 객체로 받아진다.
		// 사용할 만한 메소드가 있다면 필요에 따라 Integer로 변환해서 사용하기도 한다.
		
		//i1. ==> 숫자로만 쓰여지기 위한 숫자일 뿐이다.
		//i2. 이후에는 
		//같은 인터져라고 하더라도 method를 사용할 수 있다.
		
		
		//내부적으로는 같은 int로 취급하기 때문에 결과는 나온다
		//그러나 기본 메소드를 사용할 수 있는지 없는지에 따라 사용 범위가 다르다.
		System.out.println(i1 + i2);
		System.out.println(str + str);
	}

}
