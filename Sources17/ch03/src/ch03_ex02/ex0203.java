package ch03_ex02;
//과제01
public class ex0203 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent =(pencils/students);
		// 남은 연필 수
		int pencilsLeft = (pencils%students);
		
		System.out.println("학생 한 명이 가지는 연필의 수는 " + pencilsPerStudent+"개 입니다.");
		//System.out.printf("학생 한 명이 가지는 연필의 수는 %d개 입니다\n",pencilsPerStudent);
		System.out.println("남은 연필의 수는 "+ pencilsLeft+"개 입니다.");
		//System.out.printf("남은 연필의 수는 %d개 입니다\n",pencilsLeft);
	}

}
