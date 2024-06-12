package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraSelect01 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드를 입력하세요");
		int     deptno = sc.nextInt();
		String driver  = "oracle.jdbc.driver.OracleDriver";
		// Localhost -> 127.0.0.1; , Port 번호:1521  , xe(orcl)-> Service ID(Sid)
		String url     = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql     = "Select dname,loc From Dept Where deptno=" +deptno;
		Connection   conn   = null;  // DB    
		Statement    stmt   = null;  // Sql 
		ResultSet    rs     = null;  //
try {
			Class.forName(driver);   // Driver  
			conn    =  DriverManager.getConnection(url,"scott","tiger");
			stmt    = conn.createStatement();      // stmt  
			rs      = stmt.executeQuery(sql);      // SQL 
			 // rs  Row 
			if (rs.next()) {
				do 
				{
				String dname = rs.getString("dname");  // rs.getString(1)  <-- dname
				String loc   = rs.getString("loc");    // rs.getString(2)  <-- loc
				System.out.println("부서명 :" + deptno);
				System.out.println("부서명 :" + dname);
				System.out.println("위치  :"  + loc);
				} while(rs.next());
			}
			else {
				System.out.println("자료가 없습니다" );
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if( rs != null)    rs.close();
			if( stmt != null)  stmt.close();
			if( conn != null)  conn.close();
		}
		sc.close();
		}

	}

