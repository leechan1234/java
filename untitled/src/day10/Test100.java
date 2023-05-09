package day10;

// default 클래스
class Sample {
	public int a; 
	private int b;
	int c;
	protected int d;
}

// public 클래스
public class Test100 {
	public static void main(String[] args) {

		Sample s = new Sample(); 
		s.a = 10; 
		//s.b = 20; 다른 클래스에서는 접근 불가능 
		//System.out.println(s.b);
		s.c = 30; 
		s.d = 40; 
		
	}
}
