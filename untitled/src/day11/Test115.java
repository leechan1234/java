package day11;
/*
final class Super {
	
}
class Sub extends Super { // 상속 불가능 
	
}

class Super {
	final void func() {}
}
class Sub extends Super { 
	@Override
	void func() {} // 오버라이딩 불가능 
}*/

public class Test115 {
	
	final static int x = 10;  // 클래스 상수
	final int y = 20;		  // 인스턴스 상수  
	
	public static void main(String[] args) {

		final int z = 30; 	// 지역 상수 
		// 상수는 값 수정이 안된다. 
		//x = 100; 
		Test115 t = new Test115(); 
		//t.y = 200; 
		//z = 300; 
		
	}
}

class Super {
	/* 명시적 초기화 한 경우 생성자에서 값 대입 불가 
	final int x = 10; 
	Super(){}
	Super(int x) {
		this.x = x; 
	}
	*/
	// 상수의 초기값 세팅을 객체 생성시 지정하고 싶으면 
	// 상수의 변수 선언만하고 초기화X 
	// 생성자에서 초기화 해주기
	final int x; 
	Super(){
		x = 10; 
	}
	Super(int x){
		this.x = x; 
		
	}
	
	
}












