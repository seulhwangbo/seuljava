package ch06_ex01;
//  설계도 = 멤버변수, 필드
public class Car {
	// class car가 객체이다
	String  color;
	int 	speed;
	//행위 요소 = 메소드 : 행위를 하기 위한 요소들 
	//Method ( 첫자는 영문자 또는 $로 시작하고 두번째부터 숫자 사용 가능하다)
	void speedUp() {
		speed++;
		System.out.println(speed + "속도를 올렸다.");
	}
	void print() {
		System.out.println("색깔: " + color);
		System.out.println("속도: " + speed);
	}
}
