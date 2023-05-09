package day09;

class Circle {
	int radius; 
	//Circle(){}
	
	void setRadius(int r) {
		radius = r; 
	}
	double getArea() {
		return radius * radius * 3.14; 
	}
}

public class Test86 {
	public static void main(String[] args) {

		Circle pizza = new Circle(); 
		pizza.setRadius(10);
		System.out.println(pizza.getArea());
		
		
	}
}
