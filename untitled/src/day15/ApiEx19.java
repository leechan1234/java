package day15;

import java.util.Vector;

public class ApiEx19 {
	public static void main(String[] args) {

		// 벡터 객체 생성 
		Vector<String> v = new Vector<String>();
		
		// 저장 
		v.add("hello");
		v.add("java");
		v.add("이제 곧");
		v.add("끝나요");
		
		System.out.println(v);

		// 중간에 끼워넣기 
		v.add(0, "hahaha");
		System.out.println(v);
		
		// 꺼내기 
		String s = v.get(0);
		System.out.println(s);
		
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		
		
		
	}
}




