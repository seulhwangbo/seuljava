package ch09_ex01;

class Point3D{
	int x,y,z;
	
	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// 필요에 의해서 이런 식으로 .equals를 다시 코딩해서 사용할 수도 있다.
	public boolean equals(Point3D pd) {
		boolean result = false;
		if( x == pd.x && y == pd.y) result = true;
		return result;
	}
	
	@Override
	public String toString() {
		// return super.toString();
		String showStr = "[x = " + x + ", y =" + y + ", z = " + z + "]";
		
		return showStr;
	}
}

public class Point3DEx {

	public static void main(String[] args) {
		Point3D pd1 = new Point3D(1,2,3);
		Point3D pd2 = new Point3D(1,2,4);
		Point3D pd3 = new Point3D(1,2,5);
		
		if(pd1.equals(pd2)) System.out.println("같다");
		else			    System.out.println("다르다");
		
		if(pd1 == pd2) 	    System.out.println("같다");
		else			    System.out.println("다르다");

		// override 하지 않으면 해시코드롤 나오기 때문에 override가 필요하다.
		System.out.println(pd1);
		System.out.println(pd3);
	}

}
