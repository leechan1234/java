package day15;

public class ApiEx11 {
	public static void main(String[] args) {

		Integer i = new Integer(10); 
		int ii = i.intValue(); 
		long l = i.longValue(); 
		double ddd = i.doubleValue(); 
		// Integer 값 -> String 값 
		String s = i.toString(); 
		System.out.println(s);
		
		int x = 10; 
		Object obj = x; 
		System.out.println(obj.getClass());
		
		
		Character c = new Character('c'); 
		char cc = c.charValue();
		
		Double d = new Double(3.14);
		double dd = d.doubleValue(); 
		
		Boolean b = new Boolean(true);
		boolean bb = b.booleanValue(); 
		
		// Character를 제외한 나머지 Wrapper클래스는 문자열로 객체 생성가능
		//Integer ii = new Integer("100");
		
		
		
		
	}
}
