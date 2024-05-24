package study0523;

public class DenyEx {

	public static void main(String[] args) {
		boolean play = true;
		
		if(play) {
			System.out.println("맞아요!");
		}
		
		if(!play) {
			System.out.println("틀려요!");
		}
		
		if((!play)!=true) {
			System.out.println("맞아요");
		}
	}

}
