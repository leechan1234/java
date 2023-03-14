package _prob01;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();

        for (int i = 0; i <number ; i++) {
            for (int j = 0; j <i + 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}