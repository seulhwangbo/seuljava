package ch14_Test;

public class Test01 {

	public static void main(String[] args) {
	    int a=5, b=5, aa, bb;
        aa = ++a; //6
        bb = b++; //bb= 5, b = 6
        System.out.println("aa="+aa+" bb="+bb);
        System.out.println("a="+a+" b="+b);
       
        int i = 10;
        System.out.println(i++); // 선 print 후 ++ 실행 10 출력 후 i = 11
        System.out.println(++i); // 선 ++ 후 print 실행    출력 후 i = 12
        System.out.println(i);
	}

}
