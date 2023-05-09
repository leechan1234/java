package day16;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;

public class IoEx05 {
	public static void main(String[] args) {

		String str = "파일 생성시간 \n\n";
		str += new Date() + "\n";
		str += "안녕하세요~~~ 너무 졸리고 피곤해요~~";
		
		FileOutputStream fout = null;  // 바이트 출력 스트림 
		OutputStreamWriter out = null; // 문자 출력 스트림
		
		try {
			
			fout = new FileOutputStream("c:\\test\\outWriter.txt"); // 바이트 
			out = new OutputStreamWriter(fout, "UTF-8"); // 문자로 바이트 감싸기 
			
			out.write(str);		// 쓰기(내보내기)
			out.flush(); 		// flush를 하고 스트림을 닫기 
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(out != null) try { out.close(); }catch(Exception e) { e.printStackTrace(); }
			if(fout != null) try { fout.close(); }catch(Exception e) { e.printStackTrace(); }
		}
		
		
		
		
		
		
		
		
	}
}
