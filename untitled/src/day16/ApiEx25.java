package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ApiEx25 {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(40);
		arr.add(10);
		arr.add(50);
		arr.add(20);
		arr.add(60);
		arr.add(30);
		
		// 리스트 부분만 잘라 리턴받기 
		ArrayList<Integer> subArr = new ArrayList(arr.subList(1, 3)); // (시작인덱스, 끝인덱스)(끝은 포함X)
		System.out.println(subArr);
		
		// 정렬
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		
		// 포함 여부 확인 
		System.out.println(arr.containsAll(subArr));
		
		////////////////////////////////////////////////////////////////
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
