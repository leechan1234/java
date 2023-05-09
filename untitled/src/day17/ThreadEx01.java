package day17;
// #1. 스레드 클래스 만들기 : Tread 상속받은 클래스 정의 
class TimerThread extends Thread {
	
	int n = 0;
	// #2. run() 오버라이딩 (필수!) : 스레드가 할일 정의 
	@Override
	public void run() {
		while(true) {
			System.out.println(++n);
			try {
				sleep(1000); // 1000 밀리초 == 1초 Tread로 부터 상속받아 메서드이름만 불러 사용가능 
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}//run
	
}


public class ThreadEx01 {
	public static void main(String[] args) { // main 스레드가 실행 

		// #3. 스레드 객체 생성 
		TimerThread th = new TimerThread(); 
		// #4. 스레드 시작하게 등록 
		th.start();
		
		
		
	}
}
