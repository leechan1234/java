package day10;

import java.util.Scanner;

/*
	콘서트 예약프로그램 
	- 공연은 하루에 한번
	- 좌석은 S석, A석, B석으로 나뉘며, 각각 10개의 좌석이 있다. 
	- 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기"가 있고 번호로 입력받는다. 
	- 예약은 한번에 한자리만 가능하고, 좌석타입, 예약자 이름, 좌석번호를 입력받아 예약한다. 
	- 조회는 모든 좌석을 출력한다. 
	- 취소는 예약자의 이름을 입력받아 취소한다. 
	- 없는 이름, 없는 좌석 번호, 없는 메뉴등에 대해서 
	  오류 메세지를 출력하고 사용자가 다시 시도하도록 해본다. 
	  
	# 실행 예시 #
	자바콘서트홀 예약시스템입니다. 
	예약:1, 조회:2, 취소:3, 끝내기:4 >>  1
	좌석구분 S(1), A(2), B(3) >>  1
	S >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
	이름 >>  피카츄
	번호 >>  1
	<<예약 완료>>
	
	예약:1, 조회:2, 취소:3, 끝내기:4 >>  1
	좌석구분 S(1), A(2), B(3) >>  2
	A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
	이름 >>  꼬북이
	번호 >>  5
	<<예약 완료>>
	
	예약:1, 조회:2, 취소:3, 끝내기:4 >>  2
	S >> 피카츄 ___ ___ ___ ___ ___ ___ ___ ___ ___
	A >> ___ ___ ___ ___ 꼬북이 ___ ___ ___ ___ ___
	B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
	<<조회 완료>>
	
	예약:1, 조회:2, 취소:3, 끝내기:4 >>  3
	좌석구분 S(1), A(2), B(3) >>  2
	A >> ___ ___ ___ ___ 꼬북이 ___ ___ ___ ___ ___
	이름 >>  꼬북이
	<<취소 완료>>
	
	예약:1, 조회:2, 취소:3, 끝내기:4 >>  2
	S >> 피카츄 ___ ___ ___ ___ ___ ___ ___ ___ ___
	A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
	B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
	<<조회 완료>>
	
	예약:1, 조회:2, 취소:3, 끝내기:4 >>  4
	<<예약 프로그램 종료>>
*/
class Seat {
	private String name = "___";
	public void setName(String name) { this.name = name;  }
	public String getName() { return name; }
}
class Booking {
	final int SEAT_NUM = 10;
	private Seat[] sSeat;
	private Seat[] aSeat;
	private Seat[] bSeat;
	Scanner sc; 
	
	public Booking() {
		sc = new Scanner(System.in);
		// 좌석 세팅 
		sSeat = new Seat[SEAT_NUM];
		aSeat = new Seat[SEAT_NUM];
		bSeat = new Seat[SEAT_NUM];
		for(int i = 0; i < SEAT_NUM; i++) {
			sSeat[i] = new Seat(); 
			aSeat[i] = new Seat(); 
			bSeat[i] = new Seat(); 
		}
	}
	void book() { // 예약 처리 기능 
		System.out.print("좌석구분 S(1), A(2), B(3) >> ");
		int seatType = Integer.parseInt(sc.nextLine());
		// 선택한 좌석 현 상황 출력
		printOne(seatType); 
		// 이름과 좌석번호 입력받기
		System.out.print("이름 >> ");
		String name = sc.nextLine(); 
		System.out.println("번호 >> ");
		int seatNum = Integer.parseInt(sc.nextLine());
		// 배열에 저장 
		if(seatType == 1) sSeat[seatNum-1].setName(name);
		else if(seatType == 2) aSeat[seatNum-1].setName(name);
		else if(seatType == 3) bSeat[seatNum-1].setName(name);
		System.out.println("<<예약 완료>>");
	}
	void printOne(int seatType) {
		switch(seatType) {
		case 1:
			System.out.print("S >> ");
			for(int i = 0; i < SEAT_NUM; i++) {
				System.out.print(sSeat[i].getName() + "  ");
			}
			System.out.println();
			break;
		case 2:
			System.out.print("A >> ");
			for(int i = 0; i < SEAT_NUM; i++) {
				System.out.print(aSeat[i].getName() + "  ");
			}
			System.out.println();
			break;
		case 3:
			System.out.print("B >> ");
			for(int i = 0; i < SEAT_NUM; i++) {
				System.out.print(bSeat[i].getName() + "  ");
			}
			System.out.println();
			break;
		default:
			System.out.println("좌석 구분을 잘못 누르셨습니다. 다시 시도해주세요.");
			book(); 
		}
	}
	void show() { // 조회 기능
		printOne(1);
		printOne(2);
		printOne(3);
		System.out.println("<<조회 완료>>");
	}
	void cancel() { // 취소 처리 기능
		System.out.print("좌석구분 S(1), A(2), B(3) >> ");
		int seatType = Integer.parseInt(sc.nextLine());
		// 선택한 좌석 현 상황 출력
		printOne(seatType); 
		// 이름 입력받기
		System.out.print("이름 >> ");
		String name = sc.nextLine(); 
		// 취소 처리 == 입력받은 이름 있는 좌석의 이름을 ___ 로 변경 
		if(seatType == 1) { 
			for(int i = 0; i < SEAT_NUM; i++) {
				if(sSeat[i].getName().equals(name)) sSeat[i].setName("___");
			}
		}else if(seatType == 2) { 
			for(int i = 0; i < SEAT_NUM; i++) {
				if(aSeat[i].getName().equals(name)) aSeat[i].setName("___");
			}
		}else if(seatType == 3) { 
			for(int i = 0; i < SEAT_NUM; i++) {
				if(bSeat[i].getName().equals(name)) bSeat[i].setName("___");
			}
		}
		System.out.println("<<취소 완료>>");
	}
	void finish() { // 끝내기
		System.out.println("<<예약 프로그램 종료>>");
		sc.close();
	}
	// 예약시스템 시작지점
	void run() { 
		System.out.println("자바콘서트홀 예약시스템입니다.");
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
			int sel = Integer.parseInt(sc.nextLine());
			if(sel == 1) { book(); }
			else if(sel == 2) { show(); }
			else if(sel == 3) { cancel(); }
			else if(sel == 4) { finish(); break; }
			else { 
				System.out.println("메뉴 번호 잘못 입력하셨습니다. 다시 시도해주세요"); 
			}
		}
		
	}
}
public class Test110 {
	public static void main(String[] args) {
		Booking book = new Booking();
		book.run();
	}
}
