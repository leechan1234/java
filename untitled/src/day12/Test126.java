package day12;

// 아래 추상 클래스 Calc를 상속받은 MyCalc 클래스를 구현하세요. 
abstract class Calc {
	public abstract int add(int a, int b);			// 두 정수의 합 리턴 
	public abstract int substract(int a, int b);	// 두 정수의 차 리턴
	public abstract double average(int[] a);		// 배열의 저장된 수들의 평균값 리턴
}
class MyCalc extends Calc { // 추상메서드 구현 == 오버라이딩 
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	@Override
	public int substract(int a, int b) {
		return a - b;
	}
	@Override
	public double average(int[] a) { // = {1,2,3,4,5};
		// 배열 요소의 총 합 구하기 
		int total = 0; 
		for(int i = 0; i < a.length; i++) {
			total += a[i];
		}
		// 배열의 길이만큼 나눠서 평균 구하여 리턴 (double타입 유의) 
		return (double)total / a.length;
	} 
}
public class Test126 {
	public static void main(String[] args) {

		// MyCalc 사용 코드 작성 
		MyCalc c = new MyCalc(); 
		System.out.println(c.add(10, 20));
		System.out.println(c.substract(100, 60));
		//int [] arr = {1,2,3,4,5};
		//System.out.println(c.average(arr));
		System.out.println(c.average(new int[] {1,2,3,4,5}));
		
		
	}
}
