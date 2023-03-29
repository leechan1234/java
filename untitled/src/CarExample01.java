public class CarExample01 {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.run();
         b1.안내방송();

        Car c1 = new Bus(); // 참조변수의 타입으로 Car를 사용하면 car가 가지고 있는 메소드만 사용가능
        c1.run();

        Bus b2 = (Bus) c1;
        b2.안내방송();

        Car c2 = new SuperCar();
        c2.run();



    }
}
