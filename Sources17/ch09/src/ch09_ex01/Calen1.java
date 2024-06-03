package ch09_ex01;

import java.util.Calendar;
import java.util.Date;

// date -> util
// util 패키지 속 Calendar 클라스
// association 관계
public class Calen1 {

	public static void main(String[] args) {
//		Calendar cal = new Calendar();
// 		인스턴스화 할 수 없다 : 싱글톤인지 의심
//		new 했을 때 나타나지 않으면 싱글톤을 의심하기 -> .을 찍어서 확인하는 과정 필요
// 		네이밍 룰을 지키면 확인할 필요 없다. 커뮤니케이션 비용이 줄어들 수 있다.

		Calendar cal = Calendar.getInstance();
		
		int year  = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) +1;
		int date  = cal.get(Calendar.DATE);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다 \n", year, month, date);
	
// 		필드를 받을 수 있는데 필드를 받을 때 cal + ctrl + space -> . 찍고 확인
// 		cal.(우리가 사용할 수 있는 메소드 ctrl + t : 계층도 나타난다, 서열을 확인할 수 있고 객체들의 조상을 확인할 수 있다. )
// 		자주 쓰는 건 익숙하게 만들어놓고 필요한 게 있다면 구글링을 하면서 확인하면 된다.
		
		int hour = cal.get(Calendar.HOUR);
		int min  = cal.get(Calendar.MINUTE);
		int sec  = cal.get(Calendar.SECOND);
		System.out.printf("지금은 %d:%d:%d시 입니다 \n", hour, min, sec);
		
		// 시간과 날짜 모두 포함해서 출력
		Date dt = cal.getTime();
		System.out.println("cal.getTime - > "+ dt);
		
		// 							현재 월의 날짜:
		int dy1 = cal.get(Calendar.DAY_OF_MONTH);
		// 					   	   현재 년도의 날짜 : 올해 2024년의 현재까지의 날짜
		int dy2 = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(dy1 + " , " + dy2);
	}

}
