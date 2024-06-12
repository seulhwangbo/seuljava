package ch15_ex01;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc03 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 Oracle 사원코드?");   
		String empno = sc.nextLine();
		
		Connection        conn= null;
		CallableStatement cs  = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url 	  = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String sql  = "{? = call func_sal(?)}";
		// 앞에 있는 물음표가 첫번째 파라메터고 두번째 있는 물음표가 두번째 파라메터이다
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			cs 	 = conn.prepareCall(sql);
			cs.setString(2, empno);
			cs.registerOutParameter(1, java.sql.Types.DOUBLE);
			cs.executeQuery();
			Double sal = cs.getDouble(1);
			
			if ( sal > 0 ) {
				System.out.println("Oracle CallableStatement 수정 성공");
				System.out.println("변경 사번 : " + empno);
				System.out.println("변경 급여 : " + sal);
			}else {
				System.out.println("Oracle CallableStatement 수정 실패");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (cs 	 != null ) cs.close();
			if (conn != null ) conn.close();
		}

	}

}
