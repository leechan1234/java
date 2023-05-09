package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ApiEx27 {
	public static void main(String[] args) {

		// 생성
		HashMap<String, String> map = new HashMap<String, String>();
		
		// 저장 
		map.put("apple", "사과");
		map.put("strawberry", "딸기");
		map.put("watermelon", "수박");
		map.put("peach", "복숭아");
		
		System.out.println(map);
		
		// 값 꺼내기 
		String val = map.get("apple");
		System.out.println(val);
		val = map.get("peach");
		System.out.println(val);
		
		// 삭제 
		map.remove("strawberry");
		System.out.println(map);
		
		// 요소의 개수 
		System.out.println(map.size());

		
		// 해쉬맵 전체 검색 
		Set<String> keys = map.keySet();  // 키들만 모아오기 
		Iterator<String> it = keys.iterator(); // 키들의 반복자 얻어오기 
		while(it.hasNext()) { // 키가 있는 만큼 반복 
			String key = it.next(); // 반복자에서 key하나 꺼내기 
			String value = map.get(key);  // map에서 key주고 value 꺼내기 
			System.out.println(key + " : " + value);
		}
		
		System.out.println(map.containsKey("apple"));
		System.out.println(map.containsValue("딸기"));
		
		
		HashMap map2 = new HashMap(); 
		map2.put("java", 1234);
		map2.put("asdg", "hello");
		map2.put(10, "ahhaah");
		
		// HashMap<String, Object> 
		
		
		
		List<Integer> list = new ArrayList<Integer>(); 
		Map<String, Double> hashMap = new HashMap<>();
		
		
		
		
		
		
	}
}
