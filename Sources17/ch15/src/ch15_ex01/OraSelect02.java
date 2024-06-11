package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class OraSelect02 {

	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "Select * From emp";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		System.out.println("사원명단");
		System.out.println("사원코드\t 사원명\t 업무\t\t 급여\t 일자");

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				do {
					int empno = rs.getInt(1);
					String ename = rs.getString(2);
					String job = rs.getString(3);
					int sal = rs.getInt("sal");
					Date date = rs.getDate("hiredate");
					if (job.length()>7) System.out.printf("%d\t%s\t%s\t%d\t%TF\n",empno,ename,job,sal,date);
					else System.out.printf("%d\t%s\t%s\t\t%d\t%TF\n",empno,ename,job,sal,date);
				} while(rs.next());
			}
			else {
				System.out.println("data No");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if( rs != null ) rs.close();
			if( stmt != null ) stmt.close();
			if( conn != null ) conn.close();
		}
	}

}
