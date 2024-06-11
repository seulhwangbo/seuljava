package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraUpdate {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 부서를 입력하세요"); String deptno = sc.nextLine();
		System.out.println("부서명? "); 			 String dname = sc.nextLine();
		System.out.println("근무지?"); 			 String loc   = sc.nextLine();
		String sql    = "Update DEPT SET dname = '"+ dname +"', LOC = '"+loc+"' WHERE DEPTNO ="+deptno;
		// 어떻게 이런 로직이 나왔는지 확인하기
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "scott","tiger");
		Statement stmt =  conn.createStatement();
		System.out.println(sql);
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result > 0) System.out.println("수정 성공입니다");
			else 		   System.out.println("수정 실패입니다");
			
		} catch(Exception e) {
				System.out.println(e.getMessage());
		} finally {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}
			sc.close();
		}


		
	}
	// Update 가능하도록 완성


