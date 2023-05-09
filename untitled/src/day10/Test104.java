package day10;
/*
	main 메서드를 실행했을때 예시와 같이 출력되도록 Tv 클래스를 작성하세요. 
	콘솔출력예 >> LG에서 만든 2023년형 50인치 TV
*/
class Tv {
	private String brand; 
	private int year; 
	private int size;
	
	Tv(String brand, int year, int size) {
		this.brand = brand; this.year = year; this.size = size;
	}
	
	public String getBrand() {
		return brand; 
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//....
	void show() {
		System.out.println(brand + "에서 만든 "+ year +"년형 "+ size +"인치 TV");
	}
	
}

public class Test104 {
	public static void main(String[] args) {

		Tv tv = new Tv("LG", 2023, 50);
		tv.show(); 
		
	}
}
