package ch03_ex02;

public class ex0201 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) +(y--);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

}
