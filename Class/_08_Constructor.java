package Class;

public class _08_Constructor {   //생성자 : 객체가 만들어 질때 자동으로 호출되는 메소드
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";  // 생성자를 만들면 이 작업들을 편하게 할 수 있다.
        System.out.println(b1.modelName);
        System.out.println(b1.seriaNumber);

        System.out.println("------------------------");

        BlackBox b2 = new BlackBox("하양이","UHD",300000,"화이트");
        System.out.println(b2.modelName);
        System.out.println(b2.seriaNumber);
    }

}
