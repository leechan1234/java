package day12;

import java.util.Scanner;

//인터페이스
/*
	Stack 인터페이스를 상속받아 문자열을 저장하는 StringStack 클래스를 구현하세요. 
	아래와 같은 실행결과가 나오도록 main()을 참고하여 작성하세요. 
	실행결과:
		총 스택 저장 공간의 크기 입력 >>  3 (사용자가 입력)
		문자열 입력 >> hello
		문자열 입력 >> sunny
		문자열 입력 >> smile
		문자열 입력 >> happy
		스택이 꽉 차서 푸시 불가!
		문자열 입력 >> 그만
		스택에 저장된 모든 문자열 팝 : smile sunny hello
*/
interface Stack {
	int length();					// 현재 스택에 저장된 개수 리턴
	int capacity();					// 스택의 전체 저장 가능한 개수 리턴
	String pop();					// 스택의 톱(top)에 저장된 문자열 리턴하고 저장소에서 문자열 삭제
	boolean push(String val);		// 스택의 톱(top)에 저장소에 문자열 넣고 실행 결과 boolean 타입으로 리턴
}
class StringStack implements Stack {
	private String [] data; 
	private int top = -1;  // 마지막에 저장된 데이터의 index번호 들고있기 

	@Override
	public int length() {  
		return top + 1;  
	}
	@Override
	public int capacity() {
		return data.length;
	}
	@Override
	public String pop() {
		if(top == -1) return null; 
		String str = data[top];
		top--; 
		return str;
	}
	@Override
	public boolean push(String val) {
		// 마지막에 저장된 인덱스번호가 배열의 마지막 인덱스번호와 같으면
		if(top == data.length-1) return false;  // == 스택이 꽉 찼을 경우 
		else { // 저장공간이 비어있을 경우 
			top++; // idx 번호 증감시켜 다음 빈자리 idx로 올리고 
			data[top] = val; // 배열에 저장 
			return true; // 저장잘 됐다고 true 리턴 
		}
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int n = Integer.parseInt(sc.nextLine()); 
		data = new String[n];
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			String str = sc.nextLine(); 
			if(str.equals("그만")) { break; }
			boolean result = push(str); // 저장해보고 성공실패 결과 받아오기 
			if(!result) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int len = length();  // 현재까지 배열에 저장된 길이 
		for(int i = 0; i < len; i++) {
			System.out.print(pop() + " ");
		}
		System.out.println();
		
		sc.close();
	}
}
public class Test134 {
	public static void main(String[] args) {
		StringStack s = new StringStack();
		s.run();	// 프로그램 구동 시작
	}
}
