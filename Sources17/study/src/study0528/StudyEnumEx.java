package study0528;

import java.util.Calendar;

public class StudyEnumEx {

	public static void main(String[] args) {
		StudyEnum today = null;
		Calendar cal = Calendar.getInstance();
		int weekNum = cal.get(Calendar.DAY_OF_MONTH);
		
		switch(weekNum) {
			case 28:
				today = StudyEnum.하루; break;
			case 2:
				today = StudyEnum.이틀; break;
			case 3:
				today = StudyEnum.삼일; break;
			case 4:
				today = StudyEnum.사일; break;
			case 5:
				today = StudyEnum.오일; break;
			case 6:
				today = StudyEnum.육일; break;
			case 7:
				today = StudyEnum.칠일; break;
		}
		System.out.println("오늘 요일 : " + today);
	}

}
