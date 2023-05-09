package day16;

import java.io.File;
import java.util.Date;

public class FileEx01 {
	public static void main(String[] args) {

		File f = new File("C:\\Windows\\system.ini"); 
		// 파일 크기 
		long size = f.length(); 
		System.out.println(size);
		// 파일 이름 
		String name = f.getName(); 
		System.out.println(name);
		// 파일 경로 
		String path = f.getPath();
		System.out.println(path);
		// 파일 절대 경로 
		String absolutePath = f.getAbsolutePath(); 
		System.out.println(absolutePath);
		// 상위(부모) 
		String parent = f.getParent(); 
		System.out.println(parent);
		// 파일인지 판별 
		System.out.println(f.isFile());
		// 디렉토리인지 판별 
		System.out.println(f.isDirectory());
		
		System.out.println("숨김 속성: " + f.isHidden());
		System.out.println("읽기 속성: " + f.canRead());
		System.out.println("쓰기 속성: " + f.canWrite());
		System.out.println("수정 날짜: " + new Date(f.lastModified()));
		
		// 빈 텍스트 파일 생성 
		File f2 = new File("c:\\test\\newFile.txt");
		try {
			
			//f2.createNewFile(); 
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 디렉토리 만들기 
		File f3 = new File("c:\\test\\newFolder");
		if(!f3.exists()) {
			f3.mkdir(); 
		}
		
		
		
		
		
		
		
		
		
	}
}
