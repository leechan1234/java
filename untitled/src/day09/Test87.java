package day09;

class Circle2 {
	int radius; 
	
	// 매개변수 있는 생성자가 작성되어 기본생성자 자동생성 안됨.
	Circle2(int radius) {
		this.radius = radius; 
	}
	// 매개변수 없는 버전으로 객체 생성하고 싶으면 
	// 개발자가 직접 추가해줘야함. 
	Circle2() {}
	
	void setRadius(int radius) {
		this.radius = radius; 
	}
	double getArea() {
		return this.radius * this.radius * 3.14; 
	}
}

public class Test87 {
	public static void main(String[] args) {

		Circle2 c = new Circle2(); // 기본생성자로는 생성 불가 
		Circle2 c1 = new Circle2(5);
		System.out.println(c.getArea());
		System.out.println(c1.getArea());
		
		
		
	}
}



