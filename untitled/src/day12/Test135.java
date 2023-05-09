package day12;

import java.util.Scanner;

//추상 클래스 
/*
	아래와 같이 4개의 멤버(필드와 메소드)를 가진, 
	4개의 클래스 Add,Sub,Mul,Div 를 작성하세요. 
	- int타입의 a, b 필드 : 2개의 피연산자 저장할 변수
	- void setValue(int a, int b) : 피연산자 값을 객체 내에 저장
	- int calculate() : 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.
	그런데, 각각의 클래스마다 공통된 필드와 메소드가 존재하는 구조이므로, 
	Calc라는 이름의 추상클래스를 작성하여 Calc를 상속받아 각 4개의 클래스를 작성해보세요.
	그리고, main()메소드에서 실행예시와 같이 2개의 정수와 연산자를 입력받은 후,
	4개의 클래스중 적합한 연산을 처리할 수 있는 객체를 생성하고 
	메서드 호출하여 그 결과 값을 화면에 출력하게 작성 해보세요. 
	실행 예시 :
		두 정수와 연산자를 입력하세요 >> 5 7 +
		12
	tip : 문자열 자르기 
		String str = "a b c"; 
		String[] result = str.split(" "); 
*/
abstract class Calcu {
	protected int a; 
	protected int b; 
	protected void setValue(int a, int b) { // 세팅은 모두 동일하니 미리 구현 (일반메서드) 
		this.a = a; this.b = b; 
	}
	abstract int calculate(); // 추상메서드 (각 클래스마다 맞는 연산으로 구현해라~) 
}
class Add extends Calcu {
	@Override
	int calculate() {
		return a + b;
	}
}
class Subs extends Calcu {
	@Override
	int calculate() {
		return a - b;
	}
}
class Mul extends Calcu {
	@Override
	int calculate() {
		return a * b;
	}
}
class Div extends Calcu {
	@Override
	int calculate() {
		return a / b;
	}
}
public class Test135 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하세요 >> ");
		String str = sc.nextLine(); 
		String[] split = str.split(" ");
		// 다형성 
		Calcu cal = null; 
		
		if(split[2].equals("+")) {
			cal = new Add();
		}else if(split[2].equals("-")) {
			cal = new Subs(); 
		}else if(split[2].equals("*")) {
			cal = new Mul(); 
		}else if(split[2].equals("/")) {
			cal = new Div(); 
		}
		
		cal.setValue(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
		int result = cal.calculate();  // 오버라이딩된 calculate() 실행 
		System.out.println(result);
		
		sc.close();
		
	}
}
