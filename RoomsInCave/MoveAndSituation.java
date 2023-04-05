package RoomsInCave;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.nio.file.Files.move;

public class MoveAndSituation {

    public static int[] rooms = {0, 1, 2, 3};

    public static int[][] links = {{1, 2, 3}, {2, 3, 0}, {3, 0, 1,}, {0, 1, 2}};

    public static String BAT = "Bat";
    public static String PIT = "pit";
    public static String WUMPUS = "Wumpus";
    public static String NOTHING = "Nothing";

    public static String[] hazards = {NOTHING, BAT, PIT, WUMPUS};

    public static int currentRoom = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("지금" + currentRoom + "번 방에 있습니다.");

            int[] nextRooms = links[currentRoom];

            System.out.println("다음 번호 중에서 이동할 방 번호를 입력해주세요.");
            System.out.println(Arrays.toString(nextRooms));

            int roomNumber = scanner.nextInt();

move(roomNumber);
        }
    }
    private static void move(int room) {
        //입력한 방으로 이동합니다.
        currentRoom = room;
        String hazardInRoom = hazards[currentRoom];

        //현재 방에 옴퍼스가 있는 경우
        if (hazardInRoom.equals(WUMPUS)) {
            System.out.println("옴퍼스에게 잡아먹혔습니다");
        } //현재 방에 구덩이가 있는 경우
        // TODO.game over
        else if (hazardInRoom.equals(PIT)) {
            System.out.println("구덩이에 빠졌습니다");
            // TODO.game over
        }//현재 방에 박쥐가 있는 경우
        else if (hazardInRoom.equals(BAT)) {
            System.out.println("박쥐가 당신을 잡아 다른 방에 떨어트렸습니다");

            Random random = new Random();

            do {
                currentRoom = random.nextInt(rooms.length);
            } while (hazards[currentRoom].equals(BAT));

            hazards[room] = NOTHING;

            while (true) {
                int newBatRoom = random.nextInt(rooms.length);

                if (newBatRoom == currentRoom) {
                    continue;
                }
                if (hazards[newBatRoom].equals(NOTHING)) {
                    hazards[newBatRoom] = BAT;
                    break;
                }
            }

        }


    }


}
