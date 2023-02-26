package src;

import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        System.out.println("음식 이름을 입력하세요");
        System.out.println("1. 치킨");
        System.out.println("2. 순대국");
        System.out.println("3. 스테이크");


        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        switch (name){
            case "1":
                System.out.println(" 치킨은 5백원 입니다");
                break;
            case "2":
                System.out.println("순대국은 8천원 입니다");
                break;
            case "3":
                System.out.println("스테이크는 5천원 입니다");
                break;
            default:
                System.out.println("없는 메뉴");
        }
    }
}
