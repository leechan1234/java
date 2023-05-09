package day02;

public class Test04 {

	public static void main(String[] args) {
		
		char ch = '\u0041';
		//System.out.println(ch);
		int result = 129;
		
		// 오버플로우 
		byte b = (byte)result;
		//System.out.println(b);
		
		// 정수 int 
		int i = 15; // 10 진수 
		int j = 015; // 8 진수 : 0 으로 시작하는 수 
		int k = 0x15; // 16진수 : 0x 로 시작하는 수 
		int l = 0b0101; // 2진수 : 0b 로 시작하는 수 
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		// 문자열 
		char c = 'a';
		String s = "a";
		System.out.println(s);
		
		 
		
		
		
		
		
		
	}

}
