package day13;
// 싱글톤
class SingleT {
	
	// 아래 두 변수는 싱글턴안에 만들어진 변수라 
	// 사용할때는 마치 둘다 클래스 변수처럼 사용됨
	static int b = 1;  // getInstance()로 얻어오지 않고도 사용 가능하게 
	int a = 100; 		// getInstance()로 얻어온 후 사용가능하게 
	
	private static SingleT instance = new SingleT(); 
	private SingleT() { }
	public static SingleT getInstance() { 
		return instance; 
	}
	void func() {
		System.out.println("싱글톤!!!!!!!");
	}
}
public class Test140 {
	public static void main(String[] args) {

		// 싱글톤은 외부에서 객체 생성 불가! 
		//SingleT s = new SingleT();
		
		// 객체 얻어와 
		SingleT s = SingleT.getInstance();
		// 기능 사용하기 
		s.func();
		
		// 다른 변수에 얻어오기 
		SingleT s2 = SingleT.getInstance(); 
		System.out.println(s);
		System.out.println(s2);
		
		// 싱글톤의 인스턴스 변수 사용 
		System.out.println("s.a : " + s.a);
		System.out.println("s2.a : " + s2.a);
		s.a = 300; 
		System.out.println("s.a : " + s.a);
		System.out.println("s2.a : " + s2.a);
		
		System.out.println(SingleT.b);
		System.out.println(s.b);
		
		
		
		
	}
}
