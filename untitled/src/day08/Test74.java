package day08;

class MyCard {
	int num; 
	boolean isGwang;
}

class Student {
	String name; 
	int age; 
}

class MobilePhone {
	double width; 
	double height;
	double depth; 
	String color; 
	String brand;
}
class GlobalStudent {
	String name;
	String color; 
}

public class Test74 {
	public static void main(String[] args) {

		GlobalStudent jongho = new GlobalStudent(); 
		jongho.name = "이종호";
		jongho.color = "black";
		
		
		MobilePhone mp = new MobilePhone(); 
		mp.width = 8.9; 
		mp.height = 13.5; 
		mp.depth = 0.7; 
		mp.color = "pink";
		mp.brand = "iPhone";
		
		
		Student stu = new Student(); 
		stu.name = "학생1";
		stu.age = 20; 
		System.out.println(stu.name);
		System.out.println(stu.age);
		
		MyCard card = new MyCard(); 
		card.num = 3; 
		card.isGwang = false;
		
	}
}
