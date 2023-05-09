package day05;

public class Test42 {
	public static void main(String[] args) {

		int[] num = new int[10];
		// 모든방 100으로 초기화 
		for(int i = 0; i < 10; i++) {
			num[i] = 100; 
		}	
		
		// 출력해서 확인 
		for(int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}
		
		// 초기화 
		int [] arr = {10,20,30,40,504,33,4,5,6,7,7,8,7,5,3,2,4,6,6,7,7,7}; 
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		double[] darr = {1.1, 1.2, 1.3};
		
		String[] sArr = {"java", "jsp", "spring"}; 
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		
		// 문제. 최대값, 최소값 구하기 
		int[] score = {79,45,67,34,98,51};
		
		int max = score[0]; // 비교할때 현재까지의 최대값을 들고 다닐 변수 
		int min = score[0]; // 비교할때 현재까지의 최소값을 들고 다닐 변수 
		for(int i = 0; i < score.length; i++) {
			if(max < score[i]) { // score[i] 크면 true
				max = score[i]; // max가 더 큰애로 변경 
			}
			if(min > score[i]) { // score[i] 작으면 true
				min = score[i]; // min가 더 작은애로 변경 
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
		
		
		
		
		
	}
}
