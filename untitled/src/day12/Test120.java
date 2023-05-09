package day12;

class A {							// x, add()
	int x; 
	void add() { System.out.println("AAA"); }
}
class B extends A { 				// x, y, @add(), sub()
	int y; 
	@Override
	void add() { System.out.println("BBB"); }
	void sub() { System.out.println("subsub"); }
}
class C extends A{
	
}
public class Test120 {
	public static void main(String[] args) {
		
		A a = new B(); 
		B b = null; 
		
		// 확인하고싶은객체 instanceof 검사할클래스타입 --> true/false로 결과 돌려줌
		// B와 B의 조상들까지 true
		if(a instanceof B) { // a가 실제 가지고 있는 객체가 B의 객체가 맞으면 true
			System.out.println("a는 B의 객체다");
			b = (B)a; 
			b.add();
		}
		
		System.out.println("프로그램 종료");
		
		
		/*
		A a = null; 
		B b = new B(); 
		B b2 = null; 
		
		
		// 형변환 공식을 적어주는 이유는 변수의 타입이 달라서 
		a = (A)b;	// 다형성 upcasting
		b2 = (B)a;  // 다형성 downcasting
		
		// 실행이 되는것은 실제 생성된 객체가 B타입이라서 가능 
		b2.add(); 
		b2.sub();
		
		
		A a = new A();
		B b = null; 
		
		// 형변환 공식을 적어주는 이유는 변수 타입이 달라서 
		b = (B)a; // 컴파일은 되나 실행할때 에러
		// 실행할 때 에러가 나는 것은 실제 담고 있는 객체가 A이고 
		// 변수는 B타입으로 4가지 모두 사용해야되는데 
		// 실제로 메모리상에는 A꺼 두개만 있어서 문제가 생김! 
		b.add();
		// 자식 타입 변수에 부모 객체 담기 X!!!
		
		A a = null; 
		B b = new B();  
		
		a = (A)b; 		// b가 들고있는 자식 객체를 부모타입 변수 a에 대입 가능. 
		//    x, @add(), y, sub() 
		//	  A	   A@B   B   B
		*/
		
		
		/*
		// 기본 객체 생성 
		A a = new A();  // x, add(AAA)
		B b = new B();  // x, y, @add(BBB), sub() 
		//a.add();
		//b.add();
		
		// 다형성 : 부모(조상)타입의 변수에 자식 객체를 담을 수있다. 
		A aa = new B(); // x, @add(BBB), [ y, sub() ]
		//B bb = new A(); 불가능 
		aa.add();
		*/
		
		
		
		
		
	}
}
