package chaptor_07;

public class _02_InstensVariable {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resilution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";
        System.out.println(b1.modelName);
        System.out.println(b1.color);
        System.out.println(b1.resilution);
        System.out.println(b1.price);
        System.out.println("-------------");
        //새로운 블랙박스 제품
        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        b2.resilution = "UHD";
        b2.color = "화이트";
        b2.price = 300000;

        System.out.println(b2.price);
        System.out.println(b2.color);
        System.out.println(b2.modelName);
        System.out.println(b2.resilution);
    }
}
