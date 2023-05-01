package Class;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 =new BlackBox();
        //인스턴스 변수에 modelName
        //물건이 잘 안팔린다고 가정

        b1.modelName ="까순이";
        b1.appendModelName("(최신형)");
        System.out.println(b1.modelName);



        //최신형으로 바꿀려면 class 파일에 아래와 같이 코드를 작성해야 할 것이다.
//        void appendModelName(String modelName){} (인텔리제이는 appendModelName 마우스 두고  alt+enter로 바로 생성가능)

    }
}
