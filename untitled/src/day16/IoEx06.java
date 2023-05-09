package day16;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class IoEx06 {
	public static void main(String[] args) {

		FileInputStream fin = null; // 바이트 입력 스트림 
		InputStreamReader in = null; // 문자 입력 스트림 
		
		try {
			
			fin = new FileInputStream("c:\\test\\outWriter.txt");
			in = new InputStreamReader(fin);
			
			System.out.println("encoding : " + in.getEncoding());
			
			int c; 
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(in != null) try { in.close(); }catch(Exception e) { e.printStackTrace(); }
			if(fin != null) try { fin.close(); }catch(Exception e) { e.printStackTrace(); }
		}
		
		
		
		
		
		
	}
}
