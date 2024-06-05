package ch12_ex01;
class Th3 extends Thread{
	public Th3(String string) {
		// TODO Auto-generated constructor stub
	}

	public void start() {
		for (int i = 1; i<=20; i++) {
			System.out.println("대박"+i);
		try {
			sleep(10);
		}catch(InterruptedException e) {
			
		}
		}
	}
}

class Th4 extends Thread{
	public Th4(String string) {
		// TODO Auto-generated constructor stub
	
	}
	public void start() {
		for (int i = 1; i<=20; i++) {
			System.out.println("월요일" + i );
		try {
			sleep(20);
		}catch(InterruptedException e) {
			
		}
		}
	}
}

public class ThreadEx04_Hw02 {

	public static void main(String[] args) {
		Th3 t1 = new Th3("Th3....");
		Th4 t2 = new Th4("Th4....");
		t1.start();
		t2.start();
	}

}
