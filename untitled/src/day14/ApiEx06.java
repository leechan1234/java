package day14;

import java.util.UUID;

public class ApiEx06 {
	public static void main(String[] args) {

		String fullName = "Hello.txt"; 
		//int idx = fullName.indexOf("."); // 지정한 문자열의 인덱스번호 리턴 
		//System.out.println(idx);
		int idx = fullName.lastIndexOf("."); // 지정한 문자의 인덱스번호 뒤에서찾아 리턴 
		//System.out.println(idx);
		String ext = fullName.substring(idx); // 확장자 명만 추출 
		//System.out.println(ext);
		
		//UUID uuid = UUID.randomUUID(); 
		//System.out.println(uuid.toString());
		String uuid = UUID.randomUUID().toString();
		//uuid = uuid.replace("-", "");
		String newFileName = uuid + ext; 
		System.out.println(newFileName);
		
	}
}
