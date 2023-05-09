package day16;

import java.io.FileInputStream;

public class IoEx04 {
	public static void main(String[] args) {

		FileInputStream fin = null; 
		int c = 0; 
		
		try {
			fin = new FileInputStream("c:\\test\\fout.txt");
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fin != null) try { fin.close(); }catch(Exception e) { e.printStackTrace(); }
		}
		
		
		
		
		
		
	}
}
