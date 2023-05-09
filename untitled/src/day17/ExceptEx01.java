package day17;

import java.util.Scanner;

public class ExceptEx01 {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int age = 0; 
		
		try {
			System.out.print("나이 입력 >> ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num >= 1 && num <= 120) {
				age = num;
			}else {
				// 예외 강제로 발생!!! 
				throw new Exception("나이 오기입");
			}
			System.out.println("당신의 나이는 " + age + "살 입니다.");
			
		}catch(Exception e) {
			System.out.println("나이를 잘 못 입력하셨습니다.");
			throw e;  // 처리할거 하고 나머지는 메서드 부른쪽에서 해결하게 다시 예외 던지기
			//e.printStackTrace();
		}
		
		/* if문으로 예외 처리 
		if(num >= 1 && num <= 120) {
			age = num; 
		}else {
			System.out.println("나이 잘못 입력");
		}*/
		
		
		sc.close();
		
		
	}
}
