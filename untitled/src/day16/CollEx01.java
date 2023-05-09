package day16;


import java.util.HashMap;
import java.util.Scanner;

public class CollEx01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String,String> hashMap = new HashMap<String,String>();
		// 영한 사전 만들기 
		// HashMap을 이용하여 10개의 단어를 영어,한글의 쌍으로 저장하고 
		// 영어로 한글을 검색하는 프로그램을 만들어보세요.
		// 단, exit가 입력되면 프로그램 종료!

		while (true) {
			String user= scanner.nextLine();
			hashMap.put("apple", "사과");
			hashMap.put("banana", "바나나");
			hashMap.put("peach", "복숭아");
			String mean = hashMap.get(user);

		}






		
		
		
		
		
		
	}
}
