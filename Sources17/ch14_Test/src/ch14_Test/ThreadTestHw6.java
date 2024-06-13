package ch14_Test;

class K1 extends Thread {
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.print("k1..");
		}
		System.out.println();
	}
}

// Runnable 구현
class K2 implements Runnable {
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.print("k2..");
		}
		System.out.println();
	}
}

	public class ThreadTestHw6 {   
		public static void main(String[ ] args) {   
			        
			 K1 k1 = new K1();
//			 K2 k2 = new K2();
//			 Thread a1 = new Thread(k2);
			 Thread k2 = new Thread(new K2());
			    	
			 k1.run();
			 k2.run();
		} 
	

}

