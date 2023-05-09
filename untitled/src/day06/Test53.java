package day06;

import java.util.Scanner;

public class Test53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// * 1차원,다차원 배열 * 
		// 문제1. 2차원 배열 arr을 아래와 같이 출력하는 프로그램을 작성하세요. 
		int [][] arr = { {1}, {1,2,3}, {1}, {1,2,3,4}, {1,2} };
		/*
			1
			1 2 3
			1
			1 2 3 4
			1 2
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		// 문제2. Scanner로 소문자 알파벳하나 입력받고, 아래와 같이 출력하는 프로그램을 작성. 
		/*
			* 문자열의 기능중 알파벳 하나만 char 타입으로 가져오는 기능 사용 *
			* .charAt(문자열인덱스번호); 
			String str = "hello"; // 각 문자열의 글자들도 0 부터 시작하는 인덱스번호가 자동으로 붙음 
			System.out.println(str.charAt(0)); --> 'h'출력  
			System.out.println(str.charAt(1)); --> 'e'출력  
		
		 	(콘솔예)
			소문자 알파벳 하나를 입력하세요 >>  e (<--사용자 입력)
			abcde
			abcd
			abc
			ab
			a 
		
		
		System.out.print("소문자 알파벳 하나를 입력하세요 >>");
		String input = sc.nextLine(); 
		char ch = input.charAt(0); // a == 97  b c d e 
		// 97 98 99 100 101
		// 97 98 99 100
		// 97 98 99
		// 97 98
		// 97
		//System.out.println((int)ch); // char 를 int로 형변환하면 ascii 코드 값으로 치환됨. 
		for(int i = ch; i >= 97; i--) { // 출력해야하는 줄의 개수만큼 반복 == 입력받은 수부터 97이될때까지
			for(int j = 97; j <= i; j++) { // a(97) 부터 i 까지 
				System.out.print((char)j); // 정수를 문자로 출력하기 위해 char로 형변환 
			}
			System.out.println();
		}
		
		// 문제3. 양의 정수 10개를 입력받아 배열에 저장하고, 3의 배수만 출력하는 프로그램을 작성 
		int [] nums = new int[10];
		// 저장 
		for(int i = 0; i < nums.length; i++) {
			System.out.print("정수 입력>>");
			nums[i] = Integer.parseInt(sc.nextLine());
		}
		
		// 3의 배수만 출력
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 3 == 0) {
				System.out.println(nums[i]);
			}
		}*/
		
		// 문제4. 4x4의 2차원 배열(총 방16개)을 만들고, 1 ~ 10까지 범위의 정수 10개만 
		//		랜덤하게 생성하여 임의의 배열 위치에 저장하세요. 
		//		동일한 랜덤값 정수가 있어도 상관없으나, 
		//		16개 방중 랜덤값이 체워지지 않은 6개의 방은 모두 0으로 만들어야 합니다. 
		//		아래 이미지를 참고하여 마지막으로 4x4 형태로 출력까지 해보세요. 
		/*
				예)
				3	0	7	2
				0	8	2	5
				6	0	1	5
				0	9	0	0
		*/
		// 4x4 2차원 배열 생성 
		int [][] board = new int[4][4];
		// 1 ~ 10까지 범위의 정수 10개 랜덤값으로 받기 (중복값 허용)
		int [] rand = new int[10];
		for(int i = 0; i < rand.length; i++) {
			rand[i] = (int)(Math.random() * 10) + 1; //  1~10 사이 랜덤값 
		}
		
		int count = 0; // for문이 총 몇회 반복했는지 확인용 변수 
		// 10번 반복해서 
		for(int i = 0; i < rand.length; i++) {
			count++; 
			// 임의의 행/열 위치 랜덤으로 받아 
			int x = (int)(Math.random() * 4); // 행
			int y = (int)(Math.random() * 4); // 열
			//System.out.println("( " + x + "," + y + ")");
	
			// (위치 중복처리) 
			// 임의로 뽑은 위치에 이미 0이 아닌 다른수가 있으면 중복된거
			// -> 위치 다시 뽑아서 체우기
			if(board[x][y] != 0) { // 중복된 위치 
				System.out.println("중복!");
				i--; 
			}else { // 중복 안된 위치 
				// 위에 뽑아놓은 랜덤값으로 체운다.
				board[x][y] = rand[i];				
			}
		}
		
		// 출력해서 확인 
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("for문 반복한 총 횟수 : " + count);
		
		
		
		
		
		
		
	}
}
