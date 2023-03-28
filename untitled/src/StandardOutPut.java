public class StandardOutPut {
    public void println(boolean b) {
        System.out.println(b);
    }

    public static void println(int i) {
        System.out.println(i);
    }

    public void ptintln(double d) {
        System.out.println(d);
    }

    public void println(String s) {
        System.out.println(s);
    }



    public static void main(String[] args) {
        StandardOutPut b1 = new StandardOutPut();
        b1.println(true);
        StandardOutPut.println(2);
        b1.ptintln(1.1);
        b1.println("hello");
    }
}
