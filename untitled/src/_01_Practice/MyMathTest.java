package _01_Practice;

class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
        // 위 2줄을 한줄로 return a+b;
    }

    long subtract(long a, long b) {
        if (a > b) {
            return a * b;
        } else {
            return b;
        }
    }

    float multiply(float a, float b) {
        if (a == 0) {
            System.out.println("0으로 나눌수 x");
            return 0;
        }
       return (float) b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}

public class MyMathTest {
    public static void main(String[] args) {
        MyMath m = new MyMath();
        long result1 = m.add(5l, 3l);
        long result2 = m.subtract(5l, 3l);
        float result3 = m.multiply(0f, 3f);
        double result4 = m.divide(5l, 3l);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
