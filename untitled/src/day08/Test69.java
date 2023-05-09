package day08;

// 계산기 클래스 만들기 
// 두수를 입력받아 결과를 돌려주는 
// sum() 더하기, sub() 빼기, mul() 곱하기, div() 나누기 메서드를 만들고 
// main 메서드에서 잘 동작하는지 결과값 출력해 확인해보세요. 
class Calc {
	int sum(int a, int b) {
		return a + b; 
	}
	
	int mul(int a, int b) {
		return a * b; 
	}
	int div(int a, int b) {
		// 예외 처리 
		if(b == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}else {
			return a / b; 
		}
	}
	int sub(int a, int b) {
		return a - b; 
	}
}
public class Test69 {
	public static void main(String[] args) {
		Calc c = new Calc(); // Calc 사용위해 객체 생성 
		
		int x = 10; 
		int y = 20; 
		
		int result = c.sub(x, y);
		System.out.println(result);
		result = c.sum(1, 2);
		System.out.println(result);
		result = c.mul(12, 10);
		System.out.println(result);
		result = c.div(30, 0);
		System.out.println(result);
		
		
	}
}
