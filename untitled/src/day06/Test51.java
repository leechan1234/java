package day06;

import java.util.Scanner;

public class Test51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 문제1. 아래와 같은 형태의 정방 배열을 만들어 값을 저장하고 출력해보세요. 
			10	20	30
			40	50	60	
			70	80	90
		
		int[][] arr = { {10, 20, 30},
						{40, 50, 60},
						{70, 80, 90} };
						
		int[][] arr = new int[3][3];
		
		for(int i = 0; i < arr.length; i++) { // 행 반복 
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ((i*3) + j + 1) * 10; 
			}
		}
		
		for(int i = 0; i < arr.length; i++) { // 행 반복 
			for(int j = 0; j < arr[i].length; j++) { // 각 행의 열 반복
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}*/
		
		
		
		/* 문제2. int형 3행 2열의 정방배열을 만들고 
		//		각 방에 정수를 입력받아 저장하고, 출력해보세요. 
		int[][] arr = new int[3][2]; 
		for(int i = 0; i < arr.length; i++) { // 행 반복 
			for(int j = 0; j < arr[i].length; j++) { // 각 행의 열반복
				System.out.println("정수 입력>>"); // 콘솔에 메세지 출력
				// 정수 입력받아 배열에 바로 저장
				arr[i][j] = Integer.parseInt(sc.nextLine()); 
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		*/
		
		
		/* 문제3. 아래와 같은 비정방배열을 만들어 아래와 같이 값을 저장하고 출력. 
		
		  	10	11	12
		  	20	21	
		  	30	31	32
		  	40	41
		
		int[][] arr = { {10, 11, 12},
						{20, 21},
						{30, 31, 32},
						{40, 41} }; 
						
		int [][] arr = new int[4][]; 
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[2];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 1) * 10 + j; 
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}*/
		
	
		// 문제4. 한층에 5호씩 있는 3층짜리 아파트가 있다. 

		/*
		int[][] fee = new int[3][5]; // 아파트 관리비 저장할 배열 생성
		
		//	1) 배열로 만들어서 각각 호마다 관리비를 입력받고, 전체 출력해보세요. 
		// 각 호마다 관리비 입력받아 저장 처리  
		for(int i = 0; i < fee.length; i++) {
			for(int j = 0; j < fee[i].length; j++) {
				System.out.print(">>");
				fee[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		// 전체 출력 
		for(int i = 0; i < fee.length; i++) {
			for(int j = 0; j < fee[i].length; j++) {
				System.out.print(fee[i][j] + "\t");
			}
			System.out.println();
		}
		*/
		
		
		//	2) 층별 관리비 평균을 구해서 출력해보세요. 
		/* 1층 i=0 j=0~4 
		int total1 = 0; 
		for(int j = 0; j < fee[0].length; j++) {
			total1 += fee[0][j];
		}
		System.out.println("1층 관리비 평균 : " + (total1/5.0));
		// 2층 i=1
		int total2 = 0; 
		for(int j = 0; j < fee[1].length; j++) {
			total2 += fee[1][j];
		}
		System.out.println("2층 관리비 평균 : " + (total2/5.0));
		// 3층 1=2
		int total3 = 0; 
		for(int j = 0; j < fee[2].length; j++) {
			total3 += fee[2][j];
		}
		System.out.println("3층 관리비 평균 : " + (total3/5.0));
		
		// 각 층마다 총합더해놓을 배열
		int [] tot = new int[fee.length]; // 층수만큼 방만들기 
		for(int i = 0; i < fee.length; i++) {
			for(int j = 0; j < fee[i].length; j++) { // 2중 for문으로 각 fee방에 모두 접근 
				tot[i] += fee[i][j]; // 방에 저장된 관리비 꺼내서 해당 층수의 tot방에 누적해서 더하기 
			}
			System.out.println((i+1) + "층 관리비 평균 : " + (tot[i]/5.0));// tot 누적된것에 평균 구하기 
		}
		//-------------------------------
		
		int[][] fee = { 
				{45,32,66,86,35},
				{34, 2,45,79,42},
				{12,30,57,98,44} };
		int[][] ho = {
				{101,102,103,104,105},
				{201,202,203,204,205},
				{301,302,303,304,305} };
		
		//	3) 전체 관리비 평균을 구해서 출력해보세요.
		int total = 0; 
		for(int i = 0; i < fee.length; i++) {
			for(int j = 0; j < fee[i].length; j++) {
				total += fee[i][j]; 
			}
		}
		double avg = total / 15.0;
		System.out.println("전체 관리비 평균 : " + avg);
		
		// 	4) 103호와 203호의 관리비가 서로 바뀌었다고 합니다. 교환해주세요.
		int tmp = fee[0][2];
		fee[0][2] = fee[1][2];
		fee[1][2] = tmp; 
		
		//	5) 전체 관리비 평균보다 적게 사용한 호수들을 출력해보세요. 
		for(int i = 0; i < fee.length; i++) {
			for(int j = 0; j < fee[i].length; j++) { // 모든 fee 방에 들어가 avg보다 작으면 ho 출력 
				if(avg > fee[i][j]) {
					System.out.println(ho[i][j] + "호");
				}
			}
		} 
		//---------------------------------------------------
		*/
		int[][] fee = { 
				{45,32,66,86,35},
				{34, 2,45,79,42},
				{12,30,57,98,44} };
		int[][] ho = {
				{101,102,103,104,105},
				{201,202,203,204,205},
				{301,302,303,304,305} };
		
		//  6) 관리비 가장 적게 나온 호수와 가장 많이 나온 호수를 출력해보세요. (최대값, 최소값) 
		// 		관리비 가장 많이 나온것 (최대값) 
		int max = fee[0][0];	// 최대 관리비 들고 비교할 변수 
		int maxIdxI = 0; 		// 최대 관리비 인덱스번호 i 담을 변수 
		int maxIdxJ = 0; 		// 최대 관리비 인덱스번호 j 담을 변수 
		// 		관리비 가장 적게 나온것 (최소값) 
		int min = fee[0][0]; 
		int minIdxI = 0; 
		int minIdxJ = 0; 
		for(int i = 0; i < fee.length; i++) {
			for(int j = 0; j < fee[i].length; j++) {
				// 최대값 비교 
				if(max < fee[i][j]) { // 비교하는 쪽이 크다면 
					max = fee[i][j]; // 이 값이 max가 된다. 
					maxIdxI = i; 	// 인덱스도 같이 저장 
					maxIdxJ = j; 
				}
				// 최소값 비교 
				if(min > fee[i][j]) {
					min = fee[i][j]; 
					minIdxI = i; 
					minIdxJ = j; 
				}
			}
		}
		System.out.println("최대 관리비 : " + ho[maxIdxI][maxIdxJ] + "호 (" + max + "원)");
		System.out.println("최소 관리비 : " + ho[minIdxI][minIdxJ] + "호 (" + min + "원)");
		
		//  7) 관리비 적게 나온순으로 정렬해보세요. 
		// 		2차원 배열 -> 1차원 배열 -> 정렬 
		// 1차원 배열로 변경 
		int[] feeTmp = new int[15]; 
		int[] hoTmp = new int[15]; 
		
		// 2차원 배열 모든 방에 접근하기 위해 2중 for문을 사용
		// 2중 for문의 i, j를 연산해서 1차원배열의 idx 값을 알아내기 
		//   0 1 2 3 4   5 6 7 8 9   10 11 12 13 14
		// i 0 0 0 0 0   1 1 1 1 1   2  2  2  2  2
		// *5
		// +   		
		// j 0 1 2 3 4   0 1 2 3 4   0  1  2  3  4
		for(int i = 0; i < fee.length; i++) {
			for(int j = 0; j < fee[i].length; j++) {
				int idx = i * 5 + j; 
				feeTmp[idx] = fee[i][j]; 
				hoTmp[idx] = ho[i][j]; 
			}
		}
		
		// 정렬 
		for(int i = 0; i < feeTmp.length-1; i++) {
			for(int j = i+1; j < feeTmp.length; j++) {
				if(feeTmp[i] > feeTmp[j]) {
					int t = feeTmp[i];
					feeTmp[i] = feeTmp[j];
					feeTmp[j] = t; 
					int h = hoTmp[i]; 
					hoTmp[i] = hoTmp[j];
					hoTmp[j] = h;
				}
			}
		}
		
		// 출력해서 확인 
		for(int i = 0; i < feeTmp.length; i++) {
			System.out.println(feeTmp[i] + "\t" + hoTmp[i] + "호");
		}
		
	
		sc.close();
	
	}
}
