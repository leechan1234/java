package day04;

import javax.management.monitor.StringMonitor;
import java.util.Scanner;

public class Test41 {
    public static void main(String[] args) {
        // 문제1. 0 ~ 10까지 출력해보세요.
//        for (int i = 0; i <=10 ; i++) {
//            System.out.println(i);
//        }
//        // 문제2. 1 ~ 15까지 출력해보세요.
//        for (int i = 1; i <=15 ; i++) {
//            System.out.println(i);

        // 문제3. 0 ~ 100까지 10단위로 출력해보세요. 0 10 20 30 ...
//        for (int i = 10; i <=100 ; i++) {
//            if(i % 10 == 0){
//                System.out.println(i);
//            }
//        }
        // 문제4. 1 ~ 20까지 홀수만 출력해보세요.
//        for (int i = 0; i <=20 ; i++) {
//            if (i % 2 == 1){
//                System.out.println(i);
//            }
//        }
        // 문제5. 1 ~ 10까지의 총합을 출력해보세요.
//        int tot = 0;
//        for (int i = 1; i <=10; i++) {
//            tot += i;
//        }
//        System.out.println(tot);

        // 문제6. 1 ~ 50까지의 짝수의 합을 출력해보세요.
//        int tot = 0;
//        for (int i = 1; i <=50 ; i++) {
//            if (i % 2 == 0){
//                tot += i;
//            }
//        }
//        System.out.println(tot);
      /*
         문제7. 주문프로그램

         *** 더조은 카페 ***
         1. 아메리카노 : 2500원
         2. 카페라떼 : 3000원
         3. 카푸치노 : 3500원
         4. 카라멜마끼아또 : 4000원
         5. 샌드위치 : 6000원
         6. 종료

//         1단계 : 메뉴 번호로 주문을 원하는만큼 받고, 종료를 선택하면 받은 주문들의 총금액을 출력하세요.
         2단계 : int money = 20000; 내돈에서 주문금액 차감, 돈이 부족하면 주문 못하게,
                  총액 출력시 잔액도 출력해주세요.
      */
//        1단계 : 메뉴 번호로 주문을 원하는만큼 받고, 종료를 선택하면 받은 주문들의 총금액을 출력하세요.
        Scanner scanner = new Scanner(System.in);
        System.out.println(" *** 더조은 카페 ***\n" +
                "         1. 아메리카노 : 2500원\n" +
                "         2. 카페라떼 : 3000원\n" +
                "         3. 카푸치노 : 3500원\n" +
                "         4. 카라멜마끼아또 : 4000원\n" +
                "         5. 샌드위치 : 6000원\n" +
                "         6. 종료");
        ;
        int money = 20000;
        int tot = 0;
        while (true) {
            int user = scanner.nextInt();
            switch (user) {
                case 1:
                    tot += 2500;
                    System.out.println("아메리카노");
                    break;
                case 2:
                    tot += 3000;
                    System.out.println("카레라떼");
                    break;
                case 3:
                    tot += 3500;
                    System.out.println("카푸치노");
                    break;
                case 4:
                    tot += 4000;
                    System.out.println("카라멜 마끼아또");
                    break;
                case 5:
                    tot += 6000;
                    System.out.println("샌드위치");
                    break;
                case 6:
                    System.out.println("종료");
                break;
            }
            System.out.println("총 주문 금액 : " + tot);

                    if (money - tot < 0) {
                        System.out.println("남은 돈이 없습니다 총 주문 금액 : " + tot);
                        System.out.println("잔액은 " + (tot - money) + "입니다.");
            }

        }
    }
}

