package ch02_ex01;

public class GarbageValueEx {
	// 메모리를 잘못 잡으면 심각한 오류를 낸다
	public static void main(String[] args) {
		byte var1 = 125; 
		// 1 byte
		int  var2 = 125;
		// 4 byte
		//	1번 초기값 3번 비교 2번 증분값  
		for(int i=0; i<5; i++) {
			var1++; // var1 = var1 + 1;
			var2++;
			System.out.println("var1:" + var1 +"\t"+"var2:"+ var2);
		}
	}

}
