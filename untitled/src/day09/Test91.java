package day09;

import java.util.Scanner;

// Book3 클래스를 활용하여 2개짜리 Book3타입 객체 배열을 만들고, 
// 사용자로 부터 책의 제목과 저자를 입력받아 배열 요소를 체우고 
// 모든 책의 제목과 저자를 출력해보세요. 
class Book3 {
	String title; 
	String author;
	Book3(String title, String author) {
		this.title = title; 
		this.author = author;
	}
}
public class Test91 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문제 풀이 
		//int[] arr = new int[2]; //기본형 배열생성 
		Book3[] books = new Book3[2]; // 객체 배열 생성 == 책장 
		
		for(int i = 0; i < books.length; i++) { // 책장의 크기만큼 반복 
			// 책 제목과 저자 입력받고 
			System.out.print("제목 : ");
			String t1 = sc.nextLine();
			System.out.print("저자 : ");
			String a1 = sc.nextLine();	
			// 입력받은 값으로 책 만들고 
			// 배열(책장)에 저장 
			books[i] = new Book3(t1, a1); 	
		}
		
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i].title + " : " + books[i].author);
		}
		
		
		
		sc.close();
		
	}
}
