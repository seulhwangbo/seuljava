package ch07_ex01;
//hw01
// --> 재귀함수 사용
class D1{
	int result = 0;
	void hi(int cnt){
		if(cnt>=0) {
			result *=cnt;
			System.out.println( "안녕, 나야!!  cnt-->" + cnt);
			hi(--cnt);
		} else return;
		
		
		
	}

public class HiEx {

	public static void main(String[] args) {
		D1 d = new D1();
		d.hi(6);
	}

}
}
