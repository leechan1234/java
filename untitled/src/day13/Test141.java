package day13;

interface MyInter {
	void func(); 
}

public class Test141 {
	
	static void hahaha(MyInter inter) {
		inter.func();
	}
	
	public static void main(String[] args) {
		
		// #3. hahaha 메서드를 사용해야된다. 
		//	  매개변수의 값으로 인터페이스 구현해 객체 생성하여 던지기
		hahaha(new MyInter() {
			@Override
			public void func() {
				System.out.println("MyInter의 func 오버라이딩함");
			}
		}); 
		

		// #1.
		// 인터페이스 구현해서 객체 생성하고 func() 실행 
		new MyInter() {
			@Override
			public void func() {
				System.out.println("MyInter의 func 오버라이딩함");
			}
		}.func();
		
		// #2. 
		// 인터페이스 구현해서 객체 생성해 부모변수에 넣어주고 
		MyInter i = new MyInter() {
			@Override
			public void func() {
				System.out.println("MyInter의 func 오버라이딩함");
			}
		};
		// func() 실행 
		i.func();
		
		
	}
}
