package _07_Chptor_reviewClass;

public class _Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelname = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";
        System.out.println(b1.modelname);
        System.out.println(b1.serialNumber);

        BlackBox b2 = new BlackBox("하양이","UHD",3000000,"화이트");
        System.out.println(b2.modelname);
        System.out.println(b2.serialNumber);
    }
}
