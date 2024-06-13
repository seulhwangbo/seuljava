package ch14_Test;

class Super { 
    int index = 5; 
    public void printVal() {
        System.out.println("Super");
    } 
} 
class Sub extends Super {   
    int index = 2;   
    public void printVal() {   
        System.out.println("Sub"); 
    } 
} 
	public class Exam {   
		public static void main(String[ ] args) { 
			// 멤버변수는 아버지 것 메소드는 내 거
			Super sup = new Sub();   
			System.out.print(sup.index + " ");   
			sup.printVal(); 
			// 멤버변수와 메소드 모두 나의 것
			Sub sub = new Sub();   
			System.out.print(sub.index + " ");   
			sup.printVal(); 
			
    } 
  }
	
	// 상속에 관한 이야기 ** 중요 ** 
	// SUB를 아버지로 넣을 수 있다. 그때 sub의 Index는 아버지다. 메소드는 나를 따르고 인덱스는 아버지를 따른다
	// 두 개의 index 출력 결과를 통해서 어떤 멤버 변수를 참고하는지를 알아야 한다.