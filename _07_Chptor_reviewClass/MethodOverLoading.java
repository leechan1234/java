package _07_Chptor_reviewClass;

public class MethodOverLoading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelname = "까망이";

        b1.record(false,false,10);
        System.out.println("-------------------------");
        b1.record(true,false,3);
        System.out.println("-------------------------");
        b1.record(true,true, 5);
        b1.record();

    }
}
