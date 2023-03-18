package _07_Chptor_reviewClass;

public class BlackBox {
    // 차량 기본 정보
    String modelname; // 모델명
    String resolution;// 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 번호

    static  int counter =0; // 시리얼 번호를 생성해주는 역할 ++

    // 차량 기능 정보
    //static이 붙여지게되면은 blackbox(클래스)로부터 만들어진 모든객체들이 똑같이 적용이된다.

    //설계도에 자동신고기능 추가 변수를 넣어준것
    static boolean canAutoReport = false;
    //생성자
    BlackBox(){
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버를 발급 받았습니다 :" + this.serialNumber);
    }
    BlackBox(String modelname ,String resolution, int price , String color){
        this(); // 기본 생성자 호출

        System.out.println("사용자 정의 생성자 호출");
        this.modelname = modelname;
        this.resolution = resolution;
        this.color = color;
        this.price = price;
    }

    // 자동으로신고하는 기능 (메소드)

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충둘이 감지 되었습니다 신고 하겠습니다");
        } else {
            System.out.println("자동 신고 기능이 없습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽이 되었습니다");
        System.out.println("용량은" + capacity + "GB 입니다");
    }

    //일반 영상 : 1
    //이벤트 영상 (충돌감지) : 2
    int getVideoFileCount(int type) {
        if (type == 1) { //일반영상
            return 9;
        } else if (type == 2) {// 이벤트영상
            return 1;
        }
        return 10;
    }

    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시 됩니다");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시 됩니다.");
        }
        System.out.println("영상은" + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터 (1588-0000) 로 연결합니다.");

    }


    public void appendModelName(String modelname) {
        this.modelname += modelname;
    }
}