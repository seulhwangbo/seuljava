package study01;

public class CheckValueBeforeCasting {
	//MINVALUE / MAX VALUE + If else 구문 사용하기 + byte 확인
		// minValue & maxValue 사용
	public static void main(String[] args) {
		long i = 214748369L;
		// 비교 대상이 부재
		// 괄호 사용하기
		// 비교할 때는 Byte 대문자 확인
		
		// 값의 min과 max를 알 때는 첫문자 대문자 + 풀네임 작성
		// Byte, Short, Integer, Long, Float, Double + MIN(MAX)_VALUE
		if((i<Integer.MIN_VALUE) || (i>Integer.MAX_VALUE)) {
			System.out.println("integer 타입의 변환이 안됩니다.");
			System.out.println("값의 확인이 필요합니다.");
		} else {
			int b = (int)i;
			System.out.println("b->" + b);
		}

	}

}
