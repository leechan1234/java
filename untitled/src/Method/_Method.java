package Method;

class Param {
    void add(int x, int y) {
        int z = x + y;
        System.out.println(z);
    }

    void add2(double x, double y) {
        double z = x + y;
        System.out.println(z);
    }

    void add3(int... x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];

        }
        System.out.println(sum);
    }
}


public class _Method {
    public static void main(String[] args) {
        Param p = new Param();
        p.add(10, 5);
        p.add2((int)10.5, 5);
        p.add3(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); //매개변수가 몇개 있을지 모르때

    }
}
