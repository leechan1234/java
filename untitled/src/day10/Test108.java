package day10;

import java.util.Scanner;

/*
	n명이 참가하는 끝말잇기 게임을 만들어보자 
	처음단어는 "자동차"이다. n명의 참가자들은 순서대로 자신의 단어를 입력하면된다. 
	끝말잇기에서 틀리면 게임오버 -> 진사람 이름 출력하고 프로그램 종료. 
	아래 지문을 참고하여 WordGameApp 클래스와 각 선수를 나타내는 Player 클래스 작성하세요. 
	
	WordGameApp : 게임을 전체적으로 진행하는 run() 메서드, 
				run() 에서 입력한 플레이어의 수 만큼 Player 배열객체 생성하여 게임진행
	Player : 플레이어 이름저장할 변수, 단어를 입력받는 getWordFromUser() 메서드, 
			끝말잇기 성공여부와 게임계속할지 판별하는 checkSuccess() 메서드 작성 
	#tip : 문자열에서 첫번째 문자 알아내는 방법 
			String word = "자동차"; 
			char firstChar = word.charAt(0); ==> '자' 
	#tip : 문자열의 길이를 알아내는 방법. 
			String의 length() 메서드 활용 
*/
class Player {
	String name; // 플레이어 이름 저장 
	//단어를 입력받는 메서드 
	String getWordFromUser(Scanner sc) {
		System.out.print(name + ">> "); 
		String inputWord = sc.nextLine(); 
		return inputWord;
	}
	//끝말잇기 성공여부와 게임계속할지 판별해서 결과 돌려주기 
	boolean checkSuccess(String lastWord, String newWord) { // 이전단어와 지금입력한단어 필요 
		boolean result = false;
		// 이전단어 끝글자와, 지금 단어 첫글자가 동일한지 비교 
		// 끝 글자는 문자열의 마지막 인덱스 번호가 필요함 
		int lastWordLen = lastWord.length(); // 이전단어의 길이 구하기
		int lastWordIndex = lastWordLen - 1; // 길이 -1이 마지막 인덱스번호 
		char lastChar = lastWord.charAt(lastWordIndex);  // 이전단어 끝글자 
		char firstChar = newWord.charAt(0); // 지금단어 첫글자 
		if(lastChar == firstChar) {
			result = true; 
		}
		return result;
	}
}
class WordGameApp {
	Scanner sc = new Scanner(System.in);	
	Player[] players; // setGame(), run() 두군데에서 모두 사용해야함.
	int n;  // 몇명이 플레이할것인지 저장할 변수 미리 선언 
	
	void setGame() {
		// 몇명이 플레이할것인지 물어보기 -> 입력받기 
		System.out.print("몇명이 플레이하시나요?");
		n = Integer.parseInt(sc.nextLine());
		// 입력받은 플레이어 수만큼 Player 객체 배열 생성 
		players = new Player[n]; //플레이어수만큼 배열(빈방)만들기 
		// 배열 빈방에 player 객체 생성해서 체워주기 
		for(int i = 0; i < players.length; i++) {
			players[i] = new Player();  // 플레이어 생성해 빈방에 체우기 
			// 각 플레이어 이름 입력받아 저장 (players 배열안의 각각의 Player 객체안 name 변수에 저장) 
			System.out.print("이름 >> ");
			String name = sc.nextLine(); 
			players[i].name = name; 
		}
	}
	
	void run() {
		System.out.println("끝말잇기 게임 시작!!");
		setGame();
		
		// 플레이 시작 
		String lastWord = "자동차";
		System.out.println("시작 단어는 " + lastWord + "입니다.");
		//	한명씩 돌아가면서 게임이 진행 --> 계속 반복 틀릴때 까지 --> 무한반복 
		int idx = 0;  // while(true)는 인덱스번호가 없으니 직접 만들자 
		while(true) {
			//	이전 단어의 끝과 동일한 단어 입력 --> Player의 getWordFromUser() 호출해서 입력받아오기 
			String newWord = players[idx].getWordFromUser(sc);
			//	입력한 단어 맞는지 체크 --> Player의 checkSuccess() 호출해서 체크 해오기 
			//  이전단어와 지금 입력한 단어를 던져줘야함 
			boolean result = players[idx].checkSuccess(lastWord, newWord); // 검사 결과 가져와 
			//  위에서 가져온 검사 결과로 판단 
			if(!result) {
				//	틀리면 게임 중지하고 이름 출력 (종료시점)
				System.out.println("게임오버.... " + players[idx].name + "님이 졌습니다.");
				break; 
			}
			// 	맞으면 다음사람
			lastWord = newWord; // 다음사람을 위해 lastWord를 newWord로 바꿔주기 
			idx++; 
			idx %= n; // if(idx == n) idx = 0; 인덱스번호가 마지막방+1이되면 다시 0으로 바꿔야됨
		}
		
		sc.close();
	}// main으로 돌아가 프로그램 완전종료 
}
public class Test108 {
	public static void main(String[] args) {
			
		WordGameApp game = new WordGameApp(); 
		game.run(); 
		
		
	}
}
