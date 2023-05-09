package day15;

import java.util.ArrayList;

public class ApiEx18 {
	public static void main(String[] args) {

		// ArrayList 객체 생성 
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		// 값 저장  arr[0] = 10 --> arr.get(10)
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(null);
		arr.add(40);
		System.out.println(arr);
		
		arr.add(2, 100); // (index, 저장할값) 
		System.out.println(arr);
		
		// 값 꺼내기 : arr[0] --> arr.get(0);
		int a = arr.get(0);
		System.out.println(a);
		
		// 전체 출력 
		System.out.println("size : " + arr.size());
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		// 요소 삭제 : .remove(int index)    .remove(Object o) 
		//arr.remove(100); // 정수 작성하면 index번호로 인식 
		Integer ii = 100; // 값으로 지우기 
		arr.remove(ii);
		System.out.println(arr);
		
		arr.remove(0); // index로 지우기 
		System.out.println(arr);
		
		
		
		
		
		
		
		
	}
}
