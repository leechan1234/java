package day14;

public class ApiEx04 {
	public static void main(String[] args) {

		// 리터럴 방식 
		String a = "hello";
		String b = "hello";
		System.out.println(a == b); // 주소 비교 (문자열 비교로 사용하면 안되요) 
		System.out.println(a.equals(b)); // 문자열 비교 -> 같다라고 나옴 
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println("---------");
		
		// 객체 생성 
		String c = new String("hello");
		String d = new String("hello");
		System.out.println(c == d); // 주소비교 -> 주소가다름 
		System.out.println(c.equals(d)); // 문자열 비교 -> 같다라고 나옴 
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
		
		
		
		
		
		
	}
}
