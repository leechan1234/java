package _07_Chptor_reviewClass;

public class _02_Instance_review {
    public static void main(String[] args) {
        //처음 만든 첫 번째 제품
        BlackBox b1 = new BlackBox();
        b1.modelname = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        System.out.println(b1.modelname);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

        BlackBox b2 = new BlackBox();
        b2.modelname = "하양이";
        b2.resolution = "UHD";
        b2.price = 300000;
        b2.color = "화이트";

        System.out.println(b2.modelname);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);




    }
}
