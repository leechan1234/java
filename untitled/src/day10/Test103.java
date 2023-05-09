package day10;
// 상속을 이용하여 아래 클래스들을 간결한 구조로 변경해보세요. 
class Pen {
	private int amount; 
	public int getAmount() { return amount; }
	public void setAmount(int amount) { this.amount = amount; }
}
class SharpPencil extends Pen{ // width, amount, getA(),setA()
	private int width; 		// 샤프의 굵기
}
class BallPen extends Pen{ // color, getC(), setC(), amount, getA(), setA() 
	private String color;   // 볼펜의 색
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
}
class FountainPen extends BallPen{ // refill(), color, getC(), setC(), amount, getA(), setA()  
	public void refill(int n) { setAmount(n); }
}
public class Test103 {
	public static void main(String[] args) {

		
		
		
		
		
		
	}
}
