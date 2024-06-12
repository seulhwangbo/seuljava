package ch15_ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// hw
public class MySelect02 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("교수 코드를 입력하세요");
		int profno = sc.nextInt();
		
		String driver = "com.mysql.cj.jdbc.Driver" ;
		String url 	  = "jdbc:mysql://127.0.0.1:3306/scottdb";
		//String sql = "Select name, position,sal From professor Where profno = " + profno;
		String sql    = "Select * From professor";
		
		Connection conn = null;
		Statement  stmt = null;
		ResultSet  rs   = null;
		
		System.out.println("MySQL 교수 명단");
		System.out.println("교수번호\t이름\t직위\t급여\t학과코드");
		System.out.println("==========================");
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql84");
			stmt = conn.createStatement();
			rs 	 = stmt.executeQuery(sql);
			
			if (rs.next()) {
			  do {
				String name     = rs.getString("name");
				String position = rs.getString("position");
				String sal      = rs.getString("sal");
				String deptno   = rs.getString("deptno");
				
				System.out.print(profno  +"\t");
				System.out.print(name    +"\t");
				System.out.print(position+"\t");
				System.out.print(sal     +"\t");
				System.out.print(deptno  +"\t");
				System.out.println();
			} while(rs.next());
		}
			else {
				System.out.println("자료가 없어요");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}finally {
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
			if(rs 	!= null)   rs.close();
		}
		sc.close();
	}

}
