package src;

import java.util.Scanner;

public class whileExample02 {
    public static void main(String[] args) {
        String password = "abc123";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("비밀번호를 입력해주세요");
            String input = scanner.nextLine();

            if (input.equals(password)) {
                System.out.println("비밀번호가 일치합니다.");
                break;
            }
            System.out.println("비밀번호가 일치하지 않습니다");
        }
    }
}
