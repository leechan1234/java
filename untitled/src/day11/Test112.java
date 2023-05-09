package day11;

class A {
	public A() {
		System.out.println("생성자 A");
	}
}
class B extends A {
	public B() {
		System.out.println("생성자 B");
	}
}
class C extends B {
	public C() {
		System.out.println("생성자 C");
	}
}
public class Test112 {
	public static void main(String[] args) {

		C c = new C(); 
		
	}
}
