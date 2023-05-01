package WordGame;

import java.util.Arrays;
import java.util.Scanner;

public class Game_Play {
    public static void main(String[] args) {
        //총 3명의 유저 play name 입력 -> 이름 입력 후 저장
        System.out.println("끝말잇기 게임 시작 !");
        Scanner scanner = new Scanner(System.in);
        String[] player = new String[3];
        String word;
        String first = "자동차";

        System.out.println("3명의 유저 이름 저장");
        //유저이름을 저장하는 코드
        for (int i = 0; i < 3; i++) {
            System.out.println("유저이름" + (i + 1) + " : ");
            String playName = scanner.nextLine();
            player[i] = playName;
        }
        //닉네임을 출력하는 코드
        System.out.println("아래 이름으로 게임 진행");
        for (int i = 0; i < player.length; i++) {
            System.out.println(player[i]);
        }
        //유저이름 띄우면서 끝말잇기 게임 진행 "자동차로 시작"
        System.out.println("끝말잇기 게임 시작 첫 단어는 '자동차' 입니다");
        //자동차로 시작하는 코드
        String currentWord = first;
        //유저네임 순서 출력 변수
        int currentPlayerIndex = 0;
        while (true) {
            //현재 차례의 플레이어 이름 출력
            String currentPlayer = player[currentPlayerIndex];
            System.out.println(currentPlayer + "님의 차례 입니다");

            //이전 단어의 끝글자와 새로운 단어의 첫글자가 일치하는지 확인
            System.out.println("이전 단어 : " + currentWord);
            System.out.println(currentPlayer + "님 다음 단어를 입력하세요");
            String newWord = scanner.nextLine();
            if (newWord.charAt(0) != currentWord.charAt(currentWord.length() - 1)) {
                System.out.println("끝말잇기 실패! " + currentPlayer + "님이 패배");
                break;

            }
            // 새로운 단어가 이미 사용된 단어인지 확인
            if (Arrays.asList(player).contains(newWord)) {
                System.out.println("이미 사용된 단어입니다. " + currentPlayer + "님이 패배하셨습니다.");
                break;

            }

            // 새로운 단어를 현재 단어로 설정하고, 다음 플레이어의 차례로 변경
            currentWord = newWord;
            currentPlayerIndex++;
            if (currentPlayerIndex >= player.length) {
                currentPlayerIndex = 0;
            }
        }
    }
}

