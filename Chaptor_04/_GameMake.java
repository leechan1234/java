package Chaptor_04;

import java.util.Arrays;
import java.util.Scanner;

public class _GameMake {
    public static void main(String[] args) {
        int[] rooms = {0, 1, 2, 3}; // 3개의 통로
        int[][] links2 = {{1, 2, 3}, {2, 3, 0}, {3, 0, 1}, {0, 1, 2}};

        int correntRoom = 0; //현재 몇번 방에 위치해 있는지

        Scanner scanner = new Scanner(System.in); //사용자 입력

        while (true) {  //방 이동 할때 무한 루프
            System.out.println("지금" + correntRoom + "번 방에 있습니다.");
            System.out.println("다음 번호 중에서 이동할 방 번호를 입력해주세요.");

            System.out.println(Arrays.toString(links2[correntRoom]));

            int roomNumber = scanner.nextInt();// 사용자 정수 입력 값
            correntRoom = roomNumber;
        }
    }
}
