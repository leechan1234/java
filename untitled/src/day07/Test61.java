package day07;

// #1. 클래스 정의(선언) : 설계도 만들기 
class Person {
	// 속성 : 변수 
	String name = "피카츄"; 
	int age = 0; 
	// 기능 : 메서드 
	void eat() {
		System.out.println("배고프다 먹자!!!!!!");
	}
	void walk() {
		System.out.println("걸어가자~~~");
	}
}

public class Test61 {
	public static void main(String[] args) {

		// #2. 클래스를 이용해 객체 생성 
		Person p1 = new Person(); 
		
		// #3. 객체 사용 
		System.out.println(p1.age);
		System.out.println(p1.name);
		p1.walk();
		p1.eat();
		
		// p1이 가지고 있는 name변수에 이름 저장(수정) 
		p1.name = "홍길동";
		p1.age = 10; // p1이 가지고 있는 age 변수의 나이 저장(수정)
		
		System.out.println(p1.age);
		System.out.println(p1.name);
		
		System.out.println("-------------");
		
		Person p2 = new Person(); 
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		
		
		
	}
}
