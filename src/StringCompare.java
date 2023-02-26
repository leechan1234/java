package src;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        String a ="치킨";
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();

        System.out.println(a.equals(b));
    }
}