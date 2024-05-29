package ch07_ex01;
// hw2
class OverLoad{
	void print(){
		System.out.println("매개변수 없다");
	}
	void print(int a){
		System.out.println("매개변수 1개 Int =" + a );
		
	}
	void print(String b){
		System.out.println("매개변수 1개 str" + b);
		
	}
	void print(String c, int d){
		System.out.println("매개변수 2개 str [" + c + "], int =" + d);
		
	}
	
}
public class OverLoadingEx {

	public static void main(String[] args) {
		OverLoad o1 = new OverLoad();
		o1.print();
		o1.print(12);
		o1.print("대박");
		o1.print("금요일",16);
	}

}
