package day08;
/*
	char[] 배열을 전달받아 출력하는 printCharArray() 메서드와 
	배열속의 ' '공백 문자를 ','쉼표로 대치하는 replaceSpace() 메서드를 작성해보세요. 
	(Test73 클래스에 static붙혀 클래스 메서드로 작성)
*/
public class Test73 {
	
	// 메서드 2개 작성 
	static void printCharArray(char[] ch) {
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	
	static void replaceSpace(char[] ch) {
		for(int i = 0; i < ch.length; i++) { 
			if(ch[i] == ' ') { // char타입 비교 
				ch[i] = ',';
			}
		}
	}
	
	public static void main(String[] args) {

		char[] c = {'I', ' ', 'a', 'm', ' ', 'a', ' ', 'b', 'o', 'y'};
		// printCharArray 호출 -> I am a boy 
		printCharArray(c);
		// replaceSpace호출 
		replaceSpace(c);
		// printCharArray 호출 -> I,am,a,boy 
		printCharArray(c);
		
	}
}
