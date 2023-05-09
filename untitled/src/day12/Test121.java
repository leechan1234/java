package day12;

class Person { }
class Student extends Person { }
class Researcher extends Person { }
class Professor extends Researcher { }

public class Test121 {
	
	static void print(Person p) {
		if(p instanceof Person) System.out.println("Person");
		if(p instanceof Student) System.out.println("Student");
		if(p instanceof Researcher) System.out.println("Researcher");
		if(p instanceof Professor) System.out.println("Professor");
	}
	public static void main(String[] args) {

		Student s = new Student(); 
		System.out.print("Student --> ");
		print(s); 
		System.out.print("Researcher --> ");
		print(new Researcher());
		System.out.print("Professor --> ");
		print(new Professor());
		
	}
}
