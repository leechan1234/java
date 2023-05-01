package Class_Pratice;
	/*
n명이 참가하는 끝말잇기 게임을 만들어보자
// 1.n명 참가 플레이어 4명으로 가정
            처음단어는 "자동차"이다. n명의 참가자들은 순서대로 자신의 단어를 입력하면된다.
            2.처음단어 자동차 String car  n명 순서대로 단어 입력
            끝말잇기에서 틀리면 게임오버 -> 진사람 이름 출력하고 프로그램 종료.
            3. 끝말잇기에서 틀리면 끝 - 진사람 이름 출력하고 끝
            아래 지문을 참고하여 WordGameApp 클래스와 각 선수를 나타내는 Player 클래스 작성하세요.

            WordGameApp : 게임을 전체적으로 진행하는 run() 메서드,
               run 메서드
            run() 에서 입력한 플레이어의 수 만큼 Player 배열객체 생성하여 게임진행
            run() 메소드에서 입력한 플레이어 수 만큼 배열객체 생성
            Player : 플레이어 이름저장할 변수, 단어를 입력받는 getWordFromUser() 메서드,
            끝말잇기 성공여부와 게임계속할지 판별하는 checkSuccess() 메서드 작성
            #tip : 문자열에서 첫번째 문자 알아내는 방법
            String word = "자동차";
            char firstChar = word.charAt(0); ==> '자'
            */

import java.util.Scanner;

class Player {
    //플레이어 이름저장
    String name ;
    //단어를 입력받는 메소드
    String getWorldFromUser(Scanner sc){
        System.out.println(name + ">> ");
        String inputWord = sc.nextLine();
        return inputWord;
    }
    //끝말잇기 성공여부와 게임 계속할지 판별해서 결과 돌려주기
    boolean checkSuccess(String lastWord , String newWord) { // 이전 단어와 지금입력한 단어 필요
    boolean result = false;
    //이전단어 끝글자와, 지금 단어 첫글자가 동일한지 비교
        //끝 글자는 문자열의 마지막 인덱스 번호가 필요함
        int lastWordLen = lastWord.length(); //이전단어의 길이 구하기
        int lastWordIndex = lastWordLen -1; // 길이 -1이 마지막 인덱스 번호
        char lastChar = lastWord.charAt(lastWordIndex);//이전단어 끝글자
        char firstChar = newWord.charAt(0); //지금단어 첫글자
        if(lastChar == firstChar) {
            result = true;
        }
        return  result;
    }
}
class WordGameApp {
    Scanner sc = new Scanner(System.in);


}
public class PlayerMain {
    public static void main(String[] args) {
        WordGameApp game = new WordGameApp();
//        game.run();

    }
}
