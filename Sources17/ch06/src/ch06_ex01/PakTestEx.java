package ch06_ex01;

import ch06_ex09.PakTest01;

public class PakTestEx {

	public static void main(String[] args) {
		PakTest01 pt = new PakTest01();
		pt.a = 10;
		pt.b = 27;
		// a와 b가 public이기 때문에 접근이 가능하다.
		pt.print();

	}

}
