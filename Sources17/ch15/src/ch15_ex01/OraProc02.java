package ch15_ex01;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc02 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("정보가 궁금한 사람 사번 ");
		int empno = sc.nextInt();
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql ="{call emp_Info2(?,?,?)}";
		Connection conn = null;
		CallableStatement cs = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			cs = conn.prepareCall(sql);
			cs.setInt(1, empno);
			// 두 개는 파라메터를 꺼내는 것이다
			cs.registerOutParameter(2,java.sql.Types.VARCHAR);
			cs.registerOutParameter(3,java.sql.Types.INTEGER);
			cs.executeQuery();
			String ename = cs.getString(2);
			int sal = cs.getInt(3);
			System.out.println("사번 : " + empno);
			System.out.println("이름 : " + ename);
			System.out.println("급여 : " + sal);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if (cs 	 != null ) cs.close();
			if (conn != null ) conn.close();
		}
	}

}
