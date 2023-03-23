package _Class_Oop_Practice01;

public class Tv_Object {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        t1.color = "검정";
        t1.power = true;

        Tv t2 = new Tv();

        System.out.println("t1의 channel 값은" + t1.channel + "입니다");
        System.out.println("t2의 channel 값은" + t2.channel + "입니다");

        t1.channel = 7;
        t2=t1;
        System.out.println("t1의 channel 값을" + t1.channel + "로 변경 했습니다");
        System.out.println("t1의 channel 값은" + t1.channel + "입니다");
        System.out.println("t2의 channel 값은" + t2.channel + "입니다");


    }
}
