package Class;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
       // b1.resolution = "FHD";  //실수로 해상도 정보를 넣지 않았을떄
        b1.price = 200000;
        b1.color = "블랙";

        //할인행사
        b1.price = - 5000;
        System.out.println("가격 :" + b1.price + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution); //null 올바른 해상도 답변을 해줄수가 없다.

        System.out.println("-----------------------");

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());
     //gettet 와 setter 을 사용 하게 된다면 이상한 값이 들어간다던지 값을 설정할려다 발생할 수 있는 오류를 줄일 수 있고
        //값을 가져오는 과정에서 그 값이 없다거나 이상하면 대안으로 줄 수 있다
    }
}
