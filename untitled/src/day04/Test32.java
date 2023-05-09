package day04;

import java.util.Scanner;

public class Test32 {
	public static void main(String[] args) {

		/* 문제1. 0 ~ 10까지 출력해보세요. 
		int i = 0; 
		while(i <= 10) {
			System.out.println(i);
			i++; 
		}
		
		// 문제2. 1 ~ 15까지 출력해보세요. 
		int i = 1; 
		while(i <= 15) {
			System.out.println(i);
			i++; 
		}
		// 문제3. 0 ~ 100까지 10단위로 출력해보세요. 0 10 20 30 ...
		int i = 0; 
		while(i <= 100) {
			System.out.println(i);
			i+=10; 
		}
		// 문제4. 1 ~ 20까지 홀수만 출력해보세요. 
		int i = 1; 
		while(i <= 20) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
			i++; 
		}
		
		// 문제5. 1 ~ 10까지의 총합을 출력해보세요. 
		int i = 1; 
		int total = 0; // 누적해서 더한값을 저장할 변수 미리 만들어놓기 
		while(i <= 10) {
			total += i; // total = total + i; 
			i++; // 증감식 
		}
		System.out.println(total);
		
		
		// 문제6. 1 ~ 50까지의 짝수의 합을 출력해보세요. 
		int i = 1; 
		int total = 0; 
		while(i <= 50) {
			if(i % 2 == 0) {
				total += i; 
			}
			i++; 
		}
		System.out.println(total);
		*/
		/*
		   문제7. 주문프로그램 
		   
		   *** 더조은 카페 ***
		   1. 아메리카노 : 2500원
		   2. 카페라떼 : 3000원
		   3. 카푸치노 : 3500원
		   4. 카라멜마끼아또 : 4000원
		   5. 샌드위치 : 6000원 
		   6. 종료 
		   
		    
		   2단계 : int money = 20000; 내돈에서 주문금액 차감, 돈이 부족하면 주문 못하게, 
		   			총액 출력시 잔액도 출력해주세요. 
		*/
		//1단계 : 메뉴 번호로 주문을 원하는만큼 받고, 종료를 선택하면 받은 주문들의 총금액을 출력하세요.
		
		// 메뉴 번호로 입력 -> Scanner 필요 -> 입력받는 변수 -> 판단 -> int로 받기 
		Scanner sc = new Scanner(System.in);
		// 총금액 출력 -> 주문 누를때마다 번호에 맞는 가격을 어딘가에 저장해놔야겠다. -> 종료시 출력 
				// -> 누적해서 가지고 있을 변수가 하나 필요 
		int money = 20000;
		int total = 0; 
		// 원하는 만큼 입력받기 -> 입력받기를 반복 -> 횟수는 모르겠다,정해지지않음 -> while(true) 
		while(true) {
			// 무한반복하는 영역 
			
			// 메뉴 출력 
			System.out.println("*** 더조은 카페 ***");
			System.out.println("1. 아메리카노 : 2500원");
			System.out.println("2. 카페라떼 : 3000원");
			System.out.println("3. 카푸치노 : 3500원");
			System.out.println("4. 카라멜마끼아또 : 4000원");
			System.out.println("5. 샌드위치 : 6000원");
			System.out.println("6. 종료");
			
			// 메뉴 번호 입력받기 
			System.out.print("메뉴번호 >> ");
			int num = Integer.parseInt(sc.nextLine()); // 메뉴 번호 입력
			
			// 메뉴 번호가 몇번인지 판단 -> 그에 맞는 처리 
			if(num == 1) {
				System.out.println("1번 아메리카노를 선택하셨습니다.");
				total += 2500; // total에 2500 누적해서 저장하기 
			}else if(num == 2) {
				total += 3000; 
			}else if(num == 3) {
				total += 3500; 
			}else if(num == 4) {
				total += 4000; 
			}else if(num == 5) {
				total += 6000; 
			}else if(num == 6) { // -> 종료 시점이 필요 -> 6번 눌렀을때 break;
				System.out.println("주문 종료");
				break; 
			}
		}
		System.out.println("주문하신 총 금액은 " + total + "원 입니다.");

		
		
		
		sc.close();
		
		
		
		
	}
}
