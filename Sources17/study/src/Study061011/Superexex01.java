package Study061011;
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
public class Superexex01 {

	 public static void main(String[] args) {
	        Super sup = new Sub();   
	        System.out.print(sup.index + " ");   
	        sup.printVal(); 

	   }
}
//부모 rv = new 자식(); up casting OK
//부모 method()와 자식 method() 이름을 같을 때는  자식 메소드 실행
//부모의 멤버변수와 자식의 멤버변수가 이름이  같을 때는 부모 멤버변수 실행
//
//자식 rv2 = new 부모(); down casting X
//자식 rv3 = (자식)부모객체;  down casting
//강제 형변환 하면 
//1) 문법적 에러가 없음 
//2) 에러가 있을 때도 없을 때도 있다
//
//동물1 = new 사람();
//동물2 = new 사자();
//
//사람 s1 = (사람)동물1
//사람 s2 = (사람)동물2
//
//동물1 instanceof 사람  true
//동물2 instanceof 사람  false

