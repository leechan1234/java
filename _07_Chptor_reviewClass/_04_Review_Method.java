package _07_Chptor_reviewClass;

public class _04_Review_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelname = "까망이";
        b1.autoReport(); //지원이 안됨
        b1.canAutoReport = true;
        //지원가능
     b1.autoReport();
     b1.insertMemoryCard(256);

        //일반 영상 : 1
        //이벤트 영상 (충돌감지) : 2
        System.out.println("일반 영상 파일 수 :"+ b1.getVideoFileCount(1)+ "입니다.");
        System.out.println("이벤트영상 파일 수 :"+ b1.getVideoFileCount(9)+ " 개 입니다.");
    }
}
