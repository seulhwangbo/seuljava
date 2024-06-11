package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraInsert {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		// 부서번호는 서로 겹치지 않도록 해야 한다
		System.out.println("부서번호 입력?"); 	String deptno = sc.nextLine();
		System.out.println("부서명 입력? "); 	String dname  = sc.nextLine();
		System.out.println("위치 입력? "); 	String loc 	  = sc.nextLine();
		// localHost -> 127.0.0.1:1521 port 번호 
		String driver = "oracle.jdbc.driver.OracleDriver";
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = String.format("Insert Into dept Values(%s, '%s','%s')", deptno,dname,loc);
//	    String sql = "Insert Into Dept Values(" + deptno +",'"+dname+"','"+loc+"')";
// 		sql 에 들어간 문자열을 똑같이 다 입력을 해야 인식이 되기 때문에 단일 따옴표로 둘러 싸주어야 한다.

	    System.out.println("sql" + sql);
		Connection conn = null;
		Statement  stmt = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			stmt = conn.createStatement();
			// result set
			int result = stmt.executeUpdate(sql); // executeUpdate => 수행
			if (result > 0) System.out.println("입력 성공 ^^");
			else			System.out.println("입력 실패 ㅜ.ㅜ");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if (stmt != null) stmt.close();
			if (conn != null) conn.close();
		}
		sc.close();
		
		
	}

}
