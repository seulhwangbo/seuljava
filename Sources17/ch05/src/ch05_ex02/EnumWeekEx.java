package ch05_ex02;

import java.util.Calendar; //Calendar 사용하면 자동으로 지정되는 함수

public class EnumWeekEx {

	public static void main(String[] args) {
		Week today = null; // today가 이름
		// 자동완성 시키기
		// 현재 일자의 번호를 가지고 온다
		// 자바 자체적인 미리 만들어진 것
		Calendar cal = Calendar.getInstance();
		int weekNum = cal.get(Calendar.DAY_OF_WEEK);

		switch (weekNum) {
			case 1:
			 	today = Week.SUNDAY; 	break;
			case 2:
			 	today = Week.MONDAY; 	break;
			case 3:
			 	today = Week.TUESDAY; 	break;
			case 4:
			 	today = Week.WEDNESDAY; break;
			case 5:
			 	today = Week.THURSDAY;  break;
			case 6:
			 	today = Week.FRIDAY; 	break;
			case 7:
				today = Week.SATURDAY;  break;
			}
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 교회에 갑니다.");
			} else {
			System.out.println("열심히 자바 공부를 합니다.");
			}
			
	}
		
}
