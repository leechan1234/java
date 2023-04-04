package Quiz_01;

public class Quiz_04 {
    public static void main(String[] args) {

        int hour = 5;
        int fee =4000*hour;
        if (fee >30000){
            fee = 30000;
        }
        boolean isSmallCar = false;
        boolean DisabledCar = false;

        if (isSmallCar || DisabledCar){
            fee /= 2;
        }
        System.out.println("주차 요금은" + fee + "원 입니다");
    }
}
