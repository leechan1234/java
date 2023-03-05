package Chaptor_04;

public class _02else {
    public static void main(String[] args) {
        //조건문 if else
         int hour = 15;
         if (hour < 14) { // 오후 2시 이전
             System.out.println("아아 +1");
         } else { // 그 외 경우
             System.out.println("아아 디카페인 + 1");
         }

        System.out.println("커피 주문 완료 #1");

         // 오후 2시 이후 이거나 모닝 커피를 마신 경우?
        hour = 15;
        boolean morningCoffee = false;
        if (hour >= 14 || morningCoffee == true) {
            System.out.println("아아 디카페인 #2");
        }else {
            System.out.println("기본 아아메 +1");
        }
        System.out.println("커피 주문 완료 #2");

    }
}
