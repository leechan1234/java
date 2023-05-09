package day10;

import java.util.Scanner;
/*
	Grade 클래스를 작성하세요. 
	3과목의 점수를 입력받아 Grade 객체를 생성하고 성적 평균을 출력하는 main메서와 
	실행예시는 아래와 같다. 
	콘솔 출력예:
		수학, 과학, 영어 점수를 입력하세요. 
		수학>> 90
		과학>> 88
		영어>> 96
		평균은 91
*/
class Grade {
	int math; 
	int sci; 
	int eng; 
	Grade(int math, int sci, int eng) {
		this.math = math; this.sci = sci; this.eng = eng;
	}
	int getAvg() {
		int avg = (math + sci + eng) / 3; 
		return avg;
	}
}
public class Test105 {
	public static void main(String[] args) {
		// 메인메서드는 작성완료! 주석해제 후 실행하면 위 콘솔예제와 같은 결과가 나오도록
		Scanner sc = new Scanner(System.in);
		System.out.println("수학, 과학, 영어 점수를 입력하세요.");
		System.out.print("수학>>");
		int math = Integer.parseInt(sc.nextLine());
		System.out.print("과학>>");
		int sci = Integer.parseInt(sc.nextLine());
		System.out.print("영어>>");
		int eng = Integer.parseInt(sc.nextLine());
		Grade me = new Grade(math, sci, eng);
		System.out.println("평균은 " + me.getAvg());
		System.out.println(me.toString());
		
		sc.close();
	}
}
