package ch15_ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyInsert01 {

	public static void main(String[] args) throws SQLException {
		Scanner sc= new Scanner(System.in);
		System.out.println("MySql 부서코드?"); 	String dno   	= sc.nextLine();
		System.out.println("MySql 부서명 ?");     String dname    = sc.nextLine();
		System.out.println("MySql 위치 ? ");     String position = sc.nextLine();
		
		Connection conn = null;
		Statement stmt = null;
		String driver = "com.mysql.cj.jdbc.Driver" ;
		String url = "jdbc:mysql://127.0.0.1:3306/scottdb";
		String sql = String.format("Insert Into division(dno,dname,position)" + "values(%s,'%s','%s')",dno, dname, position);
//		String sql = "Insert Into division values("+dno+","+dname+","+position+");
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql84");
			stmt = conn.createStatement();
			//작업 성공한 갯수
			int result = stmt.executeUpdate(sql);
			if (result > 0 ) System.out.println("Mysql division 입력 성공");
			else			 System.out.println("Mysql division 입력 실패");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if ( stmt != null) stmt.close();
			if ( conn != null) conn.close();
		}
		sc.close();
	}

}
