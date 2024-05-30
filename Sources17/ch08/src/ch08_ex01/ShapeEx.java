package ch08_ex01;

public class ShapeEx {

	public static void main(String[] args) {
		// 왜 instance 가 안 되는가?
		// shape 이 abstract class 이고 구현이 안 됐기 때문에
		Shape [] sh = new Shape[3];
		sh[0] = new Triangle();
		sh[1] = new Rectangle();
		sh[2] = new Circle();
		
		for (Shape s : sh) {
			s.print();
			s.draw();
			if (s instanceof Rectangle) {
				((Rectangle)s).display();
			}
		}
	}

}

//------선과 점으로 구성됐다.-------
//삼..각형을 그린다
//------선과 점으로 구성됐다.-------
//사각형을 그린다
//Rectangle 사각형 Display을 그린다
//------선과 점으로 구성됐다.-------
//원...을 그린다