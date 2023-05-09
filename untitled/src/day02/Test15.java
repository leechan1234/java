package day02;

import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		//산술연산자 문제 
		/*문제1. 정수 2개를 입력받고, 사칙연산의 결과를 출력해보세요. 
		System.out.println("정수1 입력: ");
		//String num1str = sc.nextLine(); 
		int num1 = Integer.parseInt(sc.nextLine()); // 형변환
		System.out.println(num1);
		
		System.out.println("정수2 입력: ");
		//String num2str = sc.nextLine(); 
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println(num2);
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		*/
		
		/*문제2. 초단위로 정수를 입력받고, ?분?초 형태로 출력해보세요. 
		System.out.println("초단위 입력: ");
		int input = Integer.parseInt(sc.nextLine());
		//System.out.println(input);
		
		System.out.println((input/60) + "분" + (input%60) + "초");
		
		//문제3. 초단위로 정수를 입력받고, ?시간?분?초 형태로 출력해보세요. 
		System.out.println("초단위 입력: ");
		int input = Integer.parseInt(sc.nextLine());
		
		int hour = input / 3600; 
		int min = (input % 3600) / 60;
		int sec = input % 60; 
		System.out.println(hour + "시간" + min + "분" + sec + "초");
		*/
		
		/*문제4. 최소 화폐매수 구하기 : 금액을 입력하면 최소한의 화폐매수를 구해주는 프로그램 
		         콘솔예) 
		         금액입력 : 67800    (<-사용자가 금액입력) 
		         5만원 : 1장
		         1만원 : 1장
		         5천원 : 1장
		         1천원 : 2장
				 5백원 : 1개 
				 1백원 : 3개 
		
		System.out.print("금액입력 :");
		int money = Integer.parseInt(sc.nextLine());
		System.out.println("5만원 : " + (money/50000) + "장");
		System.out.println("1만원 : " + ((money%50000)/10000) + "장");
		System.out.println("5천원 : " + ((money%10000)/5000) + "장");
		System.out.println("1천원 : " + ((money%5000)/1000) + "장");
		System.out.println("5백원 : " + ((money%1000)/500) + "개");
		System.out.println("1백원 : " + ((money%500)/100) + "개");
		*/
		
		sc.close();
		
		
		// 증감연산자 문제 
		// 문제5. 결과를 먼저 주석으로 작성하고, 실행해서 맞는지 확인해봅시다. 
		int i = 5, j = 5; 
		System.out.println(i++); // 5출력 -> 6
		System.out.println(++j); // 6
		System.out.println("i = " + i + ", j = " + j); // 6 6
		
		// 문제6. 결과를 먼저 주석으로 작성, 실행해서 확인 
		int k = 10; 
		System.out.println(k++); // 10	11
		System.out.println(++k); // 12  12
		++k; // 13
		System.out.println(++k); // 14	14
		System.out.println(k++); // 14	15
		System.out.println(k);   // 15
		
		System.out.println("----------------------");
		// 문제7. 결과를 먼저 주석으로 작성, 실해해서 확인 
		int a = 10; 
		int b = 10; 
		int r = ++a + ++b; // r = 22
		System.out.println(r);
		r = ++a + b++; 		// r = 23
		System.out.println(r);
		r = ++a + a; 		// 26
		System.out.println(r);
		r = ++a + a++; 		// 28
		System.out.println(r);
		r = ++a + ++a; 		// 33
		System.out.println(r);
		
	}
}
