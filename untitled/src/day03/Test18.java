package day03;

public class Test18 {
	public static void main(String[] args) {

		int a = 20; 
		if(a-10 > 10) {
			System.out.println("10보다 크다");
		}
		
		int score = 60; 
		// 문제: 점수(score값)가 60점 이상이면 "합격" 출력, 
		//  	아니면 "불합격" 출력 
		if(score >= 60) {
			System.out.println("합격");
		}
		if(score < 60) {
			System.out.println("불합격");
		}
		
		//System.out.println(score >= 60? "합격" : "불합격");
		
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		
	}
}
