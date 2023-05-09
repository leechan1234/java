package day03;

public class Test17 {
	public static void main(String[] args) {

		// 대입연산자 : = : 대입을 해야 변수안의 값이 변경됨. 
		int a = 10; 
		System.out.println(a + 10); // 출력할때만 더해서 결과 출력
		System.out.println(a);
		
		// 복합대입연산자 : 산술 + 대입 : += -= *= /= %=
		System.out.println(a += 10);
		System.out.println(a);
		
		int b = 10;
		b = b - 5; 
		System.out.println(b);
		b %= 5;
		System.out.println(b);
		
		int c = 0;
		c = c - 1; 
		c -= 1;
		c--;
		
		
		
		
		
	}
}
