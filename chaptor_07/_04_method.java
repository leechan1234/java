package chaptor_07;

public class _04_method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoReport(); // 지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 지원 됨
        b1.insertMenoryCard(26);

        // 일반 영상 : 1
        // 이벤트 영상 (충돌감지) : 2
        // 일반영상
        int fileCount = b1.getVideoFileCount(1); // 일반영상
        System.out.println("일반 영상 파일 수 :" + fileCount + "개");

        fileCount = b1.getVideoFileCount(2); // 일반영상
        System.out.println("이벤트 영상 파일 수 :" + fileCount + "개");

    }

}
