package ch08_ex06;

public class DaoEx {
	//						  선언
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		// 대입하는 것
		// 부모 객체에 자식 객체를 대입하는 것은 가능하다
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		// DataAccessObject odao1 = new OracleDao();
		// dbWork(odao1)
		// 15의 dbWork와 같은 말이다.
	}

}
