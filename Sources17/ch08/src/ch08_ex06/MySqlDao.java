package ch08_ex06;
// 추상 Method이기 때문에 알아서 구현해준다.
// 클라스는 내가 선택하는 반면에
// 인터페이스는 알아서 해준다.
public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");	
	}

	@Override
	public void insert() {
		System.out.println("MySql DB에서 삽입");
	}

	@Override
	public void update() {
		System.out.println("MySql DB에서 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}

}
