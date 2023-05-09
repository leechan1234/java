package day17;

// Runnable 인터페이스 구현하여 스레드  만들기 
class TimerRunnable implements Runnable {
	int n = 0; 
	@Override
	public void run() {
//		while(true) {
//			System.out.println(++n);
//			// Runnable로부터는 run() 추상메서드만 물려받음
//			// sleep을 사용하려면 Thread 클래스의 sleep() 사용해야하며
//			// static 메서드라 아래와같이 클래스명.메서드명() 으로 호출해 사용.
//			try {
//				Thread.sleep(1000);  
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getState());
		
	}// run
}

public class ThreadEx03 {
	public static void main(String[] args) {

		// Thread 클래스 생성자의 매개변수로 
		// Runnable 인터페이스 구현한 객체를 target으로 주고 생성 
		Thread th = new Thread(new TimerRunnable()); 
		th.start();
		
//		System.out.println(Thread.currentThread().getId());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getPriority());
//		System.out.println(Thread.currentThread().getState());
		
		
		
	}
}
