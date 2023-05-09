package day08;

class Ex01 {
	String str = "Hello Java";
	int year = 2023; 
	
	void printStr() {
		System.out.println(str);
	}
	void printYear() {
		System.out.println(year);
	}
}

class Ex02 {
	int a; 
	boolean isPlay;
	double d;
	
	void setA(int num) { // 외부에서 전달해주는 값을 변수에 대입시켜주는 작업 
		a = num; 
	}
	void setPlay(boolean play) {
		isPlay = play;
	}
	void setD(double db) {
		d = db; 
	}
}
class MobilePhone1 {
	String brand; 
	double width; 
	double height; 
	int weight; 
	void sendCall(String number) {
		System.out.println(number + "로 전화를 걸고 있습니다.");
	}
	void receiveCall() {
		System.out.println("전화 받기!");
	}
	void sendMessage() {
		System.out.println("문자 보내기 ");
	}
	void receiveMessage() {
		System.out.println("문자 받기");
	}
}

public class Test75 {
	public static void main(String[] args) {

		MobilePhone1 mp = new MobilePhone1(); 
		mp.brand = "samsung"; 
		mp.width = 10.5; 
		mp.height = 13.4; 
		mp.weight = 250; 
		
		System.out.println(mp.brand);
		mp.sendCall("010-1111-2222");
		
		Ex02 ex02 = new Ex02(); 
		ex02.setA(100);
		ex02.setPlay(true);
		ex02.setD(1.23);
		System.out.println(ex02.a);
		System.out.println(ex02.isPlay);
		System.out.println(ex02.d);
		
		
		
		Ex01 ex01 = new Ex01(); 
		ex01.printStr();
		ex01.printYear();
		
	}
}
