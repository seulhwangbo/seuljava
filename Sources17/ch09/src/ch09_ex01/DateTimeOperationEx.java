package ch09_ex01;

import java.time.LocalDateTime;

public class DateTimeOperationEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재시: "+ now);
		LocalDateTime targetDateTime = now.plusYears(1)
										  .minusMonths(2)
										  .plusDays(3)
										  .plusHours(4)
										  .minusMinutes(5)
										  .plusSeconds(5)
					;
		System.out.println("연산후: "+ targetDateTime);
									
	}

}
