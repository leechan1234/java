package day03;

import java.util.Scanner;

public class Test20 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/* 문제1. 정수 두개를 입력받고, 몫과 나머지를 출력하세요. 
		// 정수 두개 입력받기
		//		Scanner 필요 v 4개 외운거 작성 
		//		변수 2개 필요 -> int 형 num1, num2 만들어야지
		System.out.println("정수1 입력: "); // 콘솔에 메세지 띄워서 입력하라는 힌트 보여주기위해
		int num1 = Integer.parseInt(sc.nextLine()); 
		System.out.println("정수2 입력: "); // 콘솔에 메세지 띄워서 입력하라는 힌트 보여주기위해
		int num2 = Integer.parseInt(sc.nextLine()); 
		// 몫 출력
		System.out.println("몫 : " + (num1/num2));
		// 나머지 출력 
		System.out.println("나머지 : " + (num1%num2));
		
		// 문제2. 일수(day)를 입력받고, 몇개월 몇일인지 출력해보세요. 단, 1달은 30일로 고정 .
		System.out.println("일수 입력 : ");
		int days = Integer.parseInt(sc.nextLine());
		System.out.println((days/30) + "개월 " + (days%30) + "일");
		
		// 문제3. 점수 3개를 입력받고, 총합과 평균을 출력해보세요. 
		System.out.println("점수1 입력 : ");
		int sco1 = Integer.parseInt(sc.nextLine());
		System.out.println("점수2 입력 : ");
		int sco2 = Integer.parseInt(sc.nextLine());
		System.out.println("점수3 입력 : ");
		int sco3 = Integer.parseInt(sc.nextLine());
		
		int total = sco1 + sco2 + sco3;
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + (total / 3.0));
		
		// 문제4. 숫자하나를 입력받고, "음수"인지 "양수"인지 출력하세요. 
		System.out.println("숫자 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		if(num > 0) {
			System.out.println("양수");
		}else if(num < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0 입니다.");
		}
		
		// 문제5. 1 ~ 99 사이의 숫자를 입력받고 "짝수"인지 "홀수"인지 출력해보세요. 
		System.out.println("1 ~ 99 사이의 숫자를 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}*/
		
		
		/* 문제6. 정수 3개를 입력받고, 3개의 숫자중 중간 크기의 수를 출력하세요.(평균값x) 
		System.out.println("정수 1 입력 : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("정수 2 입력 : ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("정수 3 입력 : ");
		int c = Integer.parseInt(sc.nextLine());
		if(a < b) {
			if(c < a) {
				System.out.println("a : " + a);
			}else { // c > a
				if(b < c) {
					System.out.println("b : " + b);
				}else { // b > c
					System.out.println("c : " + c);
				}
			}
		}else { // a > b
			if(b > c) {
				System.out.println("b : " + b);
			}else { // b < c
				if(c > a) {
					System.out.println("a : " + a);
				}else {
					System.out.println("c : " + c);
				}
			}
		}*/
		
		/* 문제7. 2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리 두점으로 표현한다. 
		 			(100,100)과 (200,200) 의 두점으로 이루어진 사각형이 있을때, 
		 			정수 x, y 값을 입력받고, 
		 			점(x,y)가 이 직사각형 안에 있는지 판단하는 프로그램을 작성해보세요. 
		*/
		System.out.print("x : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("y : ");
		int y = Integer.parseInt(sc.nextLine());
		if(x >= 100 && x <= 200 && y >= 100 && y <= 200) {
			System.out.println("사각형 안에 포함된다.");
		}else {
			System.out.println("사각형 안에 포함되지 않는다.");
		}
		
		
		
		sc.close();
		
		
	}
}
