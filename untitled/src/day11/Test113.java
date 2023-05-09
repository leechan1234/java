package day11;

class A1{
	public A1() {
		System.out.println("생성자 A");
	}
	public A1(int x) {
		System.out.println("생성자 A-param : " + x);
	}
}
class B1 extends A1 {
	public B1() {
		System.out.println("생성자 B");
	}
	public B1(int x) {
		//super(x); // 부모의 매개변수 있는 생성자 호출 
		System.out.println("생성자 B-param : " + x);
	}
}

public class Test113 {
	public static void main(String[] args) {

		B1 b = new B1(10); 
		
		
	}
}
