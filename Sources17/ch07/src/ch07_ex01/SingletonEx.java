package ch07_ex01;

class SingleTon{
	String str;
	private static SingleTon instance;
	// 외부에서 호출 못하게 private로 지정한다.
//  내가 나를 instance로 선언했다
	private SingleTon() {
//  나 이외에 나를 선언하는 자가 없는 생성자
	}
//  같은 클래스 내의 메소드는 private라고 할지라도 선언이 가능했다.
//  getInstance = 인스턴스를 생성하려면 나를 통해서 해라
//  return 이 singleTon
	public static SingleTon getInstance() {
		if (instance == null) instance = new SingleTon();
		return instance;
		// null 이여만 만들고 아니면 네가 쓰던 거 써라
	}
}
public class SingletonEx {

	public static void main(String[] args) {
		SingleTon st1 = SingleTon.getInstance();
		SingleTon st2 = SingleTon.getInstance();
		st1.str = "넌 누구";
		System.out.println(st2.str);
		if (st1 == st2 )System.out.println("같다");
		else System.out.println("다르다.");

	}

}
