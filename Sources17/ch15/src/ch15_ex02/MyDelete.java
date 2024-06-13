package ch15_ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyDelete {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mysql 삭제할 부서를 입력하세요");
		String 	   dno  = sc.nextLine();
		Connection conn = null;
		Statement  stmt = null;
		String     driver = "com.mysql.cj.jdbc.Driver" ;
		String     url 	  = "jdbc:mysql://127.0.0.1:3306/scottdb";
		
		String     sql 	  = "DELETE from division where DNO = " + dno;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql84");
			stmt = conn.createStatement();
			
			int result = stmt.executeUpdate(sql);
			if ( result > 0 ) System.out.println("삭제 성공");
			else 			  System.out.println("삭제 실패");
	} catch (Exception e) {
			System.out.println(e.getMessage());
	} finally {
			if(conn != null) conn.close();
			if(stmt != null) stmt.close();
		}	
	sc.close();
	}

}
