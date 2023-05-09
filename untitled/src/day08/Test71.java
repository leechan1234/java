package day08;

public class Test71 {
	// factorial : 1부터 입력받은 수 n까지 곱한 결과를 돌려주는 메서드 
	static long factorial(int n) {
		/*
		long result = 0; 
		if(n == 1) {
			result = 1; 
		}else {
			result = n * factorial(n-1);
		}
		return result;
		
		if(n == 1) {
			return 1; 
		}else {
			return n * factorial(n-1);
		}*/
		long result = 1; 
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result; 
	}
	public static void main(String[] args) {

		long result = factorial(5);
		System.out.println(result);
		
	}
}
