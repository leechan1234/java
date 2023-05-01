package Class;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.autoReport(); //지원안됨
        BlackBox.canAutoReport =  true;
//        b1.autoReport(); // 지원 됨
        b1.insetMemoryCard(256);

        //일반영상 : 1
        //이벤트 영상 (충돌감지) : 2
        int fileCount = b1.getVideoFileCount(1);
        int fileCount1 = b1.getVideoFileCount(2);
        System.out.println("일반 영상 파일 수 : " + fileCount + "개");
        System.out.println("이벤트 영상 파일 수 : " + fileCount1 + "개");
    }
}
