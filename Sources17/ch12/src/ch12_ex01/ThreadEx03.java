package ch12_ex01;

class Th1 extends Thread {
//	Th2(String str)
//	{super(str);}

	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print("대박" + i + "\t");
			// 이름을 주지 않았기 때문에 대박이라는 이름 대신 아래에 있는 th2는 Thread 자기가 만든다.
			if (i % 5 == 0)
				System.out.println();
			try {
				sleep(50);
			} catch (InterruptedException e) {

			}
		}
	}
}

class Th2 extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			//System.out.print("수요일" + i + "\t");
			System.out.print(getName() + i + "\t");
			try {
				sleep(50);
			} catch (InterruptedException e) {

			}

		}
	}
}

public class ThreadEx03 {

	public static void main(String[] args) {
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();
		t1.start();
		t2.start();

	}

}
