package new_chaptor_01;

public class _Quzi_05 {
    public static void main(String[] args) {
        int hour = 10; // 주차시간
        boolean isSmallCar = false; //경차 외부
        boolean withDisavledPerson = true; // 장애인 차량 여부
int money = 4000;
        int fee = hour * money; //시간당 4000원 곱하기

        //3만원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000;
        }

        //경차 또는 장애인 차량인 경우 50%할인
        if (isSmallCar || withDisavledPerson) {
            fee /= 2; // 50% 할인 적용
        }

        //실행결과
        System.out.println("주차 요금은" + fee + "입니다.");

        System.out.println("---------------------------------");
        //주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        //경차 또는 장애인 차량은 최종 요금에서 50% 할인
        int parkingFee = 4000; // 주차요금
        int perHour = 5; // 주자 시간
        boolean lightCar = false;
        boolean disa = false;

       int pee = perHour *4000; //주차요금은 시간당 4000원

        if (pee> 30000) { //(일일 최대 요금은 30000원)

        }


    }
}



























