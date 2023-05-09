package day16;

class Unit {
	int x, y; 		// 일반 기본형 변수 
	Direction dir;  // 열거형 값 저장할 변수 
	
	void initDir() { // 이 메서드 호출하면 dir 값을 EAST로 리셋
		dir = Direction.EAST;
	}
}

public class EnumEx01 {
	public static void main(String[] args) {
		
		Unit unit = new Unit(); 
		unit.x = 10; 
		unit.y = 20; 
		unit.dir = Direction.WEST;
		
		
	}
}
