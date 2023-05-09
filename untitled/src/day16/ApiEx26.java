package day16;

import java.util.ArrayList;
import java.util.Iterator;

public class ApiEx26 {
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		
		// 반복자 얻어오기 
		Iterator<Integer> it = arr.iterator();
		 
		while(it.hasNext()) { // it로 리스트 끝까지 반복 
			int n = it.next(); // it가 가르키는 요소를 꺼내기 
			System.out.println(n);
		}
		
		
		// 모든 수 더한 합계 
		int total = 0; 
		it = arr.iterator(); // 반복자 다시 받아서 사용 
		while(it.hasNext()) {
			total += it.next(); 
		}
		System.out.println(total);
		
		
		
		
		
	}
}
