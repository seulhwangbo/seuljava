package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;

public class OraDr01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		// 이는 약속이다. 무조건 이해하면 된다. copy paste로 하기
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		System.out.println("Start1");
		try {
			Class.forName(driver);
			// driver의 문제일 수 있다
			// Oracle Driver을 메모리에 올리는 것 memory up
			System.out.println("Start2");
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			// url의 정보까지는 정보이고 = > @ 뒤에 있는 것은 나의 ip이다
			// scott의 포트 번호 1521 
			System.out.println("Start3");
			if (conn != null){
				// 실패했다는 뜻이다
				System.out.println("Success 연결 성공");
			} else {
				System.out.println("Fail");
			}
			conn.close();
		}
		catch(Exception e) {
			System.out.println("Error");
			
		}
	}

}
