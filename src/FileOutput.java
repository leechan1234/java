package src;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/output01.txt", true);
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            System.exit(1);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("종료하려면 입력 없이 엔터.");
        while (true) {
            String input = scanner.nextLine();

            if (input.equals(""))
            try {
                writer.write(input);

            } catch (IOException e) {
                System.out.println("파일에 데이터를 쓰는 데에 실패했습니다 ");
                System.exit(2);
            }
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("파일 닫기에 실패 했습니다");
            }
        }
    }
}
