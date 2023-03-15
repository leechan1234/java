package chap_06;

public class _02_Parameter {
    //전달값이 있는 메소드
    public static void  power(int number) { // 매개변수
        int result = number * number;
        System.out.println(number + " 의 2 승은" + result);
    }

    public static void  powerByExp(int number, int expinent) {
        int result = 1;
        for (int i = 0; i < expinent; i++) {
            result = result * number;
        }
        System.out.println(number + "의" + expinent + "승은" + result);
    }

    public static void main(String[] args) {
        //전달값, Parameter
        // 2 -> 2*2 = 4
        // 3 -> 3*3 = 9
        power(2); // 2 * 2 = 4
        power(3); // 3 * 3 = 9

        powerByExp(2,3); // 2 * 2 * 2 = 8
        powerByExp(3,3);
        powerByExp(10,0);
    }
}
