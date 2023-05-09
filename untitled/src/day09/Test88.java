package day09;

class Person {
	String name; 
	int age; 
	String address;
	String nickname; 
	String jumin; 
	int height; 
	
	
	void setField(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	
	Person getSelf() {
		return this;
	}
	
}
public class Test88 {
	
	int x = 10; 
	void add(int x) {
		//x = x;	// 같은 이름의 변수가 있으면 지역이 우선순위가 더 높다.  
		this.x = x; // this는 인스턴스를 가르킴. 
	}
	
	public static void main(String[] args) {

		
		Person p = new Person(); 
		Person p2 = new Person(); 
		System.out.println(p);
		Person me = p.getSelf();
		System.out.println(me);
		System.out.println(p2);
		
		
		
		
//		Test88 t = new Test88();
//		t.add(10000);
//		System.out.println(t.x);
		
	}
}
