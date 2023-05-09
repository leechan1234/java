package day04;

import java.util.Scanner;

public class Test37 {
	public static void main(String[] args) {

		// * for *
		/* 문제1. 10 ~ 30까지 출력해보세요.
		for(int i = 10; i <= 30; i++) {
			System.out.println(i);
		}
		// 문제2. 0 ~ 100까지 10단위 출력해보세요. 
		for(int i = 0; i <= 100; i+=10) {
			System.out.println(i);
		}
		// 문제3. 1 ~ 20까지 짝수만 출력 
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		// 문제4. 1 ~ 100까지 홀수의 합을 출력
		int sum = 0; 
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				sum += i; 
			}
		}
		System.out.println("sum : " + sum);
		*/
		// 문제5. 정수 1개를 입력받고 1 부터 입력받은 수까지의 합을 출력해보세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력>>");
		int num = Integer.parseInt(sc.nextLine());
		int sum = 0; // 합 저장해놓을 변수 미리 선언 
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
	}
}
