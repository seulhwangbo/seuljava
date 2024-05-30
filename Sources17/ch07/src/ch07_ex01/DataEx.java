package ch07_ex01;

// Call By Value && Call By Reference --> *** 면접 단골
class Data {
	int kor;
	int eng;
	int math;
	// Call By Reference

	void addRef(Data d1, Data d2) {
		d1.kor = d2.eng;
		System.out.println("Method국어 점수 : " + d1.kor);
	}

//  return type  return Method parameter
	int addKor(int kor) {
		kor += 10;
		System.out.println("kor=>" + kor);
		return 0;
		// return 타입이 int 이다.
		// return kor를 반드시 돌려준다는 의미이다.
	}
}

public class DataEx {

	public static void main(String[] args) {
		// 확보공간의 주소를 가지고 있다
		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();
		int d3_kor = d3.addKor(10);
		//Call by value
		System.out.println("d3_kor->" + d3_kor);
		// int로 돌려준다 d3_kor
		d1.kor = 50;
		d1.math = 70;
		d2.eng = 80;
		// *** Instance를 넘겨주면 주소값을 넘겨주는 효과 : 포인터와 같은 개념
		// CallbyRef
		d3.addRef(d1, d2);
		System.out.println("Main 국어 점수: " + d1.kor);

	}

}
