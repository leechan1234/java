package day15;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ApiEx17 {
	public static void main(String[] args) {

		// D-Day 계산기 만들기 
		// 날짜를 원하는 포맷으로 입력받아 
		// 오늘부터 해당 날짜까지 몇일 남았는지 계산하여 출력하기 
		Scanner sc = new Scanner(System.in);
		
		// 날짜 입력받기 
		System.out.println("날짜 입력(예:2023-05-01)>> ");
		String input = sc.nextLine();  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = null;
		Date today = new Date(); 
		
		// 시간 변환 
		try {
			date = sdf.parse(input);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 시간차이 
		final int[] TIME_UNIT = {86400, 3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"일", "시간", "분", "초"};

		long diff = Math.abs(date.getTime() - today.getTime()) / 1000; 
		System.out.println(diff);
		
		String tmp = "";
		for(int i = 0; i < TIME_UNIT.length; i++) {
			tmp += diff/TIME_UNIT[i] + TIME_UNIT_NAME[i];
			diff %= TIME_UNIT[i];
		}
		
		System.out.println("D-Day : " + tmp);
		
		
		
		
	}
}
