package day12;
// 매개변수의 다형성 
class Product {
	int price; 		// 제품 가격
	int point; 		// 제품 구매시 제공하는 포인트 
	Product(int price){
		this.price = price;
		this.point = (int)(price / 10.0);
	}
}
class Tv extends Product {
	// 부모가 매개변수있는 생성자를 갖고있어, 명시적으로 부모의 생성자 호출해야됨. 
	Tv() { 
		// 자식 생성자에서 부모 생성자 호출, 이때 price도 던져준다.
		super(100); 
	}
	@Override
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product {
	Computer() {
		super(200); 
	}
	@Override
	public String toString() {
		return "Computer";
	}
}
class Buyer {				// 구매자 (고객) 
	int money = 1000; 		// 고객 지갑
	int point = 0; 			// 고객 포인트 쌓는 곳 
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return; // 메서드 강제 종료!
		}
		money -= p.price; 
		point += p.point; 
		System.out.println(p + "를 구입하셨습니다.");
	}
}
public class Test123 {
	public static void main(String[] args) {

		// 하이마트 
		Tv tv = new Tv(); 
		System.out.println("tv : " + tv);
		System.out.println("tv : " + tv.toString());
		Computer com = new Computer(); 
		System.out.println("com : " + com);
		System.out.println("com : " + com.toString());
		
		System.out.println("하이마트에 오신걸 환영합니다.");
		Buyer b = new Buyer(); 
		b.buy(tv); 
		b.buy(com);
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 포인트는 " + b.point + "점입니다.");
		
		
		
		
	}
}
