package day17;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ApiEx50 {
	public static void main(String[] args) {

		// 현재 로컬 컴퓨터의 날짜와 시간을 리턴 (클래스 메서드)
		LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul")); 
		System.out.println(now);
		
		// 원래사용하는 년월일시분  : 월은 숫자 또는 java.time.Month의 enum으로 지정가능
		LocalDateTime christmas = LocalDateTime.of(2023, 12, 25, 0, 0); 
		System.out.println(christmas);
		
		// DateTimeFormatter.ofPattern() 을 사용하면 원하는 패턴으로 변경가능 
		// yyyy 년, MM 월, dd 일, HH 시간, mm 분, ss 초, SSS 밀리세컨드
		
		String formattedNow 
		= now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss"));
		
		System.out.println(formattedNow);
		
		System.out.println("---------------------------");
		
		System.out.println("년 : " + now.getYear());
		System.out.println("월 : " + now.getMonthValue());
		System.out.println("일 : " + now.getDayOfMonth());
		System.out.println("요일 : " + now.getDayOfWeek());
		System.out.println("시간 : " + now.getHour());
		
		
		
		
	}
}
