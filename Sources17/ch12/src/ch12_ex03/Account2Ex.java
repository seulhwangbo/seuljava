package ch12_ex03;
//로직을 한 번씩 다시 확인하기
//thread 생성, thread 화
class Account2User extends Thread {
	Account2 act;
	boolean flag;

	public Account2User(Account2 act, String name) {
		super(name);
		this.act = act;
	}

	public void run() {
		// 한 인스턴스 당 5번 돌리게 된다
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			// try문을 사용했기 때문에 어쨌거나 catch문을 사용해야 한다
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 만약 동기화가 없다면 같은 계정 내의 출금 문제가 생길 수 있다.
				synchronized (act) {
				if (flag) act.deposit((int) (Math.random() * 10000), getName());
				else	  act.withdraw((int) (Math.random() * 10000), getName());
				flag = !flag;
				// flag SWAP
				// try catch + sync~는 같이 사용하는 것이 보통 사용하는 방법이다
			}
		}
	}
}

public class Account2Ex {

	public static void main(String[] args) {
		// girl Group --> 뉴진스
		Account2 act1 = new Account2(10000); 
		// men Group --> bts
		Account2 act2 = new Account2(15000); 
		
		//주소로 넘어가기 때문에 같이 공유할 수 있다 act1
		//생성자에서 함께 움직이기 때문에
		//act1이라는 같은 인스턴스를 사용한다 
		//하나의 계좌를 가지고 3사람이 함께 사용하고 있다
		Account2User au1 = new Account2User(act1, "하니");
		Account2User au2 = new Account2User(act1, "민지");
		Account2User au3 = new Account2User(act1, "혜린");
		
		Account2User au4 = new Account2User(act2, "정국");
		Account2User au5 = new Account2User(act2, "뷔");
		Account2User au6 = new Account2User(act2, "지민");
		
		// 시작되는 순서는 랜덤으로 나오게 된다
		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
		au6.start();
	}

}
