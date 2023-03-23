package Class;

public class method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoReport(); // 지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 지원 됨

        b1.inserMemoryCard(256);
        // 전달값과 반환값이 있는 메소드 출력
        //일반영상 : 1
        //이벤트 영상 (충돌 감지) : 2
        b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일 수 : " +b1.getVideoFileCount(1) + " 개 입니다");
        b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 수 : " +b1.getVideoFileCount(2) + " 개 입니다");
    }


}
