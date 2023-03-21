package _prob01;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int temp = 0;

        temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);


        System.out.println(7 + 7 + "");
        System.out.println("" + 7 + 7);
        int v = 65;
        System.out.println(v);
        double d = 85.4123;
        int a = (int) d;
        int c = (int) 85.4123;
        System.out.println("-----------------------");
        int score = 40;
        if (score > 30) {
            System.out.println("합격입니다");
        }
        System.out.println("-------------------");
      int num = 5;
        if (num%2==1){
            System.out.println("홀수 입니다");
        }else {
            System.out.println("짝수입니다");
        }


    }
}