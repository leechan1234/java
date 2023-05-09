package day05;

public class Test47 {
    public static void main(String[] args) {
        // 0 ~ 9 사이의 임의 숫자를 한개 받고
        for (int i = 0; i < 1; i++) {
            System.out.println( (int) (Math.random()*9));
        }
        //문제1. 1 ~ 10 사이의 임의의 수 출력
        for (int i = 0; i < 1; i++) {
            System.out.println( (int) (Math.random()*10));
        }
        //문제2. 8 ~ 16 사이의 임의의 수 출력 0 ~ 8
        for (int i = 8; i <= 16; i++) {
            System.out.println( (int) (Math.random()*9));
        }
        // 0 1 둘중에 하나 받기
    }
}
