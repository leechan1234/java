package day14;

public class ApiEx05 {
	public static void main(String[] args) {

		/*
		String str = new String("java");
		System.out.println(str);
		
		String newStr = str.concat("String type args");
		System.out.println(newStr);
		
		/////////////////////////////////////////
		
		String java = "Java";
		String cpp = "C++";
		
		int a = java.compareTo(cpp);
		System.out.println(a);
		
		////////////////////////////////////////////////
		String aa = "         abcd   efg          ";
		String bb = "         xyz\t";
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(aa.trim());
		System.out.println(bb.trim());
		
		//////////////////////////////////////////////////
		String s = "class";
		char ch = s.charAt(0);
		System.out.println(ch);
		
		// 문자열의 's'의 개수 알아내기 
		int count = 0; 
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 's') count++; 
		}
		System.out.println(count);
		*/
		
		///////////////////////////////////////////////////
		String str = "fjnrklqeantvierlknvfjdaknhakvn fdkndffaknvfhaejkenefgejhk";
		System.out.println(str.length());
		
		boolean result = str.contains("fjn");
		System.out.println(result);
		
		////////////////////////////////////////////////////
		str = "Apple Tree";
		//String replaced = str.replace("Apple", "Lemon");
		//System.out.println(replaced);
		str = str.replace("Apple", "Lemon");
		System.out.println(str);
		
		String sub = str.substring(3);
		System.out.println(sub);
		sub = str.substring(3, 7); // 시작인덱스, 끝인덱스(이전까지 잘라서) 
		System.out.println(sub);
		
		///////////////////////////////////////////////////
		// 문자열 -> 정수 
		str = "100";
		int strInt = Integer.parseInt(str);
		
		// 정수 -> 문자열 
		int num = 100; 
		String s = String.valueOf(num);
		System.out.println(s);
		
		int number = 200; 
		String ss = number + "";
		
		
		
		
		
		
		
		
	}
}
