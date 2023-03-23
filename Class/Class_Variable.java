package Class;

public class Class_Variable {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        System.out.println("----개발전----");
        System.out.println(b1.modelName + "자동신고기능 : " +BlackBox.canAutoReport);
        System.out.println(b2.modelName + "자동신고기능 :" + BlackBox.canAutoReport);
        b2.canAutoReport = true;
        System.out.println("---- 개발 후 ----");
        System.out.println(b1.modelName + "자동신고기능 : " +BlackBox.canAutoReport);
        System.out.println(b2.modelName + "자동신고기능 : " + BlackBox.canAutoReport);

    }
}
