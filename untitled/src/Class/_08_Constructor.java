package Class;

import java.io.PrintStream;

public class _08_Constructor {
    public static void main(String[] args) {
        //생성자는 객체가 만들어질때 호출되는 메서드
        BlackBox b1 = new BlackBox();
        //원래는 일일이 하나씩 선언해주고 초기화를 하였다.

        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";
        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);


        System.out.println(" ---------------------");
        BlackBox b2 = new BlackBox("하양이", "UHD", 300000, "화이트");
        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.color);
        System.out.println(b2.price);


    }
}
