package day05;

import java.util.Scanner;

public class Test46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문제1-1. int형 5개 방의 배열을 만들고 10,20,30,40,50 을 저장, 출력해보세요.
		/*
		int[] arr = new int[5]; 
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}
		
		int[] arr = {10,20,30,40,50};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------------");
		
		//문제1-2. 위 배열을 이용하여, 인덱스번호 1번과 3번방에 있는 데이터를 더한값을 출력.
		System.out.println(arr[1] + arr[3]);
		System.out.println("----------------------");
		
		//문제1-3. 인덱스번호를 사용자로부터 입력받고, 해당 인덱스의 데이터를 출력. 
		
		System.out.print("0 ~ 4 사이 인덱스번호 입력>>");
		int idx = Integer.parseInt(sc.nextLine());
		System.out.println(arr[idx]);
		System.out.println("----------------------");
		*/
		
//		int[] arr = {10,20,30,40,50};
//		//문제1-4. 배열안의 모든 데이터를 더한 값을 출력
//		int tot = 0;
//		for(int i = 0; i < arr.length; i++) {
//			tot += arr[i];
//		}
//		System.out.println("tot : " + tot);
//
		
		/*문제1-5. 배열안에 있는 값중 하나를 입력하면, 그 값이 위치한 인덱스번호를 출력. 
		System.out.print("10,20,30,40,50 중 값 하나 입력 : ");
		int val = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < arr.length; i++) {
			if(val == arr[i]) {
				System.out.println("index : " + i);
				break; // 이미 index 번호 찾았으니 반복문 강제 종료 
			}
		}*/
		
		//문제1-6. 인덱스번호 2번과 4번방의 값을 교환해보세요. 
//		int tmp = arr[2];
//		arr[2] = arr[4];
//		arr[4] = tmp;
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println("-------------------------");
		
		// arr = 50,40,30,20,10
	
		//문제1-7. (심화) 배열안의 데이터를 내림차순으로 정렬해보세요.(큰수 -> 작은수) 
		// 버블정렬 
//		for(int i = 0; i < arr.length-1; i++) {
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[i] < arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//
//		// 정렬 확인 출력
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//
		/* 선택정렬 
		for(int i = 0; i < arr.length-1; i++) {
			int max = i; // 현재까지 최대값이 들어있는 인덱스번호 저장해 비교 (처음에는 i로 초기화)
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[max] < arr[j]) {
					max = j; // 더큰 값을 가지고 있는 인덱스 번호를 max에 저장 
				}
			}
			int temp = arr[max];
			arr[max] = arr[i]; 
			arr[i] = temp;
		}*/

		

		
	}
}
