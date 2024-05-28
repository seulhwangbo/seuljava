package ch06_ex01;

class Account {
	String account; // 계좌번호
	String name; // 계좌주
	int balance; // 잔액

	public Account(String acc, String n, int bal) {
		account = acc;
		name = n;
		balance = bal;
	}
	// 클라스의 이름과 똑같은 메소드가 생성자이다.
	// 리턴값이 없을 때 void를 사용하지만 생성자에는 붙일 수 없다.
	// 예금
	void deposit(int amt) {
		balance += amt;
		System.out.println(name + "이 " + amt + " 예금...");
	}

	// 인출
	void withdraw(int amt) {
		if (balance < amt) {
			System.out.println(name + "이 " + amt + " 출금시도.");
			System.out.println(name + " 잔고 부족");
		} else {
			balance -= amt;
			System.out.println(name + "이 "+ amt + " 출금...");
		}
	}

	void preBalance() {
		System.out.println(name + " 현재 잔액은 " + balance);
	}
	// 계좌 잔액 조회
}

public class AccountEx {

	public static void main(String[] args) {
		// Account Instance ac1, ac2생성
		// ac1->신한1,이성계,1500
		// ac2->국민2,강감찬,7000
		Account ac1 = new Account("신한1", "이성계", 1500);
		Account ac2 = new Account("국민1", "강감찬", 7000);

		ac1.deposit (3000);
		ac1.withdraw(5000);
		ac1.preBalance();
		
		System.out.println();

		ac2.deposit (5000);
		ac2.withdraw(7000);
		ac2.preBalance();

	}

}
