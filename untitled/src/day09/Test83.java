package day09;

public class Test83 {
	
	int a; 
	
	Test83(){
		System.out.println("생성자 실행!!");
		a = 100;
	}
	
	public static void main(String[] args) {

		Test83 t = new Test83(); 
		Test83 t1 = new Test83(); 
		Test83 t2 = new Test83(); 
		System.out.println(t.a);
		System.out.println(t1.a);
		System.out.println(t2.a);
		System.out.println("main 실행");
		
	}
}
