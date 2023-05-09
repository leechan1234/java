package day13;

public class Test147 {
	
	static void func() throws Exception { // 내 안에서 발생한 예외를 토스 
		Exception e = new Exception(); 
		throw e; 
	}
	
	public static void main(String[] args) {
		
		try {
			func();  // 메서드를 호출해 사용하는 쪽에서 try-catch로 예외처리
		}catch(Exception e) {
			
		}
		
	}
}
