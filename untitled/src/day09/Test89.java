package day09;

class Book2 {
	String title; 
	String author;
	
	Book2(){
		this("무제");
		System.out.println("생성자 매개변수 없는거 호출");
	}
	Book2(String title){
		this(title, "작자미상");  
		System.out.println("생성자 매개변수 1개 호출");
		// 매개변수 2개 있는 생성자를 호출해 대신 처리하게 해준다. 
		//this.title = title;
		//this.author = "작자미상";
	}
	Book2(String title, String author){
		System.out.println("생성자 매개변수 2개 호출");
		this.title = title; 
		this.author = author;
	}
	void show() { System.out.println(title + " " + author); }
}
public class Test89 {
	public static void main(String[] args) {

		Book2 untitled = new Book2(); 
		untitled.show();
		
		//Book2 kong = new Book2("콩쥐팥쥐");
		//kong.show();
		//Book2 lp = new Book2("어린왕자", "생텍쥐베리");
		//lp.show();
		
		
		
		
		
		
	}
}




