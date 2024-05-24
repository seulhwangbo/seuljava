package study01;

public class EqualityEx {
// if * == * != * true or false 확인
	public static void main(String[] args) {
		String str1 = "반갑습니다 대단히 고맙습니다";
		String str2 = "안녕하세요";
		
		int str1Length = str1.length();
		int str2Length = str2.length();
		
		if(str1Length == str2Length) {
			System.out.println("둘이 길이가 같아용");
			System.out.println("1번 글씨는 " +str1);
		} else {
			System.out.println("2번 글씨는 " +str2);
		}
		
		if((str1Length != str2Length) == false) {
			System.out.println("1번 글씨는 " +str1 + "이구요" + "2번 글씨는" + str2 +"입니다.");
		}else {
			System.out.println("바부입니다.");
		}

	}

}
