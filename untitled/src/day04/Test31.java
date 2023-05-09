package day04;

import java.util.Scanner;

public class Test31 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		// while 무한반복 
		// 0 을 입력할때까지 계속 정수를 입력받아 출력하는 코드를 작성 
		while(true) {
			System.out.print("정수 입력 >> ");
			int num = Integer.parseInt(sc.nextLine()); 
			System.out.println(num);
			if(num == 0) { // 종료 시점 
				break;
			}
		}
		
		System.out.println("프로그램 종료!");
		
		sc.close();
		
		
	}
}
