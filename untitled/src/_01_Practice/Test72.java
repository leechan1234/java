package _01_Practice;

import java.util.Scanner;

/*
	TvEx 기능 구현 (필요한 변수와 메서드 만들기) 
	v1. 채널 = 배열[10] 생성후 랜덤값 10개 생성후 배열에 담아 낮은값으로 정렬 
	v2. 채널(Up, Down) = 배열의 현재 위치에서 증감 
	v3. 채널값을 입력받아 변경 (입력한 채널이 없는경우 변경 안되게) 
	v4. 볼륨(Up, Down) = 볼륨은 0 ~ 10까지 증감 
	v5. 볼륨 음소거 기능 
	v6. Tv 현재 상태 출력 기능 =  메서드 호출시 Tv상태 출력(전원, 채널, 볼륨) 
	7. 전원이 꺼져 있는경우 모든 기능 동작 안함 
*/
class TvEx {
	boolean power = false;
	int[] channel = new int[10]; 
	int chIdx = 0; // 현재 보고있는 채널배열의 index 저장 
	int vol = 0; 
	
	void onOff() { // 전원 on/off
		power = !power; 
	}
	
	void printStatus() { // #6
		System.out.println("----------------------------");
		System.out.println("전원 : " + (power?"ON":"OFF"));
		System.out.println("채널 : " + channel[chIdx]);
		System.out.println("볼륨 : " + vol);
		System.out.println("----------------------------");
	}
	void mute() { // #5
		if(power) {
			vol = 0; 
		}
	}
	// #4
	void volUp() { 
		if(power) {
			if(vol < 10) vol++; 			
		}
	}
	void volDown() {
		if(power) {
			if(vol > 0) vol--;
		}
	}
	// #1 : 채널 세팅 
	void setChannel() {
		if(power) { // 전원이 켜있어야 동작 
			// 랜덤 10개 담고 (중복처리)
			for(int i = 0; i < channel.length; i++) {
				channel[i] = (int)(Math.random() * 100) + 1; //  1 ~ 100 사이 랜덤 
				// 중복 처리 
				for(int j = 0; j < i; j++) { //j는 첫번째방부터 i의 이전방까지 반복
					if(channel[i] == channel[j]) { // j가 i번째값이랑 동일하면 
						i--; // i를 미리 한번빼서 다시 위로 증감되면 같은 위치에 
						 		// 랜덤 다시 뽑도록함 
						break; // 같은 수를 찾았으니 중복 검사 for문 종료시킴 
					}
				}
			}
			// 오름차순으로 정렬 
			for(int i = 0; i < channel.length-1; i++) {
				for(int j = i+1; j < channel.length; j++) {
					if(channel[i] > channel[j]) {
						int temp = channel[i]; 
						channel[i] = channel[j]; 
						channel[j] = temp;
					}
				}
			}// 정렬 for 끝 
			
			// 확인용 출력 
			System.out.print("channel : ");
			for(int i : channel) {
				System.out.print(i + " ");
			}
			System.out.println();
		}else {
			System.out.println("전원을 먼저 켜주세요");
		}
	}// setChannel() 
	
	// 나머지 아래 메서드들도 내용물 if(power){} 로 묶기 
	// #2
	void chUp() {
		chIdx++; 
		if(chIdx == 10) chIdx = 0; // idx 10은 없다 -> 첫번째 방으로 변경 
	}
	void chDown() {
		chIdx--; 
		if(chIdx == -1) chIdx = 9; // idx -1은 없다 -> 맨 뒷방으로 변경 
	}
	// #3 
	void changeCh(int ch) {
		for(int i = 0; i < channel.length; i++) {
			if(channel[i] == ch) {
				chIdx = i; 
			}
		}
	}
	
}// Tv

public class Test72 {
	public static void main(String[] args) {

		TvEx tv = new TvEx(); 
		tv.onOff(); // 전원키기 
		tv.setChannel(); // 채널세팅 
		tv.chDown(); 
		tv.printStatus();
		tv.volUp();
		tv.volUp();
		tv.chUp();
		tv.printStatus();
		tv.chUp();
		tv.printStatus();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("채널 입력 : ");
		int ch = Integer.parseInt(sc.nextLine());
		tv.changeCh(ch);
		tv.printStatus();
		
		
	}
}









