package Chaptor_04;

public class _01while {
    public static void main(String[] args) {
        int coffee = 10;
        int money = 20;
        while (money > 0) {
            System.out.println("돈을 받았으니 커피를 줍니다");
            coffee--;
            money--;
            System.out.println("남은 커피의 양은" + coffee + "입니다.");
            System.out.println("돈이" + money + "원 밖에 남지 않았어");

            if (coffee >= 14) {
                System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다");
                System.out.println("돈이" + money + "원밖에 안남았네");
                break;


            }
        }
    }

}



