package ch07_ex03;
//hw03
public class Calculator{
	Calculator(){
	}
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result =  (double) x / (double) y;
		return result;
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}

//전원을 켭니다.
//result1: 11
//result2: 2.5
//전원을 끕니다