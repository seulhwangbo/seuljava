package study0530;

public class ComputerExExam {

	public static void main(String[] args) {
	ComputerExam myNewCom = new ComputerExam();
	
	int [] values1 = {1,2,3,4,5};
	// 배열을 선언하는 동시에 값을 넣어주는 것
	
	int result1 = myNewCom.sum1(values1);
	System.out.println("result1: " + result1);
 
	int result2 = myNewCom.sum1(new int [] {1,2,3,4,5,6});
	System.out.println("result2: " + result2);
	
	int result31 = myNewCom.sum2(2,3);
	System.out.println(result31);
	int result34 = myNewCom.sum2(1,2,3,4,5,6,7,8);
	System.out.println("Result34" + result34);
	}

}
