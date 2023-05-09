package day13;

public class Test144 {
	public static void main(String[] args) {

		int number = 100; 
		int result = 0; 
		
		
		for(int i = 0; i < 10; i++) {
			
			try {
				result = number / (int)(Math.random() * 10);
				System.out.println(result);
			}catch(NullPointerException e) {
				System.out.println("NullPointer 발생");
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.out.println(e);
			}catch(Exception e) {
				System.out.println("그 외 다른 예외 발생시...처리");
			}
			
		}
		
		/*
		try {
			for(int i = 0; i < 10; i++) {
				result = number / (int)(Math.random() * 10);
				System.out.println(result);
			}
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}*/
		
		
	}
}
