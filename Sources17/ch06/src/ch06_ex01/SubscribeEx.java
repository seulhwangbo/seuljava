package ch06_ex01;

class Subscribe {
	public  String name;
	private String telnum;
	private int    age;

	Subscribe(String n, String t, int a) {
		name   = n;
		telnum = t;
		age	   = a;
	}

	Subscribe(String n) {
		name = n;
	}

	void ChgTelNum(String t) {
		telnum = t;
	}
	void ChgAge(int a) {
		if(age>0)		age = a;
		else			System.out.println("말이 되나요?");
	}
	// 카멜표기법 ** 
	void print() {
		System.out.printf("이름 : %s    전화번호 : %s  나이 : %d \n", name, telnum, age);
	}
}

public class SubscribeEx {

	public static void main(String[] args) {
		Subscribe s1 = new Subscribe("이성계", "010-2223-5567",45);
		Subscribe s2 = new Subscribe("김유신");
		s1.print();
		s2.print();
	//	s2.telnum = "02 - 344 - 7788";
		s2.ChgTelNum("02-344-7788");
		s2.ChgAge	(-33);
		s2.print();

	}

}
