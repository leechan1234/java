package day04;

public class Test35 {
	public static void main(String[] args) {

		// 반복문 사용시 주의점 
		for(int i = 0; i < 10; i++) { // 선언된 영역에서만 사용되는 변수 
			//System.out.println(i);
		}
		//System.out.println(i);
		
		int i = 0; 
		for( ; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println(i);
		
		for( ; ; ) {
			
		}
		
		
		
//		for(int a = 0; a < 3; a--) {
//			System.out.println("hello!!");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
