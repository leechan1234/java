package day15;

import java.util.Calendar;

public class ApiEx14 {
	public static void main(String[] args) {

		final String[] YOIL = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		Calendar today = Calendar.getInstance(); 
		Calendar vacation = Calendar.getInstance(); 
		
		// 날짜 세팅 
		vacation.set(2023, 4, 13, 0, 0, 0); // 2023/5/13 토 
		System.out.println(vacation.get(Calendar.YEAR));
		System.out.println(vacation.get(Calendar.MONTH) + 1);
		System.out.println(vacation.get(Calendar.DATE));
		System.out.println(YOIL[vacation.get(Calendar.DAY_OF_WEEK)] + "요일");
		System.out.println(vacation.get(Calendar.HOUR));
		System.out.println(vacation.get(Calendar.MINUTE));
		System.out.println(vacation.get(Calendar.SECOND));
		
		// 시간차이 
		final int[] TIME_UNIT = {86400, 3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"일", "시간", "분", "초"};
		
		long difference 
		= Math.abs(today.getTimeInMillis() - vacation.getTimeInMillis()) / 1000;
		System.out.println(difference + "초");
		
		
		String tmp = "";
		for(int i = 0; i < TIME_UNIT.length; i++) {
			tmp += difference/TIME_UNIT[i] + TIME_UNIT_NAME[i];
			difference %= TIME_UNIT[i];
		}
		
		System.out.println("일시분초로 변환 : " + tmp);
		
		
		
		
		
		
		
		
	}
}
