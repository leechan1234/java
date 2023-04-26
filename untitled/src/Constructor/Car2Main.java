package Constructor;

public class Car2Main {
    public static void main(String[] args) {
        Car3 c = new Car3();
        Car3 c1 = new Car3("현대", "대형차");
        Car3 c2 = new Car3("블랙", "기아", "화물차");
        Car3 c3 = new Car3("경차");
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


    }
}
