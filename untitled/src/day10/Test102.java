package day10;

class Super {	// x
	int x = 10; 
}
class Sub extends Super { // x, y
	int y = 20; 
}

public class Test102 {
	public static void main(String[] args) {

		Sub s = new Sub(); 
		System.out.println(s.x);
		System.out.println(s.y);
		System.out.println(s.toString()); // Object로부터 상속받은 메서드
		System.out.println(s);
		
		Super ss = new Super();
		
		
		
	}
}
