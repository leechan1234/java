package day09;

// 제목과 저자를 나타내는 title과 author라는 변수를 가진 Book 클래스를 작성. 
// 생성자를 작성하여 변수들을 초기화 해보자
class Book {
	String title; 
	String author; 
	
	Book(){
		
	}
	
	Book(String t){
		title = t; 
		author = "작자미상";
	}
	
//	Book(String t, String a){
//		title = t; 
//		author = a; 
//	}
}

public class Test85 {
	public static void main(String[] args) {

		//Book littlePrince = new Book("어린왕자", "생텍쥐베리"); 
		//System.out.println(littlePrince.title + " " + littlePrince.author);
		Book kong = new Book("콩쥐팥쥐");
		System.out.println(kong.title + " " + kong.author);
		
		
		
		
	}
}
