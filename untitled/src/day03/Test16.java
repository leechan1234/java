package day03;

public class Test16 {
	public static void main(String[] args) {

		// 비교연산자 : 결과는 true / false 
		int a = 10; 
		int b = 0; 
		
//		boolean result = a > b + 20; // 우선순위 : 산술 > 비교
//		boolean result = a == b; 
//		System.out.println(result);
		
		// 논리연산자 : && || : 비교연산식을 연결해서 하나의 연산으로 만들어줌.t/f
		// && : and : 조건식이 모두 참이여야 참 (하나라도 거짓이면 거짓)
		// || : or : 조건식이 하나라도 참이면 참 (모두 거짓이어야 거짓)
		//boolean r = a > b && b >= 0;
		//System.out.println("r = " + r);
		
//		boolean r2 = !(a > b) || b > 0;
//		System.out.println("r2 = " + r2);
//		// ! : not 부정문 : 결과를 반대로 바꿔줌 
//		System.out.println(!r2);
//		System.out.println(!false);
		
		
		// 삼항연산자 :  조건식? 참일경우결과값:거짓일경우결과값
		System.out.println(a > b ? a : b);
		int res = a > b ? a : b;
		System.out.println(res);
		String resCh = a > b ? "O" : "X";
		System.out.println(resCh);
		
		
		
	}
}
