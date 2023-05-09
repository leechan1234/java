package day02;

public class Test07 {

	public static void main(String[] args) {

		//System.out.println("hello\" \'  \\ \tjava\n hello \n\nhtml");
		
		// 문제1. 정수형 변수 a, b 를 만들고 각각 10, 20 을 대입, 
		//			변수에 저장된 값을 서로 교환해서 출력해보세요. 
		int a = 10; 
		int b = 20; 
		System.out.println(a + " " + b); // 10 20 
		
		// 각 변수가 들고 있는 값을 교환하는 로직 작성 
//		int temp = a; 
//		a = b; 
//		b = temp;
		
		a = b; 
		b = a;
		
		
		System.out.println(a + " " + b);  // 20 10
		
		
		
		
		
		
		
		
	}

}
