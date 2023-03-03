package src;

import java.util.Scanner;

public class input01 {
    public static void main(String[] args) {
        System.out.println("숫자 하나를 입력해 주세요");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            int intValue = Integer.parseInt(input);
            System.out.println(intValue + 1);
        } catch (Exception e) {
            System.out.println("숫자로 입력해 주시길 바랍니다");

        }
    }
}