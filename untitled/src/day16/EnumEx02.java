package day16;

// 상수 편하게 사용하기위해 묶어놓는 용도 
enum Rainbow { 
	// 불규칙한 값을 각 상수에 부여할경우
	// #1. 나열 후 마지막에 세미콜론 ; 붙히기 
	RED(3), ORANGE(10), YELLOW(22), GREEN(8), BLUE(51), NANY(1), PURPLE(-23);
	
	// #2. 해당 특정 값을 저장할 변수 만들기 
	private final int value;
	// #3. 변수를 초기화해주는 생성자 작성 
	Rainbow(int value) { this.value = value; }
	// #4. 변수가 private이라 외부에서 값 꺼낼 수 있게 getter 작성 
	public int getValue() { return value; }
}
enum City {
	SEOUL("seoul"), BUSAN("busan"), DAEGU("daegu"), INCHEON("incheon");
	
	private final String value; 
	City(String value) { this.value = value; }
	public String getValue() { return value; }
}
class A {
	int x = 22; 
	Rainbow r; 
}
class B {
	int x = 22; 
	Rainbow r; 
}
public class EnumEx02 {
	public static void main(String[] args) {

		//System.out.println(Rainbow.YELLOW); // YELLOW 상수명
		//System.out.println(Rainbow.YELLOW.ordinal()); // 상수값이 아니라 나열 순서 인덱스
		//System.out.println(Rainbow.YELLOW.getValue()); // 상수에 부여한 특정 값 (getter)
		
		A a = new A(); 
		B b = new B(); 
		
		// 일반 인스턴스 변수 
		System.out.println(a.x);
		System.out.println(b.x);
		System.out.println(a.x == b.x);
		
		// 상수 
		a.r = Rainbow.YELLOW;
		b.r = Rainbow.YELLOW;
		
		System.out.println(a.r);
		System.out.println(b.r);
		System.out.println(a.r == b.r);
		
		// x값과 enum 상수 비교 (타입이 달라서 비교 불가)
		//System.out.println(a.x == a.r);
		
		// r이 가진 상수에 부여된 값 출력 
		System.out.println(a.r.getValue());
		
		// 값 끼리 비교는 가능 
		System.out.println(a.x == a.r.getValue());
		
		
		
		
		
		
		
	}
}
