package study0530;

public interface Inter0101 {

		int AA = 3;
		void display();
		void print();
		
}

class D1 implements Inter0101{
	@Override
	public void display() {
		System.out.println("재정의했슈 ... AA ==> " + AA);
	
	}
	
	@Override
	public void print() {
		System.out.println("나도야 간다.");
	}
}
