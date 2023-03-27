package Class;

public class BlackBox {
    String modelName;  //메소드 변수
    String resolution;
    int price;
    String color;
    int seriaNumber; // 시리얼 번호

    static int counter = 0; // 시리얼 번호를 생성해주는 역할 ++ 1, 2, ...

    static boolean canAutoReport = false; //클래스 변수 : 객체입력없이 바로 호출 가능 ex)Blackbox.canAutoReport

    //생성자 만드는 법
    //생성자도 여러개 만들 수 있다
    //객체가 생성될 때 자동으로 호출되는 메소드
    BlackBox() {

//        System.out.println("기본 생성자 호출");
//        this.seriaNumber = ++ counter;
//        System.out.println("새로운 시리얼 넘버를 발급 받았습니다. : " + this.seriaNumber);

    }

    //생성자 여러개 호출 가능
    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); // 기본 생성자 호출
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
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

    //클래스메소드
    static void callServiceCenter() {
        System.out.println("서비스 센터 (1588-0000) 로 연결합니다.");
//modelName = "text"; x
        canAutoReport = false;
    }


    public void smodelName(String modelName) {
        this.modelName += modelName;
    }

    public void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    // Getter & Setter
    // getter : 값을 가져오는 메소드
    // setter : 값을 설정하는 메소드
    String getModelName() {  //getter
        return modelName;
    }

    void setModelName(String modelName) { //setter
        this.modelName = modelName;
    }

    //해상도에 대한 getter, setter
    String getResolution() {
        if (resolution == null || resolution.isEmpty()) { //isempty : 빈 문자열일때 true가 됨
            return "판매자에게 문의하세요";
        }
        return resolution;  //실수로 resilution을 객체를 못만들었다 null
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }else{
            this.price = price;
        }

    }
    String getColor() {
        return  color;
    }
    void setColor(String color){
        this.color = color;
    }
}
