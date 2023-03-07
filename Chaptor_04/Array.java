package Chaptor_04;

import src.ArrayToString;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] rooms = {0, 1, 2, 3};
        int[][] links = {{1, 2, 3}, {3, 4, 0}, {3, 0, 1}, {0, 1, 2}};

        int currentRoom = 0;
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        while (true) {
            System.out.println("지금" + currentRoom + " 번 방에 있습니다");
            System.out.println("다음 번호 중에서 이동할 방 번호를 입력해주세요");

            System.out.println(Arrays.toString(links[currentRoom]));

            String roomNumber = scanner.nextLine();

            currentRoom =Integer.parseInt(roomNumber);
        }

    }
}





