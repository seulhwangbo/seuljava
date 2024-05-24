package study0523;

public class SwAndIfEX {
	public static void main(String[] args) {
		// switch와 if문을 패싱을 통해서 값을 입력받고 그이후에 입력받은 값을 판단하는 식
	int a = (Integer.parseInt(args[0]));
	int b = (Integer.parseInt(args[1]));
	//Integer 사용하기
	
	if(a>0) {
		System.out.println("a는 양수입니다.");
	} else {
		System.out.println("a는 음수입니다.");	
	}
	//(괄호사용 잊지 않기)
	switch(b) {
	case 1 :
	System.out.println("hi");
	break;
	case 2 :
	System.out.println("bye");
	break;
	default:
	System.out.println("아무거토 업다");
		}
	}
}
