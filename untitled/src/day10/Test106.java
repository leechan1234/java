package day10;
/*
	노래 한곡을 나타내는 Song 클래스를 작성하세요. Song은 다음 필드로 구성된다. 
		- 노래의 제목을 나타내는 title
		- 가수를 나타내는 artist
		- 노래가 발표된 연도를 나타내는 year
		- 국적을 나타내는 country
	또한, Song 클래스에 다음 생성자와 메서드를 작성하세요. 
		- 생성자 총 2개 : 기본생성자, 매개변수로 모든필드를 초기화하는 생성자 
		- 노래 정보를 출력하는 show() 메서드 
	main메서드에서는 2022년, 한국국적의 NewJeans가 부른 "Hype boy" 를 Song객체로 생성, 
	show()를 이용하여 노래의 정보를 아래와 같이 출력하세요. 
	콘솔 예) 2022년 한국국적의 NewJeans가 부른 Hype boy 
*/
class Song {
	String title; 
	String artist; 
	int year; 
	String country; 
	Song(){}
	Song(String title, String artist, int year, String country){
		this.title = title; this.artist = artist; 
		this.year = year; this.country = country;
	}
	void show() {
		System.out.println(year +"년 "+ country +"국적의 "+ artist +"가 부른 " + title);
	}
}

public class Test106 {
	public static void main(String[] args) {
		
		Song song = new Song("hype boy", "NewJeans", 2022, "한국"); 
		song.show();
		
		
	}
}






