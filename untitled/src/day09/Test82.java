package day09;

public class Test82 {
	
	// 클래스 변수 
	static int x = 10; 
	int y = 20;
	
	// 클래스 초기화 블럭 
	static {
		System.out.println("클래스 초기화 블럭");
		x = 200; 
		//y = 10; 이 블럭이 실행될 시점에 인스턴스는 안만들어 졌다(존재하지 않음)
	}
	
	// 인스턴스 초기화 블럭
	{
		System.out.println("인스턴스 초기화 블럭");
		y = 200;
	}
	
	// 생성자 
	Test82(){
		System.out.println("생성자 실행");
	}
	
	
	public static void main(String[] args) {

		Test82 test = new Test82(); 
		
		
		
		
		
		
	}
	
}
