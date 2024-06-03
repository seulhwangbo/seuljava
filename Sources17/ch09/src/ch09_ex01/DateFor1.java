package ch09_ex01;

import java.text.SimpleDateFormat;
import java.util.Date;
// 객체를 가져올 때 헷갈리지 않도록 주의

public class DateFor1 {

	public static void main(String[] args) {
		// 현재 일자 가져올 때
		Date today = new Date();
		System.out.println("today -> " + today);
		// 전체 다 칠 필요는 없지만 윤곽이 드러날 정도로는 쳐서 헷갈리지 않도록 주의하기
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8;
		SimpleDateFormat sdf9;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("''yy년 MM월 dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
		sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");
		
		System.out.println("Sdf1->" + sdf1.format(today));
		System.out.println("Sdf2->" + sdf2.format(today));
		System.out.println("Sdf3->" + sdf3.format(today));
		System.out.println("Sdf4->" + sdf4.format(today));
		System.out.println();
		// 아래는 필요시 구글링 위는 필수이다.
		System.out.println("Sdf5->" + sdf5.format(today));
		System.out.println("Sdf6->" + sdf6.format(today));
		System.out.println("Sdf7->" + sdf7.format(today));
		System.out.println("Sdf8->" + sdf8.format(today));
		System.out.println("Sdf9->" + sdf9.format(today));
	
	}

}
