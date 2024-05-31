package ch08_ex01;
// hw01
public abstract class Shape {
	int a = 3;
//  선언을 할 수 있다는 사실을 보여준 객체이다
	abstract void draw();
	void print() {
		System.out.println("-------------------선과 점으로 구성됐다.-------------------");
	}
}

class Rectangle extends  Shape  {
		void draw() {
		System.out.println("사각형을 그린다");
	}
		// 확장해서 구현
		void display() {
		System.out.println("Rectangle 사각형 Display를 그린다.");
	}
	
}

class Triangle extends Shape {
		void draw() {
		System.out.println("삼..각형을 그린다");
	}
	
}
class Circle extends Shape {
		void draw() {
		System.out.println("원... 을 그린다");
	}
	
}