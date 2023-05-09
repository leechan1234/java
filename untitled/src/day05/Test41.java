package day05;

import java.util.Scanner;

public class Test41 {
	public static void main(String[] args) {

		// 배열 선언 
		int [] score; 	
		// 배열 생성 : 방 5개짜리 만들겠다
		score = new int[5]; 
		
		int[] num = new int[3]; // 배열 선언하면서 방 3개짜리 만듬 
		
		// 배열 사용
		// 값 저장 
		num[0] = 10; 
		num[1] = 20; 
		num[2] = 30; 
		
		// 출력해서 확인 
		System.out.println(num);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(++num[2]);
		
		// 안되는 경우 
		//int a = num;
		int a = num[0];
		
		int num0, num1, num2; 
		num0 = 10; 
		num1 = 20; 
		num2 = 30; 
		
		System.out.println(num.length);
		
		
	
		
		
		
		
		
	}
}
