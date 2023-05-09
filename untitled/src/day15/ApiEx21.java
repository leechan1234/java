package day15;

import java.util.ArrayList;

class Test {
	int x; 
}
public class ApiEx21 {
	public static void main(String[] args) {

		// 제네릭 타입 no작성 --> 모든타입 저장가능 (Object로 취급됨) 
		ArrayList arr = new ArrayList(); 
		arr.add(10);
		arr.add(20);
		arr.add("abcd");
		arr.add(true);
		arr.add(3.14);
		arr.add(new Test());
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		for(Object o : arr) {
			System.out.println(o);
		}
		
		
		System.out.println(arr);
		
		//Object o = arr.get(0);
		//System.out.println(o);
		int a = (Integer)arr.get(0);
		System.out.println(a);
		
		Object o = arr.get(5);
		if(o instanceof Test) { 
			Test t = (Test)o; 
			t.x = 100; 
		}
		
		// 결론 -> 저장된 요소를 잘 사용하려면 맞는 타입으로 형변환해서 사용해야함.
		
		
		ArrayList<Test> tArr = new ArrayList<Test>(); 
		tArr.add(new Test());
		tArr.add(new Test());
		tArr.add(new Test());
		
		Test t = tArr.get(0);
		t.x = 200;
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------------");
		
		// 업그레이드 for문 
		for(int i : list) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
