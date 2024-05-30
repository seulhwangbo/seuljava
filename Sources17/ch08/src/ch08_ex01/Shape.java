package ch08_ex01;
// hw01
public abstract class Shape {
	int a = 3;
	abstract void draw();
	void print() {
		System.out.println("-------------------선과 점으로 구성됐다.-------------------");
	}
}

class Rectangle extends  Shape  {
	public void draw() {
		System.out.println("사각형을 그린다");
	}
	public void display() {
		System.out.println("Rectangle 사각형 Display를 그린다.");
	}
	
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("삼..각형을 그린다");
	}
	
}
class Circle extends Shape {
	public void draw() {
		System.out.println("원... 을 그린다");
	}
	
}