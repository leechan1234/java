package day14;

/*
	v int 타입의 width(가로)와 height(세로) 필드를 가지는 Rect 클래스를 작성하고, 
	면적이 같으면 두 Rect가 같은 것으로 판별하는 equals()를 작성하세요.(오버라이딩)
	v 생성자에서는 가로,세로 값을 받아 width, height 필드를 초기화 하세요. 
*/
class Rect {
	int width;
	int height;
	Rect(int width, int height) {
		this.width = width; 
		this.height = height;
	}// 생성자
	@Override
	public boolean equals(Object obj) { // <= Rect b 
		Rect objRect = (Rect)obj; // <= Rect b
		// equals를 부르는 객체의 w * h  == obj의 w*h  같으면 true 
		if(width * height == objRect.width * objRect.height) {
			return true;
		}else {
			return false;
		}
		
	}//equals
	
}// Rect class 

public class ApiEx03 {
	public static void main(String[] args) {

		Rect a = new Rect(4, 5);
		Rect b = new Rect(5, 4);
		Rect c = new Rect(3, 4);
		if(a.equals(b)) System.out.println("a is equals to b"); // 출력 
		if(a.equals(c)) System.out.println("a is equals to c"); // 출력X
		if(b.equals(c)) System.out.println("b is equals to c"); // 출력X
		
		
	}//main
}// 클래스 
