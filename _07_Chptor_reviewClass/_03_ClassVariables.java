package _07_Chptor_reviewClass;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelname = "까망이";
        System.out.println(b1.modelname);

        BlackBox b2 = new BlackBox();
        b2.modelname = "하양이";
        System.out.println(b2.modelname);

        //이번 클래스변수 장에서는 차량기본정보+자동신고기능추가(class변수 쓸 것 같음 유추)

        // 자동 신고 기능 개발 여부
        System.out.println(" - 개발 전 - ");
        System.out.println(b1.modelname + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelname + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        // 자동 신고 기능 개발 후
       BlackBox.canAutoReport = true;
        System.out.println(b1.modelname + "자동 신고 기능 :" + BlackBox.canAutoReport);
        System.out.println(b2.modelname + " 자동 신고 기능 :" + BlackBox.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능:" + BlackBox.canAutoReport);


    }
}
