package day12;
// 추상 클래스 
abstract class Super {  // add()추상 , a, aaa() 
	abstract void add(); // 추상 메서드 
	// 일반 변수와 메서드 포함가능 
	int a = 10; 
	void aaa() {
		
	}
}
// 추상클래스 사용법 : 추상클래스를 상속받는 서브 클래스 작성 
// 이때, 물려받은 추상메서드를 모두 구현해야함.
class Sub extends Super { // add(){}, a, aaa()
	void add() {
		// 내용이 없어도 일단 영역이 있으면 에러는 모면함.
	}
}
public class Test125 {
	public static void main(String[] args) {

		//Super sup = new Super(); 
		Sub sub = new Sub(); 
		sub.add();
		sub.aaa();
		sub.a = 10; 
		
		
		
	}
}
