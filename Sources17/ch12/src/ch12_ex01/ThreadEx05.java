package ch12_ex01;

import javax.swing.JOptionPane;
// 거의 안 쓰는 메소드
public class ThreadEx05 {

	public static void main(String[] args) throws InterruptedException{
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		String name = JOptionPane.showInputDialog("너 이름이 뭐니?");
		System.out.println("당신의 이름은 " + name + "입니다.");

	}

}
