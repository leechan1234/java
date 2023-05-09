package day10;

import java.util.Scanner;

/*
	하루 할일을 표현하는 클래스 Day는 아래와 같다. (변경X, 그대로 사용) 
	한달의 할일을 표현하는 MonthSchedule 클래스를 작성하세요. 
	MonthSchedule 클래스에는 Day 객체 배열과 적절한 변수,메서드를 작성하고
	실행 예시처럼 입력,보기,끝내기등 3개의 기능을 작성하세요. 
	(생성자, input(), view(), finish(), run() 메서드 만들기) 
	- 콘솔 실행예시 :
		이번달 스케쥴 관리 프로그램. 
		할일(입력:1, 보기:2, 끝내기:3) >>  1
		날짜(1~30) >>  1 
		할일 >>  자바공부 
		
		할일(입력:1, 보기:2, 끝내기:3) >>  1
		날짜(1~30) >>  3 
		할일 >>  영화보기
		
		할일(입력:1, 보기:2, 끝내기:3) >>  2
		날짜(1~30) >>  1 
		1일의 할 일은 자바공부입니다.
		
		할일(입력:1, 보기:2, 끝내기:3) >>  3
		프로그램 종료. 
*/
class Day {
	private String work; 
	public void setWork(String work) { this.work = work; }
	public String getWord() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다");
		else System.out.println(work + "입니다.");
	}
}

class MonthSchedule {
	// 여러메서드에서 사용할 변수들 인스턴스로 만듬 
	Day[] days; // Day객체들 저장할 변수 
	int dayNum; // 현재 몇일짜리 달력인지 (객체 생성시 몇일인지 준 값) 
	Scanner sc = new Scanner(System.in);
	
	MonthSchedule(int n){
		// 초기 세팅 
		dayNum = n; 
		days = new Day[n]; // 30개 빈방 만들기 
		for(int i = 0; i < n; i++) {
			days[i] = new Day(); // 각 방안에 Day 객체 만들어 저장 
		}
	}
	void input() { // 입력 선택시 실행 
		System.out.print("날짜(1~" + dayNum + ") >> ");
		int inputDay = Integer.parseInt(sc.nextLine());
		System.out.print("할일 >> ");
		String inputWork = sc.nextLine();
		days[inputDay-1].setWork(inputWork);
	}
	void view() { // 보기 선택시 실행 
		System.out.print("날짜(1~" + dayNum + ") >> ");
		int inputDay = Integer.parseInt(sc.nextLine());
		System.out.print(inputDay + "일의 할 일은 ");
		days[inputDay-1].show();
	}
	void finish() { // 끝내기 선택시 실행 
		System.out.println("프로그램 종료.");
		sc.close();
	}
	void run() {
		
		// 전체 프로그램 진행 
		System.out.println("이번달 스케쥴 관리 프로그램.");
		
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
			int sel = Integer.parseInt(sc.nextLine());
			if(sel == 1) {
				input();
			}else if(sel == 2) {
				view();
			}else if(sel == 3) {
				finish();
				break; // while문 종료 
			}else {
				System.out.println("메뉴번호 잘못 입력하셨습니다.");
			}
		}
		
		
	}
}
public class Test109 {
	public static void main(String[] args) {

		// 4월 한달의 스케쥴
		MonthSchedule april = new MonthSchedule(30); // 4월은 30일
		april.run(); 
		
	}
}
