package ch06_ex01;

// 주차 요금 Class
public class Car3 {
	String name;
	int inTime;		//입고시간
	int outTime;	//출고시간
	int Fee;		//주차요금
	final int AMTPERTIME = 3000; //시간당요금
	// 상수로 만들기: 대문자 : final + 대문자
	// 생성자(Constructor) 
	// = 클라스 이름과 똑같은 메소드
	
	// 기본 생성자 
	public Car3(){
		
		}
	public Car3(String n, int inTime, int out) {
		this.name   = n;
		this.inTime = inTime; 
		this.outTime= out;	 
	}
	// 멤버변수 초기화 및 메모리 갖기 -> 두 가지의 목적을 가지고 있다.
	// 주차 요금 자동화 프로그램
	void print() {
		int fee = (outTime - inTime) * AMTPERTIME;
		System.out.println(" 차 이름 : " +    name);
		System.out.println(" 입고시간 : " +  inTime);
		System.out.println(" 출고시간 : " + outTime);
		System.out.println(" 주차요금 : " + fee);
		System.out.println("------------------------");
	}
}
