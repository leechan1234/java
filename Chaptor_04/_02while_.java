package Chaptor_04;

public class _02while_ {
    public static void main(String[] args) {
        int coffee = 10;
        int money = 20;
        System.out.println("총 20원이 있지만 5원 밖에 사용하지 못합니다");
        while (money > 0) {

            System.out.println("돈을 받았으니 커피를 줍니다.");
            coffee--;
            money--;
            System.out.println("남은 커피의 양은 " + coffee + "입니다.");
            if (money == 15 || coffee == 10) {
                System.out.println(money+ "원 밖에 없어서 커피를 못사..");

                break;
            }
        }
    }
}
