package day16;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoEx01 {
	public static void main(String[] args) {

		byte[] b = {7, 43, 54, -5, 3, 21};
		
		try {
			// 파일 출력 스트림 생성 (예외 처리 필수) 
			// 기존에 이미 존재하는 파일이면 내용지우고 스트림에 연결(덮어쓰기) 
			FileOutputStream fout = new FileOutputStream("c:\\test\\test.out");
			
			/* 파일에 데이터 쓰기 (하나씩 배열에서 꺼내 쓰기)
			for(int i = 0; i < b.length; i++) {
				fout.write(b[i]);
			}*/
			
			// 배열 통째로 던져서 쓰기 
			fout.write(b);
			
			// 스트림 닫기 
			fout.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
