package day16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class IoEx02 {
	public static void main(String[] args) {

		// 사용자로부터 파일명과 내용 입력받아 txt파일로 저장시킬것임 
		Scanner sc = new Scanner(System.in);
		String str = "파일 생성 시간\n\n" + new Date() + "\n\n";
		
		// 파일명 입력받기  
		System.out.println("파일 이름을 입력하세요 >> ");
		String file = sc.nextLine(); //  c:\\test\\fout.txt
		System.out.println("저장할 문자열을 입력하세요 >> ");
		str += sc.nextLine(); 
		
		byte[] byteStr = str.getBytes(); // 문자열을 byte 배열로 변환 
		FileOutputStream fout = null; // 미리 변수만 선언 (finally 에서도 사용해야되서)
		try {
			
			fout = new FileOutputStream(file); // 예외 처리 강제하는 코드 
			fout.write(byteStr);
			
			//fout.close(); // 위에서 에러가 발생하면 catch 로 넘어가 close() 실행을 못함 
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fout != null) try { fout.close(); }catch(IOException e) { e.printStackTrace(); }
			if(sc != null) try { sc.close(); }catch(Exception e) { e.printStackTrace(); }
		}
		
		
		
		
	}
}
