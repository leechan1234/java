package day15;

import java.util.ArrayList;

class Point {
	private int x, y; 
	Point(int x, int y){
		this.x = x; this.y = y; 
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class ApiEx20 {
	public static void main(String[] args) {

		// 저장소 객체 생성 
		ArrayList<Point> arr = new ArrayList<Point>(); 
		
		// 저장하기 
		arr.add(new Point(2, 4));
		arr.add(new Point(-10, 50));
		arr.add(new Point(200, 100));
		
		Point p = new Point(3, 8);
		arr.add(p);
		
		System.out.println(arr);
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		
		
		
		
		
	}
}
