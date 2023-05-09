package day06;

public class Test50 {
	public static void main(String[] args) {

		// 정방배열 
		int [][] ar = new int[2][3]; 
		ar[0][0] = 100; 
		ar[0][1] = 200; 
		ar[0][2] = 300; 
		ar[1][0] = 400; 
		ar[1][1] = 500; 
		ar[1][2] = 600; 
		
		int [][] arr = { {100,200,300},
						 {400,500,600} }; 
		
		System.out.println(arr.length); // 몇행
		System.out.println(arr[0].length); // 몇열
		
		for(int i = 0; i < arr.length; i++) { // 행 반복 
			for(int j = 0; j < arr[0].length; j++) { // 열반복 
				System.out.println(arr[i][j]);
			}
		}
		
		System.out.println("-----------------");
		
		// 비정방 배열 
		int [][] arr2 = new int[2][]; // 행은 먼저 지정하고 생성 
		arr2[0] = new int[2];  // 각 열마다 new int[방크기] 로 배열 생성 
		arr2[1] = new int[3];  // 필요한 공간만큼 메모리 할당 
		arr2[0][0] = 10; 
		arr2[0][1] = 20; 
		arr2[1][0] = 30; 
		arr2[1][1] = 40; 
		arr2[1][2] = 50; 
		
		// 초기화 
		int [][] arr3 = { {10, 20}, {30,40,50} }; 
		System.out.println(arr3.length); // 몇행 
		System.out.println(arr3[0].length); // 0행의 몇 열
		System.out.println(arr3[1].length); // 1행의 몇 열
		
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
