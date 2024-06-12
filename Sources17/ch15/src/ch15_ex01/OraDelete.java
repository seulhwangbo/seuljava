package ch15_ex01;
// 키를 포함해서 전부 날리는 것을 delete고 row만 날리는 것은 update로 해야 한다.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraDelete {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 부서를 입력하세요 ");
		String deptno = sc.nextLine();
		Connection conn = null;
		Statement stmt = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "DELETE DEPT WHERE DEPTNO = "+ deptno;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			stmt = conn.createStatement();
			
			int result = stmt.executeUpdate(sql);
			if(result > 0) System.out.println("삭제 성공 ^^");
			else   		   System.out.println("삭제 실패");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			if (stmt != null)stmt.close();
			if (conn != null)conn.close();
		}
		sc.close();
		//hw 02
		//삭제할 부서 입력 코드를 이용하여 삭제
		//두 개의 hw의 힌트는 전부 sql 속에 있다.
	}

}
