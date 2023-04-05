package RoomsInCave;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HazardImRooms {
    public static void main(String[] args) {
        //2.게임 설정 상 주인공에게 방해요소 추가 4개의 방 동일
        int[] rooms = {0, 1, 2, 3};

        String BAT = "Bat";
        String PIT = "pit";
        String WUMPUS = "Wumpus";
        String NOTHING = " Nothing";

        String[] hazards = {NOTHING, BAT, PIT, WUMPUS};
        // 메세지를 전달할 맵 변수 선언
        HashMap<String, String> hazardMessages = new HashMap<>();

        hazardMessages.put(WUMPUS, "\"어디선가 끔찍한 냄새가 난다. \"");
        hazardMessages.put(BAT, "\"어디선가 부스럭거리는 소리가 난다.\"");
        hazardMessages.put(PIT, "\"바람이 부는 소리가 들리는 것 같다. \"");
        hazardMessages.put(NOTHING, "\"저 방에는 아무것도 없는 것 같다. \"");

        int[][] links = {{1, 2, 3}, {2, 3, 0}, {3, 0, 1,}, {0, 1, 2}};
// 현재 있는 방 초기화
        int currentRoom = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("지금" + currentRoom + " 번 방에 있습니다.");

            int[] nextRooms = links[currentRoom];
            //각 방에 위치한 위험 요소를 가져오고 메세지를 호출
            for (int nextRoom: nextRooms) {
                String hazard =hazards[nextRoom];
                String message = hazardMessages.get(hazard);
                System.out.println(message);
            }
            System.out.println("다음 번호 중에서 이동할 방 번호를 입력해주세요.");
            System.out.println(Arrays.toString(nextRooms));

            int roomNumber = scanner.nextInt();

            currentRoom = roomNumber;
        }
    }
}
