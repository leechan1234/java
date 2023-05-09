package day12;
/* 상속문제
	#1.
	main메서드 #1과 아래 실행결과를 참고하여 TvClass클래스를 상속받은 
	ColorTV클래스를 작성하세요.
	실행결과 : 32인치 1024컬러
	
	#2. 
	위 #1 문제를 푼 후, main메서드 #2 와 아래 실행결과를 참고하여 
	ColorTV클래스를 상속받는 IPTV클래스를 작성하세요. 
	실행결과 : 나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
*/
class TvClass {
	private int size;
	public TvClass(int size) { this.size = size; }
	protected int getSize() { return size; }
}
class ColorTV extends TvClass { // size, color, getSize()
	int color; 
	ColorTV(int size, int color) {
		super(size); 
		this.color = color;
	}
	void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
}

class IPTV extends ColorTV { // size, color, getSize(), printProperty(); 
	String ip; 
	IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	@Override
	void printProperty() {
		System.out.println("나의 IPTV는 "+ ip + "주소의 " + getSize() + "인치 "+ color +"컬러");
	}
}

public class Test128 {
	public static void main(String[] args) {

		//#1. 
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		//#2. 
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
		
	}
}
