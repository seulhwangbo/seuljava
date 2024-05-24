package study0523;

public class Op2exam {
	public static void main(String[] args) {
	int n1 = 10;
	int n2 = 5;
	boolean result;
	
	result = n1> n2;
	System.out.printf("%d %c %d = %b\n", n1, '>',n2, result);
	result = n1<n2;
	System.out.printf("%d %c %d = %b\n", n1, '<',n2, result);
	result = n1>=n2;
	System.out.printf("%d %s %d = %b\n", n1, ">=", n2, result);
	result = n1<=n2;
	System.out.printf("%d %s %d = %b\n", n1, "<=", n2, result);
	result = n1 == n2;
	System.out.printf("%d %s %d = %b\n", n1, "==", n2, result);
	result = n1 != n2;
	System.out.printf("%d %s %d = %b\n", n1, "!=", n2, result);
}
	/*
	 기준을 바꿔가면서 확인하는 방식이 필요하다. 밑에 나온 예제처럼 결과를 만들기 위해서 주어진 조건을 변경해서 확인하기
	 */
}

/*
 10 > 5 = true
10 < 5 = false
10 >= 5 = true
10 <= 5 = false
10 == 5 = false
10 != 5 = true
*/