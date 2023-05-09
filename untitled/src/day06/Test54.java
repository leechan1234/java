package day06;

import java.util.Scanner;

/*
	* Up & Down 게임 *
	0 ~ 99 사이의 임의의 수를 받아 숨기고, 그 수를 맞추는 게임. 
	임의의 수보다 낮게 입력하면 "Up"출력, 높게 입력하면 "Down"출력하면서
	범위를 좁혀가며 숫자를 맞추는 게임입니다. 
	숫자를 맞추면, 게임을 반복하기 위해서 y/n 묻고, 
	n을 입력한 경우 프로그램 종료, 그렇지 않으면 게임 처음부터 다시 시작.  
	
	콘솔 실행 예) 
	숫자가 정해졌습니다. 맞춰 보세요. 
	0~99
	1 >>  55 (<-사용자 입력) 
	"Up"
	55~99
	2 >>  70
	"Up"
	70~99
	3 >>  85
	"Down"
	70~85
	4 >>  75
	"Up"
	75~85
	5 >>  77
	맞았습니다!
	게임을 다시 하시겠습니까? (y/n) >>   y
	숫자가 정해졌습니다. 맞춰 보세요. 
	0~99
	1 >>  30 
	"Up"
	30~99
	2 >>  45
	맞았습니다!
	게임을 다시 하시겠습니까? (y/n) >>   n
	게임 종료!!!
*/
public class Test54 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean play = true; 
		System.out.println("처음 시작!");
		
		while(play) { // 게임 전체를 반복시킬 while문 
			int num = (int)(Math.random() * 100); // 0 ~ 99 사이의 임의의 수를 받기
			int count = 1;  // 입력 회차 
			int guess = -1; // 입력한 값 저장할 변수 
			int low = 0; 	// 낮은 범위 
			int high = 99;  // 큰 범위
			
			
			System.out.println("숫자가 정해졌습니다. 맞춰 보세요. ");
			while(true) {
				// 먼저 맞았는지 체크 
				if(guess == num) {
					System.out.println("맞았습니다!");
					System.out.println("게임을 다시 하시겠습니까? (y/n) >> ");
					String answer = sc.nextLine(); 
					if(answer.equalsIgnoreCase("n")) {
						System.out.println("프로그램 종료!!");
						play = false;  // 전체 게임 종료 (바깥 while문 종료되게)
						break; // 안쪽 while문 종료 
					}else if(answer.equalsIgnoreCase("y")) {
						play = true;
						break; // 안쪽 while문 종료 
					}else {
						System.out.println("잘못 누르셨습니다.");
						continue; // 아래 코드 건너띄고, 안쪽 while문 처음으로 이동 
					}
					
				}
				
				// 범위 출력
				System.out.println(low + "~" + high);
				System.out.println(count + " >> ");
				// 숫자 입력받고 
				guess = Integer.parseInt(sc.nextLine());
				
				count++;  // 회차 늘리기
				// 결과 보여주고 (up,down) 
				if(guess < num) { // 작게 입력
					System.out.println("Up"); 
					low = guess; // 작은 범위를 입력한 수로 변경 
				}
				if(guess > num) { // 크게 입력
					System.out.println("Down"); 
					high = guess; // 큰 범위를 입력한 수로 변경 
				}
			}
			
		}//while(play) end
		
		System.out.println("완전 종료!!");
		
		
		
		
	}// main
}//class






