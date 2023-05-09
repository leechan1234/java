package day12;
// 인터페이스 -> 객체 생성 불가. 
interface Test {
	public static final int NUM = 1; 	// 상수
	public abstract void func(); 		// 추상메서드 
	//int x = 100;  // 앞부분 생략한 버전 
	//void sub();
}
interface Test2 {
	void sub(); 
}
// 인터페이스를 구현한 클래스 -> 객체 생성하여 사용 가능 
class Inter implements Test, Test2 { // 다중 구현 
	@Override
	public void func() {
		System.out.println("implements!!!");
	}
	@Override
	public void sub() {
		// 아무일 안하는걸로 구현...
	}
}
public class Test127 {
	public static void main(String[] args) {

		Inter i = new Inter(); 
		i.func();
		i.sub();
		// 다형성 
		Test t = new Inter(); 
		t.func();
		Test2 tt = new Inter(); 
		tt.sub();
		
		
	}
}



