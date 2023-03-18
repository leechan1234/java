package _Review_Method;

import Chaptor_04._for_01;

public class _review_parameterAndReturn {

    // void = 반환형태이기 때문에 int 가로속에 전달 매개변수
    public static int getPower(int number) {
        return number * number;
    }

    public static int getExp(int number,int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {
//전달과 반환이 같이 있는 메소드
        System.out.println(getPower(2));

        System.out.println(getExp(2,2));


    }
}
