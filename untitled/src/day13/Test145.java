package day13;

public class Test145 {
	public static void main(String[] args) {

		System.out.println(1);
		
		try {
			System.out.println(2);
			//System.out.println(0/0); // 예외 발생 
			System.out.println(3);
			//return;
		}catch(Exception e) {
			System.out.println(4);
		}finally {
			System.out.println(5);
		}
		System.out.println(6);
		
		
		
		
	}
}
