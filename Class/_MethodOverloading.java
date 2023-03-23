package Class;

public class _MethodOverloading {   //녹화 기능을 만드는데 메소드 오버로딩을 사용
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

    // 이렇게 하게 되면 BlackBox 클래스 오버로딩메소드내에서만 값을 바꿔주면 손쉽게 사용 가능하다
        System.out.println("----------------");
       b1.record();
    }
}
