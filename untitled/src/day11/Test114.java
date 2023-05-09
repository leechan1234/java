package day11;

class Super1 {
	int x;
	void add() {
		this.x = 100;
		System.out.println("Super");
	}
}
class Sub1 extends Super1 { // add()
	Sub1(){

	}
	Sub1(int xx){
		//this();
		super();
	}
	@Override
	void add() {
		super.x = 2000;
		this.x = 1000;
		System.out.println("Sub");
		System.out.println("Sub");
		super.add(); // 부모의 add() 버전 호출해서 실행시키기
		System.out.println("Sub");
	}
}

public class Test114 {
	public static void main(String[] args) {

		Sub1 sub = new Sub1();
		sub.add();

	}
}
