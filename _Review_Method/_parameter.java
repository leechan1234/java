package _Review_Method;

public class _parameter {
    public static void power(int number) {
        int result = number * number;
        System.out.println(number + "의 2승" + "=" + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        //거듭제곱 메소드
        power(2);
        power(3);
        powerByExp(2,3);

    }
}
