package Class;

public class _10_AccessModifier {
    public static void main(String[] args) {
        //접근제어자
        //private , default,protected,public
        BlackBox b1 = new BlackBox();
        b1.modelName="까망이";
        // b1.resolution="FHD";
        b1.price = 200000;
        b1.color = "블랙";
        //할인행사
        //할인코드인데 담당자가 b1.price를 실수로 뺀 상황
        //실수로 인해 5천원을 줘야 하는 상황
        b1.price = -5000;
        System.out.println("가격 : " + b1.price + '원');

        //고객문의   //고객이 실수로 제품정보에 해상도 resolution을 넣지 않았음
        System.out.println("해상도 : " + b1.resolution);
        //이렇게 실수가 이뤄 졌을때 gettersetter 사용

        System.out.println("-------------------");

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        //실수로 resolution은 넣지 않음
        b2.setPrice(-5000); //실수 가정
        b2.setColor("화이트");

        System.out.println("이름 : " + b2.getModelName());
        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution() );
        System.out.println("색상 : " + b2.getColor());
    }
}
