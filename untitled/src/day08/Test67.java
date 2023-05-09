package day08;
// Tv 클래스 
// 값저장 : 채널, 볼륨, 전원 
// 기능 : 전원on/off, 볼륨 조절, 채널 조정, 채널 입력  
class Tv {
	int ch = 1, vol = 0;
	boolean power = false;
	
	void onOff() {
		power = !power;
	}
	void chUp() {
		ch++; 
	}
	void chDown() {
		ch--; 
	}
	void volUp() {
		vol++; 
	}
	void volDown() {
		vol--; 
	}
	void changeCh(int num) {
		ch = num;
	}
	// chDown(), volUp(), volDown()....
}

public class Test67 {
	public static void main(String[] args) {

		Tv tv = new Tv();
		System.out.println(tv.power);
		tv.onOff();
		System.out.println(tv.power);
		tv.changeCh(20);
		System.out.println(tv.ch);
		
		
	}
}








