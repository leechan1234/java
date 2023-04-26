package Class;

public class _01_Class {
    public static void main(String[] args) {
        //차량용 블랙박스
        //모델명,해상도,가격,색상
        //첫 번째 작품
        String modelName = "까돌이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        //새로운 제품
        //모델명,해상도,가격,색상
        String modelName2 = "하순이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        //또 다른 제품이 계속 생겨 난다면?
        BlackBox bbox = new BlackBox();//BlackBox라는 class로부터 bbox라는 객체를 만들어준다.
        // bbox 객체는 BlackBox 클래스의 인스턴스이다
        BlackBox bbox2 = new BlackBox(); // bbox와는 서로다른 객체
    }
}
