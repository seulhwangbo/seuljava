package ch04_ex01;
//homework02
public class if03 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		
		if(score>=90) 		grade = "A";
		else if(score>=80)  grade = "B";
		else if(score>=70)  grade = "C";
		else				grade = "권총";
		
		System.out.println("당신 점수는"+score+"이고" + "학점은" + grade + "입니다." );
		
		
		
		/*
		 * if(score>=90) {
			//System.out.println("당신의 점수는"+ score + "이고 학점은 A입니다.");
			System.out.printf("당신의 점수는 %d 이고 학점은 A입니다", score);
		} else if(80<= score && score< 90) {
			//System.out.println("당신의 점수는" + score + "이고 학점은 B입니다.");
			System.out.printf("당신의 점수는 %d 이고 학점은 B입니다", score);
		} else if(70<= score && score<80) {
			//System.out.println("당신의 점수는" + score + "이고 학점은 C입니다.");
			System.out.printf("당신의 점수는 %d 이고 학점은 C입니다", score);
		} else {
			System.out.printf("당신의 점수는 %d 이고 학점은 F입니다", score);
		}
		 */
		
	
		
		// 2.score 가지고 if문 수행 
		//    1) 90 >= X          grade = "A";
		//    2) 80<= X <  90    grade = "B";
		//    3) 70<= X <  80    grade = "C";
		//    4) ELSE            grade = "F";
	}

}