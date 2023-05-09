package day17;

class ThreadTest extends Thread {
	
	@Override
	public void run() {
//		for(int i = 0; i < 100; i++) {
//			System.out.println("aaaa");
//		}
		// 무한반복시 프로그램 완전 종료가 힘들어짐
		while(true) {
			System.out.println("aaa");
		}
	}
	
}

public class ThreadEx02 {
	public static void main(String[] args) {

		// Thread생성해 start! 
		ThreadTest test = new ThreadTest(); 
		ThreadTest test2 = new ThreadTest(); 
		test.start();
		test2.start();
		//test.run(); // 단순히 일반 메서드 호출하듯 요청 -> Main스레드만 일함 
		// run() 호출은 JVM이 호출 -> 멀티스레드로 동작 
		// 개발자는 start()로 호출해야함 
		
		
		for(int i = 0; i < 100; i++) {
			System.out.println("xxxx");
		}
		
		System.out.println("============== main 종료 =============");
		
	}
}
