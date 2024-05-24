package ch04_ex02;

public class SwitchNoBreakCaseEx {

	public static void main(String[] args) {
		// 8보다 크거나 같고 12ㅣ8+4|사이의 정수 얻기 random.math
		// time 이라는 변수에 넣기
		// * 최소시간
		int time = (int)(Math.random()*4) +8;
		System.out.println("[현재시간: " + time + "시]");
		
		switch(time) {
		case 8  :System.out.println(" 출근합니다.");
		case 9  :System.out.println(" 회의를 합니다");
		case 10 :System.out.println(" 업무를 봅니다");
		default :System.out.println(" 외근을 나갑니다.");
		}

	}

	//hw2 
	//switch(time)
	// 8시면 출근합니다
	// 9시면 회의를 합니다
	// 10시면 업무를 봅니다
	// 나머지면 외근을 나갑니다

}
