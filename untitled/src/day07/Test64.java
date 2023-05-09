package day07;

class TvTest {
	
	//int y = 20; 
	//static int x = y; 
	
	static int x = 100; 
	int y = x; 
	
}

public class Test64 {
	
	static int a = 123; 
	int b = 50;
	
	public static void main(String[] args) {

		System.out.println(TvTest.x);
		
		TvTest tv = new TvTest(); 
		System.out.println(tv.y);
		
		System.out.println(Test64.a);
		
		Test64 t = new Test64(); 
		System.out.println(t.b);
		
		// 1회용으로 객체 생성해서 사용. 단발성
		System.out.println(new Test64().b);
		
		
		
		
		
		
		
		
	}
}
