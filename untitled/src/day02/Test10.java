package day02;
// 1. import 문 작성 
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {

		// 2. Scanner 객체 생성 
		Scanner sc = new Scanner(System.in);
		
		// 3. 입력받기 
		System.out.println("숫자를 입력해주세요: "); // 콘솔에 메세지 출력해주기 
		String str = sc.nextLine(); // 콘솔에 입력한 데이터를 str 변수에 담기 
		System.out.println(str + 5);   // 변수 출력해서 str에 잘 담겼는지 확인 
		
		
		// 4. Scanner 객체 닫기 
		sc.close();
		
	}// 프로그램 종료 

}
