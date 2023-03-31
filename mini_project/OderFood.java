package mini_project;

import java.util.Arrays;
import java.util.Scanner;

public class OderFood {
    public static String[] selectMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("☆★☆★ 로라스블랑 ☆★☆★");
        System.out.println("메뉴를 골라 주시기 바랍니다");
        System.out.println("1. 프로슈토 갈레트 세트");
        System.out.println("2. 프렌치토스트");
        System.out.println("3. 미트파이");
        System.out.println("4. 어니어 수프");
        System.out.println("입력 : ");
        int num = scanner.nextInt();
        return order(num);
    }

    public static String[] order(int a) {
        Scanner scanner = new Scanner(System.in);
        int price = 0;
        String foodName = "";
        switch (a) {
            case 1:
                foodName = "갈레트 세트";
                price = 26000 ;
                break;
            case 2:
                foodName = "프렌치토스트";
                price = 20000;
                break;
            case 3:
                foodName = "미트파이";
                price = 21000;
                break;
            case 4:
                foodName = "어니언 수프";
                price = 11000;
                break;
        }
        System.out.println(foodName + "의 가격은" + price + " 원 입니다");
        System.out.println("1.주문 하시겠습니까?");
        int menuNum = scanner.nextInt();
        System.out.println("카드 결제 현금 결제 어떤걸로 하시겠습니까? \n 1.카드결제 2.현금 결제");
        int chos = scanner.nextInt();
        if (chos == 1) {
            System.out.println("카드로 결제 하였습니다. 감사합니다. ");
        } else if (chos == 2) {
            System.out.println("현금으로 결제 하였습니다. 감사합니다.");
        } else {
            System.out.println("잘못 입력 하였습니다");
        }

        System.out.println("추가 주문 하시겠습니까?\n 1.네 2.아니오");
        int chose = scanner.nextInt();
        if (chose == 1) {
            System.out.println("메뉴 목록을 다시 드리겠습니다");
            selectMenu();
        } else if (chose == 2) {
            System.out.println("감사합니다 다음에 또 오십시오");

        } else {
            System.out.println("잘못 입력 하였습니다.");

        }
        String[] Name = {foodName,Integer.toString(price)};
        return Name;


    }


    public static void main(String[] args) {
      String[] Name =selectMenu();
        System.out.println(Arrays.toString(Name));

    }
}












