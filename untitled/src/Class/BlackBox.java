package Class;

public class BlackBox {
    //인스턴스 변수 또는 필드
    //모델명,해상도,가격,색상
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber; // 시리얼번호

    static int counter = 0; //시리얼 번호를 생성해주는 역할 (처음엔 0이었다가 증가 ++ 1,2, ,,,
    //모든 객체에 똑같이 적용된다.(공통)
    static boolean canAutoReport = false; //자동신고기능

    //생성자는 위에 변수들이 있는 다음에다 적어준다.
    //기본 생성자
    BlackBox() {

//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급 받았습니다." + this.serialNumber);
    }

    //생성자 오버로딩
    //지정 생성자
    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); // 기본 생성자 호출 this() : 클래스안의 다른 생성자 호출 가능
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    //전달값과 반환값이 없는 메소드
    void autoReport() {//불리언이 false면 신고를 하지 않고 true면 자동 신고 기능을 넣어준다
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    //반환값이 없는 메소드
    //블랙박스에 외장 메모리카드
    void insetMemoryCard(int capacity) {
        if (canAutoReport == true) {
            System.out.println("메모리 카드가 삽입 되었습니다.");
            System.out.println("용량은 " + capacity + "GB 입니다");
        } else {
            System.out.println("메모리가 지원되지 않았습니다");
        }
    }

    //반환값과 전달값이 있는 메소드
    //영상 기능
    int getVideoFileCount(int type) {
        if (canAutoReport == true) {
            if (type == 1) {
                return 9;
            } else if (type == 2) {
                return 1;
            }

        } else {
            System.out.println("영상 기능 지원이 되지 않았습니다");
        }
        return 0;
    }

    //녹화
    //날짜시간정보표시 여부 ,속도정보 여부 , 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {

        System.out.println("녹화를 시작 합니다");
        if (showDateTime) {
            System.out.println("영상에 날짜 정보가 표시 됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도 정보가 표시 됩니다");
        }
        System.out.println("영상은 " + min + "분 단위로 기록 됩니다.");
    }

    //오버로딩을 통해 윗 4줄의 코드를 그대로 호출 할 수 있다
    //기본세팅이 되어서 그대로 호출하면 편하다
    void record() {
        record(true, true, 5);
    }

    //클래스 메소드 static 변수와 같다
    //전에 쓰던 메소드와 차이점은 static붙고 안붙고의 차이
    //코드의 내용이 항상 똑같이 동작(모든 객체에 공통으로 적용)
    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000) 로 연결합니다 ");
//        modelName = "test";(인스턴스변수에서 만든 modelName은 접근이 불가능
        canAutoReport = false; //클레스 변수에서 만든 canAutoReport 적용 가능
    }


    public void appendModelName(String modelName) {

        this.modelName += modelName;
    }

    //Getter  & Setter
    //Getter : 값을 가지고 오는 메소드
    //Setter : 값을 설정하는 메소드
    //modelName을 가져오는 메소드라고 가정
    //Getter
    String getModelName(){
        return modelName;
    }
    //Setter
    void  setModelName(String modelName){
        this.modelName = modelName;
    }
    //resolution에 대한 getter setter
    //resolution은 직원의 실수로 값이 없는 상태 (null)
    String getResolution(){
        //resolution 은 값이 null 이거나 값이 비어있거나 둘 중에 하나
        if (resolution == null || resolution.isEmpty()){    //isEmpty = ""
             return "판매자에게 문의 하세요";
        }
        return resolution;
    }

    void setResolution(String resolution)    {
        this.resolution = resolution;
    }

    int getPrice(){
        return price;
    }
    //최소 금액을 맞츰
    //아무리 싸게 팔아도 100000원보다는 비싸게 판다.
    void setPrice(int price){
        if (price < 100000){
            this.price = 100000;
        }else {
            this.price = 100000;
        }
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color=color;
    }
}
