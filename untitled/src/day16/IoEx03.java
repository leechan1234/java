package day16;

import java.io.FileInputStream;

public class IoEx03 {
	public static void main(String[] args) {

		// IoEx01 에서 내보낸 파일 읽어오기 
		byte[] b = new byte[6];  // 내보낸 배열의 방크기와 동일하게 
		
		FileInputStream fin = null; 
		
		try {
			// 파일 입력스트림 생성 
			fin = new FileInputStream("c:\\test\\test.out");
			
			// 파일 읽기 
			// 한 바이트씩 읽기 
			int n = 0; 	// 배열의 인덱스로 사용 
			int c; 		// 읽은 파일 임시 저장 변수
			
			/* EOF를 만나면 -1 리턴 -> 읽어온값이 -1이 아닐때까지 반복해라
			while((c = fin.read()) != -1) {  // 파일에서 읽어서 c에 담고 c와 -1 비교 
				b[n] = (byte)c; //  byte로 변환해서 byte 배열에 저장 
				n++; 			// index 늘리기
			}*/
			// 한번에 읽기 (이때 배열의 방크기가 읽어오는 데이터의 길이와 같게)
			fin.read(b);
			
			// 화면에 출력 
			for(int i = 0; i < b.length; i++) {
				System.out.print(b[i] + "  ");
			}
			System.out.println();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fin != null) try{ fin.close(); }catch(Exception e){ e.printStackTrace(); }
		}
		
		
		
		
		
		
		
	}
}
