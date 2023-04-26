package Class_Pratice;

public class CarMain2 {
    public static void main(String[] args) {
        //Car 타입의 배열객체 생성
        Car[] cars = new Car[3];
        //car 객체 생성
        Car tico = new Car();

        tico.color = "화이트";
        tico.company = "대우";
        tico.type = "경차";

        // 모든 인덱스에 tico 객체 저장
        for (int i = 0; i < cars.length; i++) {
            cars[i] = tico;
        }
        System.out.println("2번 인덱스 color : " + cars[2].color);
        cars[0].color = "블랙";
        System.out.println("2번 인덱스 color : " + cars[2].color);
    }
}
