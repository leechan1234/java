package src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
  FileInputStream inputStream = null;

        try {
        inputStream = new FileInputStream("src/acronym.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNextLine()) {
 String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
