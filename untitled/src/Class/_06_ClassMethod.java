package Class;

public class _06_ClassMethod {
    public static void main(String[] args) {
        BlackBox.callServiceCenter();
        BlackBox b1 = new BlackBox();
        //블랙박스를 사용하다 어떠한 문제가 발생
        //블랙박스를 통해 바로 고객센터에 연결 기능을 메소드로 만들기
        BlackBox b2 = new BlackBox();
        b2.callServiceCenter();

        String s = String.valueOf(3);

    }
}
