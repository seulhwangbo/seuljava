package ch08_ex01;

public class LendarableEx {
	
	public static void main(String[] args) {
		// SEP + CTRL + SPACE
		SeperateVolume sv = new SeperateVolume("젊은 벨으텔으의 슬픔");
		// 멤버 변수에 책 이름 세팅
		sv.checkOut("정승환/박윤하","2024/03/21");
		//			borrower     date
		sv.checkin();
	}

}
