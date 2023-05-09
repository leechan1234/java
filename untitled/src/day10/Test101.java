package day10;
// 캡슐화 
class Person {
	private String name; 
	private int age;
	
	//getter : 외부에서 name의 값을 가져다 사용할때 
	public String getName() {
		return name; 
	}
	//setter : 외부에서 값을 주면 그 값을 name에 저장할때 
	public void setName(String name) {
		this.name = name; 
	}
	public int getAge() {
		return age; 
	}
	public void setAge(int age) {
		if(age > 0 && age <= 120) { // 나이 입력값 검증하고 값 저장 
			this.age = age; 
		}
	}
}
public class Test101 {
	public static void main(String[] args) {
		Person p = new Person(); 
		//p.name = "pikachu";
		p.setName("pikachu");
		//p.age = 10; 
		p.setAge(10);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
	}
}

// 캡슐화 연습문제 : Person1 클래스 선언 
//			이름,나이, 혈액형, 키, 주소, 전화번호, 주민번호 에 해당하는 변수들과 
//			각 변수의 해당하는 get/set 메서드 만들기 







