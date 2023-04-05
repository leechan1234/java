package RoomsInCave;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class RoomsCave {
    public static void main(String[] args) {
        // 각 동굴 무한루프
        int[] rooms = {0, 1, 2, 3};
        int[][] links = {{1, 2, 3}, {2, 3, 0}, {3, 0, 1,}, {0, 1, 2}};

        int currentRoom = 0; //현재 있는 방
     //사용자 입력값
        Scanner scanner = new Scanner(System.in);
//무한반복 안에서 현재 위치할 방 번호를 출력
        while (true) {
            System.out.println("지금" + currentRoom + "번 방에 있습니다");
            System.out.println("다음 번호 중에서 이동할 방 번호를 입력해주세요.");
//현재 이동할 수 있는 방들의 목록을 출력
            System.out.println(Arrays.toString(links[currentRoom]));
    //사용자 입력값을 curentRoom으로 초기화
            int roomsNumber = scanner.nextInt();
            currentRoom = roomsNumber;
        }

    }
}
