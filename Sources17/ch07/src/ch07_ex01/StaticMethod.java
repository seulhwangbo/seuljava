package ch07_ex01;

class StaticM {
	int num = 0;

	void display() {
		num++;
		System.out.println("메롱 num->" + num);
	}

	static void print(String str) {
		// num++;
		System.out.println("대박 수요일 " + str);
//		System.out.println("메롱 num->" + num );
//		static 메소드에는 인스턴스 메모리가 들어가면 이상해진다.
// 		static Method는 static 변수만 사용 가능하다.
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		StaticM.print("인스턴스 전");
//		공유 메모리기 때문에 인스턴스 전에도 출력이 가능해진다.
//	  = static 선언시 객체 생성이 없어도 호출이 가능하다.
		StaticM sm = new StaticM();

		sm.display();
		sm.display();
		sm.display();
		sm.print("인스턴스 후");
	}

}
