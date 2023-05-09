package day15;

public class ApiEx10 {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("hello"); 
		System.out.println(sb.capacity());
		System.out.println(sb);
		
		// 문자열 연결
		sb.append(" java");
		System.out.println(sb);
		
		// 문자열 삭제 
		sb.delete(6, 8);
		System.out.println(sb);
		
		// 문자열 삽입 
		sb.insert(6, "haha");
		System.out.println(sb);
		
		// 문자열 길이 조절 
		sb.setLength(3);
		System.out.println(sb);
		
		
		
		
	}
}
