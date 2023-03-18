package _07_Chptor_reviewClass;

public class _01_Review_Class {
    public static void main(String[] args) {
        //요지보수용이
        //높은 재사용성

        //차량용 블랙박스
        //모델명 , 해상도 ,가격, 색상

        // 우리가 만든 첫번쨰 제품
        // class 변수 사용하기 위해 변수를 둔 차량정보 예시
        String modelName  = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = " 블랙";

        //새로운 제품
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 ="화이트";

        //또 다른 제품을 개발
       BlackBox bbox = new BlackBox();
        //bbox는 blackbox의 인스턴스 변수
       BlackBox bbox2 =new BlackBox();

    }
}
