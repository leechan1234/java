package day04;

import java.util.Scanner;

public class Test38 {
	public static void main(String[] args) {

		/* 중첩반복 
		for(int i = 0; i <= 3; i++) {
			for(int j = 0; j <= 3; j++) {
				System.out.println(i + " " + j);
			}
		}*/
		
		// 문제1. 구구단 2단만 출력 
		// 2 * 1 = 2  
		/* 2 * 2 = 4 ....
		for(int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + (2*i));
		}
		
		// 문제2. 구구단수를 입력받아 해당 단만 출력 
		Scanner sc = new Scanner(System.in);
		System.out.print("단수 입력>>");
		int dan = Integer.parseInt(sc.nextLine());
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
		sc.close(); */
		
		// 문제3. 구구단 전체 출력 1단 ~ 9단까지 
		for(int i = 1; i <= 9; i++) {
			System.out.println("*** " + i + "단 ***");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		// 문제3-1. 격자무늬로 출력 
		/*
			*** 1단 *** 	*** 2단 ***		*** 3단 ***
			1 * 1 = 1		2 * 1 = 2		3 * 1 = 3
			1 * 2 = 2		2 * 2 = 4		3 * 2 = 6 
			...
			
			*** 4단 ***		*** 5단 ***		*** 6단 ***
			....
			
		 	*** 7단 ***		*** 8단 ***		*** 9단 ***	
		*/
		for(int i = 1; i <= 7; i+=3) {
			System.out.print("*** " + i + "단 ***\t");
			System.out.print("*** " + (i+1) + "단 ***\t");
			System.out.println("*** " + (i+2) + "단 ***");
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + (i*j) + "\t");
				System.out.print((i+1) + " * " + j + " = " + ((i+1)*j) + "\t");
				System.out.println((i+2) + " * " + j + " = " + ((i+2)*j));
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
