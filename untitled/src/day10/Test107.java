package day10;
/*
	직사각형을 표현하는 Rectangle 클래스를 작성하세요. 
	- int타입의 x, y, width, height 변수 : 사각형을 구성하는 점과 크기 정보
		x,y는 사각형의 왼쪽 위를 말함. x값은 오른쪽으로 늘어나고, y는 밑으로 늘어난다.
		width는 사각형의 가로, height는 사각형의 세로 사이즈이다. 
	- x, y, width, height값을 매개변수로 받아 필드를 초기화 하는 생성자 
	- int squareArea() : 사각형 너비를 int로 리턴해주는 메서드 
	- boolean contains(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true리턴 
	- main 주석해제 후 실행된 콘솔 출력결과 :
		(2,2)에서 크키가 8x7인사각형
		b의 면적은 36
		c는 a를 포함합니다.
*/
class Rectangle {
	int x, y; 
	int width, height; 
	Rectangle(int x, int y, int width, int height){
		this.x = x; this.y = y; this.width = width; this.height = height; 
	}
	int squareArea() {
		return width * height; 
	}
	boolean contains(Rectangle r) {
		boolean result = false;
		if(x < r.x && y < r.y && (x+width) > (r.x + r.width) && (y+height) > (r.y + r.height)) {
			result = true;
		}
		return result;
	}
	void show() {
		System.out.println("("+ x +","+ y +")에서 크키가 "+ width +"x"+ height +"인사각형");
	}
}
public class Test107 {
	public static void main(String[] args) {
		// 주석해제해서 실행(작성완료된것임) 
		
		Rectangle a = new Rectangle(2, 2, 8, 7);
		Rectangle b = new Rectangle(5, 5, 6, 6);
		Rectangle c = new Rectangle(1, 1, 10, 10);
		
		a.show(); 
		System.out.println("b의 면적은 " + b.squareArea());
		if(c.contains(a)) System.out.println("c는 a를 포함합니다."); // 참
		if(c.contains(b)) System.out.println("c는 b를 포함합니다."); // 거짓 
		
		
	}
}
