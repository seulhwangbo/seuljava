package ch10_ex02;
// 밤에 다시 정리해야 할 부분
public class Throw01 {

	public static void main(String[] args) {
		System.out.println("안녕");
		Exception e1 = new Exception("내가 Error 만들었다.");
		try {
			System.out.println("e1 1");
			throw e1;
		//	System.out.println("이것 throw가 있기 때문에 출력하지 않는다.");
		} catch (Exception e2) {
			System.out.println(e2.getMessage() + "kkk");
		}
		// 메세지를 뿌려준다
		System.out.println("프로그램 정상 종료 되었음.");
	}

}
