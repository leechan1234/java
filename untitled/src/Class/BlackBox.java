package Class;

public class BlackBox {
    //인스턴스 변수 또는 필드
    //모델명,해상도,가격,색상
    String modelName;
    String resolution;
    int price;
    String color;
    //모든 객체에 똑같이 적용된다.(공통)
    static boolean canAutoReport = false; //자동신고기능

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
        System.out.println("메모리 카드가 삽입 되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다");
    }

    //반환값과 전달값이 있는 메소드
    //영상 기능
    int getVideoFileCount(int type){
        if (type ==1){
            return 9;
        } else if (type == 2) {
            return 1;
        }
        return 0;
    }
    //녹화
    //날짜시간정보표시 여부 ,속도정보 여부 , 영상 기록 단위(분)
    void record(boolean showDateTime,boolean showSpeed,int min){
        System.out.println("녹화를 시작 합니다");
        if (showDateTime){
            System.out.println("영상에 날짜 정보가 표시 됩니다.");
        }
        if (showSpeed){
            System.out.println("영상에 속도 정보가 표시 됩니다");
        }
        System.out.println("영상은 " + min + "분 단위로 기록 됩니다.");
    }
 //오버로딩을 통해 윗 4줄의 코드를 그대로 호출 할 수 있다
    //기본세팅이 되어서 그대로 호출하면 편하다
    void record(){
        record(true,true,5);
    }

}
