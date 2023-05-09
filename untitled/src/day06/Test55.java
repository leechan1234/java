package day06;

public class Test55 {
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("===========");
		
		// update for문, forEach문 : 바로 값을 꺼내서 변수에 담아준다 
		// 배열의 길이만큼 자동으로 반복하며, 
		// 반복할때마다 배열의 요소를 순차적으로 앞의 변수에 담아준다. 
		for(int a : arr) {
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
