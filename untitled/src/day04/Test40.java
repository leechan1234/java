package day04;

public class Test40 {
	public static void main(String[] args) {

		int star = 1; 
		boolean flag = true; // 별이 증가하는지 감소하는지 판별 (증=T, 감=F)
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			
			// 별 증감 시키기
			if(flag) { star++; } 
			else { star--; }
			
			if(star == 5) { // 별 다섯개 찍었을때
				flag = false; // false로 변경해 이제는 별이 감소되면서 반복되게
			}
			
			
			System.out.println();
		}
		
		System.out.println();
		
		
		// #10 
		for(int i = 0; i < 5; i++) {
			for(int j = 5-i; j > 1; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
