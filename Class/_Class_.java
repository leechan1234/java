package Class;


public class _Class_ {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "검정";
        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);
        BlackBox b2 = new BlackBox();
        //다른제품
        b2.modelName = "하양이";
        b2.resolution = "FHD";
        b2.price = 300000;
        b2.color = "검정";
        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);
    }


}
