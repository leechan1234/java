package day17;

interface Toaster {
	public static final int SIZE = 10; // 모든곳에서 사용가능하고, 항상 10으로 사용
	public abstract void makeToast(); // 추상메서드 
	public abstract void preHeating(); 
	public abstract void setTimer(); 
}
class BrownToaster implements Toaster {
	@Override
	public void makeToast() {
		System.out.println("양쪽으로 고루 굽기");
	}
	@Override
	public void preHeating() {
		System.out.println("예열은 10초 5단계로");
	}
	@Override
	public void setTimer() {
		System.out.println("휠을 돌려서 타임 맞추기, 단계는 7단계");
	}
}
class SmegToaster implements Toaster {
	@Override
	public void makeToast() {
		System.out.println("한쪽면만 굽기");
	}
	@Override
	public void preHeating() {
		System.out.println("예열 5초 강하게");
	}
	@Override
	public void setTimer() {
		System.out.println("버튼식 5단계");
	}
}

public class InterEx01 {
	public static void main(String[] args) {

		Toaster t = new BrownToaster(); 
		t.preHeating();
		t.setTimer();
		t.makeToast();
		
		
		
	}
}
