package day09;

public class Test81 {

	static void add() {}
	static void add(int x) {}
	//static void add(int a) {}	
	static void add(long a) {}
	static void add(long a, int b) {}
	static void add(int a, long b) {}
	
	public static void main(String[] args) {

		add(); 
		add(100L);
		add(100, 200L);
		
		
		
		
		
		
		
		
	}
}
