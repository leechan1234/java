package day08;
/*
	리턴타입 메서드명(타입 파라미터,...){
		실행코드들...
		return 값; 
	}
*/
class TestEx{
	// 메서드 정의 
	// 입력값X, 리턴값X 
	void printHello() {
		for(int i = 0; i < 10; i++) {
			System.out.println("hello method");
		}
	}
	// 입력값X, 리턴값O 
	int getTen() {
		System.out.println("getTen 호출됨!!!");
		return 10; 
	}
	// 입력값O, 리턴값X 
	void greeting(String name) {
		System.out.println("안녕하세요 "+ name +"님!!");
	}
	// 입력값O, 리턴값O : 정수 2개 받아 2개 합을 리턴 
	int sum(int a, int b) {
		//System.out.println("a : " + a);
		//System.out.println("b : " + b);
		int result = a + b; // 두수 더하기 
		return result; // 결과 리턴 
	}
	
}

public class Test68 {
	public static void main(String[] args) {

		
		TestEx t = new TestEx(); 
		// 메서드 호출(사용)
		
		int sumResult = t.sum(10, 20); 
		System.out.println(sumResult); // 리턴받은 결과 출력해 확인 
		
//		t.printHello();
//		
//		int result = t.getTen(); 
//		System.out.println(result); // 출력해 확인 
//		
//		t.greeting("꼬북이"); 
		
		
		
	}
}






