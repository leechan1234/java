package day09;

import java.util.Scanner;

public class Test84 {

	double d; 
	
	// 생성자 
	Test84(){
		d = Math.random();
	}
	Test84(double val){
		d = val;
	}
	
	
	public static void main(String[] args) {

		Test84 t = new Test84(); 
		System.out.println(t.d);
		Test84 t1 = new Test84(3.14); 
		System.out.println(t1.d);
		
		Scanner sc = new Scanner(System.in); 
		
		
		
	}
}
