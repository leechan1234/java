package day12;
// 오버라이딩으로 다형성 실현 
class Shape {
	Shape next; 
	void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	@Override
	void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	@Override
	void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Circle");
	}
}
public class Test124 {
	
	public static void main(String[] args) {
		Shape start, last, obj;  // 첫객체, 마지막객체, 임시변수
		
		start = new Line(); 
		last = start;
		
		obj = new Rect(); 
		last.next = obj; 
		last = obj; 
		
		obj = new Circle(); 
		last.next = obj;
		last = obj; 
		
		obj = new Rect(); 
		last.next = obj;
		last = obj;
		
		// 모든 도형 출력 
		Shape s = start; 
		while(s != null) {
			s.draw();
			s = s.next;
		}
		
		
		
	}
	
	/*
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		paint(new Line());
		paint(new Rect());
		paint(new Line());
		paint(new Circle());
	}*/
}
