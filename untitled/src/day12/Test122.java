package day12;

import java.util.Scanner;

class AClass {										// x, add()
	int x; 
	void add() { System.out.println("AAA"); }
}
class BClass extends AClass {						// x, @add(), y, sub()
	int y; 
	@Override
	void add() { System.out.println("BBB"); }
	void sub() { System.out.println("subsub"); }
}

public class Test122 {
	public static void main(String[] args) {

		// Object는 최상위 클래스로 모든타입의 객체를 담을 수 있다.(다형성) 
		Object obj = new BClass(); 
		//Object obj2 = new AClass(); 
		//Object obj3 = new String(); 
		//Object obj4 = new Scanner(System.in);  
		
		// Object 변수에 담긴 객체는 Object가 아는 11개의 메서밖에 사용못함 
		// Object 타입의 변수에 담긴 객체의 기능을 온전히 사용하려면 
		// 맞는 타입으로 형변환해서 사용 
		BClass b = (BClass)obj; // obj가 실제 들고있는 객체와 같은타입에 변수에 다시 담기
		b.add();
		AClass a = (AClass)obj; //  AClass가 아는만큼만 사용가능 x, @add() 
		
		
		
		AClass aaa = new AClass(); 
		Object o = aaa; 
		BClass bbb = (BClass)o; // 안된다!!! 부모는 자식변수에 못담는다! 
		//bbb.add();
		
		
		
		
		
		
		
		
		
	}
}
