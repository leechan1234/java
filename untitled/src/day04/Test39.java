package day04;

import java.util.Scanner;

public class Test39 {
	public static void main(String[] args) {

		/*
		
		*
		**
		***
		****
		*****
		
		*/
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		
		// 별찍기 제어문 18 문제 풀기(이미지 참고) 
		
		// * while문 추가 문제 * 
		// 문제1. -1이 입력될때까지 정수를 계속 입력받아 
		//		총합과 평균을 출력해보세요. 
		// 입력받기 무한반복, 종료시점은 -1입력할때 
		// 총합 -> 누적해 가지고 있을 변수 1개 필요 
		/* */
		
		int total = 0; // 합계 변수 0으로 초기화 
		int count = 0; // 반복 횟수를 카운트할 변수 
		while(true) {
			System.out.print("정수 입력>>");
			int num = Integer.parseInt(sc.nextLine());
			if(num == -1) {  // 종료시점 
				break; 
			} 
			
			// 종료에 걸리지 않으면 아래 코드 실행 
			total += num; // 입력받은 수 total에 누적시키기 
			count++; // 카운트 1 늘리기
		}
		System.out.println("총 합 : " + total);
		System.out.println("평균 : " + (double)total / count);
		
		// 문제2. 문자열을 계속 입력받아 출력하되, 
		//		exit를 입력받으면 종료되는 프로그램을 작성하세요. 
		//		팁 : 문자열끼리의 비교는 == 로 불가능! 
		//			String의 기능중 .equals()메서드를 이용해야함.
		//		String str = "abc";
		//		System.out.println(str.equals("abc")); --> true 출력
		//		System.out.println(str.equals("abb")); --> false 출력
		while(true) {
			System.out.print("문자열 입력>>");
			String str = sc.nextLine(); 
			if(str.equals("exit")) {
				break;
			}
			System.out.println(str);
		}
		
		
		sc.close();
		
		
		
		
		
		
	}
}
