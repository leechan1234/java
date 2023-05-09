package day11;
// 상속 - 접근제어자 
class Person {
	private int weight; 
	int age; 
	protected int height; 
	public String name; 
	public int getWeight() { return weight; }
	public void setWeight(int weight) { this.weight = weight; }
}
class Student extends Person {
	void set() { // 변수들의 값 저장 
		age = 30; 			//default : 같은 패키지
		name = "홍길동";	//public : 전체
		height = 190;		//protected : 같은 패키지 + 자식
		//weight = 100; 	// private : Person에서만 
		setWeight(100);
		System.out.println(getWeight());
	}
}
public class Test111 {
	public static void main(String[] args) {

		Student s = new Student(); 
		s.set();
		
		
	}
}
