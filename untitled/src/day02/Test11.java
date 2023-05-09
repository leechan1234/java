package day02;

// 1. import문 작성 
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {

		// 2. Scanner 객체 생성 
		Scanner sc = new Scanner(System.in);
	
		// 3. 입력받기 
		System.out.println("이름을 입력해주세요: ");
		String name = sc.nextLine(); 
		System.out.println("이름 : " + name);
		
		System.out.println("나이를 입력해주세요: ");
		String age = sc.nextLine(); 
		int intAge = Integer.parseInt(age); // String -> int 로 형변환 
		//int intAge = Integer.parseInt(sc.nextLine()); // 위 2줄 한줄로 줄이기
		
		// String -> int : Integer.parseInt(문자열); 
		// String -> double : Double.parseDouble(문자열); 
		// String -> boolean : Boolean.parseBoolean(문자열); 
		
		System.out.println("내년의 당신의 나이는 " + (intAge + 1) + "살 입니다.");
		
		
		// 4. Scanneer 객체 닫기 
		sc.close();
		
			
		
		
		
		
		
	}

}
