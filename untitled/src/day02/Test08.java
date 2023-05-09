package day02;

public class Test08 {

	public static void main(String[] args) {
		
		char a = 'A';
		int b = a;
		System.out.println(b); // 65
		
		int a1 = 65;
		char b1 = (char)a1;
		System.out.println(b1); //A
		
		int a2 = 5;
		double b2 = a2;
		System.out.println(b2); //5
		
		double d = 5.7;
		int i = (int)d;
		System.out.println(i); //5

		char ch = 'a';
		double dd = ch;
		System.out.println(dd); // a


	}

}
