package Class;

public class _02_InstanceVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        //b1이 가진 4개의 인스턴스 변수에 값 지정
        b1.modelName = "까순이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";
        //호출
        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);
        System.out.println("------------------");
        //새로운 블랙박스 제품 (새로운 객체)
        BlackBox b2 = new BlackBox();
        b2.modelName = "하순이";
        b2.resolution = "UHD";
        b2.price = 300000;
        b2.color = "화이트";
        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);

    }
}
