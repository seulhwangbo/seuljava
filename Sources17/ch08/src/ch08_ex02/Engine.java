package ch08_ex02;

public class Engine {
	String type; // 알파, 베타
	int	   cc;   // 2000cc, 3000cc
	
	//생성자
	Engine(String type, int cc){
		this.type = type;
		this.cc   = cc;
	}
	//일반 method
	void print() {
		System.out.println("타입 : " + type);
		System.out.println("배기량: " + cc);
	}
	
}
