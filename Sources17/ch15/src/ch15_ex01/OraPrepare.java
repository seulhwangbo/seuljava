package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OraPrepare {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 Oracle 부서코드? "); String deptno = sc.nextLine();
		System.out.println("입력할 Oracle 부서명? ");  String dname  = sc.nextLine();
		System.out.println("입력할 Oracle 근무지? ");  String loc    = sc.nextLine();
		
		Connection   	  conn  = null;
		PreparedStatement pstmt = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "Insert Into dept values(?,?,?)";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			pstmt = conn.prepareStatement(sql); //sql 추가
			pstmt.setString(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			//result는 작업에 성공한 갯수
			int result = pstmt.executeUpdate(); // 입력, 수정, 삭제 시 = executeUpdate
			if(result > 0 ) System.out.println("OraPrepare 입력 성공");
			else 			System.out.println("OraPrepare 입력 실패");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		} finally {
			if (pstmt != null )pstmt.close();
			if (conn  != null )conn.close();
		}
		sc.close();
	}

}
