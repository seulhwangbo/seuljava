package ch04_ex02;

public class SwitchStringEx {

	public static void main(String[] args) {
		String position = args[0];
		
		/*
		 조건 : 부장이면 => 700만원
		 조건 : 과장이면 => 500만원
		 조건 : 그외면  => 300만원
		 
	    */
		switch(position) {
		case "부장" : System.out.println("당신의 직급은" + position + " 월급은 700만원입니다.");
		case "과장" : System.out.println("당신의 직급은" + position + " 월급은 500만원입니다.");
		default    : System.out.println("당신의 직급은" + position + " 월급은 300만원입니다.");
		
				}

			}
	}

