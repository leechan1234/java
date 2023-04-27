package Class;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까돌이";

        b1.record(false, false, 10);
        System.out.println("-----------------------------");
        b1.record(true, false, 3);
        System.out.println("-----------------------------");
        b1.record();
    }
}
