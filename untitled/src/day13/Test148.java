package day13;
// 나만의 예외 클래스 만들기 
class MyException extends Exception {
	public MyException() { }
	public MyException(String msg) {
		super(msg); // Exception의 메세지 매개변수 있는 생성자 실행시킴
	}
}

public class Test148 {
	
	static void method1() throws Exception {
		try {
			method2(); 
		}catch(Exception e) {
			System.out.println("method1에서 예외 처리 후 던지기");
			throw e;
		}
	}
	
	static void method2() throws Exception {
		throw new Exception("method2 에서 예외 발생"); 
	}
	
	public static void main(String[] args) {
		try {
			method1(); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
