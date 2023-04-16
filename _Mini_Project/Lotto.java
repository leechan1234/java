package _Mini_Project;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int current = 0;
        int[] humanNumber = new int[5];
        int[] machineNumber = new int[5];

        System.out.println("안녕하세요 로또 추첨기 입니다 어느 것을 선택 하시겠습니까? \n1.자동 2. 수동");
        for (int i = 0; i < machineNumber.length; i++) {
            machineNumber[i] = random.nextInt(51);
        }

        int userChoose = scanner.nextInt();
        //자동
        if (userChoose == 1) {
            System.out.println("--고객 자동 추첨 입니다--");
            for (int i = 0; i < humanNumber.length; i++) {
                humanNumber[i] = random.nextInt(51);
                System.out.println("[" + humanNumber[i] + "번]");
            }
            for (int i = 0; i <humanNumber.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (humanNumber[i] == machineNumber[j]){
                        machineNumber[i] =random.nextInt(51);
                        i -= 1;
                    }
                }
            }
            System.out.println("-- 기계 자동 추첨 번호 -- ");

            for (int i = 0; i < humanNumber.length; i++) {
                System.out.println("[" + machineNumber[i] + "번]");
                for (int j = 0; j < machineNumber.length; j++) {
                    if (humanNumber[i] == machineNumber[j]) {
                        current++;
                    }
                }
            }
        }
        // 수동 입력
        if (userChoose == 2) {
            System.out.println("--고객 수동 추첨 입니다--\n 5개의 번호를 입력해 주십시오");
            int[] userInput = new int[5];
            for (int i = 0; i < 5; i++) {
                   userInput[i] = scanner.nextInt();
                System.out.println("[" + userInput[i] + "번]");
            }
            System.out.println("-- 기계 자동 추첨 번호 -- ");
            for (int i = 0; i < userInput.length; i++) {
                System.out.println("[" + machineNumber[i] + "번]");
                for (int j = 0; j < machineNumber.length; j++) {
                    if (userInput[i] == machineNumber[j]) {
                        current++;
                    }
                }
            }
        }
        switch (current) {
            case 5:
                System.out.println("1등입니다");
                break;
            case 4:
                System.out.println("2등입니다");
                break;
            case 3:
                System.out.println("3등입니다");
                break;
            case 2 :
                System.out.println("4등입니다.");
            default:
                System.out.println("당첨되지 않았습니다.");
        }
    }
}
