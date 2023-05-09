package day14;

class A { }
public class ApiEx01 {
	public static void main(String[] args) {

		A a = new A(); 
		System.out.println("클래스 이름 : " + a.getClass());
		System.out.println("해시코드 : " + a.hashCode());
		System.out.println("객체 문자열 : " + a.toString());
		System.out.println(a.getClass().getName() + "@" + Integer.toHexString(a.hashCode()));
		
		
	}
}
