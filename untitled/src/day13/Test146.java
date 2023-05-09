package day13;

public class Test146 {
	public static void main(String[] args) {

		System.out.println("main 시작");
		
		try {
			// 예외를 강제로 개발자가 발생시킴
			// 예외발생시 원하는 메세지가 콘솔에 뜰 수 있게 
			// 메세지 지정도 가능함.
			throw new RuntimeException("우리가 만든 예외입니다."); 
		}catch(Exception e) {
			System.out.println("예외 발생");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("main 종료");
		
	}
}
