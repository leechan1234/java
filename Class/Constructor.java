package Class;

public class Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        //생성자를 사용하면 이 작업을 편리하게 할 수 있다.
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        BlackBox b2 = new BlackBox("하양이", "UHD", 300000 , "하양");
        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);
    }
}
