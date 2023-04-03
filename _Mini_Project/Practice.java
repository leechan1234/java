package _Mini_Project;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        int[] rooms = {0, 1, 2, 3};
        int[][] links = {{1, 2, 3}, {2, 3, 0}, {3, 0, 1}, {0, 1, 2}};
        int currentRoom = 0;
        int bossRoom = -1; // 보스가 있는 방

        while (bossRoom == -1) {
            // 현재 방에서 보스를 찾기 시도
            System.out.println("현재 방: " + currentRoom);
            if (currentRoom == 1) {
                System.out.println("보스를 찾았습니다!");
                bossRoom = 1;
            } else if (currentRoom == 2) {
                System.out.println("보스를 찾았습니다!");
                bossRoom = 2;
            } else if (currentRoom == 3) {
                System.out.println("보스를 찾았습니다!");
                bossRoom = 3;
            } else {
                System.out.println("보스가 없습니다.");
            }

            // 다음 방으로 이동
            int[] currentRoomLinks = links[currentRoom];
            int nextRoom = currentRoomLinks[(int) (Math.random() * currentRoomLinks.length)];
            currentRoom = nextRoom;

            System.out.println("다음 방: " + currentRoom);
        }
        System.out.println("보스가 있는 방: " + bossRoom);
    }
}