package _math_Practice;

public class _MathBeenTest {
    public static void main(String[] args) {
        MathBean b1 = new MathBean();
        b1.printClassName();
        b1.printNumber(2);
        int getone = b1.getOne();
        System.out.println(getone);
        int Plus = b1.plus(1, 2);
        System.out.println(Plus);

    }
}
