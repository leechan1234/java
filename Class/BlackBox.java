package Class;

public class BlackBox {
    String modelName;  //메소드 변수
    String resolution;
    int price;
    String color;
    int seriaNumber; // 시리얼 번호

    static  int counter = 0; // 시리얼 번호를 생성해주는 역할 ++ 1, 2, ...

    static boolean canAutoReport = false; //클래스 변수 : 객체입력없이 바로 호출 가능 ex)Blackbox.canAutoReport

    //생성자 만드는 법
    //객체가 생성될 때 자동으로 호출되는 메소드
    BlackBox() {
        System.out.println("기본 생성자 호출");
        this.seriaNumber = ++ counter;
        System.out.println("새로운 시리얼 넘버를 발급 받았습니다. : " + this.seriaNumber);

    }
//생성자 여러개 호출 가능
    BlackBox(String modelName, String resolution, int price, String color) {


        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

    void autoReport() {  // 메소드

        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고 합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void inserMemoryCard(int capacity) { //메소드
        System.out.println("메모리 카드가 삽입되었습니다");
        System.out.println("용량은" + capacity + "gb 입니다");
    }

    int getVideoFileCount(int type) { //전달값과 반환값이 있는 메소드
        if (type == 1) {
            return 9;
        } else if (type == 2) {
            return 1;
        }
        return 10;
    }

    //메소드 오버로딩
    void record(boolean showDateTime, boolean showSpeed, int min) { // 메소드 오버로딩 사용중
        System.out.println("녹화를 시작합니다");
        if (showDateTime) {
            System.out.println("영상에 날짜 정보가 표시됩니다");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시 됩니다");
        } else {
            System.out.println("속도정보표시 기능이 없습니다");
        }
        System.out.println("영상은" + min + "분 단위로 기록 됩니다.");
    }

    void record() { //메소드 오버로딩
        record(true, true, 5);
    }

    static void callServiceCenter() { //클래스메소드
        System.out.println("서비스 센터 (1588-0000) 로 연결합니다.");
//modelName = "text"; x
        canAutoReport = false;
    }


    public void smodelName(String modelName) {
        this.modelName += modelName;
    }
}
