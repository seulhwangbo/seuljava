package ch10_ex01;

public class Exception07 {
	static void callDriver() throws ClassNotFoundException {
		System.out.println("callDriver 수행 중 ...");		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 오라클 사용할 때 자주 쓸 코드  설명 다시 해 주신다고 하심
		// 존재한다면 메모리를 올리겠지만, 존재하지 않는다면 오류를 띄운다
		// 6번이 존재하지 않기 때문에 당연히 예외처리를 해야 한다.
		System.out.println("callDriver Drive 완료 ...");		
	}
	
	public static void main(String[] args) {
		System.out.println("callDriver 호출 전");
		try {
			callDriver();
			// 에러를 포함할 수도 있는 객체이기 때문에 위에서 throw를 했다면 여기서도 수정을 해야 한다
		} catch (ClassNotFoundException e) {	
			System.out.println("클래스를 찾을 수 없습니다.");		
		} catch (Exception e) { // switch문의 default
			System.out.println(e.getMessage());
		} finally {
			System.out.println("시스템 종료.");
		} // finally는 반드시 수행한다.
	}

}
