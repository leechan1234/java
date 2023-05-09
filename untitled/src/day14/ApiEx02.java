package day14;

class Point {
	int x, y; 
	Point(int x, int y){
		this.x = x; this.y = y; 
	}
	// Object로부터 물려받은 메서드 오버라이딩 
	// 주소값 비교가 아닌, Point의 x,y 좌표값 비교해서 
	// 동일하면 true, 다르면 false 
	@Override
	public boolean equals(Object obj) {
		Point pobj = (Point)obj;
		if(x == pobj.x && y == pobj.y) {
			return true;
		}else {
			return false;
		}
	}
}
public class ApiEx02 {
	public static void main(String[] args) {

		Point a = new Point(1, 3);
		Point b = new Point(1, 3);
		Point c = a; 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		if(a == b) System.out.println("a == b"); // 주소값 비교 
		// Point equals 오버라딩 
		if(a.equals(b)) {
			System.out.println("같은 점을 가르킨다");
		}
		
		
		
		
		
		// 객체사이 == 연산자로 비교하면, 레퍼런스 비교(주소값 비교)가 됨. 
		/*
		 * if(a == b) { System.out.println("a == b"); } if(a == c) {
		 * System.out.println("a == c"); }
		 
		
		// Object가 물려준 형태로 객체 끼리 비교하면, 레퍼런스 비교가 됨.
		if(a.equals(b)) {
			System.out.println("a equals b");
		}
		if(a.equals(c)) {
			System.out.println("a equals c");
		}
		System.out.println("---------");
		
		// equals 오버라이딩된 예시 
		String x = new String("hello");
		String y = new String("hello");
		if(x == y) {
			System.out.println("x == y");
		}
		if(x.equals(y)) { // String이 주소가 아닌 문자열 비교로 오버라이딩함. 
			System.out.println("x equals y");
		}*/
		/*
		String str1 = "test";
		String str2 = "test";
		if(str1 == str2) {
			System.out.println("str1 == str2");
		}
		if(str1.equals(str2)) {
			System.out.println("str1 equals str2");
		}*/
		
		
		
		
		
		
		
		
	}
}
