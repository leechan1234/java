package day15;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ApiEx16 {
	public static void main(String[] args) {

		Date day = new Date(); // 현재시간으로 
		System.out.println(day);
		System.out.println(day.getMonth());  // 0 ~ 11월 
		
		// 원하는 패턴으로 날짜 출력하고 싶다. 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy년 MM월 dd일입니다.");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy/MM/dd EEE HH:mm:ss");
		
		System.out.println(sdf.format(day));
		System.out.println(sdf1.format(day));
		System.out.println(sdf2.format(day));
		
		
		// 날짜형태의 문자열 -> 날짜 객체 변환 
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		String dateStr = "2023/05/02"; // 날짜패턴과 동일한 문자열 
		
		try {
			
			// 패턴에 맞는 문자열 -> Date 객체로 변환 : 예외처리 필수 
			Date result = df.parse(dateStr);
			System.out.println(result);
			
			// Date -> Calendar 
			Calendar cal = Calendar.getInstance(); 
			cal.setTime(result); // setTime에 Date객체 넣으면 됨. 
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
