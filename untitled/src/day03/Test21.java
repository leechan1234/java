package day03;

import java.util.Scanner;

public class Test21 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 >> ");		
		int num = Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 1: 
			System.out.println("1 입력");
			break;
		case 2:
			System.out.println("2 입력");
			break;
		case 3:
			System.out.println("3 입력");
			break;
		default:
			System.out.println("1, 2, 3 이 아닌 숫자 입력");
			//break;
		}
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
